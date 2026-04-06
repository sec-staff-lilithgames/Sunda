# 05 Root Cause And Fix

## Conclusion

Root cause:

- QuickJS native callback lifetime / ownership was too weak in the native callback path
- the system relied too much on wrapper reachability
- hot attach pressure could invalidate callback state while the callback path was still in flight

Fix:

- callback now owns durable references needed for invocation
- callbacks are tracked in `GumQuickCore`
- cleanup happens from the core side instead of relying on wrapper reachability alone

## Evidence

- canonical mapped functions:
  - `gum_quick_native_callback_invoke`
  - `ffi_closure_SYSV_inner`
  - `ffi_closure_SYSV`
- implementation contrast:
  - V8 callback path has stronger callback-owned / engine-owned lifetime control

## Modified Code Paths

- `frida17.8.0/subprojects/frida-gum/bindings/gumjs/gumquickcore.h`
- `frida17.8.0/subprojects/frida-gum/bindings/gumjs/gumquickcore.c`

## What Changed

Behavior-level change:

- QuickJS native callbacks now retain callback-owned references
- `GumQuickCore` now tracks active native callbacks for lifecycle cleanup
- callback cleanup is made explicit at core teardown

## Why This Fix

- It matches the mapped canonical crash site
- It fixes ownership where the crash actually lands
- It does not widen scope into unrelated Java bridge or app-specific code

## Why Not Elsewhere

- not in bilipai app:
  - wrong actor
- not in tombstone-only postmortem tooling:
  - wrong layer
- not in CLI script-loading:
  - separate blocker
- not in historical hotter-pressure branch:
  - separate still-open profile
