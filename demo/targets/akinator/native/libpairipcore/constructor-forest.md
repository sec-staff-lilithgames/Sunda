# Constructor Forest

Scope: full DFS expansion of all 7 `.init_array` constructor roots in `libpairipcore.so`.

Interpretation rule:
- names without parentheses are treated as high-confidence renames
- names in parentheses are tentative and should not yet be treated as final semantics

High-level result:
- constructor forest is small and bounded
- no constructor root directly enters the `dl_iterate_phdr` / `dlopen` / `dlsym` / `syscall` cluster
- constructor roots split into four families:
  - arch/property gate
  - hwcap feature profiling
  - two table/blob initialization branches
  - three `__cxa_atexit` registrations

Forest:

```text
ROOT 0x29fb4 pairip_init_arch_gate (nodes=4)
pairip_init_arch_gate [0x29fb4] constructor / arch gate
├── __system_property_get_plt [0x84680] import / system property read
├── getauxval_plt [0x84800] import / auxv read
└── strncmp_plt [0x84880] import / string compare

ROOT 0x2a238 pairip_init_hwcap_profile (nodes=5)
pairip_init_hwcap_profile [0x2a238] constructor / hwcap-profile init
├── pairip_build_hwcap_feature_mask [0x2a04c] hwcap feature-mask builder
├── __system_property_get_plt [0x84680] import / system property read
├── getauxval_plt [0x84800] import / auxv read
└── strncmp_plt [0x84880] import / string compare

ROOT 0x2a66c (init_table_blob_A) (nodes=9)
(init_table_blob_A) [0x2a66c] (constructor / init table blob A)
├── (decode_or_expand_table_blob_A) [0x2a788] (table/blob transform A)
│   ├── (ptr_add_src_byte) [0x2a838] (pointer helper)
│   ├── (ptr_add_masked_index) [0x2a840] (pointer helper)
│   ├── (ptr_add_dst_byte) [0x2a848] (pointer helper)
│   ├── (commit_table_blob_A) [0x2a850] (table blob A commit)
│   └── .__stack_chk_fail [0x84610] import
├── .__stack_chk_fail [0x84610] import
└── .memcpy [0x84690] import

ROOT 0x2a6d0 (init_table_blob_B) (nodes=9)
(init_table_blob_B) [0x2a6d0] (constructor / init table blob B)
├── (decode_or_expand_table_blob_B) [0x2bc10] (table/blob transform B)
│   ├── (ptr_add_src_byte) [0x2a838] (pointer helper)
│   ├── (ptr_add_masked_index) [0x2a840] (pointer helper)
│   ├── (ptr_add_dst_byte) [0x2a848] (pointer helper)
│   ├── (commit_table_blob_B) [0x2bcc0] (table blob B commit)
│   └── .__stack_chk_fail [0x84610] import
├── .__stack_chk_fail [0x84610] import
└── .memcpy [0x84690] import

ROOT 0x2a734 pairip_register_atexit_slot_0 (nodes=2)
pairip_register_atexit_slot_0 [0x2a734] constructor / atexit registration
└── .__cxa_atexit [0x844a0] import

ROOT 0x2a750 pairip_register_atexit_slot_1 (nodes=2)
pairip_register_atexit_slot_1 [0x2a750] constructor / atexit registration
└── .__cxa_atexit [0x844a0] import

ROOT 0x2a76c pairip_register_atexit_slot_2 (nodes=2)
pairip_register_atexit_slot_2 [0x2a76c] constructor / atexit registration
└── .__cxa_atexit [0x844a0] import
```

Takeaway:
- constructor forest does not currently look like the shell's main anti-hook or anti-debug execution path
- the next trees should pivot to non-constructor roots in the later suspicious cluster
