package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ez extends eg {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2208 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2209 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f2210 = 6823446894326390185L;

    public ez(ee eeVar, ee eeVar2, Cdo cdo) {
        super(eeVar, eeVar2, cdo);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2503(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f2210, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f2210));
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

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ﻛ */
    public final du mo2440(ds dsVar, cp cpVar) {
        f2209 = (f2208 + 91) % 128;
        du duVarM2473 = m2480().m2473(dsVar, cpVar);
        if (duVarM2473.m2434()) {
            return duVarM2473;
        }
        du duVarM24732 = m2478().m2473(dsVar, cpVar);
        int i10 = f2208 + 31;
        f2209 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 25 / 0;
        }
        return duVarM24732;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* renamed from: ﻛ */
    public final String mo2479() {
        f2209 = (f2208 + 109) % 128;
        String strIntern = m2503("\ud8c1\ud8bd蕗颂\ued54䞡", 1 - View.getDefaultSize(0, 0)).intern();
        int i10 = f2208 + 69;
        f2209 = i10 % 128;
        if (i10 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }
}
