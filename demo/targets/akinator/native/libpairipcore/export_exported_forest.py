import json

import ida_auto
import ida_bytes
import ida_funcs
import ida_name
import idautils
import idc


RENAMES = {
    0x6250C: "pairip_export_execute_program",
    0x80474: "pairip_jni_on_load",
    0x81CC8: "pairip_jni_on_unload",
    0x62C78: "pairip_jni_execute_vm_bridge",
    0x52F20: "pairip_vm_interpreter_core_tentative",
    0x29FB4: "pairip_init_arch_gate",
    0x2A238: "pairip_init_hwcap_profile",
    0x2A04C: "pairip_build_hwcap_feature_mask",
    0x2A734: "pairip_register_atexit_slot_0",
    0x2A750: "pairip_register_atexit_slot_1",
    0x2A76C: "pairip_register_atexit_slot_2",
    0x84680: "__system_property_get_plt",
    0x84800: "getauxval_plt",
    0x84880: "strncmp_plt",
}

ROOTS = [
    0x6250C,
    0x80474,
    0x81CC8,
]

TENTATIVE_LABELS = {
    0x17E1C: "(module_walk_or_integrity_path)",
    0x2C5F0: "(late_libc_symbol_resolver)",
    0x2C934: "(path_or_dir_scanner)",
    0x2EED4: "(large_dispatch_or_vm_core_A)",
    0x65ADC: "(large_dispatch_or_vm_core_B)",
    0x2A66C: "(init_table_blob_A)",
    0x2A6D0: "(init_table_blob_B)",
    0x2A788: "(decode_or_expand_table_blob_A)",
    0x2BC10: "(decode_or_expand_table_blob_B)",
    0x2A838: "(ptr_add_src_byte)",
    0x2A840: "(ptr_add_masked_index)",
    0x2A848: "(ptr_add_dst_byte)",
    0x2A850: "(commit_table_blob_A)",
    0x2BCC0: "(commit_table_blob_B)",
}


def rename_known():
    for ea, name in RENAMES.items():
        ida_name.set_name(ea, name, ida_name.SN_FORCE)


def get_name(ea):
    name = ida_name.get_ea_name(ea)
    if name:
        return name
    func = ida_funcs.get_func(ea)
    if func:
        return ida_funcs.get_func_name(func.start_ea)
    return hex(ea)


def get_display_name(ea):
    if ea in TENTATIVE_LABELS:
        return TENTATIVE_LABELS[ea]
    return get_name(ea)


def get_func_start(ea):
    func = ida_funcs.get_func(ea)
    return func.start_ea if func else None


def is_import_leaf(name):
    return name.endswith("_plt") or name.startswith(".")


def classify(name, ea):
    if name == "pairip_export_execute_program":
        return "export root / execute entry"
    if name == "pairip_jni_on_load":
        return "export root / JNI_OnLoad"
    if name == "pairip_jni_on_unload":
        return "export root / JNI_OnUnload"
    if name == "pairip_jni_execute_vm_bridge":
        return "JNI native / executeVM bridge"
    if name == "pairip_vm_interpreter_core_tentative":
        return "(tentative VM interpreter core)"
    if name == "pairip_init_arch_gate":
        return "constructor / arch gate"
    if name == "pairip_init_hwcap_profile":
        return "constructor / hwcap-profile init"
    if name == "pairip_build_hwcap_feature_mask":
        return "hwcap feature-mask builder"
    if name.startswith("pairip_register_atexit_slot_"):
        return "constructor / atexit registration"
    if ea in (0x17E1C, 0x2C5F0, 0x2C934, 0x2EED4, 0x65ADC):
        return "(high-value non-constructor)"
    if is_import_leaf(name):
        return "import"
    return "(unknown)"


def direct_callees(func_ea):
    seen = set()
    out = []
    for item_ea in idautils.FuncItems(func_ea):
        if not ida_bytes.is_code(ida_bytes.get_flags(item_ea)):
            continue
        for cref in idautils.CodeRefsFrom(item_ea, False):
            callee = get_func_start(cref)
            if callee is None or callee == func_ea or callee in seen:
                continue
            seen.add(callee)
            out.append(callee)
    return sorted(out)


def make_node(func_ea):
    name = get_name(func_ea)
    disp = get_display_name(func_ea)
    return {
        "ea": func_ea,
        "name": name,
        "display_name": disp,
        "label": f"{disp} [{hex(func_ea)}] {classify(name, func_ea)}",
        "children": [],
        "termination": "",
    }


def dfs(func_ea, path, memo):
    if func_ea in memo:
        cached = make_node(func_ea)
        cached["termination"] = "memoized_subtree"
        return cached

    node = make_node(func_ea)
    callees = direct_callees(func_ea)
    if not callees:
        node["termination"] = "leaf_no_callees"
        memo[func_ea] = dict(node)
        return node

    next_path = path | {func_ea}
    for callee in callees:
        child = make_node(callee)
        child_name = child["name"]
        if callee in next_path:
            child["termination"] = "cycle_to_path"
        elif is_import_leaf(child_name):
            child["termination"] = "import_leaf"
        else:
            child = dfs(callee, next_path, memo)
        node["children"].append(child)

    node["termination"] = "expanded"
    memo[func_ea] = dict(node)
    return node


def render_tree(node, prefix=""):
    lines = [prefix + node["label"]]
    for idx, child in enumerate(node["children"]):
        last = idx == len(node["children"]) - 1
        branch = "└── " if last else "├── "
        child_prefix = prefix + ("    " if last else "│   ")
        lines.append(prefix + branch + child["label"])
        if child["children"]:
            for subline in render_tree(child, child_prefix)[1:]:
                lines.append(subline)
    return lines


def count_nodes(node):
    return 1 + sum(count_nodes(ch) for ch in node["children"])


def main():
    ida_auto.auto_wait()
    rename_known()

    if len(idc.ARGV) < 2:
        print("usage: script.py <out_json>")
        idc.qexit(2)

    out_json = idc.ARGV[1]
    memo = {}
    roots = []
    for root_ea in ROOTS:
        tree = dfs(root_ea, set(), memo)
        roots.append(
            {
                "root_ea": root_ea,
                "root_name": get_name(root_ea),
                "root_display_name": get_display_name(root_ea),
                "tree": tree,
                "tree_lines": render_tree(tree),
                "node_count": count_nodes(tree),
                "direct_callee_count": len(tree["children"]),
            }
        )

    with open(out_json, "w", encoding="utf-8") as f:
        json.dump({"roots": roots}, f, ensure_ascii=False, indent=2)
    idc.qexit(0)


if __name__ == "__main__":
    main()
