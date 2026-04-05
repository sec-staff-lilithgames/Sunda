package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Tm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1566Tm {
    public static byte[] A02;
    public final int A00;
    public final int A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 34);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-85, -48, -40, -61, -50, -53, -58, -126, -53, -48, -58, -57, -38, -90, -57, -50, -42, -61, -126, -118, -121, -58, -114, -126, -53, -48, -58, -57, -38, -126, -97, -126, -121, -58, -117, -56, -53, -50, -57, -126, -118, -121, -58, -117, -126, -98, -126, -113, -109, -12, -9, -6, -13, -82, -53, -82, -77, -14, -82, -76, -76, -82, -9, -4, -14, -13, 6, -82, -53, -82, -77, -14, -47, -44, -41, -48, -117, -88, -88, -117, -104, -100, -117, -111, -111, -117, -44, -39, -49, -48, -29, -117, -88, -117, -112, -49};
    }

    public C1566Tm() {
        this(-1, -1);
    }

    public C1566Tm(int i10, int i11) {
        if (i10 < -1) {
            throw new IllegalArgumentException(String.format(Locale.US, A00(35, 14, 64), Integer.valueOf(i10)));
        }
        if (i10 >= 0 && i11 < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, A00(49, 23, 108), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        if (i10 == -1 && i11 != -1) {
            throw new IllegalArgumentException(String.format(Locale.US, A00(72, 24, 73), Integer.valueOf(i11)));
        }
        this.A00 = i10;
        this.A01 = i11;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }

    public final int A04(C1566Tm c1566Tm) {
        if (this.A00 != c1566Tm.A00) {
            return this.A00 - c1566Tm.A00;
        }
        return this.A01 - c1566Tm.A01;
    }

    public final C1566Tm A05(int i10) {
        if (this.A01 + i10 >= 0) {
            return new C1566Tm(this.A00, this.A01 + i10);
        }
        throw new IllegalArgumentException(String.format(Locale.US, A00(0, 35, 64), Integer.valueOf(i10), Integer.valueOf(this.A01)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1566Tm)) {
            return false;
        }
        C1566Tm c1566Tm = (C1566Tm) obj;
        return c1566Tm.A00 == this.A00 && c1566Tm.A01 == this.A01;
    }

    public final int hashCode() {
        return (this.A00 * 2) + (this.A01 * 3);
    }
}
