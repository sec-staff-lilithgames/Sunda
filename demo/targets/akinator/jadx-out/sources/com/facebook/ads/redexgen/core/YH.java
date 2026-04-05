package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class YH implements LI {
    public static byte[] A01;
    public final SQ A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-93, -73, -56, -82, -118, -71, -78, -78, -87, -80, -87, -40, -47, -47, -56, -49, -99, -125, -39, -24, -2, -52, -3, -20, -11, -5, -26, -117, -102, -109, -109, -118, -111, -68, -53, -60, -60, -69, -62, -75, -62, -59, -67, -67, -69, -70, -58, -43, -50, -50, -59, -52, -65, -52, -49, -57, -57, -55, -50, -57, -65, -51, -49, -60, -59};
    }

    public YH(SQ sq2) {
        this.A00 = sq2;
    }

    private void A02(int i10, String str, JSONObject jSONObject, boolean z10, int i11) throws JSONException {
        C1551Sw c1551Sw = new C1551Sw(A00(4, 6, 44));
        c1551Sw.A07(jSONObject);
        c1551Sw.A05(1);
        c1551Sw.A09(z10);
        c1551Sw.A04(i11);
        try {
            jSONObject.put(A00(33, 13, 62), C1544Sp.A0H(this.A00));
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put(A00(46, 19, 72), i11);
        } catch (JSONException unused2) {
        }
        this.A00.A08().AAz(A00(27, 6, 13), i10 + 4000, c1551Sw);
        if (this.A00.A05().AAF()) {
            String str2 = A00(10, 8, 75) + str + A00(0, 1, 99) + i10 + A00(1, 3, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE) + jSONObject.toString();
        }
    }

    public static boolean A03(LK lk2) {
        for (LK lk3 : C1632Wb.A06) {
            if (lk3.equals(lk2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.LI
    public final void AB0(LK lk2, JSONObject jSONObject, int i10) throws JSONException {
        A02(lk2.A03(), lk2.toString(), jSONObject, A03(lk2), i10);
    }

    @Override // com.facebook.ads.redexgen.core.LI
    public final void ABM(int i10, JSONObject jSONObject, int i11) throws JSONException {
        A02(i10, A00(18, 9, 111) + i10, jSONObject, false, i11);
    }
}
