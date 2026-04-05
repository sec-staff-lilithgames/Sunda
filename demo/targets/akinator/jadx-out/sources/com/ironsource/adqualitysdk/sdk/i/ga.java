package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ga extends gk {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2308 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2309 = 42148;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2310 = 61956;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2311 = 43338;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2312 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2313 = 50062;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        int i10 = f2308 + 75;
        f2312 = i10 % 128;
        String strIntern = m2533("\uf11c᪣鵽䙉ี桬틮־帄堺뙹ꠢ", i10 % 2 != 0 ? 20 >>> (ViewConfiguration.getPressedStateDuration() * 72) : 11 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern();
        f2308 = (f2312 + 111) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        int i10 = f2312 + 105;
        int i11 = i10 % 128;
        f2308 = i11;
        if (i10 % 2 == 0) {
            int i12 = 4 / 0;
        }
        f2312 = (i11 + 27) % 128;
        return IronSourceAdQuality.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        bf bfVar = new bf(mo2524());
        int i10 = f2308 + 99;
        f2312 = i10 % 128;
        if (i10 % 2 == 0) {
            return bfVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        f2308 = (f2312 + 17) % 128;
        String strIntern = m2533("悔鏕ᅏ힔䄤ဩꖟዷᢉ扫Ⓧ蝉ਤ쎵硂ꑓ틍핑燬焑ṭ㷥\ueb7a\udf86Ҕ砳例\ue586Ҕ砳例\ue586솋\u1775ꖟዷ\ueece룗Ⓧ蝉ਤ쎵䪜ꀖ㭤읮盕額눿⭍\ue5a4\ude1c", Drawable.resolveOpacity(0, 0) + 51).intern();
        f2308 = (f2312 + 109) % 128;
        return strIntern;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m2533(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2310)) ^ ((c11 >>> 5) + f2313)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2311) ^ ((c12 + i12) ^ ((c12 << 4) + f2309))));
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
