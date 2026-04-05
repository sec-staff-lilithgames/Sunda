package com.bytedance.sdk.openadsdk.core.settings;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz {
    private static final AtomicInteger jpo = new AtomicInteger(1);

    public static boolean jpo() {
        return jpo.get() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void jpo(int r5) {
        /*
            java.lang.String r0 = "SdkSwitch"
            r1 = 1
            if (r5 == r1) goto L9
            r2 = 2
            if (r5 == r2) goto L9
            goto L47
        L9:
            r2 = 0
            java.util.concurrent.atomic.AtomicInteger r3 = com.bytedance.sdk.openadsdk.core.settings.zz.jpo     // Catch: java.lang.Throwable -> L1a
            int r4 = r3.get()     // Catch: java.lang.Throwable -> L1a
            if (r4 == r5) goto L18
            r3.set(r5)     // Catch: java.lang.Throwable -> L16
            goto L23
        L16:
            r5 = move-exception
            goto L1c
        L18:
            r1 = r2
            goto L23
        L1a:
            r5 = move-exception
            r1 = r2
        L1c:
            java.lang.String r5 = r5.getMessage()
            com.bytedance.sdk.component.utils.nmd.wqx(r0, r5)
        L23:
            if (r1 == 0) goto L47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "switch status changed: "
            r5.<init>(r1)
            boolean r1 = jpo()
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r0, r5)
            boolean r5 = jpo()
            if (r5 == 0) goto L44
            com.bytedance.sdk.openadsdk.cm.jpo.cm.jd()
            return
        L44:
            com.bytedance.sdk.openadsdk.cm.jpo.cm.wqx()
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.zz.jpo(int):void");
    }
}
