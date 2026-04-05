import json
import sys

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


def get_func_start(ea):
    func = ida_funcs.get_func(ea)
    return func.start_ea if func else None


def is_plt_name(name):
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
    if name == "pairip_init_hwcap_profile":
        return "constructor / hwcap-profile init"
    if name == "pairip_init_arch_gate":
        return "constructor / arch gate"
    if name == "pairip_build_hwcap_feature_mask":
        return "hwcap feature-mask builder"
    if name == "__system_property_get_plt":
        return "import / system property read"
    if name == "getauxval_plt":
        return "import / auxv read"
    if name == "strncmp_plt":
        return "import / string compare"
    return "(unknown)"


def dfs(func_ea, visited, depth, max_depth):
    name = get_name(func_ea)
    node = {
        "ea": func_ea,
        "name": name,
        "label": f"{name} [{hex(func_ea)}] {classify(name, func_ea)}",
        "children": [],
        "termination": "",
    }
    if depth >= max_depth:
        node["termination"] = "depth_limit"
        return node
    callees = direct_callees(func_ea)
    if not callees:
        node["termination"] = "leaf_no_callees"
        return node
    visited = visited | {func_ea}
    for callee in callees:
        callee_name = get_name(callee)
        child = {
            "ea": callee,
            "name": callee_name,
            "label": f"{callee_name} [{hex(callee)}] {classify(callee_name, callee)}",
            "children": [],
            "termination": "",
        }
        if callee in visited:
            child["termination"] = "cycle_to_visited"
        elif is_plt_name(callee_name):
            child["termination"] = "import_leaf"
        else:
            child = dfs(callee, visited, depth + 1, max_depth)
        node["children"].append(child)
    if not node["termination"]:
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


def main():
    ida_auto.auto_wait()
    rename_known()

    if len(idc.ARGV) < 3:
        print("usage: script.py <out_json> <root_ea_hex> [max_depth]")
        idc.qexit(2)

    out_json = idc.ARGV[1]
    root_ea = int(idc.ARGV[2], 16)
    max_depth = int(idc.ARGV[3]) if len(idc.ARGV) >= 4 else 128

    root = dfs(root_ea, set(), 0, max_depth)
    tree_lines = render_tree(root)
    out = {
        "root_ea": root_ea,
        "root_name": get_name(root_ea),
        "tree": root,
        "tree_lines": tree_lines,
    }

    with open(out_json, "w", encoding="utf-8") as f:
        json.dump(out, f, ensure_ascii=False, indent=2)

    idc.qexit(0)


if __name__ == "__main__":
    main()
