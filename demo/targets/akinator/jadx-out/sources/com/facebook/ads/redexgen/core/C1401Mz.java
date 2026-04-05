package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Mz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1401Mz implements Serializable {
    public static byte[] A04 = null;
    public static final long serialVersionUID = -4041915335826065133L;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    static {
        A03();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{-3, 4, -5, -5, -21, -24, -30};
    }

    public C1401Mz(String str, String str2, JSONObject jSONObject, String str3) {
        this.A03 = A01(str);
        this.A02 = A01(str2);
        this.A00 = A01(str3);
        this.A01 = A02(jSONObject);
    }

    public static String A01(String str) {
        if (A00(0, 4, 65).equalsIgnoreCase(str)) {
            return A00(0, 0, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
        }
        return str;
    }

    private String A02(JSONObject jSONObject) {
        String strA00 = A00(0, 0, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
        if (jSONObject == null) {
            return strA00;
        }
        return jSONObject.optString(A00(4, 3, 40), strA00);
    }

    public final String A04() {
        return this.A02;
    }

    public final String A05() {
        return this.A03;
    }

    public final boolean A06() {
        return !TextUtils.isEmpty(this.A01);
    }
}
