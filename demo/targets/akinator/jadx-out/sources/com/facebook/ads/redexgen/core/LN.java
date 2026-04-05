package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Utf8;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class LN {
    public static byte[] A02;
    public final LO A00;
    public final String A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{55, 36, Utf8.REPLACEMENT_BYTE, Utf8.REPLACEMENT_BYTE, 52, 61, 14};
    }

    public LN(LO lo2, String str) {
        this.A00 = lo2;
        this.A01 = str;
    }

    public final void A02(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put(A00(0, 7, 99) + this.A00.getName(), this.A01);
        } catch (JSONException unused) {
        }
    }
}
