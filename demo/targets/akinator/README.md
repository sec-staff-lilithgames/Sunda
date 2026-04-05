# Akinator Sample Workspace

Owner: current Sunda reverse-engineering session

Purpose: keep the Akinator APK set, decompiled tree, runtime evidence, and native `libpairipcore` analysis workspace inside `demo/` so later hardening work can use one stable in-repo sample root.

Current analysis stance:
- treat this sample as `Android static environment detection first`
- do not pre-label the current startup path as `Frida detection`
- use the startup asset `ReqL9SxJHgWgm3cn` as the first semantic recovery slice

Imported entrypoints:
- Java startup entry: `jadx-out/sources/com/pairip/StartupLauncher.java`
- Java VM bridge: `jadx-out/sources/com/pairip/VMRunner.java`
- Native startup chain:
  - `pairip_jni_on_load`
  - `pairip_jni_execute_vm_bridge`
  - `pairip_vm_interpreter_core_tentative`

Directory layout:
- `apks/`
  - pulled APK splits copied from the original desktop workspace
- `jadx-out/`
  - decompiled Java/resources tree
- `evidence/`
  - low-intrusion runtime evidence, including baseline crash logs and uprobe traces
- `native/libpairipcore/`
  - isolated `libpairipcore.so` workspace, IDA exports, scripts, and existing notes
- `analysis/`
  - in-repo summary notes for handoff and current conclusions

Imported source workspace:
- original workspace: `/Users/siberia/Desktop/akinator`
- imported because the sample had already accumulated stable reverse-engineering artifacts there

Removal or refresh condition:
- refresh this sample root if the APK or split set changes
- refresh the imported native workspace if the underlying `libpairipcore.so` changes
