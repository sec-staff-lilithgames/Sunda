# Akinator Runtime Evidence Review

Scope:
- current package state on the connected Pixel 8a
- upstream `frida 17.8.0`
- objective is to reconcile the runtime phenotypes before deeper reverse engineering

## 1. Evidence set

Current retained runtime evidence used in this review:
- startup no-debug crash baseline from the earlier desktop session:
  - `evidence/2026-04-01-113209-baseline-no-debug/`
- `attach` / `spawn` 20-second hold:
  - `evidence/2026-04-05-160418-frida-20s-hold/`
- naked 25-second control:
  - `evidence/2026-04-05-161031-baseline-25s-hold/`
- late attach after 10-second naked idle:
  - `evidence/2026-04-05-161146-late-attach-10s-then-20s/`
- late attach with a direct Frida probe on `sub_2EED4+0x18598` / `0x47424` and `+0x185e0` / `0x4746c`:
  - `evidence/2026-04-05-161838-late-attach-probe-4746c/`

## 2. Runtime phenotypes

### A. Historical no-debug startup phenotype

Observed earlier:
- no Frida
- process dies during startup
- crash pc: `libpairipcore.so+0x5d75c`

Meaning:
- the old baseline established the `startup VM verifier` crash family
- this is the origin of the `0x5d61c..0x5d798` recovery work

### B. Current naked control phenotype

Observed now:
- no Frida
- process stays on one pid for `25s`
- no crash, no relaunch

Meaning:
- on the current device state, the app is now stable without Frida
- any new crash in the current turn must be treated as Frida-induced or probe-induced, not as unavoidable app startup behavior

### C. Spawn phenotype

Observed now:
- `spawn` through Frida dies almost immediately
- detach reason: `process-terminated`
- crash pc: `libpairipcore.so+0x5d75c`
- signal: `SIGSEGV / SEGV_ACCERR`

Meaning:
- `spawn` still reproduces the known startup native verifier crash
- this remains the closest runtime path to the original startup failure

### D. Historical early attach phenotype

Observed earlier:
- attach immediately after launcher start
- process stays alive for most of the hold window
- later dies and the app relaunches on a new pid
- crash path:
  - `SIGABRT`
  - abort message: `length_error was thrown in -fno-exceptions mode with message "vector"`
  - stack includes `libwebviewchromium.so`
  - stack also includes `/memfd:sunda-agent-64.so`

Meaning:
- this is not the startup verifier crash
- this is a delayed Frida-induced abort path
- it likely reflects one earlier attach perturbation path, not a stable current attach outcome

### E. Current plain attach phenotype

Observed now:
- attach without loading any script for `25s`
- attach and load a no-op script for `25s`
- same pid remains alive throughout both windows
- no crash and no relaunch

Meaning:
- plain attach is currently stable on this device state
- there is no currently reproducible direct-fix point in ordinary attach itself
- the old WebView/agent abort must be treated as historical evidence, not as the current default attach truth

### F. Late attach phenotype

Observed now:
- let the app run naked for `10s`
- attach after the app is already stable
- process remains on the same pid throughout the visible hold window
- later dies and relaunches on a new pid
- crash path:
  - `SIGSEGV / SEGV_ACCERR`
  - thread: `Thread-2`
  - crash pc: `libpairipcore.so+0x4746c`

Static identity:
- `0x4746c` is inside `sub_2EED4`
- `sub_2EED4` is one of the already known high-value environment-policy dispatchers
- `sub_2EED4` is called directly from `pairip_vm_interpreter_core_tentative`

Meaning:
- once startup has already succeeded, attach can still drive execution into a different native integrity path
- this path is no longer `0x5d75c`
- the attach timing changes which native branch is exercised

### G. Direct Frida probe phenotype

Observed now:
- a late attach with direct hooks on `0x47424` and `0x4746c`
- the hooks successfully fired on `Thread-2`
- captured loop state twice before failure
- but the crash phenotype shifted again:
  - `SIGABRT`
  - `std::bad_alloc`
  - stack returned to `libwebviewchromium.so + /memfd:sunda-agent-64.so`

Captured loop facts:
- `0x4746c` does execute at runtime under late attach
- the executing thread is `Thread-2`
- observed `x25 == 1` and `x11 == 0` on sampled hits
- the probe itself is not low-perturbation enough to preserve the native `0x4746c` crash phenotype

Meaning:
- the `0x4746c` region is a real executed path, not dead static code
- but direct Frida instruction hooks are too invasive to use as the primary truth source for this sample

## 3. Current review conclusion

The current stable runtime picture is:

1. naked baseline:
   - stable for `25s`

2. plain attach:
   - stable for `25s`
   - stable both with and without a no-op script

3. `spawn`:
   - immediate native verifier crash at `0x5d75c`

4. `late attach`:
   - later native crash at `sub_2EED4+0x18598` family, specifically `0x4746c`

5. direct Frida instruction probe on the late-attach branch:
   - perturbs the path into a WebView/agent-side abort

This means:
- there is no stable current `early attach crash`
- the two stable current native crash phenotypes are `spawn -> 0x5d75c` and `late attach -> 0x4746c`
- the WebView-side abort should now be treated as a probe-sensitive or historical attach perturbation, not as the mainline attach truth

## 4. Most defensible current reason

Current best explanation is:
- the app has multiple environment-sensitive checks or integrity-sensitive execution branches
- `spawn` perturbs the earliest VM verifier path and still reaches `0x5d75c`
- `late attach` avoids the earliest startup verifier, but later native logic in `sub_2EED4` still sees enough altered environment to crash in a different branch
- direct low-level Frida probes on that late-attach branch add enough extra perturbation to reintroduce the WebView/agent-side abort path

## 5. What not to conclude yet

Do not conclude yet that:
- `sub_2EED4+0x4746c` is definitively Frida-specific
- the WebView abort is a stable current attach result
- the old no-debug `0x5d75c` baseline is still the naked baseline on current device state

Current evidence only proves:
- Frida changes execution outcome
- attach timing changes which failure path is hit
- `sub_2EED4` is now a live native target for the late-attach branch

## 6. Best next debugging slice

The next safe slice should stay runtime-first but lower-perturbation than direct instruction hooks:
- keep the current phenotype split:
  - naked baseline
  - spawn
  - early attach
  - late attach
- use static recovery on `sub_2EED4` around `0x47424..0x474c4`
- prefer low-intrusion runtime evidence on the late-attach branch over more Frida instruction hooks

Practical target:
- explain what `x22`, `x25`, `x27`, and the blob base loaded at `0x47428..0x47454` mean in `sub_2EED4`
- then connect that branch back to one concrete environment producer or state blob
