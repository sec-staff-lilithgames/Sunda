package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.five_corp.ad.FiveAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class gj extends gk {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2358 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2359;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2360 = {63999, 64125, 65261, 62232, 63426, 59443, 60606, 57627, 58803, 58881, 55935, 57076, 54084, 55172, 51257, 52394, 49490, 50612, 50697, 47712, 48865, 45947, 47052, 25026, 25155, 26318, 27499, 28669, 28678};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2361 = -7506103602390170738L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        f2358 = (f2359 + 107) % 128;
        String strIntern = m2544((char) (24996 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6, 23 - (ViewConfiguration.getEdgeSlop() >> 16)).intern();
        f2359 = (f2358 + 17) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        int i10 = (f2359 + 65) % 128;
        f2358 = i10;
        int i11 = i10 + 105;
        f2359 = i11 % 128;
        if (i11 % 2 == 0) {
            return FiveAd.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        br brVar = new br(mo2524());
        int i10 = f2358 + 69;
        f2359 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 34 / 0;
        }
        return brVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        char fadingEdgeLength;
        int iIndexOf;
        int deadChar;
        int i10 = f2359 + 13;
        f2358 = i10 % 128;
        if (i10 % 2 == 0) {
            fadingEdgeLength = (char) (63900 << (ViewConfiguration.getFadingEdgeLength() * 71));
            iIndexOf = TextUtils.indexOf("", "") + 37;
            deadChar = KeyEvent.getDeadChar(0, 1);
        } else {
            fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 63900);
            iIndexOf = TextUtils.indexOf("", "") + 23;
            deadChar = KeyEvent.getDeadChar(0, 0);
        }
        return m2544(fadingEdgeLength, iIndexOf, deadChar).intern();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m2544(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f2360[i11 + i12] ^ (i12 * f2361)) ^ c10);
                        c.f1374 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
