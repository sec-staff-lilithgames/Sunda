package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class es extends el {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2184 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2185 = 23816;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2186 = 33497;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2187 = 45237;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2188 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2189 = 13566;

    public es(ee eeVar, ee eeVar2, Cdo cdo) {
        super(eeVar, eeVar2, cdo);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* renamed from: ﻛ */
    public final boolean mo2488(Object obj, Object obj2) {
        int i10 = f2184 + 103;
        int i11 = i10 % 128;
        f2188 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (obj != obj2) {
            return false;
        }
        int i12 = i11 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f2184 = i12 % 128;
        return i12 % 2 != 0;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* renamed from: ｋ */
    public final boolean mo2489(int i10) {
        int i11 = f2188 + 3;
        int i12 = i11 % 128;
        f2184 = i12;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (i10 == 0) {
            return true;
        }
        f2188 = (i12 + 97) % 128;
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* renamed from: ﻛ */
    public final String mo2479() {
        f2184 = (f2188 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        String strIntern = m2497("叟灇", TextUtils.getCapsMode("", 0, 0) + 2).intern();
        int i10 = f2188 + 29;
        f2184 = i10 % 128;
        if (i10 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* renamed from: ｋ */
    public final boolean mo2490(String str, String str2) {
        f2184 = (f2188 + 67) % 128;
        boolean zEquals = str.equals(str2);
        f2184 = (f2188 + 113) % 128;
        return zEquals;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2497(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (o.f3166) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3167 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3167;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2186)) ^ ((c11 >>> 5) + f2187)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2185) ^ ((c12 + i12) ^ ((c12 << 4) + f2189))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3167;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3167 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
