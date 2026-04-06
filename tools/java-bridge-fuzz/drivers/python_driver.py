#!/usr/bin/env python3
from __future__ import annotations

import json
import time
from pathlib import Path
from typing import Any

import frida

from .common import (
    ROOT,
    classify_failure,
    detect_pid_status,
    ensure_server_running,
    make_failure_signature,
    normalize_frida_crash,
    prepare_mode,
    start_logcat,
    stop_logcat,
)


AGENT_PATH = ROOT / "agents" / "java_bridge_harness.js"


def _load_agent() -> str:
    return AGENT_PATH.read_text(encoding="utf-8")


def run_case(case: dict[str, Any]) -> dict[str, Any]:
    ensure_server_running()
    package = case["package"]
    output_dir = Path(case["_output_dir"])
    device = frida.get_usb_device(timeout=10)
    result: dict[str, Any] = {
        "driver": "python",
        "mode": case["mode"],
        "package": package,
        "sessions": [],
        "detach": [],
        "ok": True,
        "failure": None,
    }

    repeats = int(case.get("driver", {}).get("repeat_sessions", 1))
    logcat_proc = None
    logcat_handle = None

    try:
        for _ in range(repeats):
            runtime = prepare_mode(case)
            out_detach: list[dict[str, Any]] = []
            session = None
            expected_pid = runtime["expected_pid"]

            if logcat_proc is None:
                logcat_proc, logcat_handle = start_logcat(output_dir)

            try:
                if case["mode"] == "attach":
                    session = device.attach(runtime["pid"])
                else:
                    spawn_pid = device.spawn([package])
                    session = device.attach(spawn_pid)
                    device.resume(spawn_pid)
                    time.sleep(case.get("launch", {}).get("delay_ms", 0) / 1000.0)
                    expected_pid = runtime["expected_pid"] = None

                script = session.create_script(_load_agent())

                def on_detached(reason: str, crash: Any) -> None:
                    out_detach.append({
                        "reason": reason,
                        "crash": normalize_frida_crash(crash),
                        "at": time.time(),
                    })

                session.on("detached", on_detached)
                script.load()
                payload = script.exports_sync.run_case(json.dumps(case))
                if case["mode"] == "spawn" and expected_pid is None:
                    expected_pid = detect_pid_status(package, None)["pid"]

                pid_status = detect_pid_status(package, expected_pid)
                session_result = {
                    "payload": payload,
                    "detach": out_detach,
                    "pid_status": pid_status,
                }
                result["sessions"].append(session_result)
                result["detach"].extend(out_detach)

                detached_failure = next((item for item in out_detach if item["reason"] != "application-requested"), None)
                if detached_failure is not None:
                    raise RuntimeError(f"detached:{detached_failure['reason']}")
                if pid_status["alive"] is False:
                    raise RuntimeError("pid-lost")
                if expected_pid is not None and pid_status["same_pid"] is False:
                    raise RuntimeError("pid-drift")

            except Exception as e:
                result["ok"] = False
                result["detach"].extend(out_detach)
                result["failure"] = {
                    "kind": classify_failure(str(e)),
                    "message": str(e),
                }
                result["pid_status"] = detect_pid_status(package, expected_pid)
                break
            finally:
                if session is not None:
                    try:
                        session.detach()
                    except Exception:
                        pass
    finally:
        if logcat_proc is not None and logcat_handle is not None:
            stop_logcat(logcat_proc, logcat_handle)

    if result["failure"] is None:
        last_session = result["sessions"][-1] if result["sessions"] else {}
        result["pid_status"] = last_session.get("pid_status")
    result["signature"] = make_failure_signature(result)
    return result
