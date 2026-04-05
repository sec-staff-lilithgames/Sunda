package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Iv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1294Iv {
    public static byte[] A0B;
    public static String[] A0C = {"k49nAlN8KevTPYFSOASLph6sBsYk4fa7", "ZHcqIGWhgUaBv559uPYodmfdla4z6YNf", "jyudHMVcZvePNcLp", "lBa1kLRes0ajIcq6EZkhg1VE2ZO4hxQe", "m2AqQobddrkuylEWDBAfxEjZEg6GjKoy", "b8nnr3L8PmBoSjec6BWbo41G2gNha3bi", "", ""};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public final int[] A09 = new int[255];
    public final C4J A0A = new C4J(255);

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 21);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{55, 44, 49, 55, 50, 50, 45, 48, 54, 39, 38, 98, 32, 43, 54, 98, 49, 54, 48, 39, 35, 47, 98, 48, 39, 52, 43, 49, 43, 45, 44};
    }

    static {
        A01();
    }

    public final void A02() {
        this.A03 = 0;
        this.A04 = 0;
        this.A05 = 0L;
        this.A08 = 0L;
        this.A07 = 0L;
        this.A06 = 0L;
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0;
    }

    public final boolean A03(InterfaceC2403lN interfaceC2403lN) throws IOException {
        return A04(interfaceC2403lN, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r12 == (-1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r11.A8f() >= r12) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        r6 = r11.AJG(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (com.facebook.ads.redexgen.core.C1294Iv.A0C[0].charAt(26) == 'Y') goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        r2 = com.facebook.ads.redexgen.core.C1294Iv.A0C;
        r2[3] = "68cxMfwSaXaldqHF3br6ENxggzqDHiHt";
        r2[1] = "gDTREffoH4ayxQFZG5Xi34FUHKUeipYB";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
    
        if (r6 == (-1)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A04(com.facebook.ads.redexgen.core.InterfaceC2403lN r11, long r12) throws java.io.IOException {
        /*
            r10 = this;
            long r5 = r11.A8f()
            long r1 = r11.A8a()
            r4 = 0
            r3 = 1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L65
            r0 = 1
        Lf:
            com.facebook.ads.redexgen.core.C3M.A07(r0)
            com.facebook.ads.redexgen.X.4J r0 = r10.A0A
            r7 = 4
            r0.A0d(r7)
        L18:
            r8 = -1
            int r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r0 == 0) goto L29
            long r5 = r11.A8f()
            r0 = 4
            long r5 = r5 + r0
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 >= 0) goto L6d
        L29:
            com.facebook.ads.redexgen.X.4J r0 = r10.A0A
            byte[] r0 = r0.A0l()
            boolean r5 = com.facebook.ads.redexgen.core.GZ.A04(r11, r0, r4, r7, r3)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C1294Iv.A0C
            r0 = 4
            r1 = r1[r0]
            r0 = 30
            char r1 = r1.charAt(r0)
            r0 = 53
            if (r1 == r0) goto L67
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1294Iv.A0C
            java.lang.String r1 = "pwarRjQHbZVi4rcQZ7lOEWakVYY08Z6g"
            r0 = 0
            r2[r0] = r1
            if (r5 == 0) goto L6d
            com.facebook.ads.redexgen.X.4J r0 = r10.A0A
            r0.A0f(r4)
            com.facebook.ads.redexgen.X.4J r0 = r10.A0A
            long r5 = r0.A0Q()
            r1 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L61
            r11.AI1()
            return r3
        L61:
            r11.AJJ(r3)
            goto L18
        L65:
            r0 = 0
            goto Lf
        L67:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L6d:
            int r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r0 == 0) goto L79
            long r1 = r11.A8f()
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 >= 0) goto La2
        L79:
            int r6 = r11.AJG(r3)
            r5 = -1
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C1294Iv.A0C
            r0 = 0
            r1 = r1[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            r0 = 89
            if (r1 == r0) goto L93
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L93:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1294Iv.A0C
            java.lang.String r1 = "68cxMfwSaXaldqHF3br6ENxggzqDHiHt"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "gDTREffoH4ayxQFZG5Xi34FUHKUeipYB"
            r0 = 1
            r2[r0] = r1
            if (r6 == r5) goto La2
            goto L6d
        La2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1294Iv.A04(com.facebook.ads.redexgen.X.lN, long):boolean");
    }

    /* JADX WARN: Incorrect condition in loop: B:22:0x00ac */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05(com.facebook.ads.redexgen.core.InterfaceC2403lN r8, boolean r9) throws java.io.IOException {
        /*
            r7 = this;
            r7.A02()
            com.facebook.ads.redexgen.X.4J r0 = r7.A0A
            r4 = 27
            r0.A0d(r4)
            com.facebook.ads.redexgen.X.4J r0 = r7.A0A
            byte[] r0 = r0.A0l()
            r3 = 0
            boolean r0 = com.facebook.ads.redexgen.core.GZ.A04(r8, r0, r3, r4, r9)
            if (r0 == 0) goto L24
            com.facebook.ads.redexgen.X.4J r0 = r7.A0A
            long r5 = r0.A0Q()
            r1 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L25
        L24:
            return r3
        L25:
            com.facebook.ads.redexgen.X.4J r5 = r7.A0A
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C1294Iv.A0C
            r0 = 0
            r1 = r1[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            r0 = 89
            if (r1 == r0) goto L3c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1294Iv.A0C
            java.lang.String r1 = "M9XA72oAU7"
            r0 = 2
            r2[r0] = r1
            int r0 = r5.A0I()
            r7.A03 = r0
            int r0 = r7.A03
            if (r0 == 0) goto L5e
            if (r9 == 0) goto L50
            return r3
        L50:
            r2 = 0
            r1 = 31
            r0 = 87
            java.lang.String r0 = A00(r2, r1, r0)
            com.facebook.ads.redexgen.X.2i r0 = com.facebook.ads.redexgen.core.C08822i.A00(r0)
            throw r0
        L5e:
            com.facebook.ads.redexgen.X.4J r0 = r7.A0A
            int r0 = r0.A0I()
            r7.A04 = r0
            com.facebook.ads.redexgen.X.4J r0 = r7.A0A
            long r0 = r0.A0N()
            r7.A05 = r0
            com.facebook.ads.redexgen.X.4J r0 = r7.A0A
            long r0 = r0.A0O()
            r7.A08 = r0
            com.facebook.ads.redexgen.X.4J r0 = r7.A0A
            long r0 = r0.A0O()
            r7.A07 = r0
            com.facebook.ads.redexgen.X.4J r0 = r7.A0A
            long r0 = r0.A0O()
            r7.A06 = r0
            com.facebook.ads.redexgen.X.4J r0 = r7.A0A
            int r0 = r0.A0I()
            r7.A02 = r0
            int r0 = r7.A02
            int r0 = r0 + r4
            r7.A01 = r0
            com.facebook.ads.redexgen.X.4J r1 = r7.A0A
            int r0 = r7.A02
            r1.A0d(r0)
            com.facebook.ads.redexgen.X.4J r0 = r7.A0A
            byte[] r1 = r0.A0l()
            int r0 = r7.A02
            boolean r0 = com.facebook.ads.redexgen.core.GZ.A04(r8, r1, r3, r0, r9)
            if (r0 != 0) goto La9
            return r3
        La9:
            r2 = 0
        Laa:
            int r0 = r7.A02
            if (r2 >= r0) goto Lc4
            int[] r1 = r7.A09
            com.facebook.ads.redexgen.X.4J r0 = r7.A0A
            int r0 = r0.A0I()
            r1[r2] = r0
            int r1 = r7.A00
            int[] r0 = r7.A09
            r0 = r0[r2]
            int r1 = r1 + r0
            r7.A00 = r1
            int r2 = r2 + 1
            goto Laa
        Lc4:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1294Iv.A05(com.facebook.ads.redexgen.X.lN, boolean):boolean");
    }
}
