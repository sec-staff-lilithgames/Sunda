# Source Reading Notes

This note narrows the current Java bridge fuzz target to the code that matches the live bilipai symptoms.

## Primary Hotspots

### `class-model.js`

Path:

- `frida17.8.0/subprojects/frida-tools/bridges/node_modules/frida-java-bridge/lib/class-model.js`

Current fuzz-relevant surfaces:

- `Model.build()` and `model_new()`
  - ART path now reads the method count from the `methods_` array header instead of trusting `copied_methods_offset_`
  - methods and fields are converted back to reflected Java objects before modifiers are read
- `to_reflected_method()` / `to_reflected_field()` + `get_modifiers()`
  - this is where Android 16 changed the trusted source of Java-level modifiers
- `enumerateMethods()`
  - query parsing drives both ART and JVM method enumeration
  - modifiers `s`, `i`, and `u` alter the enumeration path

Why this matters:

- bilipai failures are not limited to a single hook install path
- query parsing, class model construction, and reflected modifier reads are all bridge surfaces that can fail before or during normal hook setup

### `android.js`

Path:

- `frida17.8.0/subprojects/frida-tools/bridges/node_modules/frida-java-bridge/lib/android.js`

Current fuzz-relevant surfaces:

- ART runtime and class-linker spec detection
- `copiedMethodsOffset` fallback
  - Android 16 no longer exposes the older nearby raw value pattern
- attach-time bridge readiness for `Java.performNow()` and `Java.perform()`

Why this matters:

- the observed flaky attach failure includes `script.load()`-time transport closure
- bridge initialization and runtime spec detection need to be treated as fuzz lanes, not just post-load method hooks

## Current Runtime Truth To Match

Checkpoint-backed facts:

- normal bilipai smoke is green on `/data/local/.sunday/sunda`
- a `10 attach + 10 spawn` batch can pass fully
- higher-pressure attach can still fail with:
  - `frida.TransportError: the connection is closed`
  - detached-session paths carrying a `frida.Crash`

## Fixed Fuzz Lanes

The first baseline must cover:

- `script.load()` and immediate post-load initialization
- `Java.performNow()` / `Java.perform()` switching
- `Java.use()` on:
  - `java.lang.Thread`
  - `android.app.Application`
  - `com.android.purebilibili.app.PureApplication`
- `Java.enumerateMethods()` queries with signature / ignore-case / skip-system flags
- hook install and repeated invocation on:
  - `Thread.getName()`
  - `Application.getPackageName()`
- attach and spawn timing variants
