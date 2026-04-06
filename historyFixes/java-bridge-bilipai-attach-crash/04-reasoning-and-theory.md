# 04 Reasoning And Theory

## Conclusion

The strongest theory is not “bilipai crashes under attach.”
The strongest theory is:

- our injected QuickJS native callback path had weaker lifetime / ownership guarantees than the V8 path
- hot attach pressure exposed that weakness
- bilipai only made the path easy to hit

## Evidence

- mapped crash point:
  - `gum_quick_native_callback_invoke`
- libffi bridge frames:
  - `ffi_closure_SYSV_inner`
  - `ffi_closure_SYSV`
- V8 comparison:
  - persistent globals and explicit callback retention

## Reasoning

1. The crash is in our memfd agent image, not in bilipai code.
2. The canonical mapped point lands in the QuickJS native callback invoke path.
3. The crashing instruction is reached after libffi closure dispatch, which is exactly the bridge between native callback invocation and JS ownership.
4. The V8 implementation keeps explicit persistent handles and callback lifetime management.
5. The QuickJS implementation had a weaker model centered around wrapper reachability.
6. Therefore, callback lifetime / ownership is the most defensible root-cause family.

## Why Other Theories Were Weaker

- “bilipai app bug”
  - rejected because canonical frames are inside our agent
- “transport-only teardown”
  - rejected because tombstone and `lldb` prove real native crash
- “enumerateMethods parsing bug as the primary event”
  - weaker than callback-lifetime because mapped canonical crash does not land there

## Explanation

This theory is specific enough to justify a narrow fix, but broad enough to explain:

- `script has been destroyed`
- `connection is closed`
- tombstone main-thread crash
- early `lldb` transient crash surfaces
