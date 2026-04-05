package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class EC {
    public final int A00;
    public final C2451mA A01;
    public final int[] A02;
    public final int[] A03;
    public final C2451mA[] A04;
    public final String[] A05;
    public final int[][][] A06;

    public EC(String[] strArr, int[] iArr, C2451mA[] c2451mAArr, int[] iArr2, int[][][] iArr3, C2451mA c2451mA) {
        this.A05 = strArr;
        this.A03 = iArr;
        this.A04 = c2451mAArr;
        this.A06 = iArr3;
        this.A02 = iArr2;
        this.A01 = c2451mA;
        this.A00 = iArr.length;
    }

    private final int A00(int i10, int i11, int i12) {
        return this.A06[i10][i11][i12];
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A01(int r8, int r9, int[] r10) {
        /*
            r7 = this;
            r6 = 0
            r2 = 16
            r5 = 0
            r4 = 0
            r3 = 0
        L6:
            int r0 = r10.length
            if (r3 >= r0) goto L3b
            r1 = r10[r3]
            com.facebook.ads.redexgen.X.mA[] r0 = r7.A04
            r0 = r0[r8]
            com.facebook.ads.redexgen.X.oH r0 = r0.A05(r9)
            com.facebook.ads.redexgen.X.or r0 = r0.A08(r1)
            java.lang.String r0 = r0.A0W
            int r1 = r6 + 1
            if (r6 != 0) goto L32
            r4 = r0
        L1e:
            int[][][] r0 = r7.A06
            r0 = r0[r8]
            r0 = r0[r9]
            r0 = r0[r3]
            int r0 = com.facebook.ads.redexgen.core.AnonymousClass76.A01(r0)
            int r2 = java.lang.Math.min(r2, r0)
            int r3 = r3 + 1
            r6 = r1
            goto L6
        L32:
            boolean r0 = com.facebook.ads.redexgen.core.AbstractC09264a.A1E(r4, r0)
            r0 = r0 ^ 1
            r0 = r0 | r5
            r5 = r0
            goto L1e
        L3b:
            if (r5 == 0) goto L45
            int[] r0 = r7.A02
            r0 = r0[r8]
            int r2 = java.lang.Math.min(r2, r0)
        L45:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.EC.A01(int, int, int[]):int");
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03(int i10) {
        return this.A03[i10];
    }

    public final int A04(int i10, int i11, int i12) {
        return AnonymousClass76.A03(A00(i10, i11, i12));
    }

    public final int A05(int i10, int i11, boolean z10) {
        int i12 = this.A04[i10].A05(i11).A01;
        int[] iArr = new int[i12];
        int i13 = 0;
        for (int trackIndexCount = 0; trackIndexCount < i12; trackIndexCount++) {
            int iA04 = A04(i10, i11, trackIndexCount);
            if (iA04 == 4 || (z10 && iA04 == 3)) {
                int trackCount = i13 + 1;
                iArr[i13] = trackIndexCount;
                i13 = trackCount;
            }
        }
        int trackCount2 = A01(i10, i11, Arrays.copyOf(iArr, i13));
        return trackCount2;
    }

    public final C2451mA A06() {
        return this.A01;
    }

    public final C2451mA A07(int i10) {
        return this.A04[i10];
    }
}
