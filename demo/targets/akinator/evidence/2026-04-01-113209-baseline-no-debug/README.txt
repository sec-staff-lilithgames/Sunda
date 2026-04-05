Owner: current local reverse-engineering session
Purpose: fresh no-debug startup crash baseline for PairIP VM analysis
Retention reason: compare against attach-time traces to detect anti-debug-sensitive behavior changes
Generation method: adb force-stop + logcat clear + am start without debugger attached
Review trigger: refresh after app update, device build change, or if startup crash signature changes
