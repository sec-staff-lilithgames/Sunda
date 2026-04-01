# Checkpoint

- p0: A new top-level `demo/` Android app now exists as the fingerprint canary. It builds and installs on the Pixel 8a, exposes a debug-only `com.sunda.demo.SCAN` receiver, writes JSON reports under app-specific external files, and includes a native scanner plus a host-side Python driver under `demo/tools/`.
- p0: The demo scanner now has a working self-calibration path. It no longer embeds raw `frida` literals in the app binary, and a dedicated calibration run proves the matcher can find injected ASCII / UTF-16LE test bytes before cleanup and reaches zero after cleanup.
- p0: Android 16 blocks `/proc/self/mem` even for the app itself, so process-space scanning had to switch to direct reads of selected readable mappings with SIGBUS / SIGSEGV guards. This avoids the earlier `Permission denied` path and keeps scans alive when GPU / binder mappings fault on access.
- p1: The demo baseline is not clean even before any explicit host-side attach/spawn. A fresh app launch with `sunda` stopped still reports 3 stable `frida` hits from anonymous `rwxp` pages containing `agent_main` and `/frida-...`. This is external environment contamination and blocks a strict “baseline must be zero” acceptance claim on the current device.
- p0: Attach evidence is now concrete on the current working server path. On the last successful attach run:
  baseline = 3 hits
  injected = 274 hits
  the dominant source is `/memfd:sunda-agent-64.so (deleted)` with 199 hits, plus 1 thread-name hit
  the new hits are mostly `Frida.Agent.*`, `re.frida.*`, `frida:rpc`, and embedded `subprojects/frida-*` / `/frida/` source-path strings inside the agent payload.
- p1: The first agent cleanup attempt was tested as a local Android build experiment against the embedded agent payload, but the rebuilt Android `sunda` server is currently not deployable: both the wrapped `sunda` and `frida-server-raw` variants fail to stay up on-device, and logcat shows repeated startup `SIGBUS` crashes. The crashing patch path was not kept in the repo, so this remains an open investigation item rather than a landed change.
- p1: Spawn-gating validation is still pending. The driver now captures baseline vs injected reports for both attach and spawn paths, but the attach-side external contamination plus the crashing rebuilt server means the intended iterative “rebuild -> redeploy -> compare” loop is not yet back to a usable state.
- p2: Repo hygiene changed this turn: `.findings.sqlite` is still intentionally present and should be tracked with the repo state rather than left as an untracked local artifact.
