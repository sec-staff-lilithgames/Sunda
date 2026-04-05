package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class X0 {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-33, -41, -37, -39, -41, -39};
    }

    public static Bundle A00(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AbstractC1424Nw.A01, A01(0, 6, 102));
        bundle.putString(AbstractC1424Nw.A00, str);
        return bundle;
    }
}
