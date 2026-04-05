package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class S0 {
    public static S1 A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-91, -88, -79, -90, -85, -80, -92, -75, -82};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (S0.class) {
            if (A00 == null) {
                return;
            }
            C1551Sw c1551Sw = new C1551Sw(A00.AHr());
            c1551Sw.A05(1);
            C1911cu c1911cuA00 = SP.A00();
            if (c1911cuA00 != null) {
                c1911cuA00.A08().AAy(A00(0, 9, 49), 3401, c1551Sw);
            }
            A00.reset();
        }
    }

    public static void A03(long j10) {
        if (j10 > 0) {
            A00 = new C1973dw();
            new S2(j10);
        }
    }
}
