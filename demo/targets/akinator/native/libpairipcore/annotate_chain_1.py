import ida_auto
import ida_funcs
import ida_name
import idc


RENAMES = {
    0x1C450: "pairip_mutex_lock_or_abort",
    0x1C47C: "pairip_mutex_unlock",
    0x1C10C: "pairip_raise_fatal_with_message",
    0x1C12C: "pairip_build_fatal_context_and_abort",
    0x16FFC: "pairip_libunwind_resume_or_abort",
}

FUNC_COMMENTS = {
    0x1C450: "Thin wrapper around pthread_mutex_lock. On failure it routes into the fatal error path with the message 'mutex lock failed'.",
    0x1C47C: "Thin wrapper around pthread_mutex_unlock.",
    0x1C10C: "Small wrapper that forwards a status code plus message into the fatal-context builder using a shared global descriptor at off_8FF38.",
    0x1C12C: "Builds a small fatal/error context object, installs function pointers or descriptors, then routes into the libunwind-based abort path.",
    0x16FFC: "libunwind-based fatal path. Chooses one of two unwind/context-processing helpers, then prints '_Unwind_Resume() can't return' and aborts.",
    0x16DA4: "Suspicious libunwind or stack-walk core. Large recursive/control-heavy routine used by the fatal abort path; likely processes unwind frames or context records before termination.",
}


def main():
    ida_auto.auto_wait()
    for ea, name in RENAMES.items():
        ida_name.set_name(ea, name, ida_name.SN_FORCE)
    for ea, comment in FUNC_COMMENTS.items():
        idc.set_func_cmt(ea, comment, 0)
    idc.qexit(0)


if __name__ == "__main__":
    main()
