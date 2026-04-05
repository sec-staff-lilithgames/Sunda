package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ew extends eo {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2200 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2201 = 110;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2202 = 1;

    public ew(ee eeVar, ee eeVar2, Cdo cdo) {
        super(eeVar, eeVar2, cdo);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2501(int i10, int i11, String str, int i12, boolean z10) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f2201);
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

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* renamed from: ﻛ */
    public final String mo2479() {
        int i10 = f2202 + 91;
        f2200 = i10 % 128;
        return (i10 % 2 != 0 ? m2501(12600 << ((byte) KeyEvent.getModifierMetaStateMask()), ViewConfiguration.getScrollBarFadeDuration() * 109, "\u0000", -TextUtils.lastIndexOf("", 'Q', 0, 1), false) : m2501(169 - ((byte) KeyEvent.getModifierMetaStateMask()), 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0000", -TextUtils.lastIndexOf("", '0', 0, 0), true)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* renamed from: ｋ */
    public final boolean mo2489(int i10) {
        if (i10 < 0) {
            f2200 = (f2202 + 43) % 128;
            return true;
        }
        f2200 = (f2202 + 45) % 128;
        return false;
    }
}
