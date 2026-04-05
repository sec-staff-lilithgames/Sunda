package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.59, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract /* synthetic */ class AnonymousClass59 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{52, 64, 57, 56, 69, 54, 73, 69, 43, 28, 47, 43, -26, 45, 43, 43, 32, 21, 20};
    }

    public static /* synthetic */ boolean A02(String str) {
        if (str == null) {
            return false;
        }
        String strA01 = AbstractC2244iY.A01(str);
        if (TextUtils.isEmpty(strA01)) {
            return false;
        }
        return ((strA01.contains(A00(4, 4, 105)) && !strA01.contains(A00(8, 8, 79))) || strA01.contains(A00(0, 4, 100)) || strA01.contains(A00(16, 3, 64))) ? false : true;
    }
}
