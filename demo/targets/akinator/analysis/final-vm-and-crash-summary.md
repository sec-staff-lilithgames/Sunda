# Akinator VM And Crash Final Summary

Scope:
- current in-repo Akinator sample
- current connected Pixel 8a / Android 16 state
- objective: summarize the VM mapping, the real native logic we have recovered, and the real crash logic

## 1. What the VM really is

This sample is not exposing business logic as plain Java or plain native call chains.

The active execution model is:

```text
StartupLauncher.launch()
  -> VMRunner.invoke("ReqL9SxJHgWgm3cn", null)
    -> VMRunner.executeVM(byte[] vmCode, Object[] args)
      -> pairip_jni_execute_vm_bridge
        -> pairip_vm_interpreter_core_tentative
          -> jump-table-driven VM dispatcher
```

Recovered VM shape:
- `pairip_vm_interpreter_core_tentative` is the main VM dispatcher
- dispatcher opcode selection uses a `16-bit` table lookup
- the mapping table already proves that the VM works by large opcode families, not one small fixed handler
- several large native second-stage dispatchers are still called from inside the VM, especially `sub_2EED4`

So the correct working model is:
- Java only chooses an asset
- the asset becomes VM bytecode
- the real startup logic lives inside native VM families

## 2. What the mapping table already proves

Important dispatcher families recovered so far:

- startup verifier family:
  - entry block `0x5d61c..0x5d740`
  - loop block `0x5d758..0x5d774`
  - historical crash site `0x5d75c`
  - known static opcode family landing count on the entry block: `7`

- `sub_2EED4` dispatcher family:
  - dispatcher gate block `0x533d0..0x533fc`
  - `834` opcodes land in this block in the current first-pass map
  - this block directly calls `sub_2EED4`

- adjacent families around the same region:
  - `0x53388..0x533d0`: `12` opcodes
  - `0x53414..0x53448`: `49` opcodes
  - `0x53488..0x534a8`: `38` opcodes

This means the VM is already partially restored to the family level:
- we know which opcode sets enter which semantic bucket
- we do not yet know every opcode's business meaning
- but we do know which buckets are verifier or environment-policy buckets

## 3. Real startup logic recovered so far

### A. Startup verifier family `0x5d61c..0x5d798`

Recovered local logic:
- decodes several table-backed operands from VM state
- mutates an internal floating-point slot
- enters an FNV-style rolling hash loop over a selected blob-like region
- compares the derived value against an expected value
- uses the result to choose the next shared continuation

Practical meaning:
- this is a real native verifier
- not generic business code
- not generic JNI glue

### B. Late-attach branch through `sub_2EED4`

Recovered dispatcher edge:

```text
pairip_vm_interpreter_core_tentative
  -> block 0x533d0
    -> sub_2EED4(x0 = sp+0xa8, x1 = w23, x2 = sp+0xa4)
```

Recovered `sub_2EED4` branch logic around `0x47424..0x474c4`:
- initialize a 64-bit FNV-like seed
- load blob base from `[x22]`
- use stack-backed values and modulo reductions to choose a slice
- enter a byte-wise verification loop
- signed-byte load happens at `0x4746c`
- use stack-backed expected value and selection logic to decide the branch outcome

Practical meaning:
- this is another real native verifier branch
- it is VM-controlled
- it is not just suspicious infrastructure sitting next to the VM

## 4. What the caller-built state object means

Low-count late-attach entry probes on `sub_2EED4` showed:
- `x0` is a stable caller-built descriptor
- `x2 = x0 - 4`
- `x2` behaves like a mutable 32-bit side slot
- observed selector values in `x1` included:
  - `0x24`
  - `0x9f`
  - `0x19`
  - `0x0e`

Observed stable `x0` shape:

```text
offset +0x00: pointer-like field
offset +0x08: pointer-like field
offset +0x10: 0x000000af
offset +0x14: 0xffffffff
offset +0x18: 0x00000010
```

Practical meaning:
- `sub_2EED4` consumes a structured VM-built descriptor, not random registers
- the late-attach verifier branch is stateful and caller-directed
- the next unresolved step is descriptor field naming, not branch existence

## 5. Real crash logic

There is not one universal crash anymore.
There are multiple runtime phenotypes.

### A. Naked baseline on the current device state

- `25s` stable
- no crash

Meaning:
- current crashes are Frida- or probe-induced

### B. Spawn phenotype

- immediate native crash
- `SIGSEGV / SEGV_ACCERR`
- crash pc: `libpairipcore.so+0x5d75c`

Meaning:
- spawn still reproduces the historical startup verifier crash family

### C. Plain attach phenotype

- plain attach is currently stable for `25s`
- stable both without a script and with a no-op script
- no crash and no pid change in the current device state

Meaning:
- ordinary attach is not currently the non-detection point to fix

### D. Late attach phenotype

- delayed native crash after attach
- `SIGSEGV / SEGV_ACCERR`
- thread: `Thread-2`
- crash pc: `libpairipcore.so+0x4746c`

Meaning:
- once startup succeeds naked, late attach still drives execution into a second native verifier branch
- this branch lives in `sub_2EED4`

### E. Direct instruction-hook phenotype

- proves `0x47424` / `0x4746c` are genuinely executed
- but perturbs the crash back into WebView or agent-side aborts

Meaning:
- direct Frida instruction hooks are useful for reachability only
- not for preserving the original late-attach crash phenotype

## 6. Current best overall conclusion

The real logic recovered from the VM is:
- the startup asset enters a native VM
- the VM has at least two verifier-oriented native families already recovered:
  - the startup verifier family around `0x5d75c`
  - the late-attach verifier family in `sub_2EED4` around `0x4746c`
- these branches consume structured VM state, blob bases, expected values, and selectors
- they are not just passive environment scans

The real crash logic is:
- `spawn` hits the startup verifier branch and crashes at `0x5d75c`
- `late attach` hits a different VM-controlled verifier branch and crashes at `0x4746c`
- plain attach is currently stable
- direct low-level probing on the late-attach branch can still perturb execution into a WebView or `sunda-agent-64.so` abort path

So the sample is best understood as:
- a VM-protected startup path
- plus at least two stable Frida-sensitive runtime crash phenotypes
- where timing determines which verifier branch gets exercised

## 7. Detection vs bug classification

Current stable classification:
- detection points:
  - startup verifier crash at `0x5d75c`
  - late-attach verifier crash at `sub_2EED4 -> 0x4746c`
- current stable server bug crashes:
  - none proven

Reason:
- both stable crash PCs live inside recovered VM-controlled verifier branches
- neither stable crash PC lives inside our server or agent runtime
- the old WebView or `sunda-agent-64.so` abort is not currently reproducible under plain attach, so it is not a current stable bug target

## 8. Remaining unresolved point

The main unresolved point is no longer `where is the real logic`.

It is:
- what exact environment producer or encoded-state producer populates the descriptor fields that feed:
  - the startup verifier family `0x5d61c..0x5d798`
  - the late-attach verifier family `sub_2EED4 -> 0x47424..0x474c4`

That is the final missing link from VM family to concrete detection input.
