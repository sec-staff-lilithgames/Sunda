package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.hw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2210hw extends AbstractC1390Mo implements Serializable {
    public static byte[] A0B = null;
    public static final long serialVersionUID = 3751287062553772011L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final List<AbstractC2212hy> A0A;
    public final ArrayList<Integer> A09 = new ArrayList<>();
    public boolean A07 = false;
    public boolean A06 = false;
    public boolean A05 = false;
    public String A04 = A02(190, 2, 71);
    public final String A08 = UUID.randomUUID().toString();

    static {
        A05();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0B = new byte[]{93, 88, 79, 117, 126, 119, AbstractJsonLexerKt.TC_INVALID, 120, 73, 102, 119, 100, 119, 123, 101, 17, 26, 19, 27, 28, 23, 22, 45, 19, 22, 1, 45, 17, 29, 7, 28, 6, 54, 61, 52, 60, 59, 48, 49, 10, 52, 49, 38, 10, 56, 52, 45, 10, 49, 32, 39, 52, 33, 60, 58, 59, 73, 66, 75, 67, 68, 79, 78, 117, 75, 78, 89, 117, 92, 75, 88, 67, 79, 68, 94, 74, 65, 72, 64, 71, 64, 71, 78, 118, 79, 70, 91, 74, 76, 118, 95, 64, 76, 94, 118, 93, 64, 68, 76, 90, 110, 101, 111, 84, 104, 106, 121, 111, 84, 106, 126, AbstractJsonLexerKt.TC_INVALID, 100, 84, 104, 103, 100, 120, 110, 84, AbstractJsonLexerKt.TC_INVALID, 98, 102, 110, 109, 122, 111, 112, 109, 107, 64, 121, 118, 109, 108, 107, 64, 122, 124, 111, 114, 64, 112, 113, 115, 102, 65, 86, 67, 92, 65, 71, 108, 85, 90, 65, 64, 71, 108, 90, 94, 67, 65, 86, 64, 64, 90, 92, 93, 108, 92, 93, 95, 74, 13, 14, 18, 23, 10, 33, 24, 17, 12, 29, 27, 33, 8, 23, 27, 9, 25, 31};
    }

    public C2210hw(List<AbstractC2212hy> list) {
        this.A0A = list;
    }

    public static C2210hw A00(JSONObject jSONObject, C1937dL c1937dL) throws JSONException {
        return A01(jSONObject, c1937dL, false);
    }

    public static C2210hw A01(JSONObject jSONObject, C1937dL c1937dL, boolean z10) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(A02(0, 3, 25));
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (z10) {
                arrayList.add(AnonymousClass77.A00(jSONArray.getJSONObject(i10), c1937dL));
            } else {
                arrayList.add(AnonymousClass73.A00(jSONArray.getJSONObject(i10), c1937dL));
            }
        }
        C2210hw c2210hw = new C2210hw(arrayList);
        JSONObject chainingParams = jSONObject.getJSONObject(A02(3, 12, 51));
        c2210hw.A04 = chainingParams.toString();
        c2210hw.A01 = chainingParams.optInt(A02(15, 17, 87), arrayList.size());
        c2210hw.A03 = chainingParams.optInt(A02(32, 24, 112), 0);
        c2210hw.A02 = chainingParams.optInt(A02(100, 24, 46), 0);
        c2210hw.A00 = chainingParams.optInt(A02(56, 19, 15), 2);
        c2210hw.A1K(chainingParams);
        c2210hw.A07 = chainingParams.optBoolean(A02(174, 16, 91), false);
        c2210hw.A06 = chainingParams.optBoolean(A02(146, 28, 22), false);
        c2210hw.A05 = chainingParams.optBoolean(A02(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 22, 58), false);
        JSONArray jSONArrayOptJSONArray = chainingParams.optJSONArray(A02(75, 25, 12));
        if (jSONArrayOptJSONArray != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                c2210hw.A09.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i11, 0)));
            }
        }
        return c2210hw;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1390Mo
    public final int A0l() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1390Mo
    public final int A0m() {
        return this.A03 + this.A02;
    }

    public final int A1t() {
        return this.A00;
    }

    public final int A1u() {
        return this.A01;
    }

    public final int A1v() {
        return this.A02;
    }

    public final AbstractC2212hy A1w() {
        if (!this.A0A.isEmpty()) {
            return this.A0A.get(0);
        }
        return null;
    }

    public final AbstractC2212hy A1x(int i10) {
        return this.A0A.get(i10);
    }

    public final String A1y() {
        return this.A08;
    }

    public final String A1z() {
        return this.A04;
    }

    public final String A20() {
        AbstractC2212hy firstAdDataBundle = A1w();
        if (firstAdDataBundle != null) {
            return firstAdDataBundle.A25();
        }
        return null;
    }

    public final ArrayList<Integer> A21() {
        return this.A09;
    }

    public final void A22(int i10) {
        this.A0A.remove(i10);
        this.A01--;
    }

    public final boolean A23() {
        return this.A00 == 0;
    }

    public final boolean A24() {
        return this.A05;
    }

    public final boolean A25() {
        return this.A06;
    }

    public final boolean A26() {
        return this.A07;
    }

    public final boolean A27(int i10) {
        return i10 >= 0 && i10 < this.A0A.size();
    }
}
