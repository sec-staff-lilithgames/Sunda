# Crash Subpath Xref Analysis

Scope: focused semantic recovery for the startup crash path around `libpairipcore.so+0x5d75c`.

## Minimal dispatcher subpath

```text
dispatcher table land
  0x5d61c -> 0x5d740 -> 0x5d758(loop, crash at 0x5d75c) -> 0x5d774 -> 0x5f1e0
```

Relevant blocks:
- `0x53088`
  dispatcher entry skeleton:
  - `x9 = x23 & 0xffff`
  - `ldrh w11, [case_table + opcode*2]`
  - `x10 = 0x52fd0 + (w11 << 2)`
  - `br x10`
- `0x5d61c..0x5d740`
  first targeted block on this crash path
- `0x5d740..0x5d758`
  setup block for the byte-wise loop
- `0x5d758..0x5d774`
  tight loop body; crash occurs on `ldrsb x2, [x16, x11]`
- `0x5d774..0x5d798`
  loop exit and compare/select tail
- `0x5f1e0`
  shared continuation target used by many dispatcher paths

## Opcode xrefs landing on the enclosing entry block

Current first-pass opcode map shows these opcodes landing directly in `0x5d61c..0x5d740`:

```text
10051, 21889, 26971, 29059, 41291, 45133, 60095
```

Interpretation boundary:
- these are static jump-table xrefs into the enclosing entry block
- they are not yet grouped into a recovered high-level opcode family name
- `0x5d758` itself is an internal loop body, not a direct table landing block

## Local semantics recovered so far

### 1. Dispatcher-entry block `0x5d61c..0x5d740`

This block reads a VM-context-like structure from `[sp,#0xb0]`:
- `x10` behaves like a pointer to a small execution descriptor
- `x9` is used like a moving pc/index
- `[x10]` is dereferenced into `x11`, which then behaves like a base pointer to a table/blob arena
- `[x10,#8]` yields two words:
  - `w8`: recurring divisor/key/mask operand used across the whole block
  - `w16`: another local offset base used to advance state fields

The block then:
- reads several words from `x11` at pc-derived offsets
- XOR-inverts them with `w8` via `EON`
- reduces several values modulo `w8` using `UDIV` + `MSUB`
- uses those reduced values as indices back into `x11`
- combines the fetched values with `ORR`, `EOR`, `AND`
- updates `[x10,#0xc]` repeatedly, which is a strong candidate for the live pc/state cursor

This looks like a VM handler entry that:
- consumes multiple encoded operands
- decodes table-backed values
- updates the VM pc/state cursor
- prepares one floating-point operation and one byte-wise verification/hash subroutine

### 2. Floating-point preparation `0x5d700..0x5d738`

This subpath:
- fetches two `double` values from the same decoded table arena
- multiplies them with `fmul d0, d0, d1`
- stores the result back into the arena

So this handler is not only a verifier. It also mutates a floating-point table slot before entering the byte loop.

### 3. Crash loop `0x5d740..0x5d774`

This is the block containing `0x5d75c`.

Recovered shape:
- start seed constant in `x1`:
  - `0xcbf29ce484222325`
- multiply constant in `x3`:
  - `0x100000001b3`
- those are the canonical 64-bit FNV-1 / FNV-1a constants

Loop behavior:
- compute an index from `(w14 ^ w0) mod w8`
- set `x16 = x10 + index`
- iterate `w17` times
- per iteration:
  - `x1 = x1 * 0x100000001b3`
  - load one signed byte from `[x16 + x11]`
  - xor it into `x1`

Crash site:
- `0x5d75c: ldrsb x2, [x16, x11]`

Local interpretation:
- this is a byte-wise rolling hash / verification loop over a blob/string-like region
- the blob base comes from `[x10]` after the earlier setup
- `w17` is the byte count
- `x11` is the loop index
- `x16` is the selected base for the current item

### 4. Loop-exit tail `0x5d774..0x5d798`

After the loop:
- another index is derived from `(w14 ^ w12) mod w8`
- a signed word is fetched from the decoded arena
- the loop hash is xor-combined with that word
- result is compared against `x13`
- `csel` chooses between `w15` and `w9`
- selected value is xor-combined with `w14`
- execution jumps to shared continuation `0x5f1e0`

Local interpretation:
- the handler computes a derived verification/hash result
- compares it against a prepared expected value
- chooses the next state/result register based on equality
- then rejoins a common dispatcher continuation

## Current semantic conclusion

The crash subpath is best described as:
- a dispatcher-targeted VM handler entry
- that decodes several table-backed operands
- performs a floating-point multiply-store mutation
- then runs an FNV-style byte-hash/verification loop over a selected blob
- and finally compares the derived result against an expected value before branching into a shared tail

The actual crash happens inside the byte-hash loop, so the most likely immediate fault classes are:
- bad blob base from `[x10]`
- bad modulo-derived index into that blob set
- bad loop length `w17`
- corrupted or intentionally invalid selected item base in `x16`

## Best next recovery target

Do not start from `0x5d758` in isolation.

Start from the enclosing targeted block `0x5d61c` and treat the whole subpath as one semantic unit:
- `0x5d61c..0x5d740`
- `0x5d740..0x5d758`
- `0x5d758..0x5d774`
- `0x5d774..0x5d798`

That unit is the right xref bucket for the next pass.
