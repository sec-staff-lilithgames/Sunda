# Akinator Real Hit Code Reconstruction

Scope:
- only the code paths that are already proven to execute at runtime
- only the current device state and current Frida phenotypes
- code below is reconstructed from static recovery plus runtime hit evidence

## 1. Spawn-hit code

Runtime hit condition:
- Frida `spawn`
- current crash pc: `libpairipcore.so+0x5d75c`
- known family entry block: `0x5d61c..0x5d740`
- known direct-landing opcodes:
  - `10051`
  - `21889`
  - `26971`
  - `29059`
  - `41291`
  - `45133`
  - `60095`

Recovered real logic:

```c
// VM-controlled startup verifier family
// hit by spawn at 0x5d75c
static uint32_t pairip_startup_verify_family(VmState *s) {
    uint32_t key = s->decode_key;          // recurring modulo/xor key
    uint8_t *arena = s->arena_base;        // decoded blob/table arena

    // decode several table-backed operands from the current VM state
    uint32_t a = decode_word(arena, s, key);
    uint32_t b = decode_word(arena, s, key);
    uint32_t c = decode_word(arena, s, key);
    uint32_t d = decode_word(arena, s, key);
    uint32_t e = decode_word(arena, s, key);

    // update the VM cursor while decoding operands
    s->pc = next_state_cursor_after_decode(s->pc);

    // mutate one floating-point slot in the internal arena
    double lhs = read_double_slot(arena, decode_index(a, key));
    double rhs = read_double_slot(arena, decode_index(b, key));
    write_double_slot(arena, decode_index(a, key), lhs * rhs);

    // build the verifier input slice
    uint8_t *blob = arena + reduce_mod(c ^ d, key);
    uint32_t len = e;

    // FNV-style rolling hash
    uint64_t h = 0xcbf29ce484222325ULL;
    for (uint32_t i = 0; i < len; i++) {
        h *= 0x100000001b3ULL;
        h ^= (int8_t) blob[i];             // real hit load at 0x5d75c
    }

    // derive expected value from other decoded arena slots
    uint64_t expected = derive_expected_from_state(arena, s, key);
    uint32_t on_equal = s->eq_value;
    uint32_t on_neq = s->neq_value;

    // choose the next VM result/state
    uint32_t chosen = (h == expected) ? on_equal : on_neq;
    return finalize_startup_verify_result(chosen, s);
}
```

Why this is the real hit code:
- `0x5d61c..0x5d798` is already statically recovered as one verifier family
- `0x5d75c` is the signed-byte load inside the FNV-style loop
- `spawn` still hits this exact crash family today

## 2. Late-attach-hit code

Runtime hit condition:
- app first runs naked and stays stable
- Frida attaches later
- current crash pc: `libpairipcore.so+0x4746c`
- executing thread: `Thread-2`
- caller dispatcher block: `0x533d0`
- direct callee: `sub_2EED4`

Recovered dispatcher edge:

```c
// inside pairip_vm_interpreter_core_tentative
if (w25 == 0xcf72c244) {
    uint32_t side_slot = 0;
    VmBranchDesc desc = make_desc_from_vm_stack(sp + 0xa8);
    side_slot = sub_2EED4(&desc, w23, &side_slot);
    return continue_dispatch_after_sub_2EED4(side_slot);
}
```

Recovered late-attach verifier logic:

```c
typedef struct {
    uint8_t  *blob_base;   // x0 + 0x00, loaded later through x22->[0]
    void     *vm_ctx;      // x0 + 0x08
    uint32_t span;         // x0 + 0x10 == 0xaf in current hits
    int32_t  marker;       // x0 + 0x14 == -1 in current hits
    uint32_t stride;       // x0 + 0x18 == 0x10 in current hits
} VmBranchDesc;

// VM-controlled late-attach verifier branch
// hit by late attach at 0x4746c
static uint32_t sub_2EED4(VmBranchDesc *desc, uint32_t selector, uint32_t *side_slot) {
    uint8_t *base = desc->blob_base;

    // many selectors land here; current dynamic hits observed:
    // 0x24, 0x9f, 0x19, 0x0e
    uint32_t branch_id = selector & 0xffff;

    // stack-backed state prepared by the main VM dispatcher
    uint32_t xor_seed      = STACK_0x540;
    uint32_t expected_mix1 = STACK_0x548;
    uint32_t expected_mix2 = STACK_0x550;
    uint64_t expected64    = STACK_0x558;

    // current local state registers seen in this branch
    uint32_t key   = REG_W20;
    uint32_t xorm  = REG_W27;
    uint64_t mul_k = REG_X16;             // 0x100000001b3 on the hit path
    uint32_t len   = REG_W25;

    // choose one blob slice inside the arena
    uint32_t idx = reduce_mod(xorm ^ xor_seed, key);
    uint8_t *blob = base + idx;

    // FNV-style verifier loop
    uint64_t h = 0xcbf29ce484222325ULL;
    for (uint32_t i = 0; i < len; i++) {
        h *= mul_k;
        h ^= (int8_t) blob[i];            // real hit load at 0x4746c
    }

    // mix with more state prepared on the caller stack
    uint64_t actual =
        h ^
        (int64_t) base[reduce_mod(xorm ^ expected_mix1, REG_W23)] ^
        0; // extra compare/select mixing omitted here for readability

    // choose next internal result
    uint32_t next_a = reduce_mod(xorm ^ expected_mix2, key);
    uint32_t next_b = reduce_mod(xorm ^ REG_W29, REG_W23);
    uint32_t next = (actual == expected64) ? next_b : next_a;

    // write per-call side result next to the descriptor
    *side_slot = next;
    return next;
}
```

Why this is the real hit code:
- `0x533d0` directly calls `sub_2EED4`
- `sub_2EED4` is a live VM-controlled verifier branch, not just a suspicious helper
- late-attach runtime hits `0x4746c`
- entry probes confirmed:
  - `x0` is a stable descriptor
  - `x2 = x0 - 4` is a mutable side slot
  - selectors vary across calls
- loop probes confirmed the `0x4746c` load really executes on `Thread-2`

## 3. Practical bottom line

Today the two real hit code paths are:

1. `spawn`
   - hits the startup verifier family
   - byte-load crash point: `0x5d75c`

2. `late attach`
   - hits the `sub_2EED4` verifier branch
   - byte-load crash point: `0x4746c`

These are the real VM-restored native hit paths currently supported by both static recovery and runtime hit evidence.
