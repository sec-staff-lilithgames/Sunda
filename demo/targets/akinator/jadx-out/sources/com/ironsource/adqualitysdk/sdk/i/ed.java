package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import i2.hQ.aTNDubNmpwAqdU;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ed extends ee {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2128 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2129 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2130 = {215, 260, 257, 178, 261, 247, 262, 251, 256, 249, 252, 264, 243, 254, 263, 269, 190, 180, 204, 271};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean f2131 = true;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2132 = true;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2133 = 146;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Map<String, ee> f2134;

    public ed(Map<String, ee> map, Cdo cdo) {
        super(cdo);
        this.f2134 = new HashMap();
        for (String str : map.keySet()) {
            this.f2134.put(dy.m2458(str), map.get(str));
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2470(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (m.f3159) {
            try {
                char[] cArr2 = f2130;
                int i11 = f2133;
                if (f2132) {
                    int length = bArr.length;
                    m.f3157 = length;
                    char[] cArr3 = new char[length];
                    m.f3158 = 0;
                    while (m.f3158 < m.f3157) {
                        int i12 = m.f3158;
                        int i13 = m.f3157 - 1;
                        int i14 = m.f3158;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        m.f3158 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f2131) {
                    int length2 = cArr.length;
                    m.f3157 = length2;
                    char[] cArr4 = new char[length2];
                    m.f3158 = 0;
                    while (m.f3158 < m.f3157) {
                        int i15 = m.f3158;
                        int i16 = m.f3157 - 1;
                        int i17 = m.f3158;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        m.f3158 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                m.f3157 = length3;
                char[] cArr5 = new char[length3];
                m.f3158 = 0;
                while (m.f3158 < m.f3157) {
                    int i18 = m.f3158;
                    int i19 = m.f3157 - 1;
                    int i20 = m.f3158;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    m.f3158 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            f2128 = (f2129 + 19) % 128;
            return true;
        }
        if (obj != null && ed.class == obj.getClass()) {
            ed edVar = (ed) obj;
            Map<String, ee> map = this.f2134;
            if (map != null) {
                f2128 = (f2129 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
                return map.equals(edVar.f2134);
            }
            if (edVar.f2134 == null) {
                f2129 = (f2128 + 33) % 128;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = f2129;
        f2128 = (i10 + 15) % 128;
        Map<String, ee> map = this.f2134;
        if (map == null) {
            return 0;
        }
        f2128 = (i10 + 111) % 128;
        int iHashCode = map.hashCode();
        int i11 = f2129 + 69;
        f2128 = i11 % 128;
        if (i11 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ﻛ */
    public final du mo2440(ds dsVar, cp cpVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Iterator<String> it = this.f2134.keySet().iterator();
        while (it.hasNext()) {
            int i10 = f2128 + 61;
            f2129 = i10 % 128;
            if (i10 % 2 != 0) {
                String next = it.next();
                jSONObject.put(next, this.f2134.get(next).m2473(dsVar, cpVar).m2437());
                throw null;
            }
            String next2 = it.next();
            try {
                jSONObject.put(next2, this.f2134.get(next2).m2473(dsVar, cpVar).m2437());
                f2128 = (f2129 + 111) % 128;
            } catch (JSONException e10) {
                String strM2007 = cpVar.m2007();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2470(null, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, null, "\u0084\u0086\u008f\u008e\u008d\u008c\u0084\u0089\u0083\u0085\u008b\u0084\u008a\u0089\u0088\u0087\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0082\u0081").intern());
                sb2.append(m2474());
                co.m1955(strM2007, sb2.toString(), e10);
            }
            String strM20072 = cpVar.m2007();
            StringBuilder sb22 = new StringBuilder();
            sb22.append(m2470(null, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, null, "\u0084\u0086\u008f\u008e\u008d\u008c\u0084\u0089\u0083\u0085\u008b\u0084\u008a\u0089\u0088\u0087\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0082\u0081").intern());
            sb22.append(m2474());
            co.m1955(strM20072, sb22.toString(), e10);
        }
        return new du(jSONObject);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2470(null, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, null, "\u0090").intern());
        boolean z10 = true;
        for (String str : this.f2134.keySet()) {
            if (!z10) {
                f2129 = (f2128 + 45) % 128;
                sb2.append(m2470(null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, null, "\u0084\u0091").intern());
            }
            String str2 = aTNDubNmpwAqdU.uMFcvVyVaCG;
            sb2.append(m2470(null, 126 - TextUtils.indexOf((CharSequence) str2, '0', 0), null, "\u0092").intern());
            sb2.append(str);
            sb2.append(m2470(null, 127 - TextUtils.indexOf(str2, str2), null, "\u0084\u0093\u0084\u0092").intern());
            sb2.append(this.f2134.get(str));
            z10 = false;
        }
        String strI = com.google.android.gms.internal.play_billing.a.i(m2470(null, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, null, "\u0094"), sb2);
        int i10 = f2128 + 73;
        f2129 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 28 / 0;
        }
        return strI;
    }
}
