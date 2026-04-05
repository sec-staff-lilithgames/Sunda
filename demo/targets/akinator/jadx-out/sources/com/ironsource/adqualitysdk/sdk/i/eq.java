package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class eq extends eo {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2178 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2179 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int[] f2180 = {980937066, 952736164, -934187534, -25674437, -2124615155, 1758891346, -2124419732, -998120198, 1106418859, 1888617251, 277395995, -1517642692, -487582836, -486114820, -585199733, 229451787, 660950899, 2033930427};

    public eq(ee eeVar, ee eeVar2, Cdo cdo) {
        super(eeVar, eeVar2, cdo);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* renamed from: ﻛ */
    public final String mo2479() {
        f2178 = (f2179 + 3) % 128;
        String strIntern = m2495(new int[]{1707880034, 1690493711}, 1 - (ViewConfiguration.getScrollBarSize() >> 8)).intern();
        f2178 = (f2179 + 91) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* renamed from: ｋ */
    public final boolean mo2489(int i10) {
        int i11 = (f2179 + 51) % 128;
        f2178 = i11;
        if (i10 <= 0) {
            return false;
        }
        f2179 = (i11 + 87) % 128;
        return true;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2495(int[] iArr, int i10) {
        String str;
        synchronized (d.f1845) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2180.clone();
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
