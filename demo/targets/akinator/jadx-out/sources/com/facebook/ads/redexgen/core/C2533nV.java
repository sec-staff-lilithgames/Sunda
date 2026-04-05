package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.nV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2533nV implements C6S {
    public static byte[] A0B;
    public static String[] A0C = {"WWBqbqM8cT7NtZ20aOE3uXs3Aw8DSv9K", "wsMqXc0RGaIy4bMjDS0CDKFK5K3H0E7a", "tXUn5oHGArEZhR5EfIYxUHEmkE2i7Wlz", "L3oqKt7yiugAXq9nLkVCiYddeszNHWIU", "GxMV2HKS42DeS6e3iSG9rTJ", "iBUmcZRwnnz5BMe8LKV", "MLtAALupoqSZMT31TgfSKHmksSEA2gyG", "KlBG0Bt2bdiLbLP3pzzetkFN2"};
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final C2422lh A08;
    public final boolean A09;
    public final boolean A0A;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 69);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0B = new byte[]{-127, -60, -62, -49, -49, -48, -43, -127, -61, -58, -127, -51, -58, -44, -44, -127, -43, -55, -62, -49, -127, 123, -91, -58, -57, -62, -42, -51, -43, -83, -48, -62, -59, -92, -48, -49, -43, -45, -48, -51, 3, 16, 33, 22, 20, 35, -49, 17, 36, 21, 21, 20, 33, -49, 34, 24, 41, 20, -49, 33, 20, 16, 18, 23, 20, 19, -49, 38, 24, 35, 23, -49, 27, 20, 34, 34, -49, 35, 23, 16, 29, -49, -28, -33, -33, 28, 34, -49, 30, 21, -49, 17, 36, 21, 21, 20, 33, 20, 19, -49, 28, 20, 19, 24, 16, -49, 19, 16, 35, 16, -35, -36, -37, -35, -27, -68, -17, -32, -32, -33, -20, -66, -17, -20, -37, -18, -29, -23, -24, -57, -19, -77, -58, -73, -73, -74, -61, -105, -64, -61, -95, -67, -78, -54, -77, -78, -76, -68, -110, -73, -59, -74, -61, -93, -74, -77, -58, -73, -73, -74, -61, -98, -60, 21, 40, 25, 25, 24, 37, -7, 34, 37, 3, 31, 20, 44, 21, 20, 22, 30, 0, 38, -12, -24, -1, -55, -4, -19, -19, -20, -7, -44, -6, 43, 39, 44, 0, 51, 36, 36, 35, 48, 11, 49};
    }

    static {
        A03();
    }

    public C2533nV() {
        this(new C2422lh(true, C.DEFAULT_BUFFER_SEGMENT_SIZE), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    public C2533nV(C2422lh c2422lh, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        int i16;
        String strA02 = A02(163, 19, 110);
        String strA022 = A02(21, 1, 6);
        A04(i12, 0, strA02, strA022);
        String strA023 = A02(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 32, 12);
        A04(i13, 0, strA023, strA022);
        String strA024 = A02(193, 11, Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
        A04(i10, i12, strA024, strA02);
        A04(i10, i13, strA024, strA023);
        A04(i11, i10, A02(182, 11, 66), strA024);
        A04(i15, 0, A02(111, 20, 53), strA022);
        this.A08 = c2422lh;
        this.A07 = AbstractC09264a.A0O(i10);
        this.A06 = AbstractC09264a.A0O(i11);
        this.A05 = AbstractC09264a.A0O(i12);
        this.A04 = AbstractC09264a.A0O(i13);
        this.A02 = i14;
        if (this.A02 != -1) {
            i16 = this.A02;
        } else {
            i16 = C.DEFAULT_VIDEO_BUFFER_SIZE;
        }
        this.A00 = i16;
        this.A09 = z10;
        this.A03 = AbstractC09264a.A0O(i15);
        this.A0A = z11;
    }

    public static int A00(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return C.DEFAULT_VIDEO_BUFFER_SIZE;
            case 2:
                if (A0C[7].length() == 32) {
                    throw new RuntimeException();
                }
                A0C[5] = "ABED08YC";
                return 131072000;
            case 3:
                return 131072;
            case 4:
                return 131072;
            case 5:
                return 131072;
            case 6:
                return 131072;
        }
    }

    private final int A01(InterfaceC2424lj[] interfaceC2424ljArr) {
        int iA00 = 0;
        for (InterfaceC2424lj interfaceC2424lj : interfaceC2424ljArr) {
            if (interfaceC2424lj != null) {
                int targetBufferSize = interfaceC2424lj.A9D().A02;
                iA00 += A00(targetBufferSize);
            }
        }
        int iMax = Math.max(C.DEFAULT_VIDEO_BUFFER_SIZE, iA00);
        if (A0C[0].charAt(6) == 'f') {
            throw new RuntimeException();
        }
        A0C[0] = "RHrwW0B94f4UqoylhYQPwgHgnQSWW3zM";
        return iMax;
    }

    public static void A04(int i10, int i11, String str, String str2) {
        C3M.A09(i10 >= i11, str + A02(0, 21, 28) + str2);
    }

    private void A05(boolean z10) {
        int i10;
        if (this.A02 == -1) {
            i10 = C.DEFAULT_VIDEO_BUFFER_SIZE;
        } else {
            i10 = this.A02;
        }
        this.A00 = i10;
        this.A01 = false;
        if (z10) {
            this.A08.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.core.C6S
    public final C2422lh A6n() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.core.C6S
    public final long A6s(C10167m c10167m) {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.C6S
    public final void AEj(C10167m c10167m) {
        A05(false);
    }

    @Override // com.facebook.ads.redexgen.core.C6S
    public final void AEu(C10167m c10167m) {
        A05(true);
    }

    @Override // com.facebook.ads.redexgen.core.C6S
    public final void AFN(C10167m c10167m) {
        A05(true);
    }

    @Override // com.facebook.ads.redexgen.core.C6S
    public final void AFV(C6R c6r, C2451mA c2451mA, InterfaceC2424lj[] interfaceC2424ljArr) {
        int iA01;
        if (this.A02 == -1) {
            iA01 = A01(interfaceC2424ljArr);
        } else {
            iA01 = this.A02;
        }
        this.A00 = iA01;
        this.A08.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.C6S
    public final boolean AI3(C10167m c10167m) {
        return this.A0A;
    }

    @Override // com.facebook.ads.redexgen.core.C6S
    public final boolean AJB(C6R c6r) {
        boolean z10 = true;
        boolean z11 = this.A08.A00() >= this.A00;
        long jMin = this.A07;
        if (c6r.A00 > 1.0f) {
            jMin = Math.min(AbstractC09264a.A0Q(jMin, c6r.A00), this.A06);
        }
        if (c6r.A01 < Math.max(jMin, 500000L)) {
            boolean targetBufferSizeReached = this.A09;
            if (!targetBufferSizeReached && z11) {
                z10 = false;
            }
            this.A01 = z10;
            boolean targetBufferSizeReached2 = this.A01;
            if (!targetBufferSizeReached2 && c6r.A01 < 500000) {
                AnonymousClass44.A07(A02(22, 18, 28), A02(40, 71, 106));
            }
        } else if (c6r.A01 >= this.A06 || z11) {
            this.A01 = false;
        }
        boolean targetBufferSizeReached3 = this.A01;
        return targetBufferSizeReached3;
    }

    @Override // com.facebook.ads.redexgen.core.C6S
    public final boolean AJE(long j10, float f10, boolean z10, boolean z11, long minBufferDurationUs) {
        long jA0R = AbstractC09264a.A0R(j10, f10);
        long jMin = z10 ? this.A04 : this.A05;
        String[] strArr = A0C;
        if (strArr[3].charAt(20) == strArr[1].charAt(20)) {
            throw new RuntimeException();
        }
        A0C[4] = "l7tzQS6toEbIIxnpfZA1NGx";
        if (minBufferDurationUs != C.TIME_UNSET) {
            jMin = Math.min(minBufferDurationUs / 2, jMin);
        }
        return jMin <= 0 || jA0R >= jMin || (!this.A09 && this.A08.A00() >= this.A00);
    }
}
