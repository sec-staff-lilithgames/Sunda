package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ER {
    public static byte[] A00;
    public static String[] A01 = {"hxRtgXLlXZBZOOikVlBghnrqRk8D", "kooIKi1fx1Hb2qPm3oF2lCQrgWRqeUq9", "tAS3MHwJkliRqJEhDeJC9YibHYE", "z1PlvRauaFfgQg02R7fRgUIUzlYZ", "X9uQKTEyJl", "tATbEztK", "lnp2iYjILHnNLb0EhQTEEhT3vvCpm0GE", "ASuPVfTQk0HiiSTBHvF2"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[1].charAt(21) == strArr[6].charAt(21)) {
                throw new RuntimeException();
            }
            A01[7] = "l0wMWtKaafBi6h";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 96);
            i13++;
        }
    }

    public static void A01() {
        A00 = new byte[]{-18, -31, -24, -31, -35, -17, -31, -32};
    }

    static {
        A01();
    }

    public static /* synthetic */ boolean A02(ER er2) {
        throw new NullPointerException(A00(0, 8, 28));
    }
}
