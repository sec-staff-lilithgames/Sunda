package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzr {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzr zza(int i10) {
        zzgmd.zzh(!this.zzb);
        this.zza.append(i10, true);
        return this;
    }

    public final zzs zzb() {
        zzgmd.zzh(!this.zzb);
        this.zzb = true;
        return new zzs(this.zza, null);
    }
}
