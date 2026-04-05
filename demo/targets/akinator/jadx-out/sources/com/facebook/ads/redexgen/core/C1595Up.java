package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.api.NativeAdImageApi;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Up, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1595Up implements NativeAdImageApi {
    public static byte[] A03;
    public static String[] A04 = {"", "VJJRZ", "cZdb6ZeXWXZ9VUL9rLCw743uVGQUpxOO", "", "", "", "WdMLtMmdaAcYUdhsZ0J", "wLMa4MLdUcqpCAe5uR"};
    public final int A00;
    public final int A01;
    public final String A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A04;
            if (strArr[0].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A04[7] = "EG8fSiCn7c4UcgqXgi";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            byte b10 = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 66);
            if (A04[7].length() != 18) {
                String[] strArr2 = A04;
                strArr2[4] = "";
                strArr2[3] = "";
                bArrCopyOfRange[i13] = b10;
                i13 += 0;
            } else {
                A04[7] = "dmTYix46cwH5S26Htz";
                bArrCopyOfRange[i13] = b10;
                i13++;
            }
        }
    }

    public static void A02() {
        A03 = new byte[]{118, 123, 119, 121, 118, 106, 124, 123, 101, 72, 86, 91, 75, 87};
    }

    static {
        A02();
    }

    public C1595Up(String str, int i10, int i11) {
        this.A02 = str;
        this.A01 = i10;
        this.A00 = i11;
    }

    public static C1595Up A00(JSONObject jSONObject) {
        String strOptString;
        if (jSONObject == null || (strOptString = jSONObject.optString(A01(6, 3, 75))) == null) {
            return null;
        }
        return new C1595Up(strOptString, jSONObject.optInt(A01(9, 5, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), 0), jSONObject.optInt(A01(0, 6, 92), 0));
    }

    @Override // com.facebook.ads.internal.api.NativeAdImageApi
    public final int getHeight() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.NativeAdImageApi
    public final String getUrl() {
        return this.A02;
    }

    @Override // com.facebook.ads.internal.api.NativeAdImageApi
    public final int getWidth() {
        return this.A01;
    }
}
