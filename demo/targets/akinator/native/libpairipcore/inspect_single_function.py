import json

import ida_auto
import ida_bytes
import ida_funcs
import ida_name
import idautils
import idc


def get_func(ea):
    func = ida_funcs.get_func(ea)
    if func:
        return func
    name_ea = ida_name.get_name_ea(idc.BADADDR, idc.get_name(ea))
    if name_ea != idc.BADADDR:
        return ida_funcs.get_func(name_ea)
    return None


def name_of(ea):
    n = ida_name.get_ea_name(ea)
    if n:
        return n
    f = ida_funcs.get_func(ea)
    if f:
        return ida_funcs.get_func_name(f.start_ea)
    return hex(ea)


def inspect(func_ea):
    func = get_func(func_ea)
    if not func:
        return {"error": f"no function at {hex(func_ea)}"}

    start = func.start_ea
    out = {
        "start_ea": start,
        "name": name_of(start),
        "end_ea": func.end_ea,
        "xrefs_to": [],
        "direct_callees": [],
        "head_disasm": [],
    }

    seen_xrefs = set()
    for xr in idautils.XrefsTo(start, 0):
        caller = ida_funcs.get_func(xr.frm)
        caller_ea = caller.start_ea if caller else xr.frm
        key = (caller_ea, xr.frm)
        if key in seen_xrefs:
            continue
        seen_xrefs.add(key)
        out["xrefs_to"].append(
            {
                "caller_func_ea": caller_ea,
                "caller_func_name": name_of(caller_ea),
                "callsite_ea": xr.frm,
            }
        )

    seen_callees = set()
    for item_ea in idautils.FuncItems(start):
        if not ida_bytes.is_code(ida_bytes.get_flags(item_ea)):
            continue
        if len(out["head_disasm"]) < 80:
            out["head_disasm"].append(
                {
                    "ea": item_ea,
                    "mnem": idc.print_insn_mnem(item_ea),
                    "disasm": idc.generate_disasm_line(item_ea, 0) or "",
                }
            )
        for cref in idautils.CodeRefsFrom(item_ea, False):
            callee = ida_funcs.get_func(cref)
            callee_ea = callee.start_ea if callee else cref
            key = (callee_ea, item_ea)
            if key in seen_callees:
                continue
            seen_callees.add(key)
            out["direct_callees"].append(
                {
                    "callee_ea": callee_ea,
                    "callee_name": name_of(callee_ea),
                    "callsite_ea": item_ea,
                }
            )

    return out


def main():
    ida_auto.auto_wait()
    if len(idc.ARGV) < 3:
        print("usage: script.py <out_json> <func_ea_hex> [func_ea_hex...]")
        idc.qexit(2)
    out_path = idc.ARGV[1]
    funcs = [int(x, 16) for x in idc.ARGV[2:]]
    out = [inspect(ea) for ea in funcs]
    with open(out_path, "w", encoding="utf-8") as f:
        json.dump(out, f, ensure_ascii=False, indent=2)
    idc.qexit(0)


if __name__ == "__main__":
    main()
