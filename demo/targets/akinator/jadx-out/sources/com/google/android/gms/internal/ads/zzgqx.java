package com.google.android.gms.internal.ads;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgqx {
    public static Object[] zza(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            zzb(objArr[i11], i11);
        }
        return objArr;
    }

    public static Object zzb(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(o2.l(i10, "at index ", new StringBuilder(String.valueOf(i10).length() + 9)));
    }
}
