package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzah extends zza {
    final zzdr zza;
    final zzdr zzb;
    final zzdr zzc;
    final zzdr zzd;
    final zzdr zze;
    final zzdr zzf;
    final zzdr zzg;
    final zzdr zzh;
    final zzdr zzi;
    final zzdr zzj;
    final zzdr zzk;
    final zzdr zzl;
    final zzdr zzm;
    private final zzah zzn = this;

    public zzah(Application application) {
        zzdo zzdoVarZzb = zzdp.zzb(application);
        this.zza = zzdoVarZzb;
        zzdr zzdrVarZzb = zzdn.zzb(new zzar(zzdoVarZzb));
        this.zzb = zzdrVarZzb;
        zzdr zzdrVarZzb2 = zzdn.zzb(zzae.zza);
        this.zzc = zzdrVarZzb2;
        zzag zzagVar = new zzag(this);
        this.zzd = zzagVar;
        zzav zzavVar = zzau.zza;
        zzdr zzdrVarZzb3 = zzdn.zzb(new zzbp(zzagVar, zzavVar));
        this.zze = zzdrVarZzb3;
        zzq zzqVar = new zzq(zzdoVarZzb, zzdrVarZzb);
        this.zzf = zzqVar;
        zzdr zzdrVarZzb4 = zzdn.zzb(new zzf(zzavVar));
        this.zzg = zzdrVarZzb4;
        zzdr zzdrVarZzb5 = zzdn.zzb(new zzan(zzdoVarZzb));
        this.zzh = zzdrVarZzb5;
        zzdr zzdrVarZzb6 = zzdn.zzb(new zzm(zzdoVarZzb, zzdrVarZzb5));
        this.zzi = zzdrVarZzb6;
        zzap zzapVar = new zzap(zzdoVarZzb, zzdrVarZzb, zzdrVarZzb6, zzavVar);
        this.zzj = zzapVar;
        zzac zzacVar = new zzac(zzdrVarZzb4, zzapVar, zzdrVarZzb);
        this.zzk = zzacVar;
        zzx zzxVar = new zzx(zzdoVarZzb, zzdrVarZzb2, zzas.zza, zzavVar, zzdrVarZzb, zzdrVarZzb3, zzqVar, zzacVar, zzdrVarZzb4);
        this.zzl = zzxVar;
        this.zzm = zzdn.zzb(new zzk(zzdrVarZzb, zzxVar, zzdrVarZzb3));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zza
    public final zzj zzb() {
        return (zzj) this.zzm.zza();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zza
    public final zzbo zzc() {
        return (zzbo) this.zze.zza();
    }
}
