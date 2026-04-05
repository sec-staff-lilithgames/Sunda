package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class W1 {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-19, -7, -9, -72, -16, -21, -19, -17, -20, -7, -7, -11, -72, -21, -18, -3, -72, -13, -8, -2, -17, -4, -8, -21, -10, -72, -21, -18, -3, -23, -3, -6, -23, -3, -2, -7, -4, -21, -15, -17};
    }

    public static SharedPreferences A00(SQ sq2) {
        return sq2.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 40, 89), sq2), 0);
    }

    public final int A03(SQ sq2, String str, int i10) {
        return A00(sq2).getInt(str, i10);
    }

    public final String A04(SQ sq2, String str, String str2) {
        return A00(sq2).getString(str, str2);
    }

    public final void A05(SQ sq2, String str, int i10) {
        SharedPreferences btSP = A00(sq2);
        btSP.edit().putInt(str, i10).apply();
    }

    public final void A06(SQ sq2, String str, String str2) {
        SharedPreferences btSP = A00(sq2);
        btSP.edit().putString(str, str2).apply();
    }
}
