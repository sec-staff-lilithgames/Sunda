package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ph, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1459Ph extends AbstractRunnableC1624Vt {
    public static byte[] A01;
    public final /* synthetic */ VU A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-81, -78, -90, -92, -81, -94, -73, -85, -75, -78, -73, -73, -81, -88};
    }

    public C1459Ph(VU vu2) {
        this.A00 = vu2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        this.A00.A05.A08().A9v(A00(0, 14, 26));
    }
}
