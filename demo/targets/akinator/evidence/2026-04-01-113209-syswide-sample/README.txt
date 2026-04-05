Owner: current local reverse-engineering session
Purpose: low-intrusion runtime evidence for PairIP startup VM path
Retention reason: preserves no-debug baseline, system-wide sampling fallback, and APK-offset uprobe traces for later opcode/handler recovery
Generation method: adb root via zoey, simpleperf system-wide sampling, and uprobes on split APK file offsets for JNI_OnLoad, VM bridge, dispatcher, and crash PC
Review trigger: refresh after app update, device build change, or if probe offsets / crash PC change
