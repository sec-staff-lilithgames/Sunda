package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class KX {
    public static byte[] A02;
    public final List<C2614or> A00;
    public final H1[] A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{119, -100, -92, -113, -102, -105, -110, 78, -111, -102, -99, -95, -109, -110, 78, -111, -113, -98, -94, -105, -99, -100, 78, -101, -105, -101, -109, 78, -94, -89, -98, -109, 78, -98, -96, -99, -92, -105, -110, -109, -110, 104, 78, -123, -108, -108, -112, -115, -121, -123, -104, -115, -109, -110, 83, -121, -119, -123, 81, 90, 84, 92, -49, -34, -34, -38, -41, -47, -49, -30, -41, -35, -36, -99, -47, -45, -49, -101, -91, -98, -90};
    }

    public KX(List<C2614or> list) {
        this.A00 = list;
        this.A01 = new H1[list.size()];
    }

    public final void A02(long j10, C4J c4j) {
        GR.A03(j10, c4j, this.A01);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(com.facebook.ads.redexgen.core.GY r10, com.facebook.ads.redexgen.core.C1329Ke r11) {
        /*
            r9 = this;
            r3 = 0
        L1:
            com.facebook.ads.redexgen.X.H1[] r0 = r9.A01
            int r0 = r0.length
            if (r3 >= r0) goto L9a
            r11.A05()
            int r1 = r11.A03()
            r0 = 3
            com.facebook.ads.redexgen.X.H1 r2 = r10.AJh(r1, r0)
            java.util.List<com.facebook.ads.redexgen.X.or> r0 = r9.A00
            java.lang.Object r4 = r0.get(r3)
            com.facebook.ads.redexgen.X.or r4 = (com.facebook.ads.redexgen.core.C2614or) r4
            java.lang.String r5 = r4.A0W
            r6 = 43
            r1 = 19
            r0 = 7
            java.lang.String r0 = A00(r6, r1, r0)
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L3b
            r6 = 62
            r1 = 19
            r0 = 81
            java.lang.String r0 = A00(r6, r1, r0)
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L98
        L3b:
            r8 = 1
        L3c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r6 = 0
            r1 = 43
            r0 = 17
            java.lang.String r0 = A00(r6, r1, r0)
            java.lang.StringBuilder r0 = r7.append(r0)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.facebook.ads.redexgen.core.C3M.A09(r8, r0)
            java.lang.String r0 = r4.A0T
            if (r0 == 0) goto L93
            java.lang.String r1 = r4.A0T
        L5f:
            com.facebook.ads.redexgen.X.2D r0 = new com.facebook.ads.redexgen.X.2D
            r0.<init>()
            com.facebook.ads.redexgen.X.2D r0 = r0.A0y(r1)
            com.facebook.ads.redexgen.X.2D r1 = r0.A11(r5)
            int r0 = r4.A0H
            com.facebook.ads.redexgen.X.2D r1 = r1.A0n(r0)
            java.lang.String r0 = r4.A0V
            com.facebook.ads.redexgen.X.2D r1 = r1.A10(r0)
            int r0 = r4.A03
            com.facebook.ads.redexgen.X.2D r1 = r1.A0Z(r0)
            java.util.List<byte[]> r0 = r4.A0X
            com.facebook.ads.redexgen.X.2D r0 = r1.A12(r0)
            com.facebook.ads.redexgen.X.or r0 = r0.A14()
            r2.A6W(r0)
            com.facebook.ads.redexgen.X.H1[] r0 = r9.A01
            r0[r3] = r2
            int r3 = r3 + 1
            goto L1
        L93:
            java.lang.String r1 = r11.A04()
            goto L5f
        L98:
            r8 = 0
            goto L3c
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.KX.A03(com.facebook.ads.redexgen.X.GY, com.facebook.ads.redexgen.X.Ke):void");
    }
}
