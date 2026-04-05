# Frida Attach And Spawn 20s Hold

Evidence directory:
- `demo/targets/akinator/evidence/2026-04-05-160418-frida-20s-hold/`

Target package:
- `com.digidust.elokence.akinator.freemium`

Host tool:
- `frida 17.8.0`

Device:
- Pixel 8a
- Android 16

## Attach result

Procedure:
- force-stop package
- launch normally through launcher intent
- attach by pid with a no-op Frida script
- keep session alive for 20 seconds

Observed state:
- initial pid: `21515`
- the process stayed on the same pid through almost the whole hold window
- near the 20-second mark the original pid disappeared
- after that a new pid appeared: `22497`

Recorded state change:
- `process_gone` at `t=19.991s`

Logcat-level effect:
- the attached process later hit `SIGABRT`
- the process died and the app was relaunched, which produced the later replacement pid

Interpretation:
- `attach` is not a stable no-change 20-second hold on this sample
- the sample state changes under attach before the hold completes cleanly

## Spawn result

Procedure:
- force-stop package
- spawn through Frida
- attach immediately
- load the same no-op Frida script
- resume and observe for 20 seconds

Observed state:
- spawned pid: `22938`
- the process detached almost immediately with `reason=process-terminated`
- no later pid for the package survived during the hold window

Recorded state changes:
- `session_detached`
- `process_gone` at `t=0.107s`

Crash identity:
- `SIGSEGV` / `SEGV_ACCERR`
- crash pc: `libpairipcore.so+0x5d75c`
- Frida crash summary reports `Bad access due to protection failure`

Interpretation:
- `spawn` is not a stable no-change 20-second hold on this sample
- it dies almost immediately and matches the already known startup native crash site

## Bottom line

- `attach`: no stable 20-second no-change hold
- `spawn`: no stable 20-second no-change hold
- both paths show state changes, so the stop condition `20s+ with no state change` is not satisfied

## Follow-up runtime split

Additional control and timing experiments:

- baseline control:
  - evidence: `demo/targets/akinator/evidence/2026-04-05-161031-baseline-25s-hold/`
  - result: no pid change and no crash over `25s`
  - meaning: the app does not die on its own under the same observation window

- late attach:
  - evidence: `demo/targets/akinator/evidence/2026-04-05-161146-late-attach-10s-then-20s/`
  - procedure: let the app run naked for `10s`, then attach and hold for `20s`
  - result: the pid stays stable during the visible `20s` hold window, but the process later dies and restarts on a new pid
  - crash identity from logcat:
    - `SIGSEGV` / `SEGV_ACCERR`
    - thread: `Thread-2`
    - crash pc: `libpairipcore.so+0x4746c`
  - meaning: attach timing changes the crash phenotype

Current runtime interpretation:
- naked baseline is stable
- early attach and late attach do not collapse to the same failure mode
- early attach produced a delayed abort path involving `libwebviewchromium.so` and `memfd:sunda-agent-64.so`
- late attach produced a later native crash inside `libpairipcore.so`
- spawn still reproduces the known startup native crash at `0x5d75c`
