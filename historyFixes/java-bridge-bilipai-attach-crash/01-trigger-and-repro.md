# 01 Trigger And Repro

## Conclusion

The bug is triggered by attach-time Java bridge activity under hot pressure.
The test target is bilipai, but the crash belongs to our injected path.

## Trigger

- target package:
  - `com.android.purebilibili`
- device baseline:
  - current adb-connected Pixel 8a / Android 16
- authoritative server path:
  - `/data/local/.sunday/sunda`
- trigger shape:
  - attach
  - Java bridge active
  - native callback path exercised
  - hotter-pressure historical profile or reduced reproducer

## Stable Repro Entrypoints

- maintained reduced reproducer:
  - `tools/java-bridge-fuzz/cases/aggressive-attach-flake.reduced.json`
- maintained tracked attach baseline:
  - `tools/java-bridge-fuzz/cases/aggressive-attach-flake.json`

Wrapper scripts:

- `scripts/repro-reduced.sh`
- `scripts/repro-tracked-attach.sh`

## Evidence

- reduced repro pass/fail history:
  - `artifacts/current-regression-summary.json`
- historical hotter-pressure failure:
  - `artifacts/historical-hot-attach-failure-summary.txt`

## Explanation

The reproducer must be read as:

- bilipai provides a repeatable Android process shape
- our server injects our agent
- our bridge and callback machinery execute inside that process
- the crash occurs in that injected machinery
