#!/usr/bin/env python3
from __future__ import annotations

import argparse
import json
import sys
from pathlib import Path

from drivers.cli_driver import run_case as run_cli_case
from drivers.common import make_output_dir, read_case, write_output_bundle, write_repro
from drivers.python_driver import run_case as run_python_case


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--driver", choices=["python", "cli", "both"], default="both")
    parser.add_argument("--case", required=True, help="Path to a case JSON file")
    args = parser.parse_args()

    case_path = Path(args.case).resolve()
    case = read_case(case_path)

    drivers = ["python", "cli"] if args.driver == "both" else [args.driver]
    summaries: list[dict] = []

    for driver_name in drivers:
        out_dir = make_output_dir(case["id"], driver_name)
        case_copy = json.loads(json.dumps(case))
        case_copy["_output_dir"] = str(out_dir)

        if driver_name == "python":
            result = run_python_case(case_copy)
            stdout = ""
            stderr = ""
        else:
            result, stdout, stderr = run_cli_case(case_copy)

        write_output_bundle(out_dir, case, result, stdout=stdout, stderr=stderr)
        write_repro(out_dir, driver_name, case_path)
        summaries.append(
            {
                "driver": driver_name,
                "outputDir": str(out_dir),
                "ok": result["ok"],
                "signature": result["signature"],
                "failure": result["failure"],
            }
        )

    print(json.dumps({"runs": summaries}, indent=2, ensure_ascii=False))
    return 0 if all(item["ok"] for item in summaries) else 1


if __name__ == "__main__":
    raise SystemExit(main())
