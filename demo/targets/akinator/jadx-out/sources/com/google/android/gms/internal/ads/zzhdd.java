package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhdd {
    public static void zza(long[] jArr, long[] jArr2, int i10) {
        for (int i11 = 0; i11 < 10; i11++) {
            int i12 = (int) jArr[i11];
            jArr[i11] = ((-i10) & (((int) jArr2[i11]) ^ i12)) ^ i12;
        }
    }
}
