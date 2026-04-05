package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class TN {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 105);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{6, 6, 19, -9, 3, 2, -6, -3, -5, 19, 8, 7, 19, 1, 7, -5, -5, 8, -4, -18, -5, -1, -14, -20, -18, 8, -18, 1, -3, -5, -22, -4, -16, -16, -3, -15, -29, -16, -12, -25, -31, -29, -3, -15, -30, -23, -3, -12, -29, -16, -15, -25, -19, -20};
    }

    public static String A01(C1911cu c1911cu) {
        return AbstractC1609Ve.A00(c1911cu).getString(A00(0, 15, 75), null);
    }

    public static String A02(C1911cu c1911cu) {
        return AbstractC1609Ve.A00(c1911cu).getString(A00(15, 17, 64), null);
    }

    public static String A03(C1911cu c1911cu) {
        return AbstractC1609Ve.A00(c1911cu).getString(A00(32, 22, 53), null);
    }

    public static void A05(C1911cu c1911cu) {
        AbstractC1609Ve.A00(c1911cu).edit().remove(A00(32, 22, 53)).apply();
    }

    public static void A06(C1911cu c1911cu, String str, String str2) {
        AbstractC1609Ve.A00(c1911cu).edit().putString(A00(32, 22, 53), str).putString(A00(15, 17, 64), str2).putString(A00(0, 15, 75), XG.A07(XG.A00())).apply();
    }
}
