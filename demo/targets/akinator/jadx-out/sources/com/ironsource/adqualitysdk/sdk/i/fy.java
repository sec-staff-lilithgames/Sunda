package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import com.applovin.sdk.AppLovinSdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class fy extends gk {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2300 = 7514779857201363134L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2301 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2302;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        int i10 = f2301 + 27;
        f2302 = i10 % 128;
        return (i10 % 2 != 0 ? m2531("磟쑹Ơ价訍흛ᒝ凑", 48311 >>> ((Process.getThreadPriority(1) >>> 36) << 103)) : m2531("磟쑹Ơ价訍흛ᒝ凑", 48311 - ((Process.getThreadPriority(0) + 20) >> 6))).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        int i10 = f2302 + 95;
        f2301 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 76 / 0;
        }
        return AppLovinSdk.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        bm bmVar = new bm(mo2524());
        int i10 = f2302 + 103;
        f2301 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 89 / 0;
        }
        return bmVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        int i10 = f2301 + 63;
        f2302 = i10 % 128;
        String strIntern = m2531("磝㼪\uf725꽡朳Ἡ휬輏䜉；뜙漙❔\udf72靠你ܠ뽔睨⽯\ue76e齆坚ཚ의置㞤\uefac", i10 % 2 != 0 ? Color.argb(0, 1, 1, 1) + 9409 : 18427 - Color.argb(0, 0, 0, 0)).intern();
        f2302 = (f2301 + 73) % 128;
        return strIntern;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2531(String str, int i10) {
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
                        cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f2300);
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
