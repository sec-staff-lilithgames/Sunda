#!/usr/bin/env python3

from pathlib import Path
import re
import subprocess
import sys


HERE = Path(__file__).resolve().parent


def main() -> int:
    candidates = [
        HERE.parent.parent,
        HERE,
    ]

    for repo_root in candidates:
        match = re.fullmatch(r"frida(\d+\.\d+\.\d+)", repo_root.name)
        if match is not None:
            print(match.group(1))
            return 0

        helper = repo_root / "releng" / "frida_version.py"
        if not helper.exists():
            continue

        result = subprocess.run(
            [sys.executable, str(helper), str(repo_root)],
            check=True,
            capture_output=True,
            text=True,
        )
        print(result.stdout.strip())
        return 0

    print("0.0.0")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
