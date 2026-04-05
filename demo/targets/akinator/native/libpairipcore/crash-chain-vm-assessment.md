# Crash Chain VM Assessment

Scope: local assessment of the crash path rooted at `libpairipcore.so+0x5d75c`.

## Confirmed crash chain

```text
System.loadLibrary("pairipcore")
  -> JNI_OnLoad / pairip_jni_on_load (0x80474)
    -> pairip_jni_execute_vm_bridge (0x62C78)
      -> pairip_vm_interpreter_core_tentative (0x52F20)
        -> crash at 0x5d75c
```

Key local evidence:
- `VMRunner.executeVM(byte[] vmCode, Object[] args)` is the Java native API surface.
- `StartupLauncher.launch()` invokes `VMRunner.invoke("ReqL9SxJHgWgm3cn", null)` during very early app startup.
- many unrelated Java wrappers across the app call `VMRunner.invoke("<16-char asset>", ...)` instead of exposing direct business code.
- `pairip_jni_execute_vm_bridge` copies a `jbyteArray` into native memory and forwards a compact descriptor plus Java args into `pairip_vm_interpreter_core_tentative`.
- `pairip_vm_interpreter_core_tentative` is a very large jumptable-driven dispatcher/state machine, not a normal narrow business function.

## Initial conclusion

This sample should be treated as VM-protected at the native execution layer.

More specifically:
- business logic is not primarily exposed as ordinary direct native call chains
- the stable analysis surface is `VMRunner.invoke(asset_name, args)` and the per-asset bytecode payloads under `assets/`
- `sub_52F20` is best treated as a VM interpreter/dispatcher core until disproved

## Implication for next analysis

Do not continue with ordinary naked call-graph analysis as the primary method.

Prefer this route:
1. identify the native registration / execute bridge shape once
2. classify the VM input format and descriptor layout
3. group Java callsites by asset name
4. focus on the crashing startup asset `ReqL9SxJHgWgm3cn`
5. map interpreter handlers / opcode dispatch behavior instead of trying to recover business logic from raw native call depth alone
