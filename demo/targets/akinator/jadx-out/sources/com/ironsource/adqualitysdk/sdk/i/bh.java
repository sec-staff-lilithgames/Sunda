package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import com.ironsource.adqualitysdk.sdk.i.bg;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class bh extends bg {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f989 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f990 = -8647021406490404399L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f991;

    public bh(String str) {
        super(str);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m1173(String str, int i10) {
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
                        cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f990);
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

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﱡ */
    public final boolean mo1154() {
        int i10 = f991 + 101;
        f989 = i10 % 128;
        if (i10 % 2 != 0) {
            return true;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        f991 = (f989 + 77) % 128;
        String strIntern = m1173("\ud994\uf65c蘖囚暑㝛윇", Color.argb(0, 0, 0, 0) + 12227).intern();
        int i10 = f989 + 3;
        f991 = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    public final Class mo1110(String str) {
        int i10 = f989;
        int i11 = i10 + 97;
        f991 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        int i12 = i10 + 87;
        f991 = i12 % 128;
        if (i12 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        f991 = (f989 + 51) % 128;
        return map;
    }
}
