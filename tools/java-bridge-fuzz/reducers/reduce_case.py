#!/usr/bin/env python3
from __future__ import annotations

import argparse
import json
import subprocess
import tempfile
from pathlib import Path


def run_case(driver: str, case_path: Path) -> dict:
    proc = subprocess.run(
        [
            "python3",
            "tools/java-bridge-fuzz/run_case.py",
            "--driver",
            driver,
            "--case",
            str(case_path),
        ],
        text=True,
        stdout=subprocess.PIPE,
        stderr=subprocess.PIPE,
        check=False,
    )
    lines = [line for line in proc.stdout.splitlines() if line.strip()]
    payload = json.loads("\n".join(lines[-len(lines):]))
    return payload


def case_matches(driver: str, candidate: dict, signature: str) -> bool:
    with tempfile.NamedTemporaryFile("w", suffix=".json", delete=False) as handle:
        path = Path(handle.name)
        handle.write(json.dumps(candidate, indent=2))

    try:
        payload = run_case(driver, path)
        for run in payload["runs"]:
            if run["signature"] == signature and run["ok"] is False:
                return True
        return False
    finally:
        path.unlink(missing_ok=True)


def try_reduce(case: dict, driver: str, signature: str) -> dict:
    reduced = json.loads(json.dumps(case))

    operations = reduced.get("operations", [])
    changed = True
    while changed:
        changed = False
        for index in range(len(operations)):
            candidate = json.loads(json.dumps(reduced))
            candidate["operations"] = operations[:index] + operations[index + 1:]
            if case_matches(driver, candidate, signature):
                reduced = candidate
                operations = reduced["operations"]
                changed = True
                break

    for field in ["rounds", "calls_per_round", "workers"]:
        stress = reduced.get("stress", {})
        value = int(stress.get(field, 1))
        while value > 1:
            candidate = json.loads(json.dumps(reduced))
            candidate["stress"][field] = max(1, value // 2)
            if case_matches(driver, candidate, signature):
                reduced = candidate
                value = candidate["stress"][field]
            else:
                break

    return reduced


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--driver", choices=["python", "cli"], required=True)
    parser.add_argument("--case", required=True)
    parser.add_argument("--signature", required=True)
    parser.add_argument("--output", default="")
    args = parser.parse_args()

    case_path = Path(args.case).resolve()
    case = json.loads(case_path.read_text(encoding="utf-8"))
    reduced = try_reduce(case, args.driver, args.signature)

    output = Path(args.output).resolve() if args.output else case_path.with_name(case_path.stem + ".reduced.json")
    output.write_text(json.dumps(reduced, indent=2), encoding="utf-8")
    print(json.dumps({"output": str(output)}, indent=2))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
