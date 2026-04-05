package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static int f1844;

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final Object f1845 = new Object();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static int f1846;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static int f1847;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static int m2178(int i10) {
        int[][] iArr = a.f238.f240;
        return ((iArr[0][i10 >>> 24] + iArr[1][(i10 >>> 16) & 255]) ^ iArr[2][(i10 >>> 8) & 255]) + iArr[3][i10 & 255];
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m2179(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length / 2; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = iArr[(iArr.length - i10) - 1];
            iArr[(iArr.length - i10) - 1] = i11;
        }
    }
}
