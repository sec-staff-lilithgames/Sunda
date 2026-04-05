package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class et extends en {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2190 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2191 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2192 = 138;

    public et(ee eeVar, ee eeVar2, Cdo cdo) {
        super(eeVar, eeVar2, cdo);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* renamed from: ﻛ */
    public final String mo2479() {
        f2190 = (f2191 + 39) % 128;
        String strIntern = m2498(185 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u0000", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), false).intern();
        int i10 = f2191 + 93;
        f2190 = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.en
    /* renamed from: ﾒ */
    public final Number mo2493(Number number, Number number2) {
        int i10 = f2191;
        f2190 = (i10 + 101) % 128;
        if (!(number instanceof Double)) {
            int i11 = i10 + 57;
            int i12 = i11 % 128;
            f2190 = i12;
            if (i11 % 2 != 0) {
                throw null;
            }
            if (!(number2 instanceof Double)) {
                if (!(number instanceof Long)) {
                    int i13 = i12 + 89;
                    f2191 = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                    if (!(number2 instanceof Long)) {
                        return Integer.valueOf(number.intValue() / number2.intValue());
                    }
                }
                return Long.valueOf(number.longValue() / number2.longValue());
            }
        }
        return Double.valueOf(number.doubleValue() / number2.doubleValue());
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2498(int i10, int i11, String str, int i12, boolean z10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (e.f2108) {
            try {
                char[] cArr2 = new char[i11];
                e.f2107 = 0;
                while (true) {
                    int i13 = e.f2107;
                    if (i13 >= i11) {
                        break;
                    }
                    e.f2110 = cArr[i13];
                    cArr2[e.f2107] = (char) (e.f2110 + i10);
                    int i14 = e.f2107;
                    cArr2[i14] = (char) (cArr2[i14] - f2192);
                    e.f2107 = i14 + 1;
                }
                if (i12 > 0) {
                    e.f2109 = i12;
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr2, 0, cArr3, 0, i11);
                    int i15 = e.f2109;
                    System.arraycopy(cArr3, 0, cArr2, i11 - i15, i15);
                    int i16 = e.f2109;
                    System.arraycopy(cArr3, i16, cArr2, 0, i11 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    e.f2107 = 0;
                    while (true) {
                        int i17 = e.f2107;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i11 - i17) - 1];
                        e.f2107 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
