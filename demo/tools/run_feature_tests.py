#!/usr/bin/env python3
import argparse
import json
import re
import subprocess
import sys
import time
import xml.etree.ElementTree as ET
from pathlib import Path

import run_pipeline as rp


ROOT = Path(__file__).resolve().parents[1]
DEFAULT_SERVER_PATH = "/data/local/tmp/sunda"
SUMMARY_ID = "com.sunda.demo:id/summaryView"
SCAN_BUTTON_TEXT = "Scan Now"
CALIBRATION_BUTTON_TEXT = "Run Calibration"


def run(cmd, *, check=True, capture_output=True):
    return subprocess.run(
        cmd,
        check=check,
        text=True,
        stdout=subprocess.PIPE if capture_output else None,
        stderr=subprocess.PIPE if capture_output else None,
    )


def quiet_adb_shell(command: str) -> None:
    run(["adb", "shell", command], capture_output=False)


def start_root_server(server_path: str) -> int:
    quiet_adb_shell(
        " ".join(
            [
                "zoey",
                "-c",
                f"'pidof frida-server-17.8.0 | xargs -r kill -9; "
                f"pidof sunda | xargs -r kill -9; "
                f"{server_path} >/data/local/tmp/sunda.feature.log 2>&1 &'",
            ]
        )
    )
    deadline = time.time() + 10
    while time.time() < deadline:
        result = run(["adb", "shell", "pidof", "sunda"], check=False)
        pid = result.stdout.strip()
        if pid:
            return int(pid.split()[0])
        time.sleep(0.5)
    raise RuntimeError("sunda server did not start")


def extract_xml(text: str) -> str:
    start = text.find("<?xml")
    end = text.rfind("</hierarchy>")
    if start == -1 or end == -1:
        raise RuntimeError("uiautomator dump did not contain XML")
    return text[start : end + len("</hierarchy>")]


def dump_ui() -> ET.Element:
    result = run(["adb", "exec-out", "uiautomator", "dump", "/dev/tty"])
    return ET.fromstring(extract_xml(result.stdout))


def find_node(root: ET.Element, *, resource_id: str | None = None, text: str | None = None) -> ET.Element:
    for node in root.iter("node"):
        if resource_id is not None and node.attrib.get("resource-id") != resource_id:
            continue
        if text is not None and node.attrib.get("text") != text:
            continue
        return node
    needle = resource_id if resource_id is not None else text
    raise RuntimeError(f"UI node not found: {needle}")


def bounds_center(bounds: str) -> tuple[int, int]:
    match = re.fullmatch(r"\[(\d+),(\d+)\]\[(\d+),(\d+)\]", bounds)
    if match is None:
        raise RuntimeError(f"unexpected bounds: {bounds}")
    x1, y1, x2, y2 = map(int, match.groups())
    return ((x1 + x2) // 2, (y1 + y2) // 2)


def tap_button(text: str) -> None:
    root = dump_ui()
    node = find_node(root, text=text)
    x, y = bounds_center(node.attrib["bounds"])
    quiet_adb_shell(f"input tap {x} {y}")


def current_summary_text() -> str:
    deadline = time.time() + 5
    last_error = None
    while time.time() < deadline:
        try:
            root = dump_ui()
            node = find_node(root, resource_id=SUMMARY_ID)
            return node.attrib.get("text", "")
        except Exception as e:
            last_error = e
            time.sleep(0.25)
    raise RuntimeError(f"summary view unavailable: {last_error}")


def expect(condition: bool, message: str) -> None:
    if not condition:
        raise RuntimeError(message)


def launch_activity() -> int:
    rp.force_stop()
    rp.launch()
    return rp.wait_for_pid()


def run_test(name: str, func):
    started = time.time()
    try:
        details = func()
        return {
            "name": name,
            "status": "PASS",
            "elapsedMs": int((time.time() - started) * 1000),
            "details": details,
        }
    except Exception as e:
        return {
            "name": name,
            "status": "FAIL",
            "elapsedMs": int((time.time() - started) * 1000),
            "error": str(e),
        }


def test_activity_launch():
    pid = launch_activity()
    root = dump_ui()
    title = find_node(root, resource_id="com.sunda.demo:id/titleView").attrib.get("text", "")
    summary = find_node(root, resource_id=SUMMARY_ID).attrib.get("text", "")
    find_node(root, text=SCAN_BUTTON_TEXT)
    find_node(root, text=CALIBRATION_BUTTON_TEXT)
    expect(title == "Hello World from Sunda Demo", "unexpected title text")
    expect(summary != "", "summary text is empty")
    return {
        "pid": pid,
        "title": title,
        "summary": summary,
    }


def test_broadcast_scan():
    launch_activity()
    reason = "feature_broadcast_scan"
    rp.trigger_scan(reason)
    report = rp.read_remote_json("latest.json", expected_reason=reason)
    expect(report["summary"]["totalHits"] == 0, "broadcast scan baseline should stay zero")
    return {
        "reason": report["reason"],
        "totalHits": report["summary"]["totalHits"],
    }


def test_broadcast_calibration():
    launch_activity()
    reason = "feature_broadcast_calibration"
    rp.trigger_scan(reason, calibrate=True)
    report = rp.read_remote_json("calibration-latest.json", expected_reason=reason)
    before_hits = report["before"]["summary"]["totalHits"]
    after_hits = report["after"]["summary"]["totalHits"]
    expect(before_hits > 0, "calibration beforeHits should be positive")
    expect(after_hits == 0, "calibration afterHits should be zero")
    return {
        "reason": report["reason"],
        "beforeHits": before_hits,
        "afterHits": after_hits,
    }


def test_ui_scan_button():
    launch_activity()
    tap_button(SCAN_BUTTON_TEXT)
    report = rp.read_remote_json("latest.json", expected_reason="activity_button")
    expect(report["summary"]["totalHits"] == 0, "UI scan button should keep baseline zero")
    return {
        "reason": report["reason"],
        "totalHits": report["summary"]["totalHits"],
    }


def test_ui_calibration_button():
    launch_activity()
    tap_button(CALIBRATION_BUTTON_TEXT)
    report = rp.read_remote_json("calibration-latest.json", expected_reason="activity_calibration")
    before_hits = report["before"]["summary"]["totalHits"]
    after_hits = report["after"]["summary"]["totalHits"]
    expect(before_hits > 0, "UI calibration beforeHits should be positive")
    expect(after_hits == 0, "UI calibration afterHits should be zero")
    return {
        "reason": report["reason"],
        "beforeHits": before_hits,
        "afterHits": after_hits,
    }


def test_attach_path():
    results = rp.run_attach(1)
    injected = results[0]["injected"]["summary"]
    expect(injected["totalHits"] == 0, "attach injected hits regressed")
    return {
        "baselineHits": results[0]["baseline"]["summary"]["totalHits"],
        "injectedHits": injected["totalHits"],
    }


def test_spawn_path():
    results = rp.run_spawn(1)
    injected = results[0]["injected"]["summary"]
    expect(injected["totalHits"] == 0, "spawn injected hits regressed")
    return {
        "baselineHits": results[0]["baseline"]["summary"]["totalHits"],
        "injectedHits": injected["totalHits"],
    }


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--build", action="store_true", help="rebuild the demo APK before testing")
    parser.add_argument("--install", action="store_true", help="reinstall the demo APK before testing")
    parser.add_argument("--server-path", default=DEFAULT_SERVER_PATH, help="server binary path on device")
    args = parser.parse_args()

    if args.build:
        rp.ensure_built()
    if args.install:
        rp.ensure_installed()

    rp.clear_reports_dir()
    server_pid = start_root_server(args.server_path)

    tests = [
        ("activity_launch", test_activity_launch),
        ("broadcast_scan", test_broadcast_scan),
        ("broadcast_calibration", test_broadcast_calibration),
        ("ui_scan_button", test_ui_scan_button),
        ("ui_calibration_button", test_ui_calibration_button),
        ("attach_path", test_attach_path),
        ("spawn_path", test_spawn_path),
    ]

    results = [run_test(name, func) for name, func in tests]
    failed = [item for item in results if item["status"] != "PASS"]
    payload = {
        "serverPid": server_pid,
        "allPassed": len(failed) == 0,
        "results": results,
    }
    print(json.dumps(payload, indent=2))
    sys.exit(1 if failed else 0)


if __name__ == "__main__":
    main()
