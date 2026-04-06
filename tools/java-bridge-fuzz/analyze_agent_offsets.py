#!/usr/bin/env python3
from __future__ import annotations

import argparse
import json
import re
import subprocess
from pathlib import Path


REPO_ROOT = Path(__file__).resolve().parents[2]
RAW_AGENT = REPO_ROOT / "frida17.8.0" / "build-android-arm64-server-cert" / "subprojects" / "frida-core" / "lib" / "agent" / "libsunda-agent-raw.so"


def run(*args: str) -> str:
    return subprocess.check_output(list(args), text=True, errors="replace")


def parse_nm(binary: Path) -> list[tuple[int, str, str]]:
    entries: list[tuple[int, str, str]] = []
    output = run("llvm-nm", "-an", str(binary))
    for line in output.splitlines():
        parts = line.split()
        if len(parts) >= 3 and re.fullmatch(r"[0-9a-fA-F]+", parts[0]):
            entries.append((int(parts[0], 16), parts[1], parts[2]))
    return entries


def nearest_symbols(entries: list[tuple[int, str, str]], target: int) -> dict[str, list[dict[str, str]]]:
    prev = [e for e in entries if e[0] <= target][-3:]
    nxt = [e for e in entries if e[0] > target][:3]
    return {
        "previous": [{"address": hex(a), "type": t, "name": n} for a, t, n in prev],
        "next": [{"address": hex(a), "type": t, "name": n} for a, t, n in nxt],
    }


def disassemble(binary: Path, offset: int, before: int = 0x20, after: int = 0x60) -> str:
    start = max(0, offset - before)
    stop = offset + after
    return run(
        "llvm-objdump",
        "--arch=arm64",
        "--source",
        "--line-numbers",
        "--demangle",
        f"--start-address={hex(start)}",
        f"--stop-address={hex(stop)}",
        str(binary),
    )


def parse_tombstone_offsets(tombstone: Path) -> list[int]:
    offsets: list[int] = []
    for line in tombstone.read_text(errors="replace").splitlines():
        if "/memfd:sunda-agent-64.so" in line:
            match = re.search(r"#\d+ pc ([0-9a-fA-F]+)", line)
            if match is not None:
                offsets.append(int(match.group(1), 16))
    return offsets


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--tombstone", required=True)
    parser.add_argument("--offset", action="append", default=[])
    parser.add_argument("--output", default="")
    args = parser.parse_args()

    tombstone = Path(args.tombstone).resolve()
    offsets = parse_tombstone_offsets(tombstone)
    offsets.extend(int(value, 16) for value in args.offset)
    offsets = list(dict.fromkeys(offsets))

    symbols = parse_nm(RAW_AGENT)
    result = {
        "binary": str(RAW_AGENT),
        "tombstone": str(tombstone),
        "offsets": [],
    }

    for off in offsets:
        result["offsets"].append(
            {
                "relative_offset": hex(off),
                "nearest_symbols": nearest_symbols(symbols, off),
                "disassembly": disassemble(RAW_AGENT, off),
            }
        )

    payload = json.dumps(result, indent=2, ensure_ascii=False)
    if args.output:
        Path(args.output).write_text(payload, encoding="utf-8")
    else:
        print(payload)
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
