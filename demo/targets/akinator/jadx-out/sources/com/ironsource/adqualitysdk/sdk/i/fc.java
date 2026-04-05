package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class fc extends el {

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2221 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2222 = 44019;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2223 = 10772;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2224 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2225 = 1885;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2226 = 20137;

    public fc(ee eeVar, ee eeVar2, Cdo cdo) {
        super(eeVar, eeVar2, cdo);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2506(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2226)) ^ ((c11 >>> 5) + f2223)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2225) ^ ((c12 + i12) ^ ((c12 << 4) + f2222))));
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

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* renamed from: ﻛ */
    public final boolean mo2488(Object obj, Object obj2) {
        if (obj != obj2) {
            f2221 = (f2224 + 35) % 128;
            return true;
        }
        f2224 = (f2221 + 1) % 128;
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* renamed from: ｋ */
    public final boolean mo2489(int i10) {
        int i11 = f2224;
        f2221 = (i11 + 13) % 128;
        if (i10 == 0) {
            return false;
        }
        int i12 = (i11 + 51) % 128;
        f2221 = i12;
        int i13 = i12 + 3;
        f2224 = i13 % 128;
        if (i13 % 2 == 0) {
            return true;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* renamed from: ﻛ */
    public final String mo2479() {
        int i10 = f2224 + 33;
        f2221 = i10 % 128;
        String strIntern = m2506("ىꡖ", i10 % 2 == 0 ? 4 - TextUtils.indexOf((CharSequence) "", (char) 30, 1, 1) : TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3).intern();
        f2221 = (f2224 + 115) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* renamed from: ｋ */
    public final boolean mo2490(String str, String str2) {
        if (str.equals(str2)) {
            return false;
        }
        f2224 = (f2221 + 99) % 128;
        return true;
    }
}
