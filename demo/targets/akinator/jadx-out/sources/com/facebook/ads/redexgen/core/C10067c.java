package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C10067c extends AbstractC2274j4<LF> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-56, -49, -58, -58};
    }

    public C10067c(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2274j4
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final LN A04(LF lf2) {
        return new LN(this, lf2 == null ? A00(0, 4, 46) : A00(0, 0, 18) + lf2.A03());
    }
}
