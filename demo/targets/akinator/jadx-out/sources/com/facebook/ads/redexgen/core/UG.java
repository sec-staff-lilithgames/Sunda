package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum UG {
    A03,
    A04,
    A05;

    public static byte[] A00;
    public static String[] A01 = {"ho", "qHP9yOxEhBEQLiGQDtbNN28OigutVH7", "qvLHnvd2eZmVa0k12Gn7IkXrujKfrq4G", "Bd", "jxPGRB", "jXVZsta3c8xywNXZowgjFmkHt9o0BB1P", "m07lALOO7DiCFWJeqD31nTybPShDem9l", "ey6hB0JJVrjTzxOQnW2QvZgefAY6GTsJ"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = bArrCopyOfRange[i13];
            String[] strArr = A01;
            if (strArr[0].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A01[2] = "kxYjy8Ef8Kx8pIoZbzcG0C4t5bmIcMrp";
            bArrCopyOfRange[i13] = (byte) ((b10 - i12) - 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-77, -74, -83, -85, -83, -78, -91, -80, -87, -85, -104, -87, -101, -89, -85, -101, -92, -86, -72, -85, -89, -71, -93, -92, -85, -82, -85, -74, -69};
    }

    static {
        A01();
    }
}
