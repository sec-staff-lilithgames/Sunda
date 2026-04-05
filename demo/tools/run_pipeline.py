#!/usr/bin/env python3
import argparse
import json
import os
import pathlib
import select
import signal
import subprocess
import sys
import time

PACKAGE = "com.sunda.demo"
ACTIVITY = "com.sunda.demo/.MainActivity"
RECEIVER = "com.sunda.demo/.ScanReceiver"
ACTION_SCAN = "com.sunda.demo.SCAN"
REPORT_DIR = f"/sdcard/Android/data/{PACKAGE}/files/reports"
ROOT = pathlib.Path(__file__).resolve().parents[1]
APP = ROOT / "app"
AGENT = ROOT / "tools" / "agent.js"
DEFAULT_ITERATIONS = 3


def adb(*args, check=True, capture=True):
    cmd = ["adb", *args]
    kwargs = {
        "check": check,
        "text": True,
    }
    if capture:
        kwargs["stdout"] = subprocess.PIPE
        kwargs["stderr"] = subprocess.PIPE
    return subprocess.run(cmd, **kwargs)


def run(cmd, cwd=None):
    return subprocess.run(cmd, cwd=cwd, check=True, text=True)


def ensure_built():
    run(["gradle", "--no-daemon", "--console", "plain", "assembleDebug"], cwd=ROOT)


def ensure_installed():
    apk = ROOT / "app" / "build" / "outputs" / "apk" / "debug" / "app-debug.apk"
    adb("install", "-r", str(apk), capture=False)


def clear_reports_dir():
    # Reinstalling the demo can change its app UID, which leaves old external
    # report files unreadable or unwritable by the new install.
    adb(
        "shell",
        "zoey",
        "-c",
        f"rm -rf {REPORT_DIR}",
        check=False,
        capture=False,
    )


def force_stop():
    adb("shell", "am", "force-stop", PACKAGE)


def launch():
    adb("shell", "am", "start", "-W", "-n", ACTIVITY, capture=False)


def wait_for_pid(timeout=15):
    deadline = time.time() + timeout
    while time.time() < deadline:
        result = adb("shell", "pidof", PACKAGE, check=False)
        pid = result.stdout.strip()
        if pid:
            return int(pid.split()[0])
        time.sleep(0.5)
    raise RuntimeError("pidof timed out")


def trigger_scan(reason, calibrate=False):
    args = [
        "shell",
        "am",
        "broadcast",
        "-n",
        RECEIVER,
        "-a",
        ACTION_SCAN,
        "--es",
        "reason",
        reason,
    ]
    if calibrate:
        args.extend(["--ez", "calibrate", "true"])
    adb(*args, capture=False)


def read_remote_json(name="latest.json", timeout=20, expected_reason=None):
    remote = f"{REPORT_DIR}/{name}"
    deadline = time.time() + timeout
    last_error = None
    while time.time() < deadline:
        result = adb("exec-out", "cat", remote, check=False)
        if result.returncode == 0 and result.stdout.strip():
            payload = json.loads(result.stdout)
            if expected_reason is None:
                return payload
            if payload.get("reason") == expected_reason:
                return payload
        last_error = result.stderr.strip()
        time.sleep(0.5)
    raise RuntimeError(f"unable to read {remote}: {last_error}")


def latest_total_hits(report):
    return report["summary"]["totalHits"]


def summarize_report(report):
    summary = report.get("summary", {})
    bucket_details = summary.get("bucketDetails") or []
    top_modules = summary.get("topModules") or []

    bucket_parts = [
        f"{item.get('bucket', 'unknown')}={item.get('count', '?')}"
        for item in bucket_details[:4]
    ]
    module_parts = [
        f"{item.get('modulePath', '<unknown>')}={item.get('count', '?')}"
        for item in top_modules[:3]
    ]

    parts = [f"totalHits={summary.get('totalHits', '?')}"]
    if bucket_parts:
        parts.append("topBuckets=" + "; ".join(bucket_parts))
    if module_parts:
        parts.append("topModules=" + "; ".join(module_parts))
    return " ".join(parts)


def wait_for_ready_line(proc, timeout=45):
    deadline = time.time() + timeout
    while time.time() < deadline:
        ready, _, _ = select.select([proc.stdout], [], [], 0.5)
        if not ready:
            continue
        line = proc.stdout.readline()
        if not line:
            continue
        payload = json.loads(line)
        if payload.get("event") == "ready":
            return payload
    raise RuntimeError("child process did not become ready")


def start_holder(mode, value):
    proc = subprocess.Popen(
        [sys.executable, str(pathlib.Path(__file__).resolve()), f"_hold_{mode}", str(value), str(AGENT)],
        stdin=subprocess.PIPE,
        stdout=subprocess.PIPE,
        stderr=subprocess.PIPE,
        text=True,
    )
    try:
        ready = wait_for_ready_line(proc)
        return proc, ready
    except Exception:
        proc.kill()
        stdout, stderr = proc.communicate(timeout=5)
        raise RuntimeError(f"holder failed stdout={stdout!r} stderr={stderr!r}")


def stop_holder(proc):
    if proc.poll() is not None:
        return
    try:
        proc.stdin.close()
    except Exception:
        pass
    try:
        proc.wait(timeout=10)
    except subprocess.TimeoutExpired:
        proc.kill()
        proc.wait(timeout=5)


def run_attach(iterations):
    results = []
    for idx in range(iterations):
        force_stop()
        launch()
        pid = wait_for_pid()

        baseline_reason = f"attach_baseline_{idx}"
        trigger_scan(baseline_reason)
        baseline = read_remote_json("latest.json", expected_reason=baseline_reason)
        baseline_hits = latest_total_hits(baseline)

        pid = wait_for_pid()
        holder, ready = start_holder("attach", pid)
        try:
            if ready.get("ping") != 7:
                raise RuntimeError(f"attach ping failed: {ready}")
            inject_reason = f"attach_injected_{idx}"
            trigger_scan(inject_reason)
            report = read_remote_json("latest.json", expected_reason=inject_reason)
            results.append({
                "baseline": baseline,
                "injected": report,
            })
            if latest_total_hits(report) > baseline_hits:
                raise RuntimeError(
                    f"attach iteration {idx} saw injected hits={latest_total_hits(report)} baseline={baseline_hits} "
                    f"{summarize_report(report)}"
                )
        finally:
            stop_holder(holder)
    return results


def run_spawn(iterations):
    results = []
    for idx in range(iterations):
        force_stop()
        launch()
        wait_for_pid()
        baseline_reason = f"spawn_baseline_{idx}"
        trigger_scan(baseline_reason)
        baseline = read_remote_json("latest.json", expected_reason=baseline_reason)
        baseline_hits = latest_total_hits(baseline)
        force_stop()
        holder, ready = start_holder("spawn", PACKAGE)
        try:
            if ready.get("ping") != 7:
                raise RuntimeError(f"spawn ping failed: {ready}")
            inject_reason = f"spawn_injected_{idx}"
            trigger_scan(inject_reason)
            report = read_remote_json("latest.json", expected_reason=inject_reason)
            results.append({
                "baseline": baseline,
                "injected": report,
            })
            if latest_total_hits(report) > baseline_hits:
                raise RuntimeError(
                    f"spawn iteration {idx} saw injected hits={latest_total_hits(report)} baseline={baseline_hits} "
                    f"{summarize_report(report)}"
                )
        finally:
            stop_holder(holder)
    return results


def run_calibration():
    force_stop()
    launch()
    wait_for_pid()
    reason = "driver_calibration"
    trigger_scan(reason, calibrate=True)
    report = read_remote_json("calibration-latest.json", expected_reason=reason)
    before_hits = report["before"]["summary"]["totalHits"]
    after_hits = report["after"]["summary"]["totalHits"]
    if before_hits <= 0 or after_hits != 0:
        raise RuntimeError(f"calibration failed before={before_hits} after={after_hits}")
    return report


def load_agent_text(path):
    return pathlib.Path(path).read_text(encoding="utf-8")


def holder_attach(pid, agent_path):
    import frida

    device = frida.get_usb_device(timeout=5)
    session = device.attach(int(pid))
    script = session.create_script(load_agent_text(agent_path))
    script.load()
    ping = script.exports_sync.ping()
    print(json.dumps({"event": "ready", "mode": "attach", "pid": int(pid), "ping": ping}), flush=True)
    try:
        sys.stdin.read()
    finally:
        session.detach()


def holder_spawn(package, agent_path):
    import frida

    device = frida.get_usb_device(timeout=5)
    pid = device.spawn([package])
    session = device.attach(pid)
    script = session.create_script(load_agent_text(agent_path))
    script.load()
    device.resume(pid)
    time.sleep(1.5)
    ping = script.exports_sync.ping()
    print(json.dumps({"event": "ready", "mode": "spawn", "pid": pid, "ping": ping}), flush=True)
    try:
        sys.stdin.read()
    finally:
        session.detach()


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("command", nargs="?", default="all")
    parser.add_argument("--iterations", type=int, default=DEFAULT_ITERATIONS)
    args, extras = parser.parse_known_args()

    if args.command == "_hold_attach":
        holder_attach(extras[0], extras[1])
        return
    if args.command == "_hold_spawn":
        holder_spawn(extras[0], extras[1])
        return

    clear_reports_dir()

    if args.command in {"build", "all"}:
        ensure_built()
    if args.command in {"install", "all"}:
        ensure_installed()
    if args.command in {"calibrate", "all"}:
        print(json.dumps(run_calibration(), indent=2))
    if args.command in {"attach", "all"}:
        print(json.dumps({"attach": run_attach(args.iterations)}, indent=2))
    if args.command in {"spawn", "all"}:
        print(json.dumps({"spawn": run_spawn(args.iterations)}, indent=2))


if __name__ == "__main__":
    main()
