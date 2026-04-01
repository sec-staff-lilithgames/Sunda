#!/usr/bin/env python3

import argparse
from dataclasses import dataclass
import os
from pathlib import Path
import subprocess
import re
import sys
from typing import List


RELENG_DIR = Path(__file__).resolve().parent
ROOT_DIR = RELENG_DIR.parent


@dataclass
class FridaVersion:
    name: str
    major: int
    minor: int
    micro: int
    nano: int
    commit: str


def main(argv: List[str]):
    parser = argparse.ArgumentParser()
    parser.add_argument("repo", nargs="?", type=Path, default=ROOT_DIR)
    args = parser.parse_args()

    version = detect(args.repo)
    print(version.name)


def detect(repo: Path) -> FridaVersion:
    version_name = "0.0.0"
    major = 0
    minor = 0
    micro = 0
    nano = 0
    commit = ""

    env_version = os.environ.get("FRIDA_VERSION")
    if env_version:
        return parse(env_version)

    if (repo / ".git").exists():
        description = subprocess.run(["git", "describe", "--tags", "--always", "--long"],
                                     cwd=repo,
                                     capture_output=True,
                                     encoding="utf-8").stdout

        tokens = description.strip().replace("-", ".").split(".")
        if len(tokens) > 1:
            (raw_major, raw_minor, raw_micro, raw_nano, commit) = tokens
            major = int(raw_major)
            minor = int(raw_minor)
            micro = int(raw_micro)
            nano = int(raw_nano)
            if nano > 0:
                micro += 1

            if nano == 0:
                version_name = f"{major}.{minor}.{micro}"
            else:
                version_name = f"{major}.{minor}.{micro}-dev.{nano - 1}"
        else:
            commit = tokens[0]

    return FridaVersion(version_name, major, minor, micro, nano, commit)


def parse(raw_version: str) -> FridaVersion:
    match = re.fullmatch(r"(\d+)\.(\d+)\.(\d+)(?:-dev\.(\d+))?", raw_version)
    if match is None:
        raise ValueError(f"Unsupported FRIDA_VERSION: {raw_version}")

    major = int(match.group(1))
    minor = int(match.group(2))
    micro = int(match.group(3))
    dev = match.group(4)
    nano = 0 if dev is None else int(dev) + 1

    return FridaVersion(raw_version, major, minor, micro, nano, "")


if __name__ == "__main__":
    main(sys.argv)
