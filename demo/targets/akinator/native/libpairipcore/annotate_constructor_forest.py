import ida_auto
import ida_name
import idc


RENAMES = {
    0x29FB4: "pairip_init_arch_gate",
    0x2A238: "pairip_init_hwcap_profile",
    0x2A04C: "pairip_build_hwcap_feature_mask",
    0x2A66C: "pairip_init_table_blob_a_tentative",
    0x2A788: "pairip_decode_table_blob_a_tentative",
    0x2A838: "pairip_ptr_add_src_index_tentative",
    0x2A840: "pairip_ptr_add_masked_index_mod8_tentative",
    0x2A848: "pairip_ptr_add_dst_index_tentative",
    0x2A850: "pairip_commit_table_blob_a_tentative",
    0x2A6D0: "pairip_init_table_blob_b_tentative",
    0x2BC10: "pairip_decode_table_blob_b_tentative",
    0x2BCC0: "pairip_commit_table_blob_b_tentative",
    0x2A734: "pairip_register_atexit_slot_0",
    0x2A750: "pairip_register_atexit_slot_1",
    0x2A76C: "pairip_register_atexit_slot_2",
}


FUNC_COMMENTS = {
    0x29FB4: (
        "Constructor root. Reads AT_HWCAP and ro.arch, compares against 'exynos9810', "
        "then stores a one-byte platform-gate result into global state. High confidence: "
        "platform compatibility or blacklist gate, not direct anti-debug logic."
    ),
    0x2A238: (
        "Constructor root. Reads ro.arch plus AT_HWCAP/AT_HWCAP2 and forwards them into "
        "pairip_build_hwcap_feature_mask. High confidence: runtime capability profiling for later dispatch."
    ),
    0x2A04C: (
        "Leaf bit-manipulation routine with no external calls. High confidence: builds a feature mask "
        "or capability profile from auxv-derived values for later runtime dispatch."
    ),
    0x2A66C: (
        "Tentative name. Constructor root that copies a 0x108-byte embedded blob into stack memory, "
        "then routes it into pairip_decode_table_blob_a_tentative. Likely table/bootstrap state init."
    ),
    0x2A788: (
        "Tentative name. Iterates 0x100 bytes, mixes bytes from a source blob with a small masked-index table, "
        "writes the transformed result into a destination buffer, then commits the finished table globally. "
        "Likely deobfuscation or table expansion, not environment probing."
    ),
    0x2A838: (
        "Tentative helper. Pure pointer addition used to fetch the source-table byte at base + index."
    ),
    0x2A840: (
        "Tentative helper. Pure pointer addition used to fetch a byte from a small repeating table at base + (index & 7)."
    ),
    0x2A848: (
        "Tentative helper. Pure pointer addition used to address the output byte slot at dst + index."
    ),
    0x2A850: (
        "Tentative name. Commits the fully expanded 0x100-byte table blob A into a global storage region."
    ),
    0x2A6D0: (
        "Tentative name. Constructor root parallel to pairip_init_table_blob_a_tentative, but for a second embedded blob."
    ),
    0x2BC10: (
        "Tentative name. Parallel decode/expand routine for the second embedded table blob. "
        "Structure mirrors pairip_decode_table_blob_a_tentative."
    ),
    0x2BCC0: (
        "Tentative name. Commits the second expanded 0x100-byte table into a different global storage region."
    ),
    0x2A734: (
        "Registers one static destructor/object pair through __cxa_atexit. Normal object lifetime handling."
    ),
    0x2A750: (
        "Registers one static destructor/object pair through __cxa_atexit. Normal object lifetime handling."
    ),
    0x2A76C: (
        "Registers one static destructor/object pair through __cxa_atexit. Normal object lifetime handling."
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
