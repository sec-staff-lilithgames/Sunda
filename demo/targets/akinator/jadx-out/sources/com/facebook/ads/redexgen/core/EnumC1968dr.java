package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1968dr {
    A04,
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{123, 118, 121, 122, -108, -124, -118, -119, -108, -124, -125, -108, -123, -127, 118, -114, -73, -68, -60, -63, -73, -80, -70, -77, -117, 126, -120, 126, 119, -127, 122};
    }

    static {
        A01();
    }
}
