package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class WC implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C1937dL A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-55, -50, -51, -58, -1, -3, 6, -3, 10, 1, -5};
    }

    public WC(C1937dL c1937dL) {
        this.A00 = c1937dL;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            C1551Sw otsl = new C1551Sw(A00(0, 4, 14));
            otsl.A05(1);
            otsl.A06(1);
            otsl.A0A(false);
            this.A00.A08().AAz(A00(4, 7, 44), AbstractC1550Sv.A1Y, otsl);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
