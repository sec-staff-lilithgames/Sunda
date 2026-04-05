package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdqo {
    private final zzcym zza;
    private final zzczv zzb;
    private final zzdai zzc;
    private final zzdaz zzd;
    private final zzdds zze;
    private final zzffu zzf;
    private final zzffx zzg;
    private final zzcpe zzh;

    public zzdqo(zzcym zzcymVar, zzczv zzczvVar, zzdai zzdaiVar, zzdaz zzdazVar, zzdds zzddsVar, zzffu zzffuVar, zzffx zzffxVar, zzcpe zzcpeVar) {
        this.zza = zzcymVar;
        this.zzb = zzczvVar;
        this.zzc = zzdaiVar;
        this.zzd = zzdazVar;
        this.zze = zzddsVar;
        this.zzf = zzffuVar;
        this.zzg = zzffxVar;
        this.zzh = zzcpeVar;
    }

    public final void zza(zzdqt zzdqtVar) {
        final zzczv zzczvVar = this.zzb;
        zzdqh zzdqhVarZzk = zzdqtVar.zzk();
        Objects.requireNonNull(zzczvVar);
        zzdqhVarZzk.zzm(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdqn
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final /* synthetic */ void zzl() {
                zzczvVar.zzb();
            }
        });
        zzdqtVar.zzg(this.zzf, this.zzg, this.zzh);
    }
}
