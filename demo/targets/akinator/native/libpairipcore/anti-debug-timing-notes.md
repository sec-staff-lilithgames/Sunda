# Anti-Debug Timing Notes

Scope: startup-chain tracing strategy for `libpairipcore.so`.

Baseline:
- no-debug launch still crashes immediately in `libpairipcore.so+0x5d75c`
- `libpairipcore.so` loads successfully before the fault
- tombstone remains stable across fresh launches

Timing-sensitive choices used in this pass:
- avoided startup-attached debugger sessions
- used root uprobes on APK-backed file offsets instead of software breakpoints
- used system-wide sampling only as a secondary, low-confidence probe

Observed behavior:
- early uprobes preserved the startup sequence without suppressing the crash
- ordered runtime hits were: pairip_jni_on_load -> pairip_vm_bridge -> pairip_dispatcher
- crash-pc probe generated 311 hits before process death

Current conclusion:
- no debugger-induced control-flow change was observed in this slice because no debugger was attached
- uprobes are currently the preferred low-intrusion runtime method for this target
- if a later attach-based trace is needed, it should happen after the library is mapped and only for a minimal window
