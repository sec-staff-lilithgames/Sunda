# Constructor Forest Review

Scope: per-node review of every function that appears in the current constructor forest of `libpairipcore.so`.

Review rules:
- non-parenthesized names are high-confidence labels
- parenthesized names are tentative and should be treated as descriptive placeholders
- imports are reviewed as role nodes because they are leaves in the forest

## Root 1: `pairip_init_arch_gate` (`0x29FB4`)

- `pairip_init_arch_gate`
  Review: reads `AT_HWCAP` via `getauxval(16)`. If a specific capability bit is present it reads Android property `ro.arch` and compares it with `"exynos9810"`. It stores a one-byte result into a global byte. This looks like a platform compatibility gate or hardware blacklist toggle, not anti-debug logic.
- `__system_property_get_plt`
  Review: Android property read import. Used here only to read `ro.arch`.
- `getauxval_plt`
  Review: ELF auxv read import. Used here for CPU or platform capability probing.
- `strncmp_plt`
  Review: string compare import. Used here only for the `exynos9810` comparison.

## Root 2: `pairip_init_hwcap_profile` (`0x2A238`)

- `pairip_init_hwcap_profile`
  Review: another environment-profiling constructor. It has an init guard, checks `ro.arch`, reads `getauxval(16)` and `getauxval(26)`, then forwards the values to `pairip_build_hwcap_feature_mask`. This looks like runtime feature profiling for later dispatch decisions.
- `pairip_build_hwcap_feature_mask`
  Review: pure leaf bit-manipulation function. No calls, no I/O, no module scan, no syscalls. It builds a feature mask or capability profile from auxv-derived values. Function body shape is consistent with dispatch-mask synthesis, not with hook or debugger detection.
- `__system_property_get_plt`
  Review: same role as above.
- `getauxval_plt`
  Review: same role as above.
- `strncmp_plt`
  Review: same role as above.

## Root 3: `(init_table_blob_A)` (`0x2A66C`)

- `(init_table_blob_A)`
  Review: copies a 0x108-byte static blob from `.rodata` into stack memory, then calls `(decode_or_expand_table_blob_A)`. This is bootstrap for a derived lookup table or state table.
- `(decode_or_expand_table_blob_A)`
  Review: loops over 0x100 bytes, reads one byte from a source table, XORs it with a byte from another masked-index table, writes the result into a destination buffer, then commits the finished 0x100-byte table through `(commit_table_blob_A)`. Behavior matches deobfuscation or table expansion.
- `(ptr_add_src_byte)`
  Review: trivial pointer helper that returns `base + index` for the source-table byte fetch.
- `(ptr_add_masked_index)`
  Review: trivial pointer helper that returns `base + (index & 7)` for a small repeating mask table.
- `(ptr_add_dst_byte)`
  Review: trivial pointer helper that returns `dst + index` for the output write position.
- `(commit_table_blob_A)`
  Review: commits the expanded 0x100-byte table into a global storage region. No external calls; simple copy to global state.
- `.memcpy`
  Review: import used only for the initial static-blob copy.
- `.__stack_chk_fail`
  Review: stack canary failure import; compiler hardening artifact, not shell logic.

## Root 4: `(init_table_blob_B)` (`0x2A6D0`)

- `(init_table_blob_B)`
  Review: same structural role as `(init_table_blob_A)` but on a second embedded blob.
- `(decode_or_expand_table_blob_B)`
  Review: same high-level shape as `(decode_or_expand_table_blob_A)`: 0x100-byte loop, byte-wise XOR mix, then commit to a global table through `(commit_table_blob_B)`. This is also table bootstrap, not an environment scan.
- `(ptr_add_src_byte)`
  Review: shared helper, same role as above.
- `(ptr_add_masked_index)`
  Review: shared helper, same role as above.
- `(ptr_add_dst_byte)`
  Review: shared helper, same role as above.
- `(commit_table_blob_B)`
  Review: commits the second expanded table into a different global storage region. No external probing behavior.
- `.memcpy`
  Review: import used only for the initial static-blob copy.
- `.__stack_chk_fail`
  Review: same compiler hardening role as above.

## Roots 5-7: `pairip_register_atexit_slot_{0,1,2}` (`0x2A734`, `0x2A750`, `0x2A76C`)

- `pairip_register_atexit_slot_0`
  Review: registers one destructor/object pair through `__cxa_atexit`. Normal static object lifetime handling.
- `pairip_register_atexit_slot_1`
  Review: same as above for a second object slot.
- `pairip_register_atexit_slot_2`
  Review: same as above for a third object slot.
- `.__cxa_atexit`
  Review: standard C++ destructor registration import.

## Overall Summary

The entire constructor forest does four things:

1. Profiles hardware and platform state.
   - `ro.arch`
   - `AT_HWCAP`
   - `AT_HWCAP2`
   - an explicit `exynos9810` compatibility gate

2. Builds one or more feature masks for later runtime dispatch.

3. Expands two embedded 0x100-byte blobs into global lookup/state tables.

4. Registers three destructor slots for static object cleanup.

What it does **not** do in the constructor forest:

- no `ptrace`
- no `/proc` scan
- no `TracerPid`
- no `dl_iterate_phdr`
- no `dlopen` / `dlsym`
- no module walk
- no obvious hook/debugger countermeasure entry

Current bottom line:

- The constructor forest is bootstrap logic.
- It prepares platform flags and internal tables.
- It does not yet look like the shell's main anti-hook or anti-debug execution path.
- The more suspicious behavior should be sought in later non-constructor roots.
