# Akinator Startup Static Environment Assessment

Scope:
- only the startup asset `ReqL9SxJHgWgm3cn`
- only the startup chain rooted at `StartupLauncher.launch()`
- current objective is to recover `what Android static environment is being checked`
- current objective is not to prove `Frida detection`

## 1. Closed startup chain

Current closed chain:

```text
StartupLauncher.launch()
  -> VMRunner.invoke("ReqL9SxJHgWgm3cn", null)
    -> VMRunner.executeVM(byte[] vmCode, Object[] args)
      -> pairip_jni_on_load
        -> pairip_jni_execute_vm_bridge
          -> pairip_vm_interpreter_core_tentative
            -> handler family 0x5d61c..0x5d798
```

Evidence anchors:
- `jadx-out/sources/com/pairip/StartupLauncher.java`
- `jadx-out/sources/com/pairip/VMRunner.java`
- `native/libpairipcore/crash-chain-vm-assessment.md`
- `native/libpairipcore/startup-crash-semantics.md`
- `evidence/2026-04-01-113209-syswide-sample/uprobe-trace-early.txt`

## 2. Confirmed static-environment surfaces

### A. CPU / SoC capability profiling

Confirmed readers:
- `pairip_init_arch_gate` (`0x29FB4`)
- `pairip_init_hwcap_profile` (`0x2A238`)
- `pairip_build_hwcap_feature_mask` (`0x2A04C`)

Confirmed static inputs:
- `ro.arch`
- `AT_HWCAP`
- `AT_HWCAP2`
- explicit `exynos9810` comparison

Current meaning:
- this shell profiles device architecture and CPU feature state during constructor bootstrap
- this is best classified as `Android static environment modeling`
- this is not current evidence of Frida-specific detection

Evidence anchors:
- `native/libpairipcore/review-constructor-forest.md`
- `native/libpairipcore/dfs-01-2a238.md`
- `native/libpairipcore/initial-observations.md`

Current boundary:
- this capability profile is confirmed to feed later native dispatch policy
- it is not yet directly proven as an input to the `0x5d61c..0x5d798` handler family

### B. Module / phdr environment enumeration

Confirmed reader:
- `sub_17E1C`

Confirmed static inputs:
- loaded image view through `dl_iterate_phdr`
- extra kernel or libc-side environment state through `syscall`

Current meaning:
- this function is best classified as `module-walk / loader-state enumeration`
- current evidence supports `general native integrity or loader environment inspection`
- current evidence does not support calling it `Frida detection`

Evidence anchors:
- `native/libpairipcore/initial-observations.md`
- `native/libpairipcore/exported-forest.md`
- `native/libpairipcore/ida/init_suspicious.json`

Current boundary:
- `sub_17E1C` is confirmed under the `JNI_OnLoad` startup root
- current evidence proves startup-root participation
- current evidence does not yet prove that its result is the exact value consumed by the `0x5d61c..0x5d798` handler family

### C. Dynamic symbol / libc environment probing

Confirmed reader:
- `sub_2C5F0`

Confirmed static inputs:
- runtime-loaded `libc.so`
- symbol resolution through `dlopen` / `dlsym`
- likely libc or system-property helper availability

Current meaning:
- this is best classified as `dynamic runtime symbol environment probing`
- current evidence supports generic loader/runtime capability discovery
- current evidence does not support calling it Frida-specific

Evidence anchors:
- `native/libpairipcore/initial-observations.md`
- `native/libpairipcore/ida/init_suspicious.json`

Current boundary:
- `sub_2C5F0` is a high-value candidate under the broader suspicious native cluster
- direct consumption by the startup asset is not yet proven

### D. Filesystem / directory environment probing

Confirmed reader:
- `sub_2C934`

Confirmed static inputs:
- file metadata through `stat`
- directory existence / listing through `opendir` / `readdir`

Current meaning:
- this is best classified as `filesystem environment enumeration`
- this is a general Android static-environment surface
- current evidence does not support calling it Frida-specific

Evidence anchors:
- `native/libpairipcore/initial-observations.md`
- `native/libpairipcore/ida/init_suspicious.json`

Current boundary:
- direct consumption by the startup asset is not yet proven

### E. Environment aggregation dispatchers

Confirmed large hubs:
- `sub_2EED4`
- `sub_65ADC`

Current meaning:
- both functions aggregate multiple suspicious surfaces
- `sub_2EED4` mixes `dl_iterate_phdr`, `dlopen`, `dlsym`, and `syscall`
- `sub_65ADC` is a second large dispatcher that also reaches `dl_iterate_phdr`

Evidence anchors:
- `native/libpairipcore/initial-observations.md`
- `native/libpairipcore/ida/init_suspicious.json`

Current boundary:
- these are confirmed high-value environment-policy candidates
- they are not yet proven as the exact producers of the values consumed by the startup handler family

## 3. What the startup handler family currently proves

Confirmed handler family:
- entry block: `0x5d61c..0x5d740`
- loop setup: `0x5d740..0x5d758`
- byte loop: `0x5d758..0x5d774`
- compare tail: `0x5d774..0x5d798`

Confirmed local semantics:
- decodes table-backed operands from VM state
- mutates an internal floating-point slot
- runs an FNV-style rolling hash / verification loop
- compares the derived value against an expected value
- rejoins a shared continuation on non-crashing flow

Current meaning:
- the startup asset is definitely evaluating precomputed blob or table data
- the startup asset is definitely making a verify/select decision inside the VM
- the exact upstream static-environment producer feeding that blob or expected value is still unresolved

Evidence anchors:
- `native/libpairipcore/crash-subpath-xref-analysis.md`
- `native/libpairipcore/single-chain-block-semantics.md`
- `native/libpairipcore/final-crash-conclusion-0x5d75c.md`

## 4. Current classification

### Confirmed Android static-environment detection or modeling

- CPU capability and architecture profile:
  - `ro.arch`
  - `AT_HWCAP`
  - `AT_HWCAP2`
  - `exynos9810` gate
- loaded-image / phdr view:
  - `dl_iterate_phdr`
- runtime symbol environment:
  - `dlopen`
  - `dlsym`
- filesystem environment:
  - `stat`
  - `opendir`
  - `readdir`

### Confirmed general integrity / loader environment inspection

- startup-root module-walk branch through `sub_17E1C`
- dynamic libc resolver path through `sub_2C5F0`
- filesystem probe path through `sub_2C934`
- larger environment-policy hubs `sub_2EED4` and `sub_65ADC`

### Not yet provable as Frida detection

- no constructor-layer evidence of `ptrace`, `TracerPid`, `frida`, `xposed`, or `magisk`
- current startup-root suspicious imports are still generic enough to fit ordinary loader or integrity inspection
- the current VM handler family is a verifier, but the exact static-environment source feeding its verification input is not yet proven

## 5. Bottom line

Current best conclusion:
- Akinator startup is already confirmed to inspect Android static environment surfaces before app business logic becomes visible.
- The shell is currently better described as `environment modeling + integrity-oriented startup VM verification`.
- At this stage it is incorrect to collapse the current startup path directly into `Frida detection`.

Current next slice after this document:
- tie one concrete producer from `sub_17E1C` / `sub_2C5F0` / `sub_2C934` / `sub_2EED4` / `sub_65ADC` into the values consumed by `0x5d61c..0x5d798`
- only after that decide whether the sample stays generic-environment-focused or begins to expose Frida-specific detection
