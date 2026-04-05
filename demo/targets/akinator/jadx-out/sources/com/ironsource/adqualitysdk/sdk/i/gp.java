package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.my.target.common.MyTargetManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class gp extends gk {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2386 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2387 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2388 = 174;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2552(int i10, int i11, String str, int i12, boolean z10) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f2388);
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

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        int i10 = f2386 + 71;
        f2387 = i10 % 128;
        int i11 = i10 % 2;
        long zoomControlsTimeout = ViewConfiguration.getZoomControlsTimeout();
        return (i11 != 0 ? m2552(17744 / (zoomControlsTimeout > 1L ? 1 : (zoomControlsTimeout == 1L ? 0 : -1)), 92 % (ViewConfiguration.getScrollDefaultDelay() * 65), "\u0005\ufff4\u0007\f\u0000\u0007\ufff8\ufffa", 4 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), false) : m2552((zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) + 282, 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0005\ufff4\u0007\f\u0000\u0007\ufff8\ufffa", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4, true)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        int i10 = f2387;
        f2386 = (i10 + 67) % 128;
        f2386 = (i10 + 55) % 128;
        return MyTargetManager.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        bx bxVar = new bx(mo2524());
        int i10 = f2387 + 13;
        f2386 = i10 % 128;
        if (i10 % 2 != 0) {
            return bxVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        int i10 = f2387 + 99;
        f2386 = i10 % 128;
        return (i10 % 2 == 0 ? m2552(21293 >>> TextUtils.getOffsetBefore("", 0), 126 / (ViewConfiguration.getMaximumDrawingCacheSize() / 27), "\u0010\uffff\u0012ￌ\u0017\u000bￌ\u000b\r\u0001\u0010\u0003\u0005\uffff\f\uffff￫\u0012\u0003\u0005\u0010\uffff\ufff2\u0017￫ￌ\f\r\u000b\u000b\r\u0001ￌ\u0012\u0003\u0005", 85 << TextUtils.indexOf("", ""), true) : m2552(272 - TextUtils.getOffsetBefore("", 0), 36 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0010\uffff\u0012ￌ\u0017\u000bￌ\u000b\r\u0001\u0010\u0003\u0005\uffff\f\uffff￫\u0012\u0003\u0005\u0010\uffff\ufff2\u0017￫ￌ\f\r\u000b\u000b\r\u0001ￌ\u0012\u0003\u0005", TextUtils.indexOf("", "") + 10, true)).intern();
    }
}
