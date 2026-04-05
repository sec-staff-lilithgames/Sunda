package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdqm implements zzguf {
    final /* synthetic */ zzffu zza;
    final /* synthetic */ zzffx zzb;
    final /* synthetic */ zzcpe zzc;
    final /* synthetic */ zzdqt zzd;

    public zzdqm(zzdqt zzdqtVar, zzffu zzffuVar, zzffx zzffxVar, zzcpe zzcpeVar) {
        this.zza = zzffuVar;
        this.zzb = zzffxVar;
        this.zzc = zzcpeVar;
        Objects.requireNonNull(zzdqtVar);
        this.zzd = zzdqtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcgy zzcgyVar = (zzcgy) obj;
        zzffu zzffuVar = this.zza;
        zzcgyVar.zzaD(zzffuVar, this.zzb);
        zzciw zzciwVarZzP = zzcgyVar.zzP();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlf)).booleanValue() && zzciwVarZzP != null) {
            zzcpe zzcpeVar = this.zzc;
            zzdqt zzdqtVar = this.zzd;
            zzciwVarZzP.zzd(zzcpeVar, zzdqtVar.zzm(), zzdqtVar.zzn());
            zzciwVarZzP.zze(zzcpeVar, zzdqtVar.zzm(), zzdqtVar.zzl());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzob)).booleanValue() || zzciwVarZzP == null) {
            return;
        }
        zzciwVarZzP.zzb(zzffuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
    }
}
