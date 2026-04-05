package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class gb extends gk {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2314 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2315 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2316 = 45214;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2317 = 30063;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2318 = 14752;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2319 = 42628;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        f2315 = (f2314 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        String strIntern = m2534("ၠ偐Ⴅᩍ뵢긗캧≆䋛㮻⅞䊱㾘\u0dbc냥\uf5ca", 15 - (Process.myTid() >> 22)).intern();
        int i10 = f2314 + 91;
        f2315 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 36 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        int i10 = (f2314 + 85) % 128;
        f2315 = i10;
        int i11 = i10 + 41;
        f2314 = i11 % 128;
        if (i11 % 2 != 0) {
            return IronSourceAdQuality.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        be beVar = new be(mo2524());
        int i10 = f2314 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f2315 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 63 / 0;
        }
        return beVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        f2314 = (f2315 + 41) % 128;
        String strIntern = m2534("\uf211\ue9f4祯\uea96芰옗伬ώ\ue12f㗚㱓㌝߅许鳣ㄐ巊焃\ue822뽓饔쒺䄬Ꙁ䰭癤\u1f5eﵪ䰭癤\u1f5eﵪ\uf556\ufafb伬ώ\ue9af葹㱓㌝߅许ᚽ\ue69a玠ᵍ뵢긗캧≆伊\udd71", 51 - Color.green(0)).intern();
        f2314 = (f2315 + 63) % 128;
        return strIntern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2534(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2318)) ^ ((c11 >>> 5) + f2316)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2319) ^ ((c12 + i12) ^ ((c12 << 4) + f2317))));
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
