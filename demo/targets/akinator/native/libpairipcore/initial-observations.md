# Initial Observations

Scope: first-pass static triage of `libpairipcore.so` with IDA Pro headless, focused on `.init_array` and nearby startup logic.

Hard facts:
- `.init` did not yield a standalone function in IDA.
- `.init_array` contains 7 constructor entries:
  - `sub_29FB4`
  - `sub_2A238`
  - `sub_2A66C`
  - `sub_2A6D0`
  - `sub_2A734`
  - `sub_2A750`
  - `sub_2A76C`
- `sub_29FB4` and `sub_2A238` call `getauxval`, `__system_property_get`, and `strncmp` against `"ro.arch"` / `"exynos9810"`.
- `sub_2A66C` and `sub_2A6D0` copy 0x108-byte blobs and transform them into global tables.
- `sub_2A734`, `sub_2A750`, and `sub_2A76C` register destructors through `__cxa_atexit`.

Inference:
- The constructor layer looks like platform capability setup plus lookup-table or crypto-state bootstrap, not direct hook/debugger detection.
- `sub_2A238 -> sub_2A04C` appears to derive feature masks from `AT_HWCAP` and `AT_HWCAP2`.
- `sub_2A66C -> sub_2A788` and `sub_2A6D0 -> sub_2BC10` appear to initialize obfuscated or crypto-related tables.

Important non-constructor candidates:
- `sub_17E1C`: uses `dl_iterate_phdr` and `syscall`
- `sub_2C5F0`: builds `"libc.so"` at runtime and resolves symbols via `dlopen` / `dlsym`
- `sub_2C934`: uses `stat` / `opendir` / `readdir`
- `sub_2EED4`: large dispatcher touching `dl_iterate_phdr`, `dlopen`, `dlsym`, and `syscall`
- `sub_65ADC`: large dispatcher touching `dl_iterate_phdr`

Interpretation boundary:
- No direct `ptrace`, `TracerPid`, `frida`, `xposed`, or `magisk` evidence was found in the constructor layer.
- The shell does contain loader or module-walk and dynamic-resolution infrastructure elsewhere, so anti-hook or anti-analysis logic is more likely deeper than `.init_array`.
