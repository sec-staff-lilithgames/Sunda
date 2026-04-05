package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class JG {
    public static byte[] A00;
    public static String[] A01 = {"igoOoy3NY4UMRHdpx9h3UlwGdvMc0fc9", "i1My3cIv2txc6hnpPF2N9ufK5yKqcDwp", "ZPKM82HH2UhiHuE6c", "N8bcPF6", "fP1uMJr9juYIT", "Q74KZy4WGIwm3", "kYmec6ZLKDIoPLbK3wnMb68OSlbBsX7E", "P2I33wOyCa7MBOFZieFJQqH5gMHCVrks"};

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-17, 17, 13, 1, 32, 21, 24, -41, -17, -19, -12, -12, -19, -14, -21, -92, -10, -23, -15, -27, -19, -14, -24, -23, -10, -92, -13, -22, -92, -15, -27, -16, -22, -13, -10, -15, -23, -24, -92, -41, -55, -51, -92, -46, -59, -48, -92, -7, -14, -19, -8, -78};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A04(long j10, C4J c4j, H1[] h1Arr) {
        int iA0I = c4j.A0I();
        if ((iA0I & 64) != 0) {
            c4j.A0g(1);
            int i10 = (iA0I & 31) * 3;
            int iA09 = c4j.A09();
            for (H1 h12 : h1Arr) {
                c4j.A0f(iA09);
                h12.AI7(c4j, i10);
                h12.AIA(j10, 1, i10, 0, null);
            }
        }
    }

    static {
        A02();
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(com.facebook.ads.redexgen.core.C4J r6) {
        /*
            r5 = 0
        L1:
            int r0 = r6.A07()
            if (r0 != 0) goto L9
            r0 = -1
            return r0
        L9:
            int r4 = r6.A0I()
            int r5 = r5 + r4
            r3 = 255(0xff, float:3.57E-43)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.JG.A01
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 4
            if (r1 == r0) goto L26
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.JG.A01
            java.lang.String r1 = "hfDUXVNQknc2urmlb"
            r0 = 2
            r2[r0] = r1
            if (r4 == r3) goto L1
            return r5
        L26:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.JG.A00(com.facebook.ads.redexgen.X.4J):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(long r9, com.facebook.ads.redexgen.core.C4J r11, com.facebook.ads.redexgen.core.H1[] r12) {
        /*
        L0:
            int r0 = r11.A07()
            r8 = 1
            if (r0 <= r8) goto L7a
            int r2 = A00(r11)
            int r1 = A00(r11)
            int r7 = r11.A09()
            int r7 = r7 + r1
            r0 = -1
            if (r1 == r0) goto L1d
            int r0 = r11.A07()
            if (r1 <= r0) goto L39
        L1d:
            r2 = 0
            r1 = 7
            r0 = 109(0x6d, float:1.53E-43)
            java.lang.String r3 = A01(r2, r1, r0)
            r2 = 7
            r1 = 45
            r0 = 69
            java.lang.String r0 = A01(r2, r1, r0)
            com.facebook.ads.redexgen.core.AnonymousClass44.A07(r3, r0)
            int r7 = r11.A0A()
        L35:
            r11.A0f(r7)
            goto L0
        L39:
            r0 = 4
            if (r2 != r0) goto L35
            r0 = 8
            if (r1 < r0) goto L35
            int r6 = r11.A0I()
            int r5 = r11.A0M()
            r4 = 0
            r3 = 49
            if (r5 != r3) goto L51
            int r4 = r11.A0C()
        L51:
            int r2 = r11.A0I()
            r1 = 47
            if (r5 != r1) goto L5c
            r11.A0g(r8)
        L5c:
            r0 = 181(0xb5, float:2.54E-43)
            if (r6 != r0) goto L78
            if (r5 == r3) goto L64
            if (r5 != r1) goto L78
        L64:
            r0 = 3
            if (r2 != r0) goto L78
            r1 = 1
        L68:
            if (r5 != r3) goto L70
            r0 = 1195456820(0x47413934, float:49465.203)
            if (r4 != r0) goto L76
        L6f:
            r1 = r1 & r8
        L70:
            if (r1 == 0) goto L35
            A04(r9, r11, r12)
            goto L35
        L76:
            r8 = 0
            goto L6f
        L78:
            r1 = 0
            goto L68
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.JG.A03(long, com.facebook.ads.redexgen.X.4J, com.facebook.ads.redexgen.X.H1[]):void");
    }
}
