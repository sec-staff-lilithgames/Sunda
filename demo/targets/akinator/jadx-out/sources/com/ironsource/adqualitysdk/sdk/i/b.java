package com.ironsource.adqualitysdk.sdk.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b {
    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m1046(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length / 2; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = iArr[(iArr.length - i10) - 1];
            iArr[(iArr.length - i10) - 1] = i11;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m1047(int i10, int i11, boolean z10, int i12, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z10) {
            m1046(iArr);
        }
        int i13 = 0;
        while (i13 < i12) {
            int i14 = i10 ^ iArr[i13];
            int i15 = i11 ^ ((iArr2[2][(i14 >>> 8) & 255] ^ (iArr2[0][i14 >>> 24] + iArr2[1][(i14 >>> 16) & 255])) + iArr2[3][i14 & 255]);
            i13++;
            i11 = i14;
            i10 = i15;
        }
        int i16 = i10 ^ iArr[iArr.length - 2];
        int i17 = i11 ^ iArr[iArr.length - 1];
        if (!z10) {
            m1046(iArr);
        }
        iArr3[0] = i17;
        iArr3[1] = i16;
    }
}
