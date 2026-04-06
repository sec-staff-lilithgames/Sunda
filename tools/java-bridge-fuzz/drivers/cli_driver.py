#!/usr/bin/env python3
from __future__ import annotations

import json
import subprocess
import tempfile
from pathlib import Path

from .common import (
    ROOT,
    adb,
    classify_failure,
    detect_pid_status,
    ensure_server_running,
    make_failure_signature,
    prepare_mode,
    start_logcat,
    stop_logcat,
)


AGENT_PATH = ROOT / "agents" / "java_bridge_harness.js"
RESULT_PREFIX = "__FUZZ_RESULT__"
ERROR_PREFIX = "__FUZZ_ERROR__"


def render_wrapper(case: dict, case_json: str) -> str:
    harness = AGENT_PATH.read_text(encoding="utf-8")
    return (
        harness
        + "\n"
        + f"const __FUZZ_CASE__ = {case_json};\n"
        + "setImmediate(async () => {\n"
        + "  try {\n"
        + "    const result = await rpc.exports.run_case(JSON.stringify(__FUZZ_CASE__));\n"
        + f"    console.log('{RESULT_PREFIX}' + JSON.stringify(result));\n"
        + "  } catch (e) {\n"
        + f"    console.log('{ERROR_PREFIX}' + JSON.stringify({{ error: e.stack || String(e) }}));\n"
        + "  }\n"
        + "});\n"
    )


def run_case(case: dict) -> tuple[dict, str, str]:
    ensure_server_running()
    package = case["package"]
    output_dir = Path(case["_output_dir"])
    repeats = int(case.get("driver", {}).get("repeat_sessions", 1))
    timeout = int(case.get("driver", {}).get("timeout_seconds", 20))
    result: dict = {
        "driver": "cli",
        "mode": case["mode"],
        "package": package,
        "sessions": [],
        "detach": [],
        "ok": True,
        "failure": None,
    }
    stdout_chunks: list[str] = []
    stderr_chunks: list[str] = []
    logcat_proc = None
    logcat_handle = None

    try:
        logcat_proc, logcat_handle = start_logcat(output_dir)

        for _ in range(repeats):
            runtime = prepare_mode(case)
            expected_pid = runtime["expected_pid"]
            if case["mode"] == "spawn":
                cli_args = ["frida", "-U", "-f", package, "--runtime", "v8", "--no-auto-reload", "-q", "-t", str(timeout)]
            else:
                cli_args = ["frida", "-U", "-p", str(runtime["pid"]), "--runtime", "v8", "--no-auto-reload", "-q", "-t", str(timeout)]

            with tempfile.NamedTemporaryFile("w", delete=False, prefix="java-bridge-fuzz-", suffix=".js") as script_file:
                script_path = Path(script_file.name)
                script_file.write(render_wrapper(case, json.dumps(case)))

            try:
                cli_args.extend(["-l", str(script_path)])
                proc = subprocess.run(
                    cli_args,
                    text=True,
                    stdout=subprocess.PIPE,
                    stderr=subprocess.PIPE,
                    check=False,
                )
                stdout_chunks.append(proc.stdout)
                stderr_chunks.append(proc.stderr)

                payload = None
                failure = None
                for line in proc.stdout.splitlines():
                    if line.startswith(RESULT_PREFIX):
                        payload = json.loads(line[len(RESULT_PREFIX):])
                    elif line.startswith(ERROR_PREFIX):
                        message = json.loads(line[len(ERROR_PREFIX):])["error"]
                        failure = {
                            "kind": classify_failure(message),
                            "message": message,
                        }

                if payload is None and failure is None:
                    failure = {
                        "kind": classify_failure(proc.stderr or proc.stdout or "missing-cli-result"),
                        "message": (proc.stderr or proc.stdout or "missing-cli-result").strip(),
                    }

                if case["mode"] == "spawn" and expected_pid is None:
                    expected_pid = detect_pid_status(package, None)["pid"]

                pid_status = detect_pid_status(package, expected_pid)
                result["sessions"].append({
                    "payload": payload,
                    "pid_status": pid_status,
                })

                if failure is not None:
                    result["ok"] = False
                    result["failure"] = failure
                    result["pid_status"] = pid_status
                    break
                if pid_status["alive"] is False:
                    result["ok"] = False
                    result["failure"] = {"kind": "pid-lost", "message": "pid lost after CLI fuzz run"}
                    result["pid_status"] = pid_status
                    break
                if expected_pid is not None and pid_status["same_pid"] is False:
                    result["ok"] = False
                    result["failure"] = {"kind": "pid-drift", "message": "pid drift after CLI fuzz run"}
                    result["pid_status"] = pid_status
                    break
            finally:
                script_path.unlink(missing_ok=True)
    finally:
        if logcat_proc is not None and logcat_handle is not None:
            stop_logcat(logcat_proc, logcat_handle)

    if result["failure"] is None and result["sessions"]:
        result["pid_status"] = result["sessions"][-1]["pid_status"]
    result["signature"] = make_failure_signature(result)
    return result, "".join(stdout_chunks), "".join(stderr_chunks)
