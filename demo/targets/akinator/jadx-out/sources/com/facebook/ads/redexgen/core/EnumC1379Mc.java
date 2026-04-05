package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1379Mc {
    A03(A00(13, 3, 104)),
    A05(A00(22, 4, 126)),
    A04(A00(16, 6, 26));

    public static byte[] A01;
    public final String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-52, -41, -41, -56, -68, -55, -48, -68, -57, 61, 62, 61, 52, 58, 69, 69, -8, -20, -7, 0, -20, -9, 93, 94, 93, 84};
    }

    static {
        A01();
    }

    EnumC1379Mc(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
