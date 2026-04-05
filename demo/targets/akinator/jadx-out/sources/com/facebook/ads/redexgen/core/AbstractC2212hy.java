package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.hy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2212hy extends AbstractC1390Mo implements Serializable {
    public static JSONObject A0N = null;
    public static byte[] A0O = null;
    public static String[] A0P = {"MTFiGS2hyLPfirnVlCyKu8FL5ydCU71a", "6CtUdYtPnHS0iwt", "3FBcQYGRSJhXKbj7ODsddhFyR1abGnGF", "UQ7LtGE24TX4QkAlsGDlXXS4Vcev", "JcPJu", "s3C", "M3uL5ar3Pz1QrNsTamNzt8iOeyqnSnZC", "bpoJK"};
    public static final LinkedHashMap<String, String> A0Q;
    public static final long serialVersionUID = -5352540727250859603L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C1388Ml A06;
    public N3 A07;
    public N6 A08;
    public N9 A09;
    public NF A0A;
    public String A0B;
    public boolean A0D;
    public final List<C1391Mp> A0L;
    public boolean A0C = false;
    public boolean A0E = false;
    public boolean A0K = false;
    public boolean A0J = false;
    public boolean A0G = false;
    public boolean A0H = false;
    public boolean A0F = false;
    public boolean A0I = false;
    public final Map<String, String> A0M = new HashMap();
    public int A05 = 5000;

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0O, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A0O = new byte[]{81, 84, 111, 83, 88, 95, 89, 83, 85, 67, 111, 92, 89, 94, 91, 111, 69, 66, 92, 122, 117, 68, 119, 116, 124, 116, 68, 111, 98, 107, 126, 29, 18, 21, 17, 29, 8, 25, 35, 31, 14, 25, 24, 21, 8, 35, 16, 21, 18, 25, 53, 58, 61, 57, 53, 32, 49, 11, 55, 38, 49, 48, 61, 32, 11, 56, 61, 58, 49, 11, 53, 33, 32, 59, 11, 55, 56, 59, 39, 49, 11, 57, 61, 56, 56, 61, 76, 88, 89, 66, 78, 65, 68, 78, 70, 114, 78, 66, 88, 67, 89, 73, 66, 90, 67, 114, 89, 68, 64, 72, 87, 67, 66, 89, 85, 90, 95, 85, 93, 105, 85, 66, 87, 105, 66, 95, 91, 83, 47, 59, 58, 33, 45, 34, 39, 45, 37, 17, 40, 34, 47, 56, 33, 60, 59, 57, 59, 48, 61, 7, 57, 43, 43, 61, 44, 43, 15, 13, 30, 3, 25, 31, 9, 0, 6, 13, 4, 12, 11, 58, 4, 1, 22, 58, 3, 23, 0, 20, 16, 0, 11, 6, 28, 92, 80, 82, 17, 89, 94, 92, 90, 93, 80, 80, 84, 17, 94, 91, 76, 17, 86, 81, 75, 90, 77, 76, 75, 86, 75, 86, 94, 83, 17, 89, 86, 81, 86, 76, 87, 96, 94, 92, 75, 86, 73, 86, 75, 70, 33, 54, 104, AbstractJsonLexerKt.TC_INVALID, 96, 83, 109, 124, 124, 83, 110, 99, 121, 98, 104, 83, 121, 126, 96, AbstractJsonLexerKt.TC_INVALID, 91, 95, 9, 92, 98, 90, 77, 98, 82, 75, 88, 79, 81, 92, 68, 98, 78, 88, 94, 72, 79, 88, 98, 73, 82, 86, 88, 83, 120, 114, 126, AbstractJsonLexerKt.TC_INVALID, 70, 65, 92, 91, 78, 67, 67, 112, 93, 74, 73, 74, 93, 93, 74, 93, 83, 84, 78, 95, 72, 73, 78, 83, 78, 83, 91, 86, 73, 71, 71, 82, 125, 76, 71, 90, 86, 125, 86, 77, 125, 70, 71, 81, 86, 75, 76, 67, 86, 75, 77, 76, 125, 77, 76, 65, 78, 75, 65, 73, 1, 12, 3, 9, 30, 14, 12, 29, 8, 91, 86, 78, 88, 66, 67, 122, 101, 120, 126, 120, 107, 99, 126, 10, 29, 15, 25, 10, 28, 29, 28, 39, 14, 17, 28, 29, 23, 42, 49, 54, 44, 53, 61, 6, 53, 54, 62, 6, 56, 55, 32, 6, 48, 56, 59, 6, 58, 53, 48, 58, 50, 6, 54, 55, 58, 60, 58, 33, 38, 62, 22, 42, 59, 44, 45, 32, 61, 22, 37, 32, 39, 44, 45, 54, 49, 41, 1, 61, 44, 59, 58, 55, 42, 1, 50, 55, 48, 59, 1, 49, 48, 1, 44, 61, 1, 45, 43, 61, 61, 59, 45, 45, 1, 45, 61, 44, 59, 59, 48, 44, 55, 48, 40, 0, 51, 48, 62, 59, 58, 45, 0, 49, 43, 59, 56, 35, 36, 60, 20, 37, 46, 51, Utf8.REPLACEMENT_BYTE, 20, 40, Utf8.REPLACEMENT_BYTE, 42, 20, 36, 37, 20, 46, 37, 47, 40, 42, 57, 47, 125, 96, 125, 101, 108, 43, 48, 48, 51, 61, 62, 45, 0, 62, 60, 43, 0, 62, 44, 0, 60, 43, 62, 98, 101, 123};
    }

    static {
        A09();
        A0Q = new LinkedHashMap<>(10, 0.75f, false);
    }

    public AbstractC2212hy(List<C1391Mp> list) {
        this.A0L = list;
    }

    public static String A06(String str) {
        return A0Q.get(str);
    }

    private HashMap<String, String> A07(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A05(230, 18, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
        HashMap<String, String> map = new HashMap<>();
        if (jSONObjectOptJSONObject == null) {
            return map;
        }
        Iterator<String> nameItr = jSONObjectOptJSONObject.keys();
        while (nameItr.hasNext()) {
            try {
                String next = nameItr.next();
                map.put(next, jSONObjectOptJSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        return map;
    }

    public static List<C1391Mp> A08(JSONObject jSONObject, C1937dL c1937dL, N1 n12) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A05(156, 8, 28));
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            return AbstractC1399Mx.A01(jSONArrayOptJSONArray, jSONObject, c1937dL, n12);
        }
        List<AdInfo> adInfoList = new ArrayList<>();
        C1391Mp c1391MpA00 = C1391Mp.A00(jSONObject);
        n12.A3q(c1391MpA00, jSONObject);
        adInfoList.add(c1391MpA00);
        return adInfoList;
    }

    private void A0A(int i10) {
        this.A00 = i10;
    }

    private final void A0B(int i10) {
        this.A04 = i10;
    }

    private void A0C(C1388Ml c1388Ml) {
        this.A06 = c1388Ml;
    }

    private final void A0D(N3 n32) {
        this.A07 = n32;
    }

    private void A0E(N6 n62) {
        this.A08 = n62;
    }

    private final void A0F(N9 n9) {
        this.A09 = n9;
    }

    private void A0G(NF nf2) {
        this.A0A = nf2;
    }

    private void A0H(String str) {
        this.A0B = str;
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

    public final int A1w() {
        return this.A03;
    }

    public final int A1x() {
        return this.A04;
    }

    public final int A1y() {
        return this.A05;
    }

    public final C1388Ml A1z() {
        return this.A06;
    }

    public final C1391Mp A20() {
        return this.A0L.get(0);
    }

    public final N3 A21() {
        return this.A07;
    }

    public final N6 A22() {
        return this.A08;
    }

    public final N9 A23() {
        return this.A09;
    }

    public final NF A24() {
        return this.A0A;
    }

    public final String A25() {
        return this.A0B;
    }

    public final String A26(String str) {
        return this.A0M.get(str);
    }

    public final List<C1391Mp> A27() {
        return Collections.unmodifiableList(this.A0L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A28(com.facebook.ads.redexgen.core.InterfaceC1668Xn r5) {
        /*
            r4 = this;
            java.lang.String r3 = r4.A0v()
            int r0 = r3.hashCode()
            switch(r0) {
                case -1364000502: goto L39;
                case 604727084: goto L27;
                default: goto Lb;
            }
        Lb:
            r0 = -1
        Lc:
            switch(r0) {
                case 0: goto L10;
                case 1: goto L1d;
                default: goto Lf;
            }
        Lf:
            return
        L10:
            r2 = 183(0xb7, float:2.56E-43)
            r1 = 45
            r0 = 79
            java.lang.String r0 = A05(r2, r1, r0)
            r5.A4b(r0)
        L1d:
            com.facebook.ads.redexgen.X.dh r0 = com.facebook.ads.redexgen.core.EnumC1959dh.A08
            java.lang.String r0 = r0.A03()
            r5.A4b(r0)
            goto Lf
        L27:
            r2 = 296(0x128, float:4.15E-43)
            r1 = 12
            r0 = 74
            java.lang.String r0 = A05(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lb
            r0 = 0
            goto Lc
        L39:
            r2 = 363(0x16b, float:5.09E-43)
            r1 = 14
            r0 = 8
            java.lang.String r0 = A05(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC2212hy.A28(com.facebook.ads.redexgen.X.Xn):void");
    }

    public final void A29(JSONObject jSONObject) {
        String strA05;
        A0D(N3.A00(jSONObject.optJSONObject(A05(280, 16, 95))));
        A0N = jSONObject.optJSONObject(A05(144, 12, 40));
        N8 n8A06 = new N8().A06(jSONObject.optString(A05(498, 5, Sdk.SDKError.Reason.TPAT_ERROR_VALUE)));
        String strA052 = A05(276, 4, 97);
        if (jSONObject.optJSONObject(strA052) != null) {
            strA05 = jSONObject.optJSONObject(strA052).optString(A05(521, 3, 103));
        } else {
            strA05 = A05(0, 0, 15);
        }
        A0F(n8A06.A05(strA05).A04(jSONObject.optString(A05(0, 19, 64))).A07(NA.A03(jSONObject)).A08());
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A05(349, 6, 71));
        JSONObject layoutObject = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(A05(355, 8, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE)) : null;
        C1400My c1400MyA01 = C1400My.A01(layoutObject);
        String[] strArr = A0P;
        if (strArr[1].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[2] = "MaJS3iOjDVpkOvzQIu4XnTvkYtI43ENf";
        strArr2[6] = "dcadpZfpRdAwhtf1LK3imqQWfZ9Fu8JJ";
        A0C(new C1388Ml(c1400MyA01, C1400My.A01(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(A05(340, 9, 29)) : null)));
        A0G(NA.A01(jSONObject));
        A0E(NA.A00(jSONObject));
        A0A(jSONObject.optInt(A05(19, 12, 107), 0));
        A0B(jSONObject.optInt(A05(164, 19, 21), -1));
        this.A0M.putAll(A07(jSONObject));
        this.A03 = jSONObject.optInt(A05(110, 18, 70), 0);
        this.A01 = jSONObject.optInt(A05(128, 16, 62), 1);
        this.A0K = jSONObject.optBoolean(A05(503, 18, 47), false);
        this.A0J = jSONObject.optBoolean(A05(459, 15, 47), false);
        this.A0G = jSONObject.optBoolean(A05(474, 24, 59), false);
        this.A0H = jSONObject.optBoolean(A05(406, 16, 57), false);
        this.A0F = jSONObject.optBoolean(A05(31, 19, 12), false);
        this.A05 = jSONObject.optInt(A05(50, 36, 36), 5000);
        this.A0I = jSONObject.optBoolean(A05(422, 37, 46), false);
        this.A0E = jSONObject.optBoolean(A05(377, 29, 41), false);
        this.A0D = jSONObject.optBoolean(A05(308, 32, 82), false);
        this.A02 = jSONObject.optInt(A05(86, 24, 93), this.A03);
        String strOptString = jSONObject.optString(A05(228, 2, 50));
        A0H(strOptString);
        A0Q.put(strOptString, jSONObject.optString(A05(248, 28, 77)));
        A1K(jSONObject);
    }

    public final void A2A(boolean z10) {
        this.A0C = z10;
    }

    public final void A2B(boolean z10) {
        this.A0G = z10;
    }

    public final boolean A2C() {
        return this.A0C;
    }

    public final boolean A2D() {
        return this.A0D;
    }

    public final boolean A2E() {
        return this.A0E;
    }

    public final boolean A2F() {
        return this.A0F;
    }

    public final boolean A2G() {
        return this.A0G;
    }

    public final boolean A2H() {
        return this.A0H;
    }

    public final boolean A2I() {
        return this.A0I;
    }

    public final boolean A2J() {
        return this.A0J;
    }

    public final boolean A2K() {
        return this.A0K;
    }
}
