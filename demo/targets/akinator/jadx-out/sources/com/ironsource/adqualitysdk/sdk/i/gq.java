package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import com.vungle.ads.internal.protos.Sdk;
import jp.maio.sdk.android.MaioAds;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class gq extends gk {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2389 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f2390 = 1718531341791055039L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2391;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        f2391 = (f2389 + 77) % 128;
        String strIntern = m2553("攆贤そ쎗敫䇺ꥊꗅ", -TextUtils.indexOf((CharSequence) "", '0')).intern();
        int i10 = f2389 + 53;
        f2391 = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        int i10 = f2389;
        int i11 = i10 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f2391 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        f2391 = (i10 + 39) % 128;
        return MaioAds.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        bs bsVar = new bs(mo2524());
        int i10 = f2391 + 25;
        f2389 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 52 / 0;
        }
        return bsVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        int i10 = f2391 + 39;
        f2389 = i10 % 128;
        return m2553("䖲쉰듃膄䗘\u0ebfⶓ\ue7d4眯㶢磖ᢓ‹\uf0a3䯞䶟\udd27Ɬ蛕织踭媶퇉뎇묓\u09baⳀ\ue4c2琛㲳翖", i10 % 2 == 0 ? 1 >> View.resolveSizeAndState(1, 0, 1) : View.resolveSizeAndState(0, 0, 0) + 1).intern();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2553(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f2390, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f2390));
                        i.f2623 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2781, 4, cArrM2781.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
