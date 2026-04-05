package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class GO extends AbstractRunnableC1624Vt {
    public static byte[] A01;
    public final /* synthetic */ C4K A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{67, 124, 113, 112, 122, 53, 98, 116, 102, 53, 123, 112, 99, 112, 103, 53, 101, 103, 112, 101, 116, 103, 112, 113};
    }

    public GO(C4K c4k) {
        this.A00 = c4k;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        if (!this.A00.A0J) {
            this.A00.A0V.AFg(A00(0, 24, 27));
        }
    }
}
