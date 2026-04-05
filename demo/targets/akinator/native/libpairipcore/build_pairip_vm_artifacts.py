import json
import re
from pathlib import Path


ROOT = Path("/Users/siberia/Desktop/akinator/so-info/libpairipcore")
IDA = ROOT / "ida"
EVIDENCE_BASELINE = Path("/Users/siberia/Desktop/akinator/evidence/2026-04-01-113209-baseline-no-debug")
EVIDENCE_TRACE = Path("/Users/siberia/Desktop/akinator/evidence/2026-04-01-113209-syswide-sample")


def read_json(path):
    return json.loads(Path(path).read_text())


def parse_uprobe_lines(path):
    rows = []
    pattern = re.compile(
        r"^\s*(?P<task>\S+)-(?P<pid>\d+)\s+\[(?P<cpu>\d+)\].*?(?P<ts>\d+\.\d+):\s+(?P<event>\S+):\s+\((?P<ip>0x[0-9a-f]+)\)"
    )
    for line in Path(path).read_text(errors="ignore").splitlines():
        match = pattern.match(line)
        if not match:
            continue
        rows.append(
            {
                "task": match.group("task"),
                "pid": int(match.group("pid")),
                "cpu": int(match.group("cpu")),
                "timestamp": float(match.group("ts")),
                "event": match.group("event"),
                "ip": match.group("ip"),
            }
        )
    return rows


def parse_logcat_baseline(path):
    lines = Path(path).read_text(errors="ignore").splitlines()
    out = {
        "pairip_load_ok": False,
        "crash_signal": None,
        "crash_pc": None,
        "tombstone_name": None,
        "process_pid": None,
    }
    for line in lines:
        if "Load " in line and "libpairipcore.so" in line and ": ok" in line:
            out["pairip_load_ok"] = True
        if "Start proc " in line and "com.digidust.elokence.akinator.freemium" in line:
            m = re.search(r"Start proc (\d+):com\.digidust\.elokence\.akinator\.freemium", line)
            if m:
                out["process_pid"] = int(m.group(1))
        if "signal 11 (SIGSEGV)" in line or "Fatal signal 11 (SIGSEGV)" in line:
            out["crash_signal"] = "SIGSEGV/SEGV_ACCERR"
        if "#00 pc " in line and "libpairipcore.so" in line:
            m = re.search(r"#00 pc\s+([0-9a-f]+)", line)
            if m:
                out["crash_pc"] = f"0x{m.group(1)}"
        if "Tombstone written to:" in line:
            m = re.search(r"Tombstone written to:\s+(\S+)", line)
            if m:
                out["tombstone_name"] = m.group(1)
    return out


def build_vm_init_chain():
    comments = {item["ea"]: item for item in read_json(IDA / "read_func_comments.json")}
    chain = [
        {
            "ea": 0x80474,
            "name": comments[0x80474]["name"],
            "role": "JNI_OnLoad root",
            "comment": comments[0x80474]["func_comment"],
        },
        {
            "ea": 0x62C78,
            "name": comments[0x62C78]["name"],
            "role": "JNI execute bridge",
            "comment": comments[0x62C78]["func_comment"],
        },
        {
            "ea": 0x52F20,
            "name": comments[0x52F20]["name"],
            "role": "dispatcher / VM interpreter core",
            "comment": comments[0x52F20]["func_comment"],
        },
    ]
    edges = [
        {
            "from_ea": 0x80474,
            "to_ea": 0x62C78,
            "callsite_ea": 0x819E0,
            "evidence": "pairip_jni_on_load xrefs_to sub_62C78 and dynamic uprobe ordering",
        },
        {
            "from_ea": 0x62C78,
            "to_ea": 0x52F20,
            "callsite_ea": 0x62D04,
            "evidence": "direct BL in bridge function and dynamic uprobe ordering",
        },
    ]
    out = {
        "asset_focus": "ReqL9SxJHgWgm3cn",
        "chain": chain,
        "edges": edges,
        "notes": [
            "the startup crash path is treated as JNI_OnLoad-driven VM entry, not post-start business code",
            "the VM bridge copies bytecode and forwards a compact descriptor into the dispatcher",
        ],
    }
    (IDA / "vm-init-chain.json").write_text(json.dumps(out, ensure_ascii=False, indent=2))


def build_startup_trace():
    baseline = parse_logcat_baseline(EVIDENCE_BASELINE / "logcat.txt")
    early = parse_uprobe_lines(EVIDENCE_TRACE / "uprobe-trace-early.txt")
    crash = parse_uprobe_lines(EVIDENCE_TRACE / "uprobe-trace.txt")

    early_order = [row["event"] for row in early]
    early_deltas = []
    for prev, cur in zip(early, early[1:]):
        early_deltas.append(
            {
                "from": prev["event"],
                "to": cur["event"],
                "delta_us": round((cur["timestamp"] - prev["timestamp"]) * 1_000_000, 3),
            }
        )

    crash_hits = [row for row in crash if row["event"] == "pairip_crash_pc"]
    out = {
        "baseline_no_debug": baseline,
        "early_uprobe_events": early,
        "early_uprobe_order": early_order,
        "early_uprobe_deltas_us": early_deltas,
        "crash_pc_trace": {
            "event_name": "pairip_crash_pc",
            "hit_count": len(crash_hits),
            "first_timestamp": crash_hits[0]["timestamp"] if crash_hits else None,
            "last_timestamp": crash_hits[-1]["timestamp"] if crash_hits else None,
        },
        "notes": [
            "early uprobes were run without debugger attach and preserved the expected JNI_OnLoad -> VM bridge -> dispatcher sequence",
            "crash-pc uprobes flood rapidly, consistent with repeated execution or looping at the crash address just before fatal termination",
        ],
    }
    (IDA / "startup-trace.json").write_text(json.dumps(out, ensure_ascii=False, indent=2))


def build_markdown_notes():
    startup_trace = read_json(IDA / "startup-trace.json")
    early = startup_trace["early_uprobe_events"]
    crash = startup_trace["crash_pc_trace"]
    layout = None
    opcode_map = None
    crash_block = None
    crash_block_opcodes = []
    crash_entry_block = None
    crash_entry_block_opcodes = []
    layout_path = IDA / "dispatcher-layout.json"
    map_path = IDA / "opcode-handler-map.json"
    if layout_path.exists() and map_path.exists():
        layout = read_json(layout_path)
        opcode_map = read_json(map_path)
        crash_ea = 0x5D75C
        for block in layout["blocks"]:
            if block["start_ea"] <= crash_ea < block["end_ea"]:
                crash_block = block
                break
        if crash_block is not None:
            crash_block_opcodes = [
                entry["opcode"]
                for entry in opcode_map
                if crash_block["start_ea"] <= entry["raw_target_ea"] < crash_block["end_ea"]
            ]
            if not crash_block_opcodes:
                block_by_start = {block["start_ea"]: block for block in layout["blocks"]}
                seen = set()
                queue = list(crash_block["preds"])
                while queue:
                    start_ea = queue.pop(0)
                    if start_ea in seen:
                        continue
                    seen.add(start_ea)
                    block = block_by_start.get(start_ea)
                    if block is None:
                        continue
                    opcodes = [
                        entry["opcode"]
                        for entry in opcode_map
                        if block["start_ea"] <= entry["raw_target_ea"] < block["end_ea"]
                    ]
                    if opcodes:
                        crash_entry_block = block
                        crash_entry_block_opcodes = opcodes
                        break
                    queue.extend(block["preds"])

    anti_debug = f"""# Anti-Debug Timing Notes

Scope: startup-chain tracing strategy for `libpairipcore.so`.

Baseline:
- no-debug launch still crashes immediately in `libpairipcore.so+0x5d75c`
- `libpairipcore.so` loads successfully before the fault
- tombstone remains stable across fresh launches

Timing-sensitive choices used in this pass:
- avoided startup-attached debugger sessions
- used root uprobes on APK-backed file offsets instead of software breakpoints
- used system-wide sampling only as a secondary, low-confidence probe

Observed behavior:
- early uprobes preserved the startup sequence without suppressing the crash
- ordered runtime hits were: {' -> '.join(startup_trace['early_uprobe_order'])}
- crash-pc probe generated {crash['hit_count']} hits before process death

Current conclusion:
- no debugger-induced control-flow change was observed in this slice because no debugger was attached
- uprobes are currently the preferred low-intrusion runtime method for this target
- if a later attach-based trace is needed, it should happen after the library is mapped and only for a minimal window
"""

    semantics = f"""# Startup Crash Semantics

Focus asset: `ReqL9SxJHgWgm3cn`

Fresh no-debug crash facts:
- package loads `libpairipcore.so` successfully, then crashes immediately
- signal: {startup_trace['baseline_no_debug']['crash_signal']}
- crash pc: {startup_trace['baseline_no_debug']['crash_pc']}
- tombstone: {startup_trace['baseline_no_debug']['tombstone_name']}

Dynamic chain confirmed in this pass:
- {early[0]['event']} at {early[0]['timestamp']}
- {early[1]['event']} at {early[1]['timestamp']}
- {early[2]['event']} at {early[2]['timestamp']}

Static + runtime interpretation:
- `pairip_jni_on_load` reaches `pairip_jni_execute_vm_bridge`
- the bridge reaches `pairip_vm_interpreter_core_tentative`
- the crash address `0x5d75c` is inside the dispatcher core and executes repeatedly just before the fatal fault

Local semantic conclusion:
- the crash happens after dispatcher entry, not before VM startup
- the crashing path is part of the live VM execution path for the startup asset
- the first semantic-recovery target should be the dispatcher case block containing `0x5d75c` and the state fields feeding `x10/x16/x11`
"""

    if crash_block is not None:
        semantics += f"""

Crash subpath candidate:
- crash block start: `0x{crash_block['start_ea']:x}`
- crash block end: `0x{crash_block['end_ea']:x}`
- block last branch: `{crash_block['last_disasm']}`
- first candidate opcodes landing in this block: {crash_block_opcodes[:20]}

Interpretation boundary:
- these opcodes map to the enclosing block containing `0x5d75c`, not yet to a recovered high-level opcode meaning
- the repeated crash-pc uprobe hits suggest this block contains an internal loop body, not a one-shot handler entry
"""
        if crash_entry_block is not None:
            semantics += f"""

Enclosing handler-entry candidate:
- entry block start: `0x{crash_entry_block['start_ea']:x}`
- entry block end: `0x{crash_entry_block['end_ea']:x}`
- first candidate opcodes landing in the entry block: {crash_entry_block_opcodes[:20]}
"""

    (ROOT / "anti-debug-timing-notes.md").write_text(anti_debug)
    (ROOT / "startup-crash-semantics.md").write_text(semantics)


def main():
    build_vm_init_chain()
    build_startup_trace()
    build_markdown_notes()


if __name__ == "__main__":
    main()
