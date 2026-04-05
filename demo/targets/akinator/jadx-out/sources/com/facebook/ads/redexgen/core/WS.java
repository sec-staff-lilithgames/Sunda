package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class WS {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static final Map<String, String> A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-10, -14, -66, -11, -62, -11, -66, -76, -80, 124, -64, -61, -68, -68, -73, -68, -75, -83, -77, -128, -77, -84, -86, -83, -99};
    }

    static {
        A03();
        A01 = false;
        A00 = false;
        A03 = Collections.synchronizedMap(new HashMap());
    }

    public static synchronized String A01(String str) {
        if (!A04()) {
            return null;
        }
        return System.getProperty(A00(0, 7, 115) + str);
    }

    public static Map<String, String> A02() {
        if (!A04()) {
            return Collections.emptyMap();
        }
        return A03;
    }

    public static synchronized boolean A04() {
        if (!A00) {
            A01 = A00(21, 4, 27).equals(System.getProperty(A00(7, 14, 49)));
            A00 = true;
        }
        return A01;
    }

    public static synchronized boolean A05(String str) {
        return !TextUtils.isEmpty(A01(str));
    }
}
