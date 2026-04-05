package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class fj extends fr {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2234 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int[] f2235 = {1381757024, 515208469, 975253045, -1059569956, -1791072698, 757905094, 1844761415, -2145139965, 613622000, -702716822, -116149158, 910095063, -1760979370, 180452743, 1516759432, -484896406, -591791176, 628013984};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2236;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2508(int[] iArr, int i10) {
        String str;
        synchronized (d.f1845) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2235.clone();
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

    public final String toString() {
        f2234 = (f2236 + 23) % 128;
        String strIntern = m2508(new int[]{955313793, -1785226786, -1644227813, 2026985309, 376173136, -1416315260}, View.MeasureSpec.getSize(0) + 9).intern();
        int i10 = f2234 + 27;
        f2236 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 75 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* renamed from: ﻐ, reason: contains not printable characters */
    public final du mo2509(ds dsVar, cp cpVar) {
        du duVar = new du(null);
        duVar.m2430();
        int i10 = f2236 + 9;
        f2234 = i10 % 128;
        if (i10 % 2 != 0) {
            return duVar;
        }
        throw null;
    }
}
