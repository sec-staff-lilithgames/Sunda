# 02 Investigation Timeline

## Conclusion

The investigation moved from symptom-level transport failures to source-level callback lifetime.

## Timeline

1. Initial symptom capture
   Evidence:
   - attach pressure produced `script has been destroyed`
   - transport errors such as `connection is closed`
   Explanation:
   - these were treated as downstream symptoms only

2. Fuzz baseline creation
   Evidence:
   - `tools/java-bridge-fuzz/`
   Explanation:
   - established tracked repro, regression, and reduction entrypoints

3. Reduced reproducer stabilized
   Evidence:
   - `tools/java-bridge-fuzz/cases/aggressive-attach-flake.reduced.json`
   Explanation:
   - isolated a smaller still-crashing reproducer

4. `lldb` stop-state capture
   Evidence:
   - `artifacts/authoritative-lldb-summary.txt`
   Explanation:
   - proved the failure is a real native crash, not just transport teardown

5. `KernelSU + dmesg + tombstone` layering
   Evidence:
   - `artifacts/authoritative-dmesg-excerpt.txt`
   - `artifacts/authoritative-logcat-excerpt.txt`
   - `artifacts/authoritative-tombstone.txt`
   Explanation:
   - connected privilege path, userspace crash, tombstone creation, and process death

6. Offset normalization and source mapping
   Evidence:
   - `artifacts/authoritative-offset-analysis.json`
   Explanation:
   - turned anonymous memfd offsets into named functions

7. Root-cause narrowing by implementation contrast
   Evidence:
   - QuickJS callback path vs V8 callback path
   Explanation:
   - singled out callback lifetime / ownership as the most credible root cause

8. Fix and retest
   Evidence:
   - `06-regression-and-classification.md`
   Explanation:
   - current maintained baseline is green, historical hotter branch still open

## Key Observations That Changed The Theory

- transport failure alone was insufficient
- `lldb` and tombstone proved a real native crash
- source mapping proved the crash belongs to our own callback path
- V8/QuickJS contrast turned the theory from generic “agent crash” into concrete “callback lifetime”
