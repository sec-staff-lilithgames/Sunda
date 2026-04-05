package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1879cO implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C4L A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{98, 93, 80, 81, 91, 100, 88, 85, 77, 86, 85, 87, 95, 113, 70, 70, 91, 70};
    }

    public RunnableC1879cO(C4L c4l) {
        this.A00 = c4l;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0V.AFg(A00(0, 18, 82));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
