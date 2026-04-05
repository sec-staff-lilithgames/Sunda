package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1631Wa {
    public static byte[] A00;
    public static String[] A01 = {"qSiXKiq1IG9lqM50Z2Mb9O8Z2LWgBu", "r2U8xUOmaYVPqVNF7ipuwqUkClKOL9fI", "t2SmaoScOMFcI6wk6u94gycUTd7TrCEv", "g958mvzQCDN4laMR6tofpj9QKe8MWy18", "srt0ITOyv23HblPPEDvfXyJdFCTOXScH", "yBqqog3SgBsnKDzcKk1fPvagOkeR5j", "3gR", "V2iGxa"};

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{16, 23, 27, 24, 14, 5, 14, 27, 21, 26, 35, 32, 43, 44};
    }

    static {
        A02();
    }

    public static String A00(float f10) {
        if (A03(f10)) {
            return A01(10, 4, 69);
        }
        if (A05(f10)) {
            return A01(0, 4, 126);
        }
        if (A04(f10)) {
            return A01(4, 3, 96);
        }
        String strA01 = A01(7, 3, 112);
        String[] strArr = A01;
        if (strArr[0].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A01[4] = "joCrsBqpJwLPerzsPAAgEpnRec6YcWpS";
        return strA01;
    }

    public static boolean A03(float f10) {
        return f10 <= 0.7f;
    }

    public static boolean A04(float f10) {
        return f10 == 1.0f;
    }

    public static boolean A05(float f10) {
        return f10 >= 1.2f;
    }
}
