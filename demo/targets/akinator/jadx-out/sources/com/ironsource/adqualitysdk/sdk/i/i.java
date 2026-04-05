package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final Object f2622 = new Object();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static int f2623;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static int f2624;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static char[] m2781(long j10, char[] cArr, int i10) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i11 = 0;
        int i12 = 4;
        for (int i13 = 0; i13 < cArr.length; i13++) {
            if ((((j10 >>> i13) & 1) != i10 || i11 >= 4) && i12 < length) {
                cArr2[i12] = cArr[i13];
                i12++;
            } else {
                cArr2[i11] = cArr[i13];
                i11++;
            }
        }
        return cArr2;
    }
}
