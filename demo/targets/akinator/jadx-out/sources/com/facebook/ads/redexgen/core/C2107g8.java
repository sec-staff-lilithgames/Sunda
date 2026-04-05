package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.g8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2107g8 implements InterfaceC1460Pi {
    public static byte[] A01;
    public final /* synthetic */ C09846g A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-10, 0, -9};
    }

    public C2107g8(C09846g c09846g) {
        this.A00 = c09846g;
    }

    private final void A02(C1461Pj c1461Pj) {
        throw new NullPointerException(A00(0, 3, 40));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1460Pi
    public final void AD2(C1461Pj c1461Pj) {
        A02(c1461Pj);
        throw null;
    }
}
