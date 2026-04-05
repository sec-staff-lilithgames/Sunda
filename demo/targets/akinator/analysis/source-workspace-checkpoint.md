# Imported Desktop Checkpoint

Source of truth before migration:
- `/Users/siberia/Desktop/akinator/.status/checkpoint.md`

Imported retained state from the previous workspace:
- APK set existed at the desktop workspace root:
  - `base.apk`
  - `split_config.arm64_v8a.apk`
  - `split_config.en.apk`
  - `split_config.xxhdpi.apk`
- Decompiled output existed at `jadx-out/`
- Runtime crash evidence existed at `evidence/2026-03-31-231457-crash/`
- Reusable notes were already accumulated in the desktop workspace
- Isolated SO workspace existed at `so-info/libpairipcore/`
- Constructor forest, exported forest, and first JNI DFS slice were already completed there
- Constructor conclusions had already been written back into the IDA database

Imported priorities from the desktop workspace:
- Stay focused on `libpairipcore.so`
- Treat `0x5d75c` as a VM handler-family crash, not plain business logic
- Continue from the `JNI_OnLoad` and startup-asset path instead of widening into unrelated Java code
- Use low-intrusion runtime evidence first

Imported closed items:
- APK extraction
- usable `jadx` tree generation
- baseline startup crash reproduction and offset anchoring
- constructor forest recovery
- exported-root forest recovery
- first JNI_OnLoad DFS slice recovery

Migration note:
- this file is a handoff summary only
- future live progress for the Sunda repo should be tracked in the repo-root `.status/checkpoint.md`
