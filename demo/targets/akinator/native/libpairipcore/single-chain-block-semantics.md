# `0x5d75c` Single-Chain Block Semantics

Scope: only the minimal crash-centric semantic chain inside `pairip_vm_interpreter_core_tentative`.

## Chain boundary

Current minimal semantic unit:

```text
0x5d61c..0x5d740
  -> 0x5d740..0x5d758
  -> 0x5d758..0x5d774   (crash at 0x5d75c)
  -> 0x5d774..0x5d798
  -> 0x5f1e0            (shared continuation)
```

Dispatch entry into this unit lands at:
- `0x5d61c..0x5d740`

Known static jump-table xrefs into the entry block:
- `10051`
- `21889`
- `26971`
- `29059`
- `41291`
- `45133`
- `60095`

## Block-by-block recovery

### 1. Entry/decode block `0x5d61c..0x5d740`

Observed inputs:
- `[sp,#0xb0]` yields a small VM-state structure
- `[state + 0x0]` behaves like a base pointer to a decoded table/blob arena
- `[state + 0x8]` yields:
  - one recurring xor/mod divisor key (`w8`)
  - one moving state/pc-like cursor base (`w16` lineage)

Observed actions:
- reads multiple words from the arena at state-derived offsets
- decodes them with repeated `EON`
- reduces multiple values modulo `w8` with `UDIV` + `MSUB`
- indexes back into the arena with the reduced values
- repeatedly updates `[state + 0xc]`

Recovered local meaning:
- this is a handler entry block that consumes encoded operands
- `[state + 0xc]` is a strong candidate for the live VM pc/state cursor
- `w8` is not a loop bound here; it is a decode divisor/key used throughout the handler

### 2. Floating-point preparation `0x5d700..0x5d738`

Observed actions:
- fetch two `double` values from the decoded arena
- multiply them with `FMUL`
- write the result back into the arena

Recovered local meaning:
- this handler family is not purely a verifier
- it mutates an internal floating-point slot before entering the crash loop

### 3. Crash loop setup `0x5d740..0x5d758`

Observed actions:
- derive an index from `(w14 ^ w0) mod w8`
- compute `x16 = x10 + index`
- zero/init loop index register path (`x11 <- 0`)

Recovered local meaning:
- `x10` behaves like a selected blob/table base pointer for this subroutine
- `x16` becomes the concrete per-item byte-sequence base

### 4. Crash loop body `0x5d758..0x5d774`

Observed constants:
- `0xcbf29ce484222325`
- `0x100000001b3`

Recovered meaning:
- these are the canonical 64-bit FNV-style rolling hash constants

Loop behavior:
- `x1 = x1 * 0x100000001b3`
- load one signed byte from `[x16 + x11]`
- xor it into the rolling accumulator
- increment `x11`
- decrement `w17`
- loop until `w17 == 0`

Crash instruction:
- `0x5d75c: ldrsb x2, [x16, x11]`

Recovered local meaning:
- this is a byte-wise rolling hash / verification loop over a selected blob-like region
- `x11` is the byte index
- `w17` is the remaining byte count
- the crash is an over-read during that loop

### 5. Exit/compare block `0x5d774..0x5d798`

Observed actions:
- derive another modulo-reduced index from `(w14 ^ w12) mod w8`
- fetch a signed word from the arena
- xor-combine that with the loop hash result
- compare against `x13`
- choose between `w15` and `w9`
- branch to shared continuation `0x5f1e0`

Recovered local meaning:
- the hash loop is part of a larger verify/select subroutine
- on non-crashing execution it would feed a result into the shared dispatcher continuation

## Crash mechanism at block level

Tombstone register facts:
- `x16 = 0xb400007e504207a1`
- `x11 = 0x3385f`
- effective fault address = `x16 + x11 = 0xb400007e50454000`
- `w17 = 0xfffc954b`

Strong local conclusion:
- the fault is best explained by a bad or unchecked **byte-count / loop-progress state**
- `x16` already points into the selected blob region
- the huge `x11` offset is what walks the access into the faulting page
- therefore the most direct failure class is not “wrong instruction semantics” but “corrupted or unchecked loop length / remaining-count state”
