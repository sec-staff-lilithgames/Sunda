# Akinator Pending Classification

Scope:
- classify the currently recovered crash points as either:
  - detection point
  - server bug crash
- keep the result intentionally narrow

## Current pending items

### 1. `spawn -> libpairipcore.so+0x5d75c`

Classification:
- detection point

Why:
- this path is inside the recovered startup verifier family
- the family is VM-controlled
- it performs a real FNV-style blob verification loop and compare-select logic
- the crash occurs on the signed-byte load inside that verifier loop
- it is not inside our server or agent runtime

Current pending status:
- pending as `sample-side detection point`

### 2. `late attach -> sub_2EED4 -> libpairipcore.so+0x4746c`

Classification:
- detection point

Why:
- `sub_2EED4` is reached directly from the main VM dispatcher through block `0x533d0`
- the local `0x47424..0x474c4` code is another blob-verification branch
- entry probes proved this branch executes on `Thread-2`
- the crash point is again inside the verifier loop, not inside our server or agent runtime

Current pending status:
- pending as `sample-side detection point`

### 3. Historical `early attach -> libwebviewchromium.so + /memfd:sunda-agent-64.so`

Classification:
- not a current stable bug
- not a current stable detection point

Why:
- on the current device state, plain attach is stable for `25s`
- plain attach with a no-op script is also stable for `25s`
- the old WebView or agent-side abort can still be reintroduced by heavier direct instruction probes
- this makes it a probe-sensitive or historical perturbation path, not a current reproducible direct-fix target

Current pending status:
- pending as `historical/probe-perturbed path`
- explicitly not queued as a current server bug fix

## Bottom line

Current stable classification is:
- real detection points:
  - `0x5d75c`
  - `sub_2EED4 -> 0x4746c`
- current stable server bug crashes:
  - none proven
