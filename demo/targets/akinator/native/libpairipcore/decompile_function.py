import json

import ida_auto
import ida_funcs
import ida_hexrays
import ida_name
import idc


def name_of(ea):
    n = ida_name.get_ea_name(ea)
    if n:
        return n
    f = ida_funcs.get_func(ea)
    if f:
        return ida_funcs.get_func_name(f.start_ea)
    return hex(ea)


def decompile_at(ea):
    func = ida_funcs.get_func(ea)
    if func is None:
        return {"error": f"no function at {hex(ea)}"}

    start = func.start_ea
    result = {
        "query_ea": ea,
        "function_ea": start,
        "function_name": name_of(start),
        "pseudocode": None,
        "error": None,
    }

    if not ida_hexrays.init_hexrays_plugin():
        result["error"] = "hexrays unavailable"
        return result

    try:
        cfunc = ida_hexrays.decompile(start)
        if cfunc is None:
            result["error"] = "decompile returned none"
            return result
        lines = []
        sv = cfunc.get_pseudocode()
        for line in sv:
            lines.append(idc.tag_remove(line.line))
        result["pseudocode"] = "\n".join(lines)
    except Exception as e:
        result["error"] = str(e)

    return result


def main():
    ida_auto.auto_wait()
    if len(idc.ARGV) < 3:
        print("usage: decompile_function.py <out_json> <ea_hex> [ea_hex...]")
        idc.qexit(2)

    out_path = idc.ARGV[1]
    addrs = [int(x, 16) for x in idc.ARGV[2:]]
    out = [decompile_at(ea) for ea in addrs]
    with open(out_path, "w", encoding="utf-8") as f:
        json.dump(out, f, ensure_ascii=False, indent=2)
    idc.qexit(0)


if __name__ == "__main__":
    main()
