package com.google.android.gms.internal.common;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
class zzae extends zzaf {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzae(int i10) {
    }

    public final zzae zza(Object obj) {
        int i10;
        obj.getClass();
        int length = this.zza.length;
        int i11 = this.zzb;
        int i12 = i11 + 1;
        if (i12 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i12 <= length) {
            i10 = length;
        } else {
            i10 = (length >> 1) + length + 1;
            if (i10 < i12) {
                int iHighestOneBit = Integer.highestOneBit(i11);
                i10 = iHighestOneBit + iHighestOneBit;
            }
            if (i10 < 0) {
                i10 = Integer.MAX_VALUE;
            }
        }
        if (i10 > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, i10);
            this.zzc = false;
        }
        Object[] objArr = this.zza;
        int i13 = this.zzb;
        this.zzb = i13 + 1;
        objArr[i13] = obj;
        return this;
    }
}
