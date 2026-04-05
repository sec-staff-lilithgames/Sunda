import json
import re

import ida_auto
import ida_bytes
import ida_funcs
import ida_idaapi
import ida_name
import ida_nalt
import ida_segment
import ida_strlist
import ida_xref
import idautils
import idc


SUSPICIOUS_IMPORT_PATTERNS = [
    r"ptrace",
    r"dlopen",
    r"dlsym",
    r"dladdr",
    r"dl_iterate_phdr",
    r"mprotect",
    r"mmap",
    r"munmap",
    r"memfd",
    r"prctl",
    r"syscall",
    r"sysconf",
    r"getauxval",
    r"readlink",
    r"open",
    r"fopen",
    r"access",
    r"stat",
    r"lstat",
    r"fstat",
    r"kill",
    r"tgkill",
    r"fork",
    r"clone",
    r"process_vm_readv",
    r"inotify",
    r"socket",
    r"connect",
    r"getppid",
]

SUSPICIOUS_STRING_PATTERNS = [
    r"frida",
    r"gum-js",
    r"xposed",
    r"substrate",
    r"magisk",
    r"zygisk",
    r"tracerpid",
    r"/proc/self/maps",
    r"/proc/",
    r"debug",
    r"hook",
    r"ptrace",
    r"android_server",
    r"gdb",
    r"lldb",
    r"jdwp",
]


def compile_patterns(patterns):
    return [re.compile(p, re.IGNORECASE) for p in patterns]


IMPORT_RE = compile_patterns(SUSPICIOUS_IMPORT_PATTERNS)
STRING_RE = compile_patterns(SUSPICIOUS_STRING_PATTERNS)


def get_seg(name):
    return ida_segment.get_segm_by_name(name)


def seg_bounds(seg):
    if not seg:
        return None
    return {"name": ida_segment.get_segm_name(seg), "start_ea": seg.start_ea, "end_ea": seg.end_ea}


def get_func_info(ea):
    func = ida_funcs.get_func(ea)
    if not func:
        return None
    return {
        "start_ea": func.start_ea,
        "end_ea": func.end_ea,
        "name": ida_funcs.get_func_name(func.start_ea) or ida_name.get_ea_name(func.start_ea),
        "size": func.end_ea - func.start_ea,
    }


def get_or_make_name(ea):
    name = ida_name.get_ea_name(ea)
    if name:
        return name
    func = ida_funcs.get_func(ea)
    if func:
        return ida_funcs.get_func_name(func.start_ea)
    return ""


def read_init_array():
    seg = get_seg(".init_array")
    out = {"segment": seg_bounds(seg), "entries": []}
    if not seg:
        return out
    ea = seg.start_ea
    while ea + 8 <= seg.end_ea:
        target = ida_bytes.get_qword(ea)
        item = {
            "slot_ea": ea,
            "target_ea": target,
            "target_name": get_or_make_name(target),
            "function": get_func_info(target),
        }
        out["entries"].append(item)
        ea += 8
    return out


def read_init_section():
    seg = get_seg(".init")
    out = {"segment": seg_bounds(seg), "functions": []}
    if not seg:
        return out
    seen = set()
    for ea in idautils.Functions(seg.start_ea, seg.end_ea):
        if ea in seen:
            continue
        seen.add(ea)
        out["functions"].append(get_func_info(ea))
    return out


def enum_imports():
    imports = []
    suspicious = []

    def cb(ea, name, ordinal):
        record = {"ea": ea, "name": name or "", "ordinal": ordinal}
        imports.append(record)
        if any(r.search(record["name"]) for r in IMPORT_RE):
            suspicious.append(record)
        return True

    qty = ida_nalt.get_import_module_qty()
    for i in range(qty):
        module_name = ida_nalt.get_import_module_name(i)
        before = len(imports)
        ida_nalt.enum_import_names(i, cb)
        for rec in imports[before:]:
            rec["module"] = module_name
    return imports, suspicious


def iter_strings():
    ida_strlist.build_strlist()
    hits = []
    for s in idautils.Strings():
        value = str(s)
        if any(r.search(value) for r in STRING_RE):
            hits.append({"ea": int(s.ea), "length": len(value), "value": value})
    return hits


def callers_of_import(import_ea):
    callers = set()
    for xref in idautils.XrefsTo(import_ea):
        func = ida_funcs.get_func(xref.frm)
        if func:
            callers.add(func.start_ea)
    return callers


def callers_of_ea(target_ea):
    callers = set()
    for xref in idautils.XrefsTo(target_ea, 0):
        func = ida_funcs.get_func(xref.frm)
        if func:
            callers.add(func.start_ea)
    return callers


def callers_of_string(string_ea):
    callers = set()
    for xref in idautils.XrefsTo(string_ea):
        func = ida_funcs.get_func(xref.frm)
        if func:
            callers.add(func.start_ea)
    return callers


def match_import_stub(import_name):
    bare = import_name.split("@@")[0]
    candidates = [
        "." + bare,
        bare,
        "__imp_" + bare,
    ]
    for name in candidates:
        ea = ida_name.get_name_ea(ida_idaapi.BADADDR, name)
        if ea != ida_idaapi.BADADDR:
            func = ida_funcs.get_func(ea)
            if func:
                return func.start_ea
    return None


def direct_callees(func_ea):
    func = ida_funcs.get_func(func_ea)
    if not func:
        return []
    out = []
    seen = set()
    for ea in idautils.FuncItems(func.start_ea):
        if not ida_bytes.is_code(ida_bytes.get_flags(ea)):
            continue
        for cref in idautils.CodeRefsFrom(ea, False):
            callee = ida_funcs.get_func(cref)
            if not callee:
                continue
            start = callee.start_ea
            if start in seen or start == func.start_ea:
                continue
            seen.add(start)
            out.append(get_func_info(start))
    out.sort(key=lambda x: x["start_ea"])
    return out


def collect_reasons(suspicious_imports, suspicious_strings, init_entries, init_funcs):
    reasons = {}

    def add_reason(func_ea, reason):
        reasons.setdefault(func_ea, set()).add(reason)

    for item in init_entries:
        func = item.get("function")
        if func:
            add_reason(func["start_ea"], "init_array_target")
    for item in init_funcs:
        if item:
            add_reason(item["start_ea"], "init_section")

    for rec in suspicious_imports:
        for func_ea in callers_of_import(rec["ea"]):
            add_reason(func_ea, "calls_import:" + rec["name"])
        stub_ea = match_import_stub(rec["name"])
        if stub_ea is not None:
            for func_ea in callers_of_ea(stub_ea):
                add_reason(func_ea, "calls_stub:" + rec["name"])

    for rec in suspicious_strings:
        for func_ea in callers_of_string(rec["ea"]):
            add_reason(func_ea, "refs_string:" + rec["value"][:80])

    return reasons


def disasm_window(func_ea, limit=80):
    func = ida_funcs.get_func(func_ea)
    if not func:
        return []
    lines = []
    count = 0
    for ea in idautils.FuncItems(func.start_ea):
        if count >= limit:
            break
        if not ida_bytes.is_code(ida_bytes.get_flags(ea)):
            continue
        lines.append(
            {
                "ea": ea,
                "mnem": idc.print_insn_mnem(ea),
                "disasm": idc.generate_disasm_line(ea, 0) or "",
            }
        )
        count += 1
    return lines


def build_candidates(reasons):
    out = []
    for func_ea, reason_set in reasons.items():
        info = get_func_info(func_ea)
        if not info:
            continue
        info["reasons"] = sorted(reason_set)
        info["direct_callees"] = direct_callees(func_ea)
        info["disasm_head"] = disasm_window(func_ea)
        out.append(info)
    out.sort(key=lambda x: (0 if any(r.startswith("init_") or r == "init_section" for r in x["reasons"]) else 1, x["start_ea"]))
    return out


def main():
    ida_auto.auto_wait()
    init_array = read_init_array()
    init_section = read_init_section()
    imports, suspicious_imports = enum_imports()
    suspicious_strings = iter_strings()
    reasons = collect_reasons(
        suspicious_imports,
        suspicious_strings,
        init_array["entries"],
        init_section["functions"],
    )
    candidates = build_candidates(reasons)

    out = {
        "input_file": ida_nalt.get_input_file_path(),
        "init_array": init_array,
        "init_section": init_section,
        "imports_total": len(imports),
        "suspicious_imports": suspicious_imports,
        "suspicious_strings": suspicious_strings,
        "candidate_functions": candidates,
    }

    out_path = idc.ARGV[1] if len(idc.ARGV) >= 2 else ida_nalt.get_input_file_path() + ".init_suspicious.json"
    with open(out_path, "w", encoding="utf-8") as f:
        json.dump(out, f, ensure_ascii=False, indent=2)
    print("[IDA_EXPORT] wrote", out_path)
    idc.qexit(0)


if __name__ == "__main__":
    main()
