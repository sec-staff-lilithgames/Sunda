#!/usr/bin/env python3
from __future__ import annotations

import json
import shlex
import subprocess
import time
from datetime import datetime
from pathlib import Path
from typing import Any


ROOT = Path(__file__).resolve().parents[1]
OUTPUT_ROOT = ROOT / "outputs"
AUTHORITATIVE_SERVER_PATH = "/data/local/.sunday/sunda"
SERVER_LOG_PATH = "/data/local/tmp/sunda.java-bridge-fuzz.log"
DEFAULT_DEVICE_TIMEOUT = 20.0


def adb(*args: str, check: bool = True, capture: bool = True) -> subprocess.CompletedProcess[str]:
    return subprocess.run(
        ["adb", *args],
        check=check,
        text=True,
        stdout=subprocess.PIPE if capture else None,
        stderr=subprocess.PIPE if capture else None,
    )


def read_case(path: str | Path) -> dict[str, Any]:
    return json.loads(Path(path).read_text(encoding="utf-8"))


def make_output_dir(case_id: str, driver_name: str) -> Path:
    timestamp = datetime.now().strftime("%Y%m%d-%H%M%S")
    out_dir = OUTPUT_ROOT / f"{timestamp}-{case_id}-{driver_name}"
    out_dir.mkdir(parents=True, exist_ok=False)
    return out_dir


def force_stop(package: str) -> None:
    adb("shell", "am", "force-stop", package, check=False)


def launch_package(package: str) -> None:
    adb(
        "shell",
        "monkey",
        "-p",
        package,
        "-c",
        "android.intent.category.LAUNCHER",
        "1",
        check=False,
    )


def wait_for_pid(package: str, timeout_seconds: float = DEFAULT_DEVICE_TIMEOUT) -> int:
    deadline = time.time() + timeout_seconds
    last_error = ""
    while time.time() < deadline:
        result = adb("shell", "pidof", package, check=False)
        pid = result.stdout.strip()
        if pid:
            return int(pid.split()[0])
        last_error = result.stderr.strip() or result.stdout.strip()
        time.sleep(0.5)
    raise RuntimeError(f"pidof timeout for {package}: {last_error}")


def current_pid(package: str) -> int | None:
    result = adb("shell", "pidof", package, check=False)
    value = result.stdout.strip()
    if not value:
        return None
    return int(value.split()[0])


def ensure_server_running() -> int:
    adb(
        "shell",
        f"zoey -c 'pidof frida-server-17.8.0 | xargs -r kill -9; pidof sunda | xargs -r kill -9; {AUTHORITATIVE_SERVER_PATH} >{SERVER_LOG_PATH} 2>&1 &'",
        capture=False,
    )
    deadline = time.time() + 10
    while time.time() < deadline:
        result = adb("shell", "pidof", "sunda", check=False)
        pid = result.stdout.strip()
        if pid:
            return int(pid.split()[0])
        time.sleep(0.5)
    raise RuntimeError("sunda server did not start from /data/local/.sunday/sunda")


def start_logcat(out_dir: Path) -> tuple[subprocess.Popen[str], Any]:
    adb("logcat", "-c", capture=False)
    handle = (out_dir / "logcat.txt").open("w", encoding="utf-8")
    proc = subprocess.Popen(
        ["adb", "logcat", "-v", "threadtime"],
        stdout=handle,
        stderr=subprocess.STDOUT,
        text=True,
    )
    return proc, handle


def stop_logcat(proc: subprocess.Popen[str], handle: Any) -> None:
    if proc.poll() is None:
        proc.terminate()
        try:
            proc.wait(timeout=5)
        except subprocess.TimeoutExpired:
            proc.kill()
            proc.wait(timeout=5)
    handle.close()


def normalize_frida_crash(crash: Any) -> dict[str, Any] | None:
    if crash is None:
        return None
    data: dict[str, Any] = {
        "type": crash.__class__.__name__,
        "repr": repr(crash),
        "str": str(crash),
    }
    for name in ["pid", "process_name", "summary", "report"]:
        value = getattr(crash, name, None)
        if value is not None:
            data[name] = value
    return data


def classify_failure(message: str) -> str:
    lowered = message.lower()
    if "connection is closed" in lowered:
        return "transport-closed"
    if "failed to load script" in lowered or "script.load" in lowered:
        return "script-load-error"
    if "detached" in lowered:
        return "session-detached"
    if "crash" in lowered:
        return "frida-crash"
    return "bridge-operation-error"


def detect_pid_status(package: str, expected_pid: int | None) -> dict[str, Any]:
    pid = current_pid(package)
    return {
        "alive": pid is not None,
        "pid": pid,
        "same_pid": pid == expected_pid if pid is not None and expected_pid is not None else False,
    }


def make_failure_signature(result: dict[str, Any]) -> str:
    driver = result.get("driver", "unknown")
    mode = result.get("mode", "unknown")
    failure = result.get("failure") or {}
    detached = result.get("detach", [])
    pid_status = result.get("pid_status", {})
    parts = [driver, mode]
    if failure.get("kind"):
        parts.append(failure["kind"])
    if detached:
        parts.append(detached[0].get("reason", "detached"))
    if pid_status.get("alive") is False:
        parts.append("pid-lost")
    elif pid_status.get("same_pid") is False:
        parts.append("pid-drift")
    return "::".join(parts)


def write_output_bundle(
    out_dir: Path,
    case: dict[str, Any],
    result: dict[str, Any],
    stdout: str = "",
    stderr: str = "",
) -> None:
    (out_dir / "case.json").write_text(json.dumps(case, indent=2), encoding="utf-8")
    (out_dir / "result.json").write_text(json.dumps(result, indent=2), encoding="utf-8")
    (out_dir / "detach.json").write_text(json.dumps(result.get("detach", []), indent=2), encoding="utf-8")
    (out_dir / "stdout.txt").write_text(stdout, encoding="utf-8")
    (out_dir / "stderr.txt").write_text(stderr, encoding="utf-8")


def write_repro(out_dir: Path, driver_name: str, case_path: Path) -> None:
    repo_root = Path(__file__).resolve().parents[3]
    command = f"cd {shlex.quote(str(repo_root))} && python3 tools/java-bridge-fuzz/run_case.py --driver {shlex.quote(driver_name)} --case {shlex.quote(str(case_path))}"
    script = "#!/usr/bin/env bash\nset -euo pipefail\n" + command + "\n"
    repro_path = out_dir / "repro.sh"
    repro_path.write_text(script, encoding="utf-8")
    repro_path.chmod(0o755)


def prepare_mode(case: dict[str, Any]) -> dict[str, Any]:
    package = case["package"]
    mode = case["mode"]
    launch = case.get("launch", {})
    strategy = launch.get("strategy", "cold")
    delay_ms = int(launch.get("delay_ms", 0))

    if mode == "attach":
        force_stop(package)
        launch_package(package)
        pid = wait_for_pid(package)
        if strategy == "delayed_attach" and delay_ms > 0:
            time.sleep(delay_ms / 1000.0)
        return {"pid": pid, "expected_pid": pid}

    if mode == "spawn":
        force_stop(package)
        return {"pid": None, "expected_pid": None}

    raise RuntimeError(f"Unsupported mode: {mode}")


def summarize_result(result: dict[str, Any]) -> dict[str, Any]:
    return {
        "ok": result.get("ok", False),
        "driver": result.get("driver"),
        "mode": result.get("mode"),
        "signature": make_failure_signature(result),
        "failure": result.get("failure"),
        "pid_status": result.get("pid_status"),
    }


def strip_case(case: dict[str, Any]) -> dict[str, Any]:
    return json.loads(json.dumps(case))
