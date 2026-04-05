package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class fm extends fi<String> {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2246 = 149;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2247 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2248;

    public fm(String str, Cdo cdo) {
        super(dy.m2458(str), cdo);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m2514(int i10, int i11, String str, int i12, boolean z10) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f2246);
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

    @Override // com.ironsource.adqualitysdk.sdk.i.fi
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2514(183 - Color.alpha(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0000", -TextUtils.indexOf((CharSequence) "", '0'), false).intern());
        sb2.append(super.toString());
        String strI = com.google.android.gms.internal.play_billing.a.i(m2514(TextUtils.indexOf("", "") + 183, 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0000", 1 - Color.red(0), false), sb2);
        int i10 = f2247 + 9;
        f2248 = i10 % 128;
        if (i10 % 2 == 0) {
            return strI;
        }
        throw null;
    }
}
