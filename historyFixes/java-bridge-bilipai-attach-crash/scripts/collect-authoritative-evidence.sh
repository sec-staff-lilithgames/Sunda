#!/usr/bin/env bash
set -euo pipefail

cd "$(dirname "$0")/../../.."

echo "This wrapper documents the canonical collection flow."
echo "Use the reduced reproducer and collect:"
echo "1. KernelSU dmesg"
echo "2. logcat"
echo "3. tombstone"
echo "4. lldb stop state"
echo
echo "Primary reduced repro:"
echo "python3 tools/java-bridge-fuzz/run_case.py --driver python --case tools/java-bridge-fuzz/cases/aggressive-attach-flake.reduced.json"
