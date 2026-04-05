package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import com.fyber.FairBid;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ge extends gk {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2328 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2329 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2330 = 923122982339501505L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        f2329 = (f2328 + 21) % 128;
        String strIntern = m2537("噽嘛뎱灲\ue5eeℛ\uee11쮙ﳟ㪽糧", -TextUtils.lastIndexOf("", '0', 0, 0)).intern();
        int i10 = f2328 + 33;
        f2329 = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        Class<FairBid> cls;
        int i10 = f2328 + 113;
        int i11 = i10 % 128;
        f2329 = i11;
        if (i10 % 2 != 0) {
            cls = FairBid.class;
            int i12 = 89 / 0;
        } else {
            cls = FairBid.class;
        }
        int i13 = i11 + 109;
        f2328 = i13 % 128;
        if (i13 % 2 != 0) {
            return cls;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        bn bnVar = new bn(mo2524());
        f2329 = (f2328 + 99) % 128;
        return bnVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        f2329 = (f2328 + 69) % 128;
        String strIntern = m2537("ꮋꯨ\u17ea볩⯮\udce9䩄܆㊃黸㗢ꊡ䗱ƣ껊㖩컮裻⟊䲥矿", Color.green(0) + 1).intern();
        f2328 = (f2329 + 91) % 128;
        return strIntern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2537(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f2330, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f2330));
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
