# 00 Summary

## Conclusion

The crash chain is rooted in our own injected QuickJS callback path, not in the test target app itself.

Canonical source-level chain:

- `0x97d4dc -> gum_quick_native_callback_invoke`
- `0xaa06a4 -> ffi_closure_SYSV_inner`
- `0xaa0ac0 -> ffi_closure_SYSV`

The crash localizes to QuickJS native callback lifetime behavior after libffi closure dispatch.

## Evidence

- canonical tombstone offset analysis:
  - `artifacts/authoritative-offset-analysis.json`
- authoritative crash narrative:
  - `03-evidence-chain.md`
- root-cause reasoning:
  - `04-reasoning-and-theory.md`
- fix details:
  - `05-root-cause-and-fix.md`
- regression state:
  - `06-regression-and-classification.md`

## Explanation

The test app `com.android.purebilibili` is only the trigger environment.
The failure event happens inside `/memfd:sunda-agent-64.so`, and the mapped offsets resolve into our own agent and bridge path.

## Current Status

- current maintained baseline:
  - fixed-current-baseline
- still-open branch:
  - historical-hotter-branch-open
