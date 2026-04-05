package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum VW {
    A04,
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{42, 47, 56, 122, 109, 109, 112, 109, 6, 29, 24, 29, 28, 4, 29};
    }

    static {
        A01();
    }
}
