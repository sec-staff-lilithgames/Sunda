# Startup Crash Semantics

Focus asset: `ReqL9SxJHgWgm3cn`

Fresh no-debug crash facts:
- package loads `libpairipcore.so` successfully, then crashes immediately
- signal: SIGSEGV/SEGV_ACCERR
- crash pc: 0x000000000005d75c
- tombstone: tombstone_09

Dynamic chain confirmed in this pass:
- pairip_jni_on_load at 1318413.791135
- pairip_vm_bridge at 1318413.795566
- pairip_dispatcher at 1318413.795704

Static + runtime interpretation:
- `pairip_jni_on_load` reaches `pairip_jni_execute_vm_bridge`
- the bridge reaches `pairip_vm_interpreter_core_tentative`
- the crash address `0x5d75c` is inside the dispatcher core and executes repeatedly just before the fatal fault

Local semantic conclusion:
- the crash happens after dispatcher entry, not before VM startup
- the crashing path is part of the live VM execution path for the startup asset
- the first semantic-recovery target should be the dispatcher case block containing `0x5d75c` and the state fields feeding `x10/x16/x11`


Crash subpath candidate:
- crash block start: `0x5d758`
- crash block end: `0x5d774`
- block last branch: `B.NE            loc_5D758`
- first candidate opcodes landing in this block: []

Interpretation boundary:
- these opcodes map to the enclosing block containing `0x5d75c`, not yet to a recovered high-level opcode meaning
- the repeated crash-pc uprobe hits suggest this block contains an internal loop body, not a one-shot handler entry


Enclosing handler-entry candidate:
- entry block start: `0x5d61c`
- entry block end: `0x5d740`
- first candidate opcodes landing in the entry block: [10051, 21889, 26971, 29059, 41291, 45133, 60095]
