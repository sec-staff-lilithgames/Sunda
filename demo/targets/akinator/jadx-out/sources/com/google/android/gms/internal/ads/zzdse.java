package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdse {
    private final Context zza;
    private final zzaxa zzb;
    private final zzbgb zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbdt zzf;
    private final zzdbp zzg;
    private final zzegj zzh;
    private final zzfgr zzi;
    private final zzdvi zzj;
    private final zzcix zzk;

    public zzdse(zzcho zzchoVar, Context context, zzaxa zzaxaVar, zzbgb zzbgbVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbdt zzbdtVar, zzdbp zzdbpVar, zzegj zzegjVar, zzfgr zzfgrVar, zzdvi zzdviVar, zzcix zzcixVar) {
        this.zza = context;
        this.zzb = zzaxaVar;
        this.zzc = zzbgbVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbdtVar;
        this.zzg = zzdbpVar;
        this.zzh = zzegjVar;
        this.zzi = zzfgrVar;
        this.zzj = zzdviVar;
        this.zzk = zzcixVar;
    }

    public final zzcgy zza(com.google.android.gms.ads.internal.client.zzr zzrVar, zzffu zzffuVar, zzffx zzffxVar) throws zzchn {
        zzcji zzcjiVarZza = zzcji.zza(zzrVar);
        String str = zzrVar.zza;
        zzdrt zzdrtVar = new zzdrt(this);
        zzaxa zzaxaVar = this.zzb;
        zzegj zzegjVar = this.zzh;
        zzcgy zzcgyVarZza = zzcho.zza(this.zza, zzcjiVarZza, str, false, false, zzaxaVar, this.zzc, this.zzd, null, zzdrtVar, this.zze, this.zzf, zzffuVar, zzffxVar, zzegjVar, this.zzi, this.zzj);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoP)).booleanValue()) {
            this.zzk.zza(zzcgyVarZza.zzD());
        }
        return zzcgyVarZza;
    }

    public final /* synthetic */ zzdbp zzb() {
        return this.zzg;
    }
}
