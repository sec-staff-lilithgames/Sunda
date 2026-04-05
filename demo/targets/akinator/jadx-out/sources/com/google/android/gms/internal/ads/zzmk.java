package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzmk {
    private final zzs zza;
    private final SparseArray zzb;

    public zzmk(zzs zzsVar, SparseArray sparseArray) {
        this.zza = zzsVar;
        SparseArray sparseArray2 = new SparseArray(zzsVar.zzb());
        for (int i10 = 0; i10 < zzsVar.zzb(); i10++) {
            int iZzc = zzsVar.zzc(i10);
            zzmj zzmjVar = (zzmj) sparseArray.get(iZzc);
            zzmjVar.getClass();
            sparseArray2.append(iZzc, zzmjVar);
        }
        this.zzb = sparseArray2;
    }

    public final zzmj zza(int i10) {
        zzmj zzmjVar = (zzmj) this.zzb.get(i10);
        zzmjVar.getClass();
        return zzmjVar;
    }

    public final boolean zzb(int i10) {
        return this.zza.zza(i10);
    }

    public final int zzc() {
        return this.zza.zzb();
    }

    public final int zzd(int i10) {
        return this.zza.zzc(i10);
    }
}
