package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdqr implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final Context zzb;
    private final zzdvi zzc;
    private final zzefy zzd;
    private final Executor zze;
    private final zzaxa zzf;
    private final VersionInfoParcel zzg;
    private final zzfng zzh;
    private final zzegj zzi;
    private final zzfgr zzj;

    public zzdqr(Context context, Executor executor, zzaxa zzaxaVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzcho zzchoVar, zzefy zzefyVar, zzfng zzfngVar, zzdvi zzdviVar, zzegj zzegjVar, zzfgr zzfgrVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzaxaVar;
        this.zzg = versionInfoParcel;
        this.zza = zzaVar;
        this.zzd = zzefyVar;
        this.zzh = zzfngVar;
        this.zzc = zzdviVar;
        this.zzi = zzegjVar;
        this.zzj = zzfgrVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdqt zzdqtVar = new zzdqt(this);
        zzdqtVar.zza();
        return zzdqtVar;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.zza zza() {
        return this.zza;
    }

    public final /* synthetic */ Context zzb() {
        return this.zzb;
    }

    public final /* synthetic */ zzdvi zzc() {
        return this.zzc;
    }

    public final /* synthetic */ zzefy zzd() {
        return this.zzd;
    }

    public final /* synthetic */ Executor zze() {
        return this.zze;
    }

    public final /* synthetic */ zzaxa zzf() {
        return this.zzf;
    }

    public final /* synthetic */ VersionInfoParcel zzg() {
        return this.zzg;
    }

    public final /* synthetic */ zzfng zzh() {
        return this.zzh;
    }

    public final /* synthetic */ zzegj zzi() {
        return this.zzi;
    }

    public final /* synthetic */ zzfgr zzj() {
        return this.zzj;
    }
}
