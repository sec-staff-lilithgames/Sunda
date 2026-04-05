import ida_auto
import ida_name
import idc


RENAMES = {
    0x80474: "pairip_jni_on_load",
    0x62C78: "pairip_jni_execute_vm_bridge",
    0x52F20: "pairip_vm_interpreter_core_tentative",
}


FUNC_COMMENTS = {
    0x80474: (
        "JNI_OnLoad root. Early native initialization path that installs runtime state, "
        "builds native registration metadata, and reaches pairip_jni_execute_vm_bridge "
        "through the registration chain before Java-side business entrypoints run."
    ),
    0x62C78: (
        "High-confidence JNI bridge for VMRunner.executeVM(byte[] vmCode, Object[] args). "
        "Observed shape: reads jbyteArray length through JNIEnv, allocates a native byte "
        "buffer, copies the bytecode into that buffer, packs a small local descriptor "
        "({ptr,len,0}), then forwards descriptor + Java args object into "
        "pairip_vm_interpreter_core_tentative."
    ),
    0x52F20: (
        "Tentative name. Large VM-like execution core reached from the JNI execute bridge. "
        "Receives a bytecode-buffer descriptor plus Java args object, then enters a large "
        "dispatch loop / jumptable-driven state machine. Crash PC 0x5d75c lands inside this "
        "function on an indexed signed-byte read (ldrsb x2, [x16, x11]). Treat this as VM "
        "interpreter/dispatcher territory until disproved."
    ),
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
