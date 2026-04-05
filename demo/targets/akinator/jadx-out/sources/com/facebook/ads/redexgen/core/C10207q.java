package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7q, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C10207q implements InterfaceC2376kk {
    public static byte[] A04;
    public final long A00;
    public final long A01;
    public final long[] A02;
    public final long[] A03;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C10207q A00(long j10, long j11, C1233Gl c1233Gl, C4J c4j) {
        int iA0I;
        long j12 = j11;
        c4j.A0g(10);
        int iA0C = c4j.A0C();
        if (iA0C <= 0) {
            return null;
        }
        int i10 = c1233Gl.A03;
        long jA0U = AbstractC09264a.A0U(iA0C, (i10 >= 32000 ? 1152 : 576) * 1000000, i10);
        int iA0M = c4j.A0M();
        int iA0M2 = c4j.A0M();
        int iA0M3 = c4j.A0M();
        c4j.A0g(2);
        long j13 = j12 + c1233Gl.A02;
        long[] jArr = new long[iA0M];
        long[] jArr2 = new long[iA0M];
        for (int i11 = 0; i11 < iA0M; i11++) {
            jArr[i11] = (i11 * jA0U) / iA0M;
            jArr2[i11] = Math.max(j12, j13);
            switch (iA0M3) {
                case 1:
                    iA0I = c4j.A0I();
                    break;
                case 2:
                    iA0I = c4j.A0M();
                    break;
                case 3:
                    iA0I = c4j.A0K();
                    break;
                case 4:
                    iA0I = c4j.A0L();
                    break;
                default:
                    return null;
            }
            j12 += iA0I * iA0M2;
        }
        if (j10 != -1 && j10 != j12) {
            AnonymousClass44.A07(A01(27, 10, 89), A01(2, 25, 50) + j10 + A01(0, 2, 80) + j12);
        }
        return new C10207q(jArr, jArr2, jA0U, j12);
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-89, -101, -77, -97, -81, -90, 125, -63, -66, -47, -66, 125, -48, -58, -41, -62, 125, -54, -58, -48, -54, -66, -47, -64, -59, -105, 125, -38, -26, -10, -19, -41, -23, -23, -17, -23, -10};
    }

    public C10207q(long[] jArr, long[] jArr2, long j10, long j11) {
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A01 = j10;
        this.A00 = j11;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2376kk
    public final long A7b() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final long A7l() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final C1243Gv A8t(long j10) {
        int iA0L = AbstractC09264a.A0L(this.A03, j10, true, true);
        C1245Gx c1245Gx = new C1245Gx(this.A03[iA0L], this.A02[iA0L]);
        if (c1245Gx.A01 < j10) {
            int tableIndex = this.A03.length;
            if (iA0L != tableIndex - 1) {
                int tableIndex2 = iA0L + 1;
                long j11 = this.A03[tableIndex2];
                int tableIndex3 = iA0L + 1;
                C1245Gx nextSeekPoint = new C1245Gx(j11, this.A02[tableIndex3]);
                return new C1243Gv(c1245Gx, nextSeekPoint);
            }
        }
        return new C1243Gv(c1245Gx);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2376kk
    public final long A99(long j10) {
        return this.A03[AbstractC09264a.A0L(this.A02, j10, true, true)];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final boolean AAa() {
        return true;
    }
}
