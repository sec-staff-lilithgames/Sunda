package com.bytedance.sdk.openadsdk.utils;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.utils.yd$1, reason: invalid class name */
    public static class AnonymousClass1 implements FilenameFilter {
        private final Pattern jpo = Pattern.compile("^cpu[0-9]+$");

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.jpo.matcher(str).matches();
        }
    }

    public static int cm() {
        return com.bytedance.sdk.openadsdk.core.wqx.jpo().jd("cpu_min_frequency", 0);
    }

    public static int jd() {
        return com.bytedance.sdk.openadsdk.core.wqx.jpo().jd("cpu_count", 0);
    }

    public static int jpo() {
        return Math.max(Runtime.getRuntime().availableProcessors(), 0);
    }

    public static int wqx() {
        return com.bytedance.sdk.openadsdk.core.wqx.jpo().jd("cpu_max_frequency", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[Catch: Exception -> 0x0064, DONT_GENERATE, TRY_LEAVE, TryCatch #3 {Exception -> 0x0064, blocks: (B:24:0x005c, B:26:0x0061), top: B:44:0x005c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int jd(int r7) throws java.io.IOException {
        /*
            r0 = 0
            r1 = 0
            r2 = r1
        L3:
            int r7 = r7 + (-1)
            if (r7 < 0) goto L72
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L4d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4d
            r4.append(r7)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = "/cpufreq/cpuinfo_min_freq"
            r4.append(r5)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4d
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L47
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = r1.readLine()     // Catch: java.lang.Throwable -> L39
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L39
            if (r4 != 0) goto L3e
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L39
            if (r2 >= r0) goto L35
            goto L37
        L35:
            if (r0 != 0) goto L3e
        L37:
            r0 = r2
            goto L3e
        L39:
            r2 = move-exception
            r6 = r3
            r3 = r1
            r1 = r6
            goto L51
        L3e:
            r1.close()     // Catch: java.lang.Exception -> L44
            r3.close()     // Catch: java.lang.Exception -> L44
        L44:
            r2 = r1
            r1 = r3
            goto L3
        L47:
            r1 = move-exception
            r6 = r2
            r2 = r1
            r1 = r3
            r3 = r6
            goto L51
        L4d:
            r3 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
        L51:
            java.lang.String r4 = "CpuUtils"
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L66
            com.bytedance.sdk.component.utils.nmd.wqx(r4, r2)     // Catch: java.lang.Throwable -> L66
            if (r3 == 0) goto L5f
            r3.close()     // Catch: java.lang.Exception -> L64
        L5f:
            if (r1 == 0) goto L64
            r1.close()     // Catch: java.lang.Exception -> L64
        L64:
            r2 = r3
            goto L3
        L66:
            r7 = move-exception
            if (r3 == 0) goto L6c
            r3.close()     // Catch: java.lang.Exception -> L71
        L6c:
            if (r1 == 0) goto L71
            r1.close()     // Catch: java.lang.Exception -> L71
        L71:
            throw r7
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.yd.jd(int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[Catch: Exception -> 0x0061, DONT_GENERATE, TRY_LEAVE, TryCatch #5 {Exception -> 0x0061, blocks: (B:22:0x0059, B:24:0x005e), top: B:46:0x0059 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int jpo(int r7) throws java.io.IOException {
        /*
            r0 = 0
            r1 = 0
            r2 = r1
        L3:
            int r7 = r7 + (-1)
            if (r7 < 0) goto L6f
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L4a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4a
            r4.append(r7)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r5 = "/cpufreq/cpuinfo_max_freq"
            r4.append(r5)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4a
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L44
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = r1.readLine()     // Catch: java.lang.Throwable -> L36
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L36
            if (r4 != 0) goto L3b
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L36
            if (r2 <= r0) goto L3b
            r0 = r2
            goto L3b
        L36:
            r2 = move-exception
            r6 = r3
            r3 = r1
            r1 = r6
            goto L4e
        L3b:
            r1.close()     // Catch: java.lang.Exception -> L41
            r3.close()     // Catch: java.lang.Exception -> L41
        L41:
            r2 = r1
            r1 = r3
            goto L3
        L44:
            r1 = move-exception
            r6 = r2
            r2 = r1
            r1 = r3
            r3 = r6
            goto L4e
        L4a:
            r3 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
        L4e:
            java.lang.String r4 = "CpuUtils"
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L63
            com.bytedance.sdk.component.utils.nmd.wqx(r4, r2)     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L5c
            r3.close()     // Catch: java.lang.Exception -> L61
        L5c:
            if (r1 == 0) goto L61
            r1.close()     // Catch: java.lang.Exception -> L61
        L61:
            r2 = r3
            goto L3
        L63:
            r7 = move-exception
            if (r3 == 0) goto L69
            r3.close()     // Catch: java.lang.Exception -> L6e
        L69:
            if (r1 == 0) goto L6e
            r1.close()     // Catch: java.lang.Exception -> L6e
        L6e:
            throw r7
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.yd.jpo(int):int");
    }
}
