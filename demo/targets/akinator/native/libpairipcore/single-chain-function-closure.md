# `0x5d75c` Single-Chain Function Closure

Scope: only the actual function-level closure touched by the crash chain.

## Upstream closure

```text
pairip_jni_on_load
  -> pairip_jni_execute_vm_bridge
    -> pairip_vm_interpreter_core_tentative
      -> crash subpath
```

### 1. `pairip_jni_on_load` (`0x80474`)
- role: root entry
- why in closure:
  - this is the topmost native entry on the observed startup path
  - dynamic low-intrusion trace confirms it fires first in the crashing launch
- caller status:
  - treat as root/no meaningful native caller for this chain

### 2. `pairip_jni_execute_vm_bridge` (`0x62c78`)
- role: transition function
- why in closure:
  - direct caller of the dispatcher function
  - packages VM input and forwards it
- recovered meaning:
  - reads bytecode length from JNI
  - allocates native byte buffer
  - copies `jbyteArray` contents
  - packs a compact descriptor `({ptr,len,0})`
  - forwards descriptor + Java args to dispatcher

### 3. `pairip_vm_interpreter_core_tentative` (`0x52f20`)
- role: core semantic function
- why in closure:
  - contains the dispatch logic
  - contains the crash block
- recovered meaning:
  - jump-table-driven VM dispatcher/state machine
  - crash subpath is an internal handler-family path inside this function

## Downstream closure

For the **actual crashing branch**, the function-level closure ends inside `pairip_vm_interpreter_core_tentative`.

Reason:
- the crash happens before this branch returns to `pairip_jni_execute_vm_bridge`
- on the crashing execution, no additional external callee is reached after the loop begins
- `0x5f1e0` is a shared in-function continuation block, not a separate callee

## Functions intentionally excluded

Excluded from this closure because they are not on the crashing branch itself:
- `sub_28DE4`
  - called by the bridge only after dispatcher return
  - not reached on the crashing execution
- unrelated dispatcher callees elsewhere in `pairip_vm_interpreter_core_tentative`
  - they exist globally
  - but are not part of this single-chain crash closure

## Closure conclusion

The actual crash-centric function closure is minimal:
- root: `pairip_jni_on_load`
- bridge: `pairip_jni_execute_vm_bridge`
- sink/core: `pairip_vm_interpreter_core_tentative`

At function level, the crashing branch is effectively a leaf inside the dispatcher core.
