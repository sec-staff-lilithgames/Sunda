package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdqy {
    private final zzcym zza;
    private final zzczv zzb;
    private final zzdai zzc;
    private final zzdaz zzd;
    private final zzdds zze;
    private final zzdgt zzf;
    private final zzdvi zzg;
    private final zzfng zzh;
    private final zzefy zzi;
    private final zzcpe zzj;

    public zzdqy(zzcym zzcymVar, zzczv zzczvVar, zzdai zzdaiVar, zzdaz zzdazVar, zzdds zzddsVar, zzdgt zzdgtVar, zzdvi zzdviVar, zzfng zzfngVar, zzefy zzefyVar, zzcpe zzcpeVar) {
        this.zza = zzcymVar;
        this.zzb = zzczvVar;
        this.zzc = zzdaiVar;
        this.zzd = zzdazVar;
        this.zze = zzddsVar;
        this.zzf = zzdgtVar;
        this.zzg = zzdviVar;
        this.zzh = zzfngVar;
        this.zzi = zzefyVar;
        this.zzj = zzcpeVar;
    }

    public final void zza(zzdqz zzdqzVar, zzcgy zzcgyVar) throws Throwable {
        zzdqw zzdqwVarZzb = zzdqzVar.zzb();
        final zzczv zzczvVar = this.zzb;
        Objects.requireNonNull(zzczvVar);
        zzdqwVarZzb.zzn(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdqx
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final /* synthetic */ void zzl() {
                zzczvVar.zzb();
            }
        }, this.zzf);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlh)).booleanValue() || zzcgyVar == null || zzcgyVar.zzP() == null) {
            return;
        }
        zzciw zzciwVarZzP = zzcgyVar.zzP();
        zzcpe zzcpeVar = this.zzj;
        zzefy zzefyVar = this.zzi;
        zzciwVarZzP.zzd(zzcpeVar, zzefyVar, this.zzh);
        zzciwVarZzP.zze(zzcpeVar, zzefyVar, this.zzg);
    }
}
