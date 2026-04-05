import json

import ida_auto
import ida_bytes
import ida_funcs
import ida_gdl
import ida_name
import idc


DISPATCHER_FUNC_EA = 0x52F20
DISPATCH_ENTRY_BLOCK_EA = 0x53088
DISPATCH_BRANCH_EA = 0x530A4
CASE_TABLE_START_EA = 0x62726
CASE_TABLE_ENTRY_COUNT = 0x10000
CASE_TARGET_BASE_EA = 0x52FD0


LAYOUT_OUT = "/Users/siberia/Desktop/akinator/so-info/libpairipcore/ida/dispatcher-layout.json"
MAP_OUT = "/Users/siberia/Desktop/akinator/so-info/libpairipcore/ida/opcode-handler-map.json"


def func_name(ea):
    name = ida_name.get_ea_name(ea)
    if name:
        return name
    func = ida_funcs.get_func(ea)
    if func:
        return ida_funcs.get_func_name(func.start_ea)
    return hex(ea)


def collect_flowchart(func):
    fc = ida_gdl.FlowChart(func)
    blocks = []
    block_by_start = {}
    for block in fc:
        item = {
            "start_ea": block.start_ea,
            "end_ea": block.end_ea,
            "succs": [succ.start_ea for succ in block.succs()],
            "preds": [pred.start_ea for pred in block.preds()],
            "is_backedge_source": False,
            "last_insn_ea": idc.prev_head(block.end_ea, block.start_ea),
            "last_disasm": idc.generate_disasm_line(idc.prev_head(block.end_ea, block.start_ea), 0) or "",
        }
        blocks.append(item)
        block_by_start[block.start_ea] = item

    for block in blocks:
        if any(succ <= block["start_ea"] for succ in block["succs"]):
            block["is_backedge_source"] = True

    return blocks


def block_for_ea(blocks, ea):
    for block in blocks:
        if block["start_ea"] <= ea < block["end_ea"]:
            return block
    return None


def build_opcode_map(blocks):
    entries = []
    unique_targets = set()
    unique_handler_blocks = set()

    for opcode in range(CASE_TABLE_ENTRY_COUNT):
        table_ea = CASE_TABLE_START_EA + (opcode * 2)
        table_word = ida_bytes.get_word(table_ea)
        raw_target_ea = CASE_TARGET_BASE_EA + (table_word << 2)
        handler_block = block_for_ea(blocks, raw_target_ea)
        handler_block_start = handler_block["start_ea"] if handler_block else None
        handler_func = ida_funcs.get_func(raw_target_ea)
        handler_func_start = handler_func.start_ea if handler_func else None
        if handler_block_start is not None:
            handler_ea = handler_block_start
            handler_kind = "dispatcher_block"
        elif handler_func_start is not None:
            handler_ea = handler_func_start
            handler_kind = "external_func"
        else:
            handler_ea = None
            handler_kind = "unknown"
        if raw_target_ea is not None:
            unique_targets.add(raw_target_ea)
        if handler_ea is not None:
            unique_handler_blocks.add(handler_ea)

        entry = {
            "opcode": opcode,
            "table_ea": table_ea,
            "table_word": table_word,
            "dispatch_evidence": {
                "dispatch_branch_ea": DISPATCH_BRANCH_EA,
                "case_table_start_ea": CASE_TABLE_START_EA,
                "case_target_base_ea": CASE_TARGET_BASE_EA,
            },
            "raw_target_ea": raw_target_ea,
            "handler_ea": handler_ea,
            "handler_name": func_name(handler_ea) if handler_ea is not None else None,
            "handler_kind": handler_kind,
            "pc_delta_rule": "dispatcher table lookup via 16-bit entry; exact pc advance unresolved in this pass",
            "context_fields_touched": [
                "opcode selector register path uses x23 & 0xffff at dispatcher entry",
                "handler-local context fields unresolved in this pass",
            ],
            "notes": "first-pass static map from 16-bit jump table to basic-block start",
            "confidence": "high",
        }
        entries.append(entry)

    return entries, sorted(unique_targets), sorted(unique_handler_blocks)


def main():
    ida_auto.auto_wait()
    func = ida_funcs.get_func(DISPATCHER_FUNC_EA)
    if not func:
        raise RuntimeError(f"no function at {hex(DISPATCHER_FUNC_EA)}")

    blocks = collect_flowchart(func)
    opcode_entries, unique_targets, unique_handler_blocks = build_opcode_map(blocks)

    layout = {
        "dispatcher_func_ea": DISPATCHER_FUNC_EA,
        "dispatcher_name": func_name(DISPATCHER_FUNC_EA),
        "dispatcher_comment": idc.get_func_cmt(DISPATCHER_FUNC_EA, 0) or "",
        "dispatcher_entry_block_ea": DISPATCH_ENTRY_BLOCK_EA,
        "dispatcher_branch_ea": DISPATCH_BRANCH_EA,
        "dispatcher_branch_disasm": idc.generate_disasm_line(DISPATCH_BRANCH_EA, 0) or "",
        "case_table_start_ea": CASE_TABLE_START_EA,
        "case_table_entry_count": CASE_TABLE_ENTRY_COUNT,
        "case_target_base_ea": CASE_TARGET_BASE_EA,
        "blocks": blocks,
        "loop_backedge_sources": [b["start_ea"] for b in blocks if b["is_backedge_source"]],
        "unique_raw_target_count": len(unique_targets),
        "unique_handler_block_count": len(unique_handler_blocks),
        "notes": [
            "dispatch table is recovered manually from the ADR+LDRH+BR sequence near 0x53088",
            "IDA did not expose the entry jump as a formal switch in this database",
            "opcode mapping is first-pass static and maps to basic-block starts inside the dispatcher function",
        ],
    }

    with open(LAYOUT_OUT, "w", encoding="utf-8") as f:
        json.dump(layout, f, ensure_ascii=False, indent=2)

    with open(MAP_OUT, "w", encoding="utf-8") as f:
        json.dump(opcode_entries, f, ensure_ascii=False, indent=2)

    idc.qexit(0)


if __name__ == "__main__":
    main()
