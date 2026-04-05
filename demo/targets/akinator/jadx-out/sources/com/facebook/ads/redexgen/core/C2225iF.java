package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.iF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2225iF extends AbstractRunnableC1624Vt {
    public static byte[] A01;
    public final /* synthetic */ C2224iE A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-107, -116, -95, -116, -98, -114, -99, -108, -101, -97, 101};
    }

    public C2225iF(C2224iE c2224iE) {
        this.A00 = c2224iE;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        this.A00.A03.A0F().AKB();
        this.A00.A05.loadUrl(A00(0, 11, 29) + this.A00.A00.A03());
    }
}
