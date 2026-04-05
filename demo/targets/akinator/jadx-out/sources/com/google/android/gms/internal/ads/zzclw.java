package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzclw implements zzedb {
    final zzifq zza;
    final zzifq zzb;
    private final zzckz zzc;
    private final zzclw zzd = this;

    public zzclw(zzckz zzckzVar, Context context) {
        this.zzc = zzckzVar;
        zzeej zzeejVarZzc = zzeej.zzc(zzckzVar.zzaw);
        this.zza = zzeejVarZzc;
        this.zzb = zzeeb.zza(zzckzVar.zzf, zzfjn.zza(), zzckt.zza, zzckzVar.zzav, zzeejVarZzc, zzckzVar.zzax, zzckq.zza, zzckzVar.zzC);
    }

    @Override // com.google.android.gms.internal.ads.zzedb
    public final zzedf zza() {
        zzckz zzckzVar = this.zzc;
        zzifq zzifqVar = zzckzVar.zzl;
        zzcjp zzcjpVarZzI = zzckzVar.zzI();
        return zzedg.zza(zzcjv.zzd(zzckzVar.zzI()), zzfjt.zzc(), zzfjn.zzc(), zzifg.zzc(this.zzb), zzckk.zzd(zzcjpVarZzI), this, (zzdvi) zzifqVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzedb
    public final zzedh zzb() {
        return new zzclx(this.zzc, this.zzd, null);
    }
}
