# Dynamic Debug Blockers

Scope: actual blockers encountered while trying to add `single-step debugging + Frida Stalker` to the `0x5d75c` crash chain workflow.

## Frida

### USB transport

Observed:
- `frida-ps -Uai` works and enumerates apps
- direct spawn does not work:
  - `NotSupportedError: need Gadget to attach on jailed Android`
- `-W/await-spawn` on USB did not catch Akinator startup in this environment

Meaning:
- USB Frida on this device/session is usable for enumeration and likely late attach
- it is not currently usable for early spawn-based Stalker on this target

### `sunda`

Observed:
- `/data/local/.sunday/sunda` listens successfully
- remote client can connect far enough to query system parameters
- enumerate/spawn paths terminate with closed transport
- device-side log reports internal Java-agent failure:
  - `Unable to find copied methods in java/lang/Thread`

Meaning:
- `sunda` is not currently stable enough for the required early-process Frida workflow

### `frida-server-17.7.3-arm64`

Observed:
- daemon can be made to listen on `127.0.0.1:27043`
- host and server versions match at `17.7.3`
- remote client still loses the connection during spawn-oriented operations

Meaning:
- standard remote Frida is also not yet giving a working spawn/Stalker path on this device state

## Single-step debugging

### `lldb-server`

Available:
- `/data/local/.sunday/tools/lldb-server`
- `/data/local/tmp/lldb-server`

What was attempted:
- root-side watcher using `pidof` then `lldb-server gdbserver --attach`
- root-side watcher using ActivityManager `Start proc` log then `SIGSTOP`
- `wrap.<package>` test wrapper

Observed:
- direct attach watcher did not stop the process before crash
- logcat watcher saw the correct pid, but the process was already gone by the time `SIGSTOP` executed
- `wrap.<package>` probe script did not fire for this package/environment

Meaning:
- current environment does not yet provide a reliable way to halt this 50ms-scale startup crash early enough for native single-step attach

## What *did* work

- no-debug baseline launch
- fresh tombstone capture
- APK-offset uprobes on:
  - `pairip_jni_on_load`
  - `pairip_vm_bridge`
  - `pairip_dispatcher`
  - `pairip_crash_pc`

These already gave a valid low-intrusion runtime chain and crash-PC flood evidence.

## Operational conclusion

The current blocker is not lack of symbol knowledge or offset knowledge.

The blocker is **process-control timing**:
- the target crashes too quickly for late attach
- the currently available Frida spawn paths are unstable or unsupported on this device state
- the currently available wrapper/freeze paths are not intercepting early enough

Until one of those infrastructure problems is solved, the reliable dynamic evidence path remains:
- no-debug baseline
- uprobes
- static-to-runtime cross-validation
