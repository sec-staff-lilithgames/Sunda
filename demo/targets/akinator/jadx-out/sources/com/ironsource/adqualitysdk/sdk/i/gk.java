package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.ironsource.adqualitysdk.sdk.i.ja;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class gk {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2362 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2363 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f2364 = {-488189151, 862013811, -1356092223, -2000759684, -557259937, 277078035, -1559089447, -269331505, -455314635, -99922519, -1033203497, -2127591108, -641179185, -330969738, 1867937624, -632430638, -1315236123, 1561693569};

    /* renamed from: ﻐ */
    public abstract String mo2524();

    /* renamed from: ﻛ */
    public abstract Class mo2525();

    /* renamed from: ｋ, reason: contains not printable characters */
    public final ja.d m2546() {
        f2363 = (f2362 + 39) % 128;
        if (!aq.m814().mo827().m812()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2545(new int[]{-613240978, 2139210726, 1287102905, -1912709791, -2104033295, -446635869}, 11 - Color.argb(0, 0, 0, 0)).intern());
            sb2.append(mo2524());
            return new ja.d(sb2.toString(), m2545(new int[]{-423878329, -1777612289}, View.MeasureSpec.getMode(0) + 3).intern());
        }
        String strM811 = aq.m814().mo827().m811(mo2524());
        if (!TextUtils.isEmpty(strM811)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m2545(new int[]{-613240978, 2139210726, 1287102905, -1912709791, -2104033295, -446635869}, 11 - (KeyEvent.getMaxKeyCode() >> 16)).intern());
            sb3.append(mo2524());
            return new ja.e(sb3.toString(), m2545(new int[]{-423878329, -1777612289}, TextUtils.getCapsMode("", 0, 0) + 3).intern(), strM811);
        }
        int i10 = f2362 + 53;
        f2363 = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public abstract bg mo2526();

    /* renamed from: ﾒ */
    public abstract String mo2527();

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2545(int[] iArr, int i10) {
        String str;
        synchronized (d.f1845) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2364.clone();
                d.f1846 = 0;
                while (true) {
                    int i11 = d.f1846;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        d.f1844 = (c10 << 16) + c11;
                        d.f1847 = (c12 << 16) + c13;
                        d.m2179(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = d.f1844 ^ iArr2[i13];
                            d.f1844 = i14;
                            int iM2178 = d.m2178(i14) ^ d.f1847;
                            int i15 = d.f1844;
                            d.f1844 = iM2178;
                            d.f1847 = i15;
                        }
                        int i16 = d.f1844;
                        int i17 = d.f1847;
                        d.f1844 = i17;
                        d.f1847 = i16;
                        int i18 = i16 ^ iArr2[16];
                        d.f1847 = i18;
                        int i19 = i17 ^ iArr2[17];
                        d.f1844 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        d.m2179(iArr2);
                        int i20 = d.f1846;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        d.f1846 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
