# Checkpoint

- p0: `gmain` root cause is now identified and the build path is corrected. The old successful Android build was preferring `deps/sdk-android-arm64/lib/pkgconfig` over the local GLib tree, so root-level `frida-glib/glib/gmain.c` edits never reached runtime. `releng/meson_configure.py` and `releng/env.py` now prepare and prepend a local Android GLib pkg-config overlay before the pulled SDK path.
- p0: The local GLib route needed one extra fix: the bootstrap `gio-2.0.pc` carried `-lresolv`, which is not present in the current Android toolchain/sysroot. Overlay generation now strips that stale linker flag before configure.
- p0: Runtime evidence improved after switching to the local GLib-backed Android build. On-device `sunda` thread names changed from `gmain/gdbus/pool-sunda/sunda` to `Saturday/Thursday/sunda`, which confirms the GLib worker-thread rename from the local `frida-glib` tree is finally reaching runtime.
- p0: Residual `frida-*` cleanup is partially landed but not fully revalidated yet. A second patch wave renamed high-signal Android/Linux runtime strings and filenames:
  `frida-main-loop` -> `sunda-main-loop`
  `frida-agent-*` -> `sunda-agent-*`
  `frida-helper-*` -> `sunda-helper-*`
  several `remote frida-server` user-facing strings -> `remote sunda daemon`
  This patch set still needs one clean rebuild-and-rescan pass to confirm the final binary no longer exposes those strings in the active Android build.
- p1: Core Android runtime remains usable but unstable under pressure. Verified:
  `sunda --version` returns `17.4.1`
  daemon can listen on `127.0.0.1:27042`
  host can discover the USB device
  but a 10-iteration Python stress loop of `enumerate_processes()` failed 10/10 with `NotSupportedError: cannot read properties of undefined (reading getRunningAppProcesses)`
- p0: Host CLI packaging has a real regression. Global `frida` and `frida-tools` now report `17.4.1`, but filesystem commands are broken:
  `frida-push` and `frida-pull` fail with `ModuleNotFoundError: frida_tools.stream_controller`
  root cause is visible in `frida17.4.1/subprojects/frida-tools/frida_tools/meson.build`, which omits existing modules such as `stream_controller.py`, `itracer.py`, and `units.py`
- p1: CLI smoke is mixed instead of clean:
  `frida-ls-devices` prints device rows but still crashes/hangs in non-TTY mode with prompt-toolkit input attachment errors
  `frida-ps -U` and `frida-ps -Uai` do not return cleanly within the current timeout budget
  `frida-ls -U /data/local/.sunday` also failed to return within the current timeout budget
- p1: Attach/spawn coverage is not yet healthy. Direct attach to the earlier `Settings` PID failed (`ProcessNotFoundError` after the process disappeared), so a stable attach smoke target still needs to be selected before the next fix round.
- p1: Version detection in vendored Frida trees now honors `FRIDA_VERSION`, which is required because these vendored directories are not git roots and otherwise resolve to `0.0.0`. This fix was applied in the top-level `frida17.4.1/releng/frida_version.py` and the duplicated releng copies under `subprojects/frida-python/` and `subprojects/frida-tools/`.
- p1: Host `frida-python` source build needed two local build fixes before it became usable:
  `subprojects/frida-python/setup.py` now supports `-V` for Meson version probing
  macOS helper post-processing requires ad-hoc signing through `MACOS_CERTID=-`
- p1: Root launch matters on device. Running `/data/local/.sunday/sunda` as `shell` reproduced `ProcessNotFoundError unable to find process with name 'system_server'` during host enumeration; launching through `zoey sh -c 'nohup /data/local/.sunday/sunda ... &'` fixed process enumeration stability across repeated runs.
- p1: `frida-tools` wheel generation needed JS build hardening. Switching the helper scripts from `npm install` to `npm ci --no-audit --no-fund`, plus one-time prewarming of the six package directories, unblocked the final wheel build.
- p2: Repository structure and architecture diagram still match the current tree shape; this turn changed build/config/runtime behavior only and did not change module boundaries.
