# Java Bridge Fuzz Baseline

`tools/java-bridge-fuzz/` is the tracked home for the bilipai-only Java bridge fuzz baseline.

Current scope:

- target package: `com.android.purebilibili`
- device model: current adb-connected Pixel 8a / Android 16
- authoritative device server path: `/data/local/.sunday/sunda`
- driver surfaces:
  - Python raw `create_script()`
  - `frida` CLI

## Layout

- `SOURCE-READING.md`
  - focused source-reading notes for current Java bridge hotspots
- `cases/`
  - tracked fuzz case definitions
- `corpus/seed/`
  - tracked seed copies used as the initial corpus
- `agents/`
  - shared Frida JS harness
- `drivers/`
  - Python raw driver, CLI driver, and shared helpers
- `reducers/`
  - minimizer for failing cases
- `outputs/`
  - runtime artifacts; ignored by Git

## Case Model

Each case is JSON. Important fields:

- `id`
- `package`
- `mode`
  - `attach` or `spawn`
- `launch`
  - `strategy`: `cold`, `delayed_attach`, or `spawn`
  - `delay_ms`
- `driver`
  - `repeat_sessions`
  - `timeout_seconds`
- `entry`
  - ordered list of `performNow` / `perform`
- `targets`
  - classes and enumerate-method queries
- `operations`
  - ordered operation list executed by the shared harness
- `stress`
  - rounds, call counts, and worker count
- `expect`
  - crash-worthy event kinds

## Run

Run one case through both drivers:

```bash
python3 tools/java-bridge-fuzz/run_case.py --driver both --case tools/java-bridge-fuzz/cases/smoke-attach-core.json
```

Run only the Python raw path:

```bash
python3 tools/java-bridge-fuzz/run_case.py --driver python --case tools/java-bridge-fuzz/cases/aggressive-attach-flake.json
```

`aggressive-attach-flake.json` is the current attach-stress baseline for the edge-by-edge workflow.
It is intentionally moderated below the historical crash-inducing pressure level so the tracked seed stays replayable while the older failure remains preserved in captured output bundles.

Run only the CLI path:

```bash
python3 tools/java-bridge-fuzz/run_case.py --driver cli --case tools/java-bridge-fuzz/cases/smoke-spawn-enumerate.json
```

Map canonical tombstone hit points back to the rebuilt local agent image:

```bash
python3 tools/java-bridge-fuzz/analyze_agent_offsets.py \
  --tombstone tools/java-bridge-fuzz/outputs/<evidence-dir>/tombstone.txt \
  --output tools/java-bridge-fuzz/outputs/<evidence-dir>/agent-offset-analysis.json
```

## Output Contract

Each run writes to:

```text
tools/java-bridge-fuzz/outputs/<timestamp>-<case-id>-<driver>/
```

Tracked fields:

- `case.json`
- `stdout.txt`
- `stderr.txt`
- `logcat.txt`
- `result.json`
- `detach.json`
- `repro.sh`

`result.json` is the canonical machine-readable summary. `detach.json` is the extracted detached-event view.

## Result Rules

Runs are treated as failures if any of these happen:

- `frida.TransportError: the connection is closed`
- detached session with reason other than `application-requested`
- `frida.Crash`
- pid loss or pid drift after the fuzz session
- uncaught error during `script.load()`, `Java.perform*()`, `Java.use()`, `Java.enumerateMethods()`, or hook install/call

## Replay

Replay a captured failure directly:

```bash
bash tools/java-bridge-fuzz/outputs/<timestamp>-<case-id>-<driver>/repro.sh
```

## Reduction

Reduce a failing case:

```bash
python3 tools/java-bridge-fuzz/reducers/reduce_case.py \
  --driver python \
  --case tools/java-bridge-fuzz/outputs/<timestamp>-<case-id>-<driver>/case.json \
  --signature '<failure-signature>'
```

The reducer keeps a mutation only if the rerun still matches the requested signature.

Current repo state:

- `cases/aggressive-attach-flake.json`
  - maintained medium-pressure attach stress seed that currently passes
- `cases/aggressive-attach-flake.reduced.json`
  - reduced historical reproducer that still triggers the older `script has been destroyed` attach failure

For low-level evidence collection against an already running pid, a temporary case may use:

- `launch.strategy = "existing"`
  - skips force-stop and fresh launch
  - intended for `lldb-server` / `/proc/<pid>/maps` aligned collection
