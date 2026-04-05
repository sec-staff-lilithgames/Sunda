# Final Crash Conclusion For `0x5d75c`

## Final conclusion

`0x5d75c` is inside a startup-time VM handler family reached through:

```text
pairip_jni_on_load
  -> pairip_jni_execute_vm_bridge
    -> pairip_vm_interpreter_core_tentative
      -> crash family entry block 0x5d61c
        -> loop setup 0x5d740
          -> byte-hash loop 0x5d758 (crash at 0x5d75c)
```

This chain is not generic business logic. It is a VM-internal decode + verify path.

## What the chain does

The recovered handler-family semantics are:
1. decode several table-backed operands from VM state
2. update the live state/pc cursor
3. perform a floating-point multiply-store mutation in the internal arena
4. enter a byte-wise FNV-style rolling hash / verification loop over a selected blob-like region
5. compare the derived result against an expected value
6. on success/non-crash, merge back into a shared dispatcher continuation

## Most direct fault mechanism

The strongest current conclusion is:

**the crash is caused by corrupted or unchecked loop-length / loop-progress state, which drives the byte-wise hash loop past the selected blob boundary and into an inaccessible page.**

Why this is the strongest conclusion:
- crash instruction is a plain byte load:
  - `ldrsb x2, [x16, x11]`
- tombstone register relation is exact:
  - `fault = x16 + x11`
- `x16` already points inside the selected blob region
- `x11` is huge (`0x3385f`) and acts as the byte index
- `w17` is also non-sane for a normal small bounded byte loop

So the immediate crash cause is not “dispatcher entry failure” and not “JNI bridge failure”.
It is an **out-of-bounds read during the rolling hash loop**.

## Upstream source of the bad state

At the current confidence level:
- the nearest upstream producer of the bad state is **inside the same handler family**, starting at `0x5d61c`
- the external caller `pairip_jni_execute_vm_bridge` only forwards the VM descriptor and args
- there is no current evidence that the bridge itself computes the bad `x16/x11/w17` values

So the likely bad-state source is:
- malformed/decoded VM state inside the handler family
- not the JNI bridge packaging layer

## What this means for next reverse-engineering work

The next target should not be `0x5d75c` alone.

The correct next semantic unit is the full family:
- `0x5d61c..0x5d740`
- `0x5d740..0x5d758`
- `0x5d758..0x5d774`
- `0x5d774..0x5d798`

And the next questions should be:
- where does the selected blob base (`x10/x16`) come from
- where does the byte count (`w17`) come from
- why do these seven opcodes share this family
- whether the failure is malformed VM bytecode state or an intentional guard/fail path

## Bottom line

`0x5d75c` is not just “some verification-like code”.

It is a **VM handler-family over-read in a rolling FNV-style byte-hash loop**, and the current best crash explanation is:

**bad loop-bound / state-derived length causes the verifier to walk off the selected blob and fault on the byte load.**
