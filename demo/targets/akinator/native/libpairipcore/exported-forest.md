# Exported Forest

Scope: full DFS forest rooted at the three exported functions of `libpairipcore.so`.

Exports:
- `ExecuteProgram` -> `pairip_export_execute_program` (`0x6250C`)
- `JNI_OnLoad` -> `pairip_jni_on_load` (`0x80474`)
- `JNI_OnUnload` -> `pairip_jni_on_unload` (`0x81CC8`)

Root sizes:
- `pairip_export_execute_program`: 172 nodes
- `pairip_jni_on_load`: 107 nodes
- `pairip_jni_on_unload`: 5 nodes

Most obvious shared nodes across export roots:
- `sub_62D44`
- `sub_29CC8`
- `sub_28DDC`
- `sub_28DE4`
- `sub_843A4`
- `sub_17E1C` appears under the `JNI_OnLoad` path through deeper initialization and is tagged as a high-value non-constructor branch

Interpretation boundary:
- many names remain provisional
- this file is for structural orientation first
- rename only where the role is already stable

Forest:

```text
## pairip_export_execute_program 0x6250c
pairip_export_execute_program [0x6250c] export root / execute entry
├── sub_28DDC [0x28ddc] (unknown)
│   └── sub_28D9C [0x28d9c] (unknown)
│       ├── sub_1CDD0 [0x1cdd0] (unknown)
│       ├── sub_28E54 [0x28e54] (unknown)
│       │   ├── sub_16634 [0x16634] (unknown)
│       │   │   ├── sub_1CBA0 [0x1cba0] (unknown)
│       │   │   │   ├── sub_16634 [0x16634] (unknown)
│       │   │   │   ├── sub_1CBF0 [0x1cbf0] (unknown)
│       │   │   │   │   ├── sub_16634 [0x16634] (unknown)
│       │   │   │   │   ├── sub_1CFC0 [0x1cfc0] (unknown)
│       │   │   │   │   │   ├── .fwrite [0x84580] import
│       │   │   │   │   │   ├── .abort [0x845c0] import
│       │   │   │   │   │   ├── .openlog [0x84650] import
│       │   │   │   │   │   ├── .vasprintf [0x84670] import
│       │   │   │   │   │   ├── .vfprintf [0x846b0] import
│       │   │   │   │   │   ├── .closelog [0x84700] import
│       │   │   │   │   │   ├── .android_set_abort_message [0x84740] import
│       │   │   │   │   │   ├── .fputc [0x847c0] import
│       │   │   │   │   │   └── .syslog [0x847d0] import
│       │   │   │   │   └── sub_28EA4 [0x28ea4] (unknown)
│       │   │   │   │       ├── sub_16634 [0x16634] (unknown)
│       │   │   │   │       ├── sub_1CBA0 [0x1cba0] (unknown)
│       │   │   │   │       └── sub_1CD68 [0x1cd68] (unknown)
│       │   │   │   │           └── sub_29CC8 [0x29cc8] (unknown)
│       │   │   │   │               ├── .pthread_mutex_lock [0x84570] import
│       │   │   │   │               ├── .pthread_mutex_unlock [0x845a0] import
│       │   │   │   │               ├── .memset [0x845b0] import
│       │   │   │   │               ├── .abort [0x845c0] import
│       │   │   │   │               ├── .memcpy [0x84690] import
│       │   │   │   │               ├── .pthread_setspecific [0x846c0] import
│       │   │   │   │               ├── .pthread_getspecific [0x84770] import
│       │   │   │   │               ├── .malloc [0x84790] import
│       │   │   │   │               ├── .realloc [0x847e0] import
│       │   │   │   │               └── .pthread_once [0x84850] import
│       │   │   │   ├── sub_1CD8C [0x1cd8c] (unknown)
│       │   │   │   │   └── sub_29CC8 [0x29cc8] (unknown)
│       │   │   │   └── sub_28E30 [0x28e30] (unknown)
│       │   │   └── sub_28EA4 [0x28ea4] (unknown)
│       │   ├── sub_1CBA0 [0x1cba0] (unknown)
│       │   ├── sub_291A0 [0x291a0] (unknown)
│       │   │   ├── sub_1CFC0 [0x1cfc0] (unknown)
│       │   │   ├── sub_28DEC [0x28dec] (unknown)
│       │   │   │   └── .posix_memalign [0x845e0] import
│       │   │   ├── sub_2946C [0x2946c] (unknown)
│       │   │   │   └── .pthread_mutex_unlock [0x845a0] import
│       │   │   ├── sub_29490 [0x29490] (unknown)
│       │   │   └── .pthread_mutex_lock [0x84570] import
│       │   └── .memset [0x845b0] import
│       ├── sub_28FFC [0x28ffc] (unknown)
│       │   ├── sub_16CAC [0x16cac] (unknown)
│       │   │   ├── sub_16DA4 [0x16da4] (unknown)
│       │   │   │   ├── sub_1733C [0x1733c] (unknown)
│       │   │   │   ├── sub_1734C [0x1734c] (unknown)
│       │   │   │   ├── sub_1735C [0x1735c] (unknown)
│       │   │   │   │   ├── (module_walk_or_integrity_path) [0x17e1c] (high-value non-constructor)
│       │   │   │   │   │   ├── sub_175D4 [0x175d4] (unknown)
│       │   │   │   │   │   │   ├── sub_1776C [0x1776c] (unknown)
│       │   │   │   │   │   │   │   ├── sub_19344 [0x19344] (unknown)
│       │   │   │   │   │   │   │   │   ├── sub_196D0 [0x196d0] (unknown)
│       │   │   │   │   │   │   │   │   │   ├── .fflush [0x84510] import
│       │   │   │   │   │   │   │   │   │   ├── .abort [0x845c0] import
│       │   │   │   │   │   │   │   │   │   └── .fprintf [0x846d0] import
│       │   │   │   │   │   │   │   │   ├── .fflush [0x84510] import
│       │   │   │   │   │   │   │   │   ├── .abort [0x845c0] import
│       │   │   │   │   │   │   │   │   └── .fprintf [0x846d0] import
│       │   │   │   │   │   │   │   ├── sub_196D0 [0x196d0] (unknown)
│       │   │   │   │   │   │   │   ├── .fflush [0x84510] import
│       │   │   │   │   │   │   │   ├── .abort [0x845c0] import
│       │   │   │   │   │   │   │   └── .fprintf [0x846d0] import
│       │   │   │   │   │   │   ├── sub_19344 [0x19344] (unknown)
│       │   │   │   │   │   │   └── sub_196D0 [0x196d0] (unknown)
│       │   │   │   │   │   ├── sub_18528 [0x18528] (unknown)
│       │   │   │   │   │   │   ├── sub_19344 [0x19344] (unknown)
│       │   │   │   │   │   │   ├── sub_196D0 [0x196d0] (unknown)
│       │   │   │   │   │   │   ├── .fflush [0x84510] import
│       │   │   │   │   │   │   ├── .fwrite [0x84580] import
│       │   │   │   │   │   │   ├── .abort [0x845c0] import
│       │   │   │   │   │   │   ├── .memcpy [0x84690] import
│       │   │   │   │   │   │   └── .fprintf [0x846d0] import
│       │   │   │   │   │   ├── sub_1A25C [0x1a25c] (unknown)
│       │   │   │   │   │   │   ├── sub_18528 [0x18528] (unknown)
│       │   │   │   │   │   │   ├── sub_1A78C [0x1a78c] (unknown)
│       │   │   │   │   │   │   │   ├── sub_1776C [0x1776c] (unknown)
│       │   │   │   │   │   │   │   ├── sub_19344 [0x19344] (unknown)
│       │   │   │   │   │   │   │   └── sub_196D0 [0x196d0] (unknown)
│       │   │   │   │   │   │   ├── sub_1A954 [0x1a954] (unknown)
│       │   │   │   │   │   │   │   ├── sub_175D4 [0x175d4] (unknown)
│       │   │   │   │   │   │   │   ├── sub_19344 [0x19344] (unknown)
│       │   │   │   │   │   │   │   ├── sub_1A66C [0x1a66c] (unknown)
│       │   │   │   │   │   │   │   │   ├── sub_19344 [0x19344] (unknown)
│       │   │   │   │   │   │   │   │   ├── .fflush [0x84510] import
│       │   │   │   │   │   │   │   │   └── .fprintf [0x846d0] import
│       │   │   │   │   │   │   │   └── sub_1AABC [0x1aabc] (unknown)
│       │   │   │   │   │   │   │       ├── .fflush [0x84510] import
│       │   │   │   │   │   │   │       ├── .abort [0x845c0] import
│       │   │   │   │   │   │   │       └── .fprintf [0x846d0] import
│       │   │   │   │   │   │   ├── .memset [0x845b0] import
│       │   │   │   │   │   │   ├── .pthread_rwlock_rdlock [0x84600] import
│       │   │   │   │   │   │   ├── .pthread_rwlock_unlock [0x84660] import
│       │   │   │   │   │   │   ├── .memcpy [0x84690] import
│       │   │   │   │   │   │   ├── .pthread_rwlock_wrlock [0x846e0] import
│       │   │   │   │   │   │   ├── .free [0x84780] import
│       │   │   │   │   │   │   └── .malloc [0x84790] import
│       │   │   │   │   │   ├── .dl_iterate_phdr [0x844c0] import
│       │   │   │   │   │   ├── .memset [0x845b0] import
│       │   │   │   │   │   ├── .pthread_rwlock_rdlock [0x84600] import
│       │   │   │   │   │   ├── .__errno [0x84640] import
│       │   │   │   │   │   ├── .pthread_rwlock_unlock [0x84660] import
│       │   │   │   │   │   └── .syscall [0x84860] import
│       │   │   │   │   └── .memcpy [0x84690] import
│       │   │   │   ├── sub_17404 [0x17404] (unknown)
│       │   │   │   ├── sub_17580 [0x17580] (unknown)
│       │   │   │   ├── sub_17594 [0x17594] (unknown)
│       │   │   │   ├── .fflush [0x84510] import
│       │   │   │   ├── .abort [0x845c0] import
│       │   │   │   └── .fprintf [0x846d0] import
│       │   │   ├── sub_172A0 [0x172a0] (unknown)
│       │   │   ├── sub_1735C [0x1735c] (unknown)
│       │   │   ├── sub_17404 [0x17404] (unknown)
│       │   │   ├── sub_1756C [0x1756c] (unknown)
│       │   │   └── sub_17594 [0x17594] (unknown)
│       │   ├── sub_1CD68 [0x1cd68] (unknown)
│       │   ├── sub_28F64 [0x28f64] (unknown)
│       │   └── sub_29058 [0x29058] (unknown)
│       └── .free [0x84780] import
├── sub_28DE4 [0x28de4] (unknown)
│   └── sub_28D9C [0x28d9c] (unknown)
├── sub_29CC8 [0x29cc8] (unknown)
├── sub_2A3A4 [0x2a3a4] (unknown)
│   └── sub_1C29C [0x1c29c] (unknown)
│       ├── .abort [0x845c0] import
│       ├── .openlog [0x84650] import
│       ├── .vasprintf [0x84670] import
│       ├── .vfprintf [0x846b0] import
│       ├── .closelog [0x84700] import
│       ├── .android_set_abort_message [0x84740] import
│       └── .syslog [0x847d0] import
├── sub_2A4E4 [0x2a4e4] (unknown)
│   └── sub_2A36C [0x2a36c] (unknown)
│       └── sub_1C29C [0x1c29c] (unknown)
├── sub_5F544 [0x5f544] (unknown)
│   └── .__stack_chk_fail [0x84610] import
├── sub_62D44 [0x62d44] (unknown)
│   ├── .getpid [0x84590] import
│   └── .__stack_chk_fail [0x84610] import
├── sub_7BC74 [0x7bc74] (unknown)
│   └── .__stack_chk_fail [0x84610] import
├── sub_843A4 [0x843a4] (unknown)
│   ├── sub_1CC20 [0x1cc20] (unknown)
│   ├── sub_28D9C [0x28d9c] (unknown)
│   └── .malloc [0x84790] import
├── sub_843F4 [0x843f4] (unknown)
│   └── sub_843A4 [0x843a4] (unknown)
├── .__stack_chk_fail [0x84610] import
├── .memcpy [0x84690] import
└── .strlen [0x84870] import

## pairip_jni_on_load 0x80474
pairip_jni_on_load [0x80474] export root / JNI_OnLoad
├── sub_1C450 [0x1c450] (unknown)
│   ├── sub_1C10C [0x1c10c] (unknown)
│   │   └── sub_1C12C [0x1c12c] (unknown)
│   │       ├── sub_16FFC [0x16ffc] (unknown)
│   │       │   ├── sub_16DA4 [0x16da4] (unknown)
│   │       │   ├── sub_17080 [0x17080] (unknown)
│   │       │   │   ├── sub_1733C [0x1733c] (unknown)
│   │       │   │   ├── sub_1734C [0x1734c] (unknown)
│   │       │   │   ├── sub_1735C [0x1735c] (unknown)
│   │       │   │   ├── sub_17580 [0x17580] (unknown)
│   │       │   │   └── sub_17594 [0x17594] (unknown)
│   │       │   ├── sub_172A0 [0x172a0] (unknown)
│   │       │   ├── .fflush [0x84510] import
│   │       │   ├── .abort [0x845c0] import
│   │       │   └── .fprintf [0x846d0] import
│   │       ├── sub_1C034 [0x1c034] (unknown)
│   │       │   ├── sub_1ADA4 [0x1ada4] (unknown)
│   │       │   │   ├── sub_1ACF4 [0x1acf4] (unknown)
│   │       │   │   │   ├── sub_843A4 [0x843a4] (unknown)
│   │       │   │   │   ├── .memcpy [0x84690] import
│   │       │   │   │   └── .strlen [0x84870] import
│   │       │   │   └── sub_1AE38 [0x1ae38] (unknown)
│   │       │   ├── sub_1AFB4 [0x1afb4] (unknown)
│   │       │   │   └── sub_28DDC [0x28ddc] (unknown)
│   │       │   ├── sub_1B824 [0x1b824] (unknown)
│   │       │   │   ├── sub_1B020 [0x1b020] (unknown)
│   │       │   │   │   ├── sub_1AF9C [0x1af9c] (unknown)
│   │       │   │   │   │   └── sub_1B7D0 [0x1b7d0] (unknown)
│   │       │   │   │   │       ├── sub_16FFC [0x16ffc] (unknown)
│   │       │   │   │   │       ├── sub_1B940 [0x1b940] (unknown)
│   │       │   │   │   │       │   └── sub_1AD58 [0x1ad58] (unknown)
│   │       │   │   │   │       │       └── sub_1ACF4 [0x1acf4] (unknown)
│   │       │   │   │   │       ├── sub_28E54 [0x28e54] (unknown)
│   │       │   │   │   │       ├── sub_28F40 [0x28f40] (unknown)
│   │       │   │   │   │       └── sub_28FFC [0x28ffc] (unknown)
│   │       │   │   │   ├── sub_1B898 [0x1b898] (unknown)
│   │       │   │   │   │   └── sub_843A4 [0x843a4] (unknown)
│   │       │   │   │   ├── sub_1BD14 [0x1bd14] (unknown)
│   │       │   │   │   ├── sub_1BD80 [0x1bd80] (unknown)
│   │       │   │   │   ├── sub_1BE10 [0x1be10] (unknown)
│   │       │   │   │   └── .memmove [0x846f0] import
│   │       │   │   └── .strlen [0x84870] import
│   │       │   ├── sub_1BF70 [0x1bf70] (unknown)
│   │       │   │   ├── sub_1AFB4 [0x1afb4] (unknown)
│   │       │   │   ├── sub_1B648 [0x1b648] (unknown)
│   │       │   │   │   ├── sub_1B284 [0x1b284] (unknown)
│   │       │   │   │   │   ├── sub_1AE54 [0x1ae54] (unknown)
│   │       │   │   │   │   │   ├── sub_1AF9C [0x1af9c] (unknown)
│   │       │   │   │   │   │   ├── sub_1B898 [0x1b898] (unknown)
│   │       │   │   │   │   │   ├── sub_1BCF4 [0x1bcf4] (unknown)
│   │       │   │   │   │   │   ├── sub_28DDC [0x28ddc] (unknown)
│   │       │   │   │   │   │   └── .memmove [0x846f0] import
│   │       │   │   │   │   ├── sub_1BD28 [0x1bd28] (unknown)
│   │       │   │   │   │   ├── sub_1BD4C [0x1bd4c] (unknown)
│   │       │   │   │   │   ├── sub_1BD90 [0x1bd90] (unknown)
│   │       │   │   │   │   ├── sub_1BDB0 [0x1bdb0] (unknown)
│   │       │   │   │   │   └── .memmove [0x846f0] import
│   │       │   │   │   ├── sub_1BD70 [0x1bd70] (unknown)
│   │       │   │   │   └── .strlen [0x84870] import
│   │       │   │   └── sub_1C1F4 [0x1c1f4] (unknown)
│   │       │   │       └── sub_1B284 [0x1b284] (unknown)
│   │       │   └── sub_1C214 [0x1c214] (unknown)
│   │       ├── sub_28E54 [0x28e54] (unknown)
│   │       ├── sub_28F40 [0x28f40] (unknown)
│   │       └── sub_28FFC [0x28ffc] (unknown)
│   └── .pthread_mutex_lock [0x84570] import
├── sub_1C47C [0x1c47c] (unknown)
│   └── .pthread_mutex_unlock [0x845a0] import
├── sub_28DDC [0x28ddc] (unknown)
├── sub_28DE4 [0x28de4] (unknown)
├── sub_29CC8 [0x29cc8] (unknown)
├── sub_2A3A4 [0x2a3a4] (unknown)
├── sub_2A4E4 [0x2a4e4] (unknown)
├── sub_5FA88 [0x5fa88] (unknown)
│   ├── sub_28DDC [0x28ddc] (unknown)
│   ├── sub_28DE4 [0x28de4] (unknown)
│   ├── sub_29CC8 [0x29cc8] (unknown)
│   ├── sub_2A3A4 [0x2a3a4] (unknown)
│   ├── sub_62D44 [0x62d44] (unknown)
│   ├── sub_843F4 [0x843f4] (unknown)
│   └── .__stack_chk_fail [0x84610] import
├── sub_62D44 [0x62d44] (unknown)
├── sub_7C020 [0x7c020] (unknown)
│   ├── sub_28DDC [0x28ddc] (unknown)
│   ├── sub_28DE4 [0x28de4] (unknown)
│   ├── sub_29CC8 [0x29cc8] (unknown)
│   ├── sub_2A3A4 [0x2a3a4] (unknown)
│   ├── sub_62D44 [0x62d44] (unknown)
│   ├── sub_843A4 [0x843a4] (unknown)
│   ├── sub_843F4 [0x843f4] (unknown)
│   └── .__stack_chk_fail [0x84610] import
├── sub_8334C [0x8334c] (unknown)
│   ├── sub_28DDC [0x28ddc] (unknown)
│   ├── sub_28DE4 [0x28de4] (unknown)
│   ├── sub_29CC8 [0x29cc8] (unknown)
│   ├── sub_2A3A4 [0x2a3a4] (unknown)
│   ├── sub_62D44 [0x62d44] (unknown)
│   ├── sub_843F4 [0x843f4] (unknown)
│   └── .__stack_chk_fail [0x84610] import
├── sub_843A4 [0x843a4] (unknown)
├── sub_843F4 [0x843f4] (unknown)
├── .getpid [0x84590] import
├── .__stack_chk_fail [0x84610] import
├── .memcpy [0x84690] import
├── .memmove [0x846f0] import
└── .strlen [0x84870] import

## pairip_jni_on_unload 0x81cc8
pairip_jni_on_unload [0x81cc8] export root / JNI_OnUnload
├── sub_1C450 [0x1c450] (unknown)
├── sub_1C47C [0x1c47c] (unknown)
├── sub_29CC8 [0x29cc8] (unknown)
└── sub_62D44 [0x62d44] (unknown)
```

Reading hints:
- `pairip_export_execute_program` looks like the narrower exported execution entry.
- `pairip_jni_on_load` is the wider initialization root and already reaches the high-value non-constructor branch `0x17E1C`.
- `pairip_jni_on_unload` is small and cleanup-oriented compared with the other two roots.
