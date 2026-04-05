import json

import ida_auto
import ida_bytes
import ida_funcs
import ida_name
import idautils
import idc


RENAMES = {
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
    0x29FB4,
    0x2A238,
    0x2A66C,
    0x2A6D0,
    0x2A734,
    0x2A750,
    0x2A76C,
]

TENTATIVE_LABELS = {
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


def classify(name, ea):
    if name == "pairip_init_arch_gate":
        return "constructor / arch gate"
    if name == "pairip_init_hwcap_profile":
        return "constructor / hwcap-profile init"
    if ea == 0x2A66C:
        return "(constructor / init table blob A)"
    if ea == 0x2A6D0:
        return "(constructor / init table blob B)"
    if name == "pairip_build_hwcap_feature_mask":
        return "hwcap feature-mask builder"
    if ea == 0x2A788:
        return "(table/blob transform A)"
    if ea == 0x2BC10:
        return "(table/blob transform B)"
    if ea in (0x2A838, 0x2A840, 0x2A848):
        return "(pointer helper)"
    if ea == 0x2A850:
        return "(table blob A commit)"
    if ea == 0x2BCC0:
        return "(table blob B commit)"
    if name.startswith("pairip_register_atexit_slot_"):
        return "constructor / atexit registration"
    if name == "__system_property_get_plt":
        return "import / system property read"
    if name == "getauxval_plt":
        return "import / auxv read"
    if name == "strncmp_plt":
        return "import / string compare"
    if is_import_leaf(name):
        return "import"
    return "(unknown)"


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


def dfs(func_ea, visited):
    node = make_node(func_ea)
    callees = direct_callees(func_ea)
    if not callees:
        node["termination"] = "leaf_no_callees"
        return node
    visited = visited | {func_ea}
    for callee in callees:
        child = make_node(callee)
        child_name = child["name"]
        if callee in visited:
            child["termination"] = "cycle_to_visited"
        elif is_import_leaf(child_name):
            child["termination"] = "import_leaf"
        else:
            child = dfs(callee, visited)
        node["children"].append(child)
    node["termination"] = "expanded"
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
    roots = []
    for root_ea in ROOTS:
        tree = dfs(root_ea, set())
        roots.append(
            {
                "root_ea": root_ea,
                "root_name": get_name(root_ea),
                "root_display_name": get_display_name(root_ea),
                "tree": tree,
                "tree_lines": render_tree(tree),
                "node_count": count_nodes(tree),
            }
        )

    out = {
        "roots": roots,
    }
    with open(out_json, "w", encoding="utf-8") as f:
        json.dump(out, f, ensure_ascii=False, indent=2)
    idc.qexit(0)


if __name__ == "__main__":
    main()
