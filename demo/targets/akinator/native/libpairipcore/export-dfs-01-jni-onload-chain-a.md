# Export DFS 01

Root context: `pairip_jni_on_load`

Current DFS slice:

```text
pairip_jni_on_load
└── pairip_mutex_lock_or_abort [0x1C450]
    └── pairip_raise_fatal_with_message [0x1C10C]
        └── pairip_build_fatal_context_and_abort [0x1C12C]
            └── pairip_libunwind_resume_or_abort [0x16FFC]
                └── sub_16DA4 [(libunwind/stack-walk core?)]
```

Per-function review:

- `pairip_mutex_lock_or_abort` (`0x1C450`)
  - direct role: `pthread_mutex_lock` wrapper
  - failure path: sends `"mutex lock failed"` into `pairip_raise_fatal_with_message`
  - xref note: used by many higher-level paths including `sub_2EED4`

- `pairip_raise_fatal_with_message` (`0x1C10C`)
  - direct role: thin fatal wrapper
  - takes a status code and a message
  - forwards both into `pairip_build_fatal_context_and_abort` with shared descriptor `off_8FF38`
  - xref note: reused by several thread and mutex wrappers

- `pairip_build_fatal_context_and_abort` (`0x1C12C`)
  - direct role: allocates and initializes a small context object
  - then routes the prepared object into `pairip_libunwind_resume_or_abort`
  - structural hint: looks like packaged fatal/report object construction, not business logic

- `pairip_libunwind_resume_or_abort` (`0x16FFC`)
  - direct role: fatal libunwind path
  - chooses between `sub_16DA4` and `sub_17080`
  - logs `libunwind: _Unwind_Resume - _Unwind_Resume() can't return`
  - then flushes and aborts
  - xref note: called from many exception or fatal-style paths, not only this chain

- `sub_16DA4`
  - current status: not renamed yet
  - suspicious points:
    - large recursive/control-heavy routine
    - only two incoming xrefs in the current database slice
    - sits directly on the libunwind abort path
    - repeatedly calls `sub_1735C`, `sub_17580`, `sub_17404`, `sub_17594`
  - current interpretation: `(libunwind/stack-walk core?)`

Takeaway:

- this branch is not the shell's anti-hook mainline
- it is a shared fatal/unwind infrastructure branch
- worth keeping because it is heavily reused and will likely help separate crash plumbing from real detection logic
