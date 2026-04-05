package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Utf8;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.Arrays;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class NB implements Serializable {
    public static byte[] A0J = null;
    public static final NC A0K;
    public static final EnumC1726Zt A0L;
    public static final long serialVersionUID = -5352540123250859603L;
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final NC A09;
    public final EnumC1726Zt A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0J = new byte[]{95, 99, 110, 118, 47, 92, 123, 96, 125, 106, 47, 120, 102, 99, 99, 47, 110, 122, 123, 96, 98, 110, 123, 102, 108, 110, 99, 99, 118, 47, 96, AbstractJsonLexerKt.TC_INVALID, 106, 97, 47, 102, 97, 47, 84, 124, 106, 108, 124, 82, 124, 34, 30, 19, 11, 19, 16, 30, 23, 82, 19, 22, 89, 110, 124, 106, 121, 111, 110, 111, 43, 91, 103, 106, 114, 49, 62, 59, 55, 60, 38, 13, 38, 61, 57, 55, 60, 28, 11, 90, 91, 82, 95, 71, 97, 93, 82, 87, 93, 85, 97, 74, 91, 70, 74, 124, 119, 120, 123, 117, 124, 70, 124, 119, 125, 70, 122, 120, 107, 125, 20, 31, 16, 19, 29, 20, 46, 24, 31, 5, 3, 30, 46, 18, 16, 3, 21, 56, 58, 49, 58, 45, 54, 60, 0, 43, 58, 39, 43, 4, 3, 30, 25, 12, 3, 14, 8, 50, 4, 9, 23, 16, 10, 12, 17, 33, 29, 31, 12, 26, 33, 23, 29, 17, 16, 33, 11, 12, 18, 66, 88, 116, 91, 71, 74, 82, 74, 73, 71, 78, 116, 91, 89, 78, 116, 71, 68, 74, 79, 66, 69, 76, 116, 78, 69, 74, 73, 71, 78, 79, 107, 113, 93, 114, 110, 99, 123, 99, 96, 110, 103, 93, 112, 103, 111, 109, 118, 103, 93, 100, 109, 112, 111, 99, 118, 124, 97, 122, 118, 125, 103, 114, 103, 122, 124, 125, 14, 18, 31, 7, 80, 25, 17, 17, 25, 18, 27, 80, 29, 17, 19, 93, 65, 76, 84, 76, 79, 65, 72, 114, 73, 76, 89, 76, 105, 117, 120, 96, 120, 123, 117, 124, 70, 124, 119, 125, 70, 122, 120, 107, 125, 70, 125, 124, 106, 122, 92, 64, 77, 85, 77, 78, 64, 73, 115, 69, 66, 88, 94, 67, 115, 79, 77, 94, 72, 115, 72, 73, 95, 79, 83, 79, 66, 90, 66, 65, 79, 70, 124, 81, 70, 71, 70, 80, 74, 68, 77, 124, 70, 77, 66, 65, 79, 70, 71, 121, 123, 108, 106, 104, 106, 97, 96, 103, 110, 86, 100, 108, 125, 97, 102, 109, 21, 2, 16, 6, 21, 3, 2, 3, 56, 23, 11, 6, 30, 56, 19, 2, 31, 19, 48, 40, 42, 51, 51, 34, 33, 47, 38, 28, 48, 38, 32, 44, 45, 39, 48, 47, 52, 41, 49, 51, 42, 42, 59, 56, 54, Utf8.REPLACEMENT_BYTE, 5, 41, Utf8.REPLACEMENT_BYTE, 57, 53, 52, 62, 41, 50, 53, 46, 32, Utf8.REPLACEMENT_BYTE, 50, 51, 57, 9, 58, 51, 55, 50, Utf8.REPLACEMENT_BYTE, 56, 49, 9, 38, 58, 55, 47, 55, 52, 58, 51, 9, 51, 56, 55, 52, 58, 51, 50, 85, 74, 71, 70, 76, 124, 79, 70, 66, 71, 74, 77, 68, 124, 83, 79, 66, 90, 66, 65, 79, 70, 124, 86, 77, 80, 72, 74, 83, 83, 66, 65, 79, 70, 124, 87, 74, 78, 70, 88, 74, 77, 112, 89, 70, 74, 88, 112, 91, 70, 66, 74, 64, 90, 91, 112, 70, 65, 112, 66, 70, 67, 67, 70, 92, 74, 76, 64, 65, 75, 92};
    }

    static {
        A06();
        A0L = EnumC1726Zt.A04;
        A0K = NC.A03;
    }

    public NB(String str, String str2, int i10, String str3, String str4, EnumC1726Zt enumC1726Zt, int i11, boolean z10, boolean z11, NC nc2, boolean z12, String str5, boolean z13, boolean z14, int i12, String str6, String str7, boolean z15) {
        if (z12) {
            this.A0E = UUID.randomUUID().toString();
            this.A0D = WQ.A00(str).buildUpon().appendQueryParameter(A03(143, 11, 90), this.A0E).appendQueryParameter(A03(69, 12, 101), str5).build().toString();
        } else {
            this.A0D = str;
            this.A0E = null;
        }
        this.A0C = str2;
        this.A07 = i10;
        this.A0F = str3;
        this.A0B = str4;
        this.A0A = enumC1726Zt;
        this.A08 = i11;
        this.A0H = z10;
        this.A0G = z11;
        this.A09 = nc2;
        this.A0I = z12;
        this.A06 = z13;
        this.A05 = z14;
        this.A00 = i12;
        this.A03 = str6;
        this.A02 = str7;
        this.A04 = z15;
    }

    public static int A00(JSONObject jSONObject) {
        String strA03 = A03(374, 17, 116);
        if (jSONObject.has(strA03)) {
            return jSONObject.optInt(strA03);
        }
        return jSONObject.optInt(A03(391, 19, 109), 0);
    }

    public static NB A01(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A03(255, 13, 26));
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        NC ncA00 = NC.A00(jSONObjectOptJSONObject.optString(A03(339, 17, 62), A0K.name()));
        String precachingMethodStr = A03(TTAdConstant.VIDEO_INFO_CODE, 30, 97);
        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean(precachingMethodStr, false);
        String precachingMethodStr2 = A03(410, 3, 112);
        String strOptString = jSONObjectOptJSONObject.optString(precachingMethodStr2);
        String precachingMethodStr3 = A03(154, 19, 73);
        String strOptString2 = jSONObjectOptJSONObject.optString(precachingMethodStr3);
        int iA00 = A00(jSONObject);
        String strA05 = A05(jSONObjectOptJSONObject);
        String strA04 = A04(jSONObjectOptJSONObject);
        EnumC1726Zt enumC1726ZtA02 = A02(jSONObjectOptJSONObject);
        int iOptInt = jSONObjectOptJSONObject.optInt(A03(482, 32, 24), 5000);
        boolean z10 = !zOptBoolean && jSONObjectOptJSONObject.optBoolean(A03(114, 17, 70), true);
        String precachingMethodStr4 = A03(99, 15, 46);
        boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean(precachingMethodStr4);
        String precachingMethodStr5 = A03(204, 25, 53);
        boolean zOptBoolean3 = jSONObjectOptJSONObject.optBoolean(precachingMethodStr5);
        String precachingMethodStr6 = A03(81, 2, 72);
        String strOptString3 = jSONObject.optString(precachingMethodStr6);
        String precachingMethodStr7 = A03(Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE, 25, 20);
        boolean zOptBoolean4 = jSONObjectOptJSONObject.optBoolean(precachingMethodStr7, false);
        String precachingMethodStr8 = A03(443, 39, 20);
        int iOptInt2 = jSONObjectOptJSONObject.optInt(precachingMethodStr8, 5);
        String strOptString4 = jSONObject.optString(A03(290, 24, 27), A03(45, 11, 69));
        String strOptString5 = jSONObject.optString(A03(268, 22, 46), A03(PsExtractor.VIDEO_STREAM_MASK, 15, 73));
        String precachingMethodStr9 = A03(173, 31, 28);
        return new NB(strOptString, strOptString2, iA00, strA05, strA04, enumC1726ZtA02, iOptInt, z10, zOptBoolean2, ncA00, zOptBoolean3, strOptString3, zOptBoolean, zOptBoolean4, iOptInt2, strOptString4, strOptString5, jSONObjectOptJSONObject.optBoolean(precachingMethodStr9, false));
    }

    public static EnumC1726Zt A02(JSONObject jSONObject) {
        int orientation = jSONObject.optInt(A03(229, 11, 36), A0L.A04());
        return EnumC1726Zt.A00(orientation);
    }

    public static String A04(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A03(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 12, 104));
        String strA03 = A03(0, 45, 56);
        return jSONObjectOptJSONObject == null ? strA03 : jSONObjectOptJSONObject.optString(A03(83, 16, 9), strA03);
    }

    public static String A05(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A03(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 12, 104));
        String strA03 = A03(56, 13, 60);
        return jSONObjectOptJSONObject == null ? strA03 : jSONObjectOptJSONObject.optString(A03(356, 18, 80), strA03);
    }

    public final int A07() {
        return this.A07;
    }

    public final int A08() {
        return this.A00;
    }

    public final int A09() {
        return this.A08;
    }

    public final NC A0A() {
        return this.A09;
    }

    public final EnumC1726Zt A0B() {
        return this.A0A;
    }

    public final String A0C() {
        return this.A01;
    }

    public final String A0D() {
        return this.A0B;
    }

    public final String A0E() {
        return this.A0C;
    }

    public final String A0F() {
        return this.A0D;
    }

    public final String A0G() {
        return this.A02;
    }

    public final String A0H() {
        return this.A03;
    }

    public final String A0I() {
        return this.A0E;
    }

    public final String A0J() {
        return this.A0F;
    }

    public final void A0K(String str) {
        this.A01 = str;
    }

    public final boolean A0L() {
        return this.A0H;
    }

    public final boolean A0M() {
        return this.A04;
    }

    public final boolean A0N() {
        return this.A05;
    }

    public final boolean A0O() {
        return this.A0I;
    }

    public final boolean A0P() {
        return this.A06;
    }
}
