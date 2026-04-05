package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum NZ {
    A02,
    A06,
    A05,
    A07,
    A08,
    A03,
    A04;

    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{5, 20, 3, 7, 18, 3, 2, 24, 25, 15, 8, 14, 19, 5, 25, 24, 10, 29, 29, 0, 29, 101, 102, 104, 109, 108, 109, 53, 54, 56, 61, 48, 55, 62, 46, 53, 50, 42, 52, 51, 58, 28, 7, 0, 24, 1};
    }

    static {
        A01();
    }
}
