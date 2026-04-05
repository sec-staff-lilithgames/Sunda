package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class VV {
    public static VV A00;
    public static byte[] A01;
    public static String[] A02 = {"1xbaBrS", "A5o8L0K", "NCBBTtQ91bL4qNkC9", "VOiFjhrLKrSiOl", "IzdWV2mN1IZOPy8q", "dzpcam", "yMP3JjbsUfzn40YA", "FhpQzKItQmfQ6pj5K9dUgRwf2x"};

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 36);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{118, 115, 72, 101, 114, 103, 120, 101, 99, 126, 121, 112, 72, 116, 120, 121, 113, 126, 112, 77, 72, 77, 92, 88, 73, 94, 24, 29, 10, 100, 107, 90, 115, 100, 105, 108, 97, 100, 113, 108, 106, 107, 90, 112, 112, 108, 97, 44, 46, 44, 39, 42, 105, 98, 107, 99, 100, 85, 122, 107, 120, 107, 103, 121, 39, 43, 32, 33, 122, AbstractJsonLexerKt.TC_INVALID, 106, AbstractJsonLexerKt.TC_INVALID, 16, 21, 0, 21, 59, 22, 30, 17, 23, 0, 84, 29, 7, 84, 26, 1, 24, 24, 108, 105, 124, 105, 87, 101, 103, 108, 109, 100, 87, 124, 113, 120, 109, 120, 121, 126, 105, 123, 67, 122, 105, 114, 114, 121, 112, 67, AbstractJsonLexerKt.TC_INVALID, 115, 114, 122, 117, 123, 26, 27, 24, 23, 16, 23, 10, 23, 17, 16, 24, 15, 15, 18, 15, 75, 72, 76, 89, 88, 95, 72, 114, 78, 66, 67, 75, 68, 74, 82, 88, 85, 71, 92, 107, 87, 91, 90, 82, 93, 83, 46, 45, 37, 29, 33, 55, 48, 48, 39, 44, 54, 29, 36, 55, 44, 44, 39, 46, 89, 81, 71, 71, 85, 83, 81, 121, 101, 104, 106, 108, 100, 108, 103, 125, 122, 115, 100, 107, 95, 99, 97, 99, 104, 101, 41, 47, 60, 62, 54, 56, 47, 46, 87, 90, 83, 70};
    }

    static {
        A05();
        A00 = new VV();
    }

    public static synchronized VV A00() {
        return A00;
    }

    private PW A01(C1937dL c1937dL, JSONObject data, long j10) throws JSONException {
        JSONArray placements = data.getJSONArray(A04(190, 10, 45));
        JSONObject jSONObject = placements.getJSONObject(0);
        TF tfA00 = TF.A00(jSONObject.getJSONObject(A04(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 10, 90)));
        String strOptString = jSONObject.optString(A04(139, 14, 9));
        String strA04 = A04(47, 5, 107);
        String str = null;
        String flashConfig = jSONObject.has(strA04) ? jSONObject.optString(strA04) : null;
        String strA042 = A04(200, 9, 36);
        String strOptString2 = jSONObject.has(strA042) ? jSONObject.optString(strA042) : null;
        String adReportingConfig = jSONObject.optString(A04(0, 19, 51));
        String strA043 = A04(153, 12, 16);
        String cache = jSONObject.has(strA043) ? jSONObject.optString(strA043) : null;
        TE te2 = new TE(tfA00, strOptString, adReportingConfig, cache, flashConfig, strOptString2, A06(jSONObject));
        String strA044 = A04(26, 3, 93);
        if (jSONObject.has(strA044)) {
            JSONArray jSONArray = jSONObject.getJSONArray(strA044);
            int i10 = 0;
            while (i10 < jSONArray.length()) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                AbstractC1582Uc.A06(c1937dL, jSONObject2, j10, str);
                String strOptString3 = jSONObject2.optString(A04(19, 7, 8));
                String strOptString4 = jSONObject2.optString(A04(90, 15, 44));
                JSONObject ad2 = jSONObject2.optJSONObject(A04(68, 4, 58));
                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(A04(209, 8, Sdk.SDKError.Reason.TPAT_ERROR_VALUE));
                if (ad2 != null) {
                    te2.A0F(new TC(strOptString3, strOptString4, ad2, jSONArrayOptJSONArray));
                } else {
                    LH lhA0F = c1937dL.A0F();
                    int errorCode = AdErrorType.UNKNOWN_ERROR.getErrorCode();
                    String[] strArr = A02;
                    if (strArr[0].length() != strArr[1].length()) {
                        throw new RuntimeException();
                    }
                    A02[7] = "vhqatTRLHh1uNEmkPYajEb8nOj";
                    lhA0F.A5Y(errorCode, A04(72, 18, 80));
                }
                i10++;
                str = null;
            }
        }
        String strA045 = A04(52, 12, 46);
        if (jSONObject.has(strA045)) {
            te2.A0G(jSONObject.getJSONObject(strA045));
        }
        String anValidationUuid = data.optString(A04(29, 18, 33));
        return new PW(te2, anValidationUuid);
    }

    private PV A02(JSONObject jSONObject) {
        return new PV(jSONObject.optString(A04(183, 7, 16), A04(0, 0, 92)), jSONObject.optInt(A04(64, 4, 96), 0), null);
    }

    private PV A03(JSONObject jSONObject) throws JSONException {
        String strA04 = A04(200, 9, 36);
        String strA042 = A04(47, 5, 107);
        try {
            JSONObject jSONObject2 = jSONObject.getJSONArray(A04(190, 10, 45)).getJSONObject(0);
            TF tfA00 = TF.A00(jSONObject2.getJSONObject(A04(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 10, 90)));
            String strOptString = jSONObject2.optString(A04(139, 14, 9));
            String strOptString2 = jSONObject2.has(strA042) ? jSONObject2.optString(strA042) : null;
            String cache = jSONObject2.has(strA04) ? jSONObject2.optString(strA04) : null;
            String featureConfig = jSONObject2.optString(A04(0, 19, 51));
            return new PV(jSONObject.optString(A04(183, 7, 16), A04(0, 0, 92)), jSONObject.optInt(A04(64, 4, 96), 0), new TE(tfA00, strOptString, featureConfig, null, strOptString2, cache, A06(jSONObject2)));
        } catch (JSONException unused) {
            return A02(jSONObject);
        }
    }

    public static boolean A06(JSONObject jSONObject) throws JSONException {
        String strA04 = A04(105, 19, 56);
        if (jSONObject.has(strA04)) {
            return jSONObject.getJSONObject(strA04).optBoolean(A04(165, 18, 102), false);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.core.VX A07(com.facebook.ads.redexgen.core.C1937dL r8, java.lang.String r9, long r10) throws org.json.JSONException {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L59
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>(r9)
            r2 = 217(0xd9, float:3.04E-43)
            r1 = 4
            r0 = 7
            java.lang.String r0 = A04(r2, r1, r0)
            java.lang.String r6 = r4.optString(r0)
            int r5 = r6.hashCode()
            r2 = 134(0x86, float:1.88E-43)
            r1 = 5
            r0 = 89
            java.lang.String r3 = A04(r2, r1, r0)
            switch(r5) {
                case 96432: goto L3e;
                case 96784904: goto L36;
                default: goto L27;
            }
        L27:
            r0 = -1
        L28:
            switch(r0) {
                case 0: goto L54;
                case 1: goto L4f;
                default: goto L2b;
            }
        L2b:
            org.json.JSONObject r0 = r4.optJSONObject(r3)
            if (r0 == 0) goto L59
            com.facebook.ads.redexgen.X.PV r0 = r7.A02(r0)
            return r0
        L36:
            boolean r0 = r6.equals(r3)
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L3e:
            r2 = 26
            r1 = 3
            r0 = 93
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L27
            r0 = 0
            goto L28
        L4f:
            com.facebook.ads.redexgen.X.PV r0 = r7.A03(r4)
            return r0
        L54:
            com.facebook.ads.redexgen.X.PW r0 = r7.A01(r8, r4, r10)
            return r0
        L59:
            com.facebook.ads.redexgen.X.VW r1 = com.facebook.ads.redexgen.core.VW.A04
            com.facebook.ads.redexgen.X.VX r0 = new com.facebook.ads.redexgen.X.VX
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.VV.A07(com.facebook.ads.redexgen.X.dL, java.lang.String, long):com.facebook.ads.redexgen.X.VX");
    }
}
