package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.l4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2384l4 implements HK {
    public static String[] A00 = {"S2ZlE7yw63A48uwr9dQcAEYhUnBJ4Yn0", "jzjCSZ", "gN1GhDNq1ONaTY", "QUbV6eP7CXYOE5n4wRXfJJIvrecH4qk8", "luywBeNRakBazgpsmb", "EdZTTUAmlRsHtXkkAmykmZcXBm9Gnzxa", "aBS20hcvH8Cg0VDZoQaxMtYiCLoGsxgc", "2I8VYTEH9eD6qwDjwvQqiLyn0yln2Tpt"};

    public abstract Metadata A0R(C10428z c10428z, ByteBuffer byteBuffer);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    @Override // com.facebook.ads.redexgen.core.HK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.androidx.media3.common.Metadata A5g(com.facebook.ads.redexgen.core.C10428z r6) {
        /*
            r5 = this;
            java.nio.ByteBuffer r0 = r6.A02
            java.lang.Object r3 = com.facebook.ads.redexgen.core.C3M.A01(r0)
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r0 = r3.position()
            if (r0 != 0) goto L46
            boolean r0 = r3.hasArray()
            if (r0 == 0) goto L46
            int r4 = r3.arrayOffset()
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AbstractC2384l4.A00
            r0 = 7
            r1 = r2[r0]
            r0 = 3
            r2 = r2[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L48
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AbstractC2384l4.A00
            java.lang.String r1 = "EqsX6PhC"
            r0 = 1
            r2[r0] = r1
            if (r4 != 0) goto L46
            r0 = 1
        L36:
            com.facebook.ads.redexgen.core.C3M.A07(r0)
            boolean r0 = r6.A04()
            if (r0 == 0) goto L41
            r0 = 0
        L40:
            return r0
        L41:
            com.facebook.ads.androidx.media3.common.Metadata r0 = r5.A0R(r6, r3)
            goto L40
        L46:
            r0 = 0
            goto L36
        L48:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC2384l4.A5g(com.facebook.ads.redexgen.X.8z):com.facebook.ads.androidx.media3.common.Metadata");
    }
}
