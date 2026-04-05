package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.37, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass37 extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{83, 104, 110, 103, 104, 98, 106, 99, 98, 38, 96, 105, 116, 107, 103, 114, 60, 38};
    }

    public AnonymousClass37(AnonymousClass36 anonymousClass36) {
        super(A00(0, 18, 51) + anonymousClass36);
    }
}
