package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1893cc implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C09183s A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{22, 41, 36, 37, 47, 16, 44, 33, 57, 34, 33, 35, 43, 5, 50, 50, 47, 50};
    }

    public RunnableC1893cc(C09183s c09183s) {
        this.A00 = c09183s;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0R(A00(0, 18, 81));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
