# `sub_2EED4` Late-Attach Branch Note

Scope:
- explain the current late-attach native branch
- connect `pairip_vm_interpreter_core_tentative` to `sub_2EED4`
- recover the local semantics around `0x47424..0x474c4`

## 1. Dispatcher-to-`sub_2EED4` edge

Confirmed caller:
- `pairip_vm_interpreter_core_tentative`
- callsite: `0x533e0`

Relevant dispatcher block:

```text
0x531dc..0x531ec
  cmp w25, 0xcf72c244
  b.eq 0x533d0

0x533d0..0x533fc
  x0 = sp + 0xa8
  x2 = sp + 0xa4
  w1 = w23
  w25 = w30
  bl sub_2EED4
  test w0 bit0
  choose next dispatcher state
  return to shared dispatcher loop
```

Important facts:
- `0x533d0` is a real dispatcher target block, not a dead helper
- current jump-table export shows a large static family landing here
- current first-pass count for this block is `834` opcodes

Meaning:
- `sub_2EED4` is not a random deep helper
- it is a major second-stage environment-policy branch reached directly from the main VM dispatcher

## 2. `sub_2EED4` call interface

Observed call arguments from the dispatcher:
- `x0 = sp + 0xa8`
- `x1 = w23`
- `x2 = sp + 0xa4`

Observed local setup at `sub_2EED4` entry:
- `x22 = x0`
- `w8 = w1 & 0xffff`

Working interpretation:
- `x22` is a pointer to a caller-built local descriptor or working state object
- `w1` is a caller-selected 16-bit selector or sub-opcode value
- `x2` is likely an output or continuation slot consumed by `sub_2EED4`

Boundary:
- the exact field layout of the `sp+0xa8` structure is still unresolved
- but the entry shape already proves this path is VM-driven and stateful

Late-attach entry probe facts:
- first six dynamic entries all hit the same function entry on `Thread-2`
- observed `x1` values included `0x24`, `0x9f`, `0x19`, and `0x0e`
- observed `x0` remained a stable caller-built stack object
- observed `x2 = x0 - 4`

Observed `x0` memory shape:

```text
x0 + 0x00: 0x00000078211e4370
x0 + 0x08: 0x00000077cdaa7cf8
x0 + 0x10: 0x000000af
x0 + 0x14: 0xffffffff
x0 + 0x18: 0x00000010
```

Observed `x2` meaning:
- `x2` points to a mutable 32-bit slot immediately before the `x0` structure
- the slot value changed between calls while the rest of the `x0` structure stayed stable

Refined interpretation:
- `x0` is best treated as the main caller-built descriptor for this verifier branch
- `x2` is best treated as a side output or per-call status/result slot attached to that descriptor
- `w1` is the branch selector that chooses which internal `sub_2EED4` subpath runs

## 3. Local semantics of `0x47424..0x474c4`

Disassembly focus:
- `0x47424` initializes a 64-bit FNV-style seed
- `0x47428` loads a base pointer from `[x22]`
- `0x47438` gates the loop on `w25`
- `0x4743c` pulls a word from `[sp,#0x540]`
- `0x47448..0x47454` derives an index using `w27`, `w20`, and modulo reduction
- `0x47454` forms `x10 = base + index`
- `0x47468` multiplies by `x16`
- `0x4746c` performs the signed byte load
- `0x47474` decrements `w25`
- `0x47484..0x474c4` loads more stack-backed words, compares the computed result against `[sp,#0x558]`, and updates `w20`

Recovered meaning:
- this block is a byte-wise blob or table verification loop
- `x22 -> [x22]` gives the blob arena base
- `w25` is the remaining byte count
- `x11` is the loop index
- `w27` and stack values at `0x540/0x548/0x550/0x558` influence which slice is hashed and what expected value is compared
- `x16` acts as the FNV multiply constant in this branch

This is consistent with:
- a late-stage native verifier or selector
- not with generic UI or Java glue

## 4. Runtime correlation

Late-attach native crash:
- thread: `Thread-2`
- crash pc: `libpairipcore.so+0x4746c`

Direct probe facts:
- direct hooks on `0x47424` and `0x4746c` did fire on `Thread-2`
- entry hooks on `sub_2EED4` also fired repeatedly on `Thread-2`
- entry probes showed a stable caller-built descriptor plus a mutable side slot at `x2 = x0 - 4`
- sampled runtime state included:
  - `x25 == 1` inside the loop probe
  - `x11 == 0` inside the loop probe
  - a stable blob-descriptor-like structure at entry

Meaning:
- `0x4746c` is a live executed late-attach verifier path
- this is enough to treat the branch as real and reviewable
- it is not enough to trust direct Frida instruction hooks as low-perturbation evidence

## 5. Current best conclusion

The late-attach branch is now narrowed to:

```text
pairip_vm_interpreter_core_tentative
  -> dispatcher block 0x533d0
    -> sub_2EED4
      -> verifier loop 0x47424..0x474c4
        -> late-attach crash at 0x4746c
```

This gives two important current truths:

1. `sub_2EED4` is already inside the VM-controlled integrity path, not merely adjacent suspicious infrastructure.
2. The `0x4746c` late-attach crash is a blob-verification branch with caller-supplied state, not an unrelated random native fault.

## 6. Best next static target

The next useful recovery slice is not the byte load itself.

It is:
- the caller-built structure at `sp+0xa8`
- the meaning of stack slots:
  - `0x540`
  - `0x548`
  - `0x550`
  - `0x558`
- and the upstream origin of `w23`, `w25`, `w27`, `x16`, and `x22[0]`

That is the shortest route from `sub_2EED4` back to a concrete environment producer or encoded state blob.
