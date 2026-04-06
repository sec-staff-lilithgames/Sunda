#!/usr/bin/env bash
set -euo pipefail

cd "$(dirname "$0")/../../.."

python3 tools/java-bridge-fuzz/run_case.py --driver python --case tools/java-bridge-fuzz/cases/aggressive-attach-flake.reduced.json
python3 tools/java-bridge-fuzz/run_case.py --driver python --case tools/java-bridge-fuzz/cases/aggressive-attach-flake.json
python3 tools/java-bridge-fuzz/run_case.py --driver python --case tools/java-bridge-fuzz/cases/smoke-attach-core.json
python3 tools/java-bridge-fuzz/run_case.py --driver python --case tools/java-bridge-fuzz/cases/smoke-spawn-enumerate.json
