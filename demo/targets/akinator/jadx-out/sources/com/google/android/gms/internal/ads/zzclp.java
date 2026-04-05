package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzclp implements zzdxa {
    final zzifq zza;
    final zzifq zzb;
    final zzifq zzc;
    final zzifq zzd;
    private final Context zze;
    private final zzbmx zzf;
    private final zzckz zzg;
    private final zzclp zzh = this;

    public zzclp(zzckz zzckzVar, Context context, zzbmx zzbmxVar) {
        this.zzg = zzckzVar;
        this.zze = context;
        this.zzf = zzbmxVar;
        zzifh zzifhVarZza = zzifi.zza(this);
        this.zza = zzifhVarZza;
        zzifh zzifhVarZza2 = zzifi.zza(zzbmxVar);
        this.zzb = zzifhVarZza2;
        zzdww zzdwwVarZzc = zzdww.zzc(zzifhVarZza2);
        this.zzc = zzdwwVarZzc;
        this.zzd = zzifg.zza(zzdwy.zza(zzifhVarZza, zzdwwVarZzc));
    }

    public final zzdwv zza() {
        return zzdww.zzd(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final zzdwx zzb() {
        return (zzdwx) this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final zzdws zzc() {
        return new zzclm(this.zzg, this.zzh, null);
    }

    public final /* synthetic */ Context zzd() {
        return this.zze;
    }
}
