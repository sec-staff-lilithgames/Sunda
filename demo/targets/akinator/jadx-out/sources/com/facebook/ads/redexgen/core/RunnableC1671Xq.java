package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1671Xq implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C6H A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-106, -108, -122, -109, -128, -125, -106, -121, -121, -122, -109, -122, -123, -128, -124, -115, -118, -124, -116, -128, -126, -121, -107, -122, -109, -128, -123, -122, -115, -126, -102};
    }

    public RunnableC1671Xq(C6H c6h) {
        this.A00 = c6h;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0H(A00(0, 31, 20));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
