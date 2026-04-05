package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzs {
    private final SparseBooleanArray zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzs) {
            return this.zza.equals(((zzs) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final boolean zza(int i10) {
        return this.zza.get(i10);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final int zzc(int i10) {
        SparseBooleanArray sparseBooleanArray = this.zza;
        zzgmd.zzm(i10, sparseBooleanArray.size(), "index");
        return sparseBooleanArray.keyAt(i10);
    }
}
