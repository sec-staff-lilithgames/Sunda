package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4A, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4A {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 120);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-13, -21, -14, -15, -24};
    }

    public static void A02(Context context, C4D c4d) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C3M.A01((TelephonyManager) context.getSystemService(A00(0, 5, 11)));
            AnonymousClass49 callback = new AnonymousClass49(c4d);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), callback);
            telephonyManager.unregisterTelephonyCallback(callback);
        } catch (RuntimeException unused) {
            c4d.A07(5);
        }
    }
}
