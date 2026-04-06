# History Fixes

`historyFixes/` is the repository's audit archive layer.

It does not replace:

- `.findings.sqlite`
  - reusable distilled lessons
- `.status/checkpoint.md`
  - current prioritized repo state
- `tools/java-bridge-fuzz/`
  - executable repro / fuzz / regression baseline

It exists to preserve complete fix narratives in a reviewable, reusable form.

## Cases

- `java-bridge-bilipai-attach-crash/`
  - full audit archive for the Java bridge attach crash investigation
  - important role split:
    - primary subject: our own `sunda` / injected agent / Java bridge implementation
    - test trigger: `com.android.purebilibili`
