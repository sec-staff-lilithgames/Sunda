package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.yandex.mobile.ads.common.MobileAds;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class gz extends gk {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2440 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f2441 = -5554146638539099596L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2442 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2565(String str, int i10) {
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
                        cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f2441);
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

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        int i10 = f2442 + 43;
        f2440 = i10 % 128;
        String strIntern = (i10 % 2 != 0 ? m2565("牍ࣴ蜘ᶳ飕ᝩ", 22767 % TextUtils.indexOf((CharSequence) "", 'n')) : m2565("牍ࣴ蜘ᶳ飕ᝩ", 31392 - TextUtils.indexOf((CharSequence) "", '0'))).intern();
        int i11 = f2440 + 27;
        f2442 = i11 % 128;
        if (i11 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        int i10 = f2442 + 1;
        int i11 = i10 % 128;
        f2440 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        int i12 = i11 + 65;
        f2442 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 15 / 0;
        }
        return MobileAds.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        cj cjVar = new cj(mo2524());
        int i10 = f2442 + 45;
        f2440 = i10 % 128;
        if (i10 % 2 == 0) {
            return cjVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        int i10 = f2440 + 73;
        f2442 = i10 % 128;
        String strIntern = m2565("牗楸䐟⍳ề\uf5fa킈쾥ꭉ虷組壘㟿ኑষ\ue555쁡뽉騣燉泻䯅❕ɾ螺퐲돕껫藎悎屁㭫ᘽෛ\ue8f7잼ꊼ鹈", i10 % 2 == 0 ? (ViewConfiguration.getScrollBarFadeDuration() / 112) * 918 : 6947 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern();
        int i11 = f2442 + 93;
        f2440 = i11 % 128;
        if (i11 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }
}
