package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1835bg {
    public static byte[] A03;
    public final int A00;
    public final String A01;
    public final String A02;

    static {
        A03();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 76);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-88, -73, -80, -80, -45, -53, -53, -55, -42, -74, -49, -62, -61, -51, -58, -127, -43, -48, -127, -60, -45, -58, -62, -43, -58, -127, -62, -59, -59, -54, -43, -54, -48, -49, -62, -51, -86, -49, -57, -48, -28, -25, -30, -26, -11, -24, -28, -9, -20, -7, -24, -30, -9, -4, -13, -24, -44, -41, -46, -39, -30, -27, -32, -44, -25, -46, -25, -20, -29, -40, 16, 19, 14, 33, 20, 32, 36, 20, 34, 35, 14, 24, 19, -26, -11, -18, -39, -35, -47, -41, -43, -6, -19, -24, -23, -13};
    }

    public C1835bg(String str, String str2, int i10) {
        String strA01;
        this.A02 = str;
        this.A00 = i10;
        if (!TextUtils.isEmpty(str2)) {
            strA01 = A01(91, 5, 56);
        } else {
            strA01 = A01(86, 5, 36);
        }
        this.A01 = strA01;
    }

    private C1551Sw A00(String str) {
        C1551Sw c1551Sw = new C1551Sw(str);
        c1551Sw.A07(A02());
        c1551Sw.A05(1);
        return c1551Sw;
    }

    private JSONObject A02() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A01(56, 14, 39), this.A00);
            jSONObject.put(A01(70, 13, 99), this.A02);
            jSONObject.put(A01(40, 16, 55), this.A01);
        } catch (JSONException e10) {
            Log.w(A01(0, 9, 24), A01(9, 31, 21), e10);
        }
        return jSONObject;
    }

    public final void A04(int i10, String str) {
        C1911cu sdkContext = SP.A00();
        if (sdkContext != null) {
            sdkContext.A08().AAy(A01(83, 3, 54), i10, A00(str));
        }
    }
}
