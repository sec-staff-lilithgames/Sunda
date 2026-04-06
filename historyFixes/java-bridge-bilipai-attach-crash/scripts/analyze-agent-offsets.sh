#!/usr/bin/env bash
set -euo pipefail

if [[ $# -lt 1 ]]; then
  echo "usage: $0 <tombstone.txt> [output.json]" >&2
  exit 1
fi

cd "$(dirname "$0")/../../.."

tombstone="$1"
output="${2:-}"

if [[ -n "$output" ]]; then
  python3 tools/java-bridge-fuzz/analyze_agent_offsets.py --tombstone "$tombstone" --output "$output"
else
  python3 tools/java-bridge-fuzz/analyze_agent_offsets.py --tombstone "$tombstone"
fi
