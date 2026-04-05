package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class GU {
    public static byte[] A03;
    public static String[] A04 = {"HU4YGL7IwZePYHnBLI2PbuSTKGYLERhV", "fFsJPZ9", "v5n0jNlIC8VEk9kcmtdxoaJ1lX", "iKo8W6GX5Xgtq", "u9GtZMdpfWAUjc", "5VwMttC", "nQaWhqWLYmZyv", "CiiXTe9emjL8TKahiZ469ARUB1y9RvmO"};
    public final int A00;
    public final int A01;
    public final String A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-73, -83, -81, -81, -60, -79, -127, -89, -71, -85, -88, -11, -14, 3, -66};
    }

    static {
        A02();
    }

    public GU(int i10, int i11, String str) {
        this.A01 = i10;
        this.A00 = i11;
        this.A02 = str;
    }

    public static GU A00(C4J c4j) {
        String strA01;
        c4j.A0g(2);
        int profileData = c4j.A0I();
        int i10 = profileData >> 1;
        int iA0I = ((profileData & 1) << 5) | ((c4j.A0I() >> 3) & 31);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            strA01 = A01(7, 4, 12);
        } else if (i10 == 8) {
            strA01 = A01(11, 4, 86);
        } else {
            int dvProfile = A04[2].length();
            if (dvProfile != 26) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[3] = "DwVGRWEQxSiyr";
            strArr[6] = "AkYplpXV9U4Nr";
            if (i10 == 9) {
                strA01 = A01(3, 4, 23);
            } else {
                return null;
            }
        }
        StringBuilder sbAppend = new StringBuilder().append(strA01);
        String strA012 = A01(1, 2, 72);
        StringBuilder sbAppend2 = sbAppend.append(strA012).append(i10);
        if (iA0I >= 10) {
            strA012 = A01(0, 1, 82);
        }
        return new GU(i10, iA0I, sbAppend2.append(strA012).append(iA0I).toString());
    }
}
