# 03 Evidence Chain

## Conclusion

The complete evidence chain is:

1. KernelSU privileged execution path
2. reduced replay inside bilipai
3. real native crash in `/memfd:sunda-agent-64.so`
4. canonical tombstone frames
5. local offset mapping into QuickJS callback source

`bilipai` is only the trigger environment.
The chain terminates in our own code.

## Evidence

### Layer 1: KernelSU / dmesg

Artifacts:

- `artifacts/authoritative-dmesg-excerpt.txt`

Key facts:

- `commit_common_su`
- `handle_before_execve`

Meaning:

- privileged process-control path is real
- replay is not a hypothetical or user-space-only story

### Layer 2: logcat

Artifacts:

- `artifacts/authoritative-logcat-excerpt.txt`

Key facts:

- `Fatal signal 11 (SIGSEGV)`
- `tombstoned`
- `Process com.android.purebilibili ... has died`

Meaning:

- the primary event is process death
- Frida-side teardown is downstream

### Layer 3: tombstone

Artifacts:

- `artifacts/authoritative-tombstone.txt`

Key facts:

- canonical hit points:
  - `#00 0x97d4dc`
  - `#01 0xaa06a4`
  - `#02 0xaa0ac0`
- crash location:
  - `/memfd:sunda-agent-64.so`
- bridge boundary:
  - `art_quick_generic_jni_trampoline`

Meaning:

- canonical crash chain already enters our injected image before returning into ART trampoline logic

### Layer 4: lldb

Artifacts:

- `artifacts/authoritative-lldb-summary.txt`

Key facts:

- earlier stop states:
  - `0x7289dc78`
  - `0x724eaf78`
- later authoritative existing-pid stops:
  - `0x72270070`
  - `0x722f02e0`

Meaning:

- there are transient earlier crash surfaces before the final tombstone stabilizes
- they enrich the chain even when they are not all normalized to final relative offsets

### Layer 5: local offset analysis

Artifacts:

- `artifacts/authoritative-offset-analysis.json`

Key facts:

- `0x97d4dc -> gum_quick_native_callback_invoke`
- `0xaa06a4 -> ffi_closure_SYSV_inner`
- `0xaa0ac0 -> ffi_closure_SYSV`

Meaning:

- the crash is no longer anonymous
- it is source-level and belongs to our own callback path

## Explanation

The chain is only coherent if we keep the actor hierarchy explicit:

- trigger actor:
  - bilipai app process
- failing actor:
  - our injected `sunda-agent-64.so`
- failing subsystem:
  - QuickJS native callback invoke path
