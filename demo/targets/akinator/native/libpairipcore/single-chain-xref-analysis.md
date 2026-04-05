# `0x5d75c` Single-Chain Xref Analysis

Scope: only xrefs that matter to the crash-centric subpath.

## Function-level xrefs

### `pairip_vm_interpreter_core_tentative` (`0x52f20`)
- direct native caller:
  - `pairip_jni_execute_vm_bridge` at `0x62d04`

### `pairip_jni_execute_vm_bridge` (`0x62c78`)
- direct native caller:
  - `pairip_jni_on_load` at `0x819e0`

### `pairip_jni_on_load` (`0x80474`)
- root for this native chain

## Block-level xrefs

### Dispatch entry

Dispatcher entry skeleton:
- `0x53088..0x530a4`

Recovered form:
- `opcode = x23 & 0xffff`
- `word = [case_table + opcode * 2]`
- `target = 0x52fd0 + (word << 2)`
- `br target`

This is the only jump source that matters for this chain.

### Entry block xrefs for the crash family

Current static table entries landing in `0x5d61c..0x5d740`:

```text
10051
21889
26971
29059
41291
45133
60095
```

Interpretation:
- these opcodes share the same entry block
- they should currently be treated as one provisional handler family
- `0x5d75c` is not the family entry, but an internal loop body within that family

### Neighbor family signal

Another large opcode cluster lands in the adjacent block beginning at `0x5d798`:
- current first-pass count: 488 static opcode entries

Interpretation:
- `0x5d61c` family is narrow and selective
- `0x5d798` family is broad and likely more generic
- this makes the `0x5d61c` crash family worth treating as a distinct semantic niche, not random noise inside the dispatcher

## Cross-analysis conclusion

The xref picture is coherent:
- one native root chain leads into the dispatcher
- one dispatcher jump-table source leads into the crash family
- seven currently known opcodes feed the crash-family entry block
- the crash happens deeper inside that family, specifically inside the rolling byte-hash loop
