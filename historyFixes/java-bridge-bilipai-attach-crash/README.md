# Java Bridge Bilipai Attach Crash

## Conclusion

This archive records the complete investigation and fix history for the Java bridge attach crash chain.

Important role split:

- Primary subject:
  - our own `sunda` server
  - injected `sunda-agent-64.so`
  - Java bridge / QuickJS callback lifetime behavior
- Trigger-only test target:
  - `com.android.purebilibili`

`bilipai` is not the main actor of the bug.
It is the repeatable environment used to expose the bug in our own injected path.

## Key Entrypoints

- Summary:
  - `00-summary.md`
- Trigger and repro:
  - `01-trigger-and-repro.md`
- Investigation timeline:
  - `02-investigation-timeline.md`
- Evidence chain:
  - `03-evidence-chain.md`
- Reasoning:
  - `04-reasoning-and-theory.md`
- Root cause and fix:
  - `05-root-cause-and-fix.md`
- Regression and classification:
  - `06-regression-and-classification.md`
- Machine index:
  - `index.json`

## Key Scripts

- `scripts/repro-reduced.sh`
- `scripts/repro-tracked-attach.sh`
- `scripts/run-regression.sh`
- `scripts/collect-authoritative-evidence.sh`
- `scripts/analyze-agent-offsets.sh`

## Key Artifacts

- `artifacts/authoritative-tombstone.txt`
- `artifacts/authoritative-logcat-excerpt.txt`
- `artifacts/authoritative-dmesg-excerpt.txt`
- `artifacts/authoritative-offset-analysis.json`
- `artifacts/authoritative-lldb-summary.txt`
- `artifacts/historical-hot-attach-failure-summary.txt`
- `artifacts/current-regression-summary.json`
