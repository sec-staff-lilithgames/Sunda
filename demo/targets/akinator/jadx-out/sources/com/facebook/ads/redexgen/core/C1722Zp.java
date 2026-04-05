package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Zp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1722Zp {
    public static byte[] A01;
    public final Map<String, String> A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-25, -6, -10, -12, -29, -31, -22, -21, -16, -10, -11, -37, -42, -36, -54, -49};
    }

    public C1722Zp() {
        this.A00 = new HashMap();
    }

    public C1722Zp(Map<String, String> extraData) {
        this.A00 = extraData;
    }

    public final C1722Zp A02(XH xh2) throws JSONException {
        if (xh2 != null) {
            this.A00.put(A00(11, 5, 48), AbstractC1646Wr.A01(xh2.A04()));
        }
        return this;
    }

    public final C1722Zp A03(C2010eX c2010eX) {
        if (c2010eX != null) {
            this.A00.putAll(c2010eX.A0S());
        }
        return this;
    }

    public final C1722Zp A04(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A00.put(A00(0, 11, 75), str);
        }
        return this;
    }

    public final Map<String, String> A05() {
        return this.A00;
    }
}
