package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdvi {
    private final zzdvn zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdvi(zzdvn zzdvnVar, Executor executor) {
        this.zza = zzdvnVar;
        this.zzc = zzdvnVar.zza();
        this.zzb = executor;
    }

    public final zzdvh zza() {
        zzdvh zzdvhVar = new zzdvh(this);
        zzdvhVar.zzl();
        return zzdvhVar;
    }

    public final void zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmE)).booleanValue()) {
            zzdvh zzdvhVarZza = zza();
            zzdvhVarZza.zzc("action", "pecr");
            zzdvhVarZza.zzd();
        }
    }

    public final /* synthetic */ zzdvn zzc() {
        return this.zza;
    }

    public final /* synthetic */ Executor zzd() {
        return this.zzb;
    }

    public final /* synthetic */ Map zze() {
        return this.zzc;
    }
}
