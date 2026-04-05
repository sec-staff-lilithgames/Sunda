package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.aq;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ap extends aq.AnonymousClass1 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f544 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f545;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f546 = {'7', 'n', 'i', GMTDateParser.DAY_OF_MONTH, 'k', 'q', 'p', 'r', 'k', 'i', GMTDateParser.DAY_OF_MONTH, 22, '5', 'i', 'k', 'H', 144, 142, 144, 148, 141, 127, 134, 146, 147, 141, 134, 139, 144, 144, 139};

    /* renamed from: ｋ, reason: contains not printable characters */
    private final String f547;

    public ap(ax axVar) {
        m809("\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000", false, new int[]{0, 10, 0, 8}).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m809("\u0000", false, new int[]{10, 1, 85, 0}).intern());
        sb2.append(UUID.randomUUID().toString().replace(m809("\u0001", false, new int[]{11, 1, 0, 0}).intern(), ""));
        this.f547 = sb2.toString();
        m850(axVar);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private JSONObject m810() {
        JSONObject jSONObjectOptJSONObject;
        int i10 = f545 + 29;
        f544 = i10 % 128;
        if (i10 % 2 != 0 ? (jSONObjectOptJSONObject = m849().optJSONObject(m809("\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000", false, new int[]{0, 10, 0, 8}).intern())) == null : (jSONObjectOptJSONObject = m849().optJSONObject(m809("\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000", true, new int[]{0, 10, 0, 8}).intern())) == null) {
            jSONObjectOptJSONObject = new JSONObject();
            f544 = (f545 + 113) % 128;
        }
        int i11 = f545 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f544 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 35 / 0;
        }
        return jSONObjectOptJSONObject;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m811(String str) {
        int i10 = f544 + 63;
        f545 = i10 % 128;
        if (i10 % 2 != 0) {
            m810().optJSONObject(str);
            throw null;
        }
        JSONObject jSONObjectOptJSONObject = m810().optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        int i11 = f545 + 5;
        f544 = i11 % 128;
        return jSONObjectOptJSONObject.optString((i11 % 2 == 0 ? m809("\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", false, new int[]{15, 16, 34, 0}) : m809("\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", true, new int[]{15, 16, 34, 0})).intern());
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m813() {
        f545 = (f544 + 5) % 128;
        String strOptString = m849().optString(m809("\u0000\u0001\u0001", false, new int[]{12, 3, 0, 0}).intern(), this.f547);
        int i10 = f545 + 85;
        f544 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 59 / 0;
        }
        return strOptString;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m809(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (g.f2307) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f546, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    g.f2306 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = g.f2306;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        g.f2306 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    g.f2306 = 0;
                    while (true) {
                        int i16 = g.f2306;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        g.f2306 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    g.f2306 = 0;
                    while (true) {
                        int i17 = g.f2306;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        g.f2306 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m812() {
        f544 = (f545 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
        boolean zHas = m849().has(m809("\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000", false, new int[]{0, 10, 0, 8}).intern());
        int i10 = f544 + 61;
        f545 = i10 % 128;
        if (i10 % 2 == 0) {
            return zHas;
        }
        throw null;
    }
}
