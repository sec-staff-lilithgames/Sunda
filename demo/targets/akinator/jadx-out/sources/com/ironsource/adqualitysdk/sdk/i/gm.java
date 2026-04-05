package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.inmobi.sdk.InMobiSdk;
import io.bidmachine.protobuf.sdk.ErrorReasonAnalytics;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class gm extends gk {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2370 = 5657521403065740628L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2371 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2372;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        int i10 = f2372 + 63;
        f2371 = i10 % 128;
        return m2548("ⴽᗅ峇蟆컊㇆", i10 % 2 == 0 ? TextUtils.getCapsMode("", 0, 1) + ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT_VALUE : TextUtils.getCapsMode("", 0, 0) + 14591).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        int i10 = f2372 + 5;
        f2371 = i10 % 128;
        if (i10 % 2 != 0) {
            return InMobiSdk.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        bo boVar = new bo(mo2524());
        f2371 = (f2372 + 9) % 128;
        return boVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        f2371 = (f2372 + 71) % 128;
        String strIntern = m2548("ⴷ驖䏣ଽ\uf089렛憷⻀陞忨ܸ첈됬綶⪌鉾寪̤좑뀡禹⛶\uee6e埴", 46957 - TextUtils.indexOf("", "", 0, 0)).intern();
        f2371 = (f2372 + 9) % 128;
        return strIntern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2548(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (j.f2852) {
            try {
                j.f2850 = i10;
                char[] cArr2 = new char[cArr.length];
                j.f2851 = 0;
                while (true) {
                    int i11 = j.f2851;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f2370);
                        j.f2851++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
