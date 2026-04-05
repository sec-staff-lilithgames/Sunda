package com.google.android.gms.internal.ads;

import bp.oM.DwaEpyvxz;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbph implements zzblx {
    final /* synthetic */ zzbow zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzbv zzb;
    final /* synthetic */ zzbqb zzc;

    public zzbph(zzbqb zzbqbVar, zzaxa zzaxaVar, zzbow zzbowVar, com.google.android.gms.ads.internal.util.zzbv zzbvVar) {
        this.zza = zzbowVar;
        this.zzb = zzbvVar;
        Objects.requireNonNull(zzbqbVar);
        this.zzc = zzbqbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        zzbqb zzbqbVar = this.zzc;
        synchronized (zzbqbVar.zzf()) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
                com.google.android.gms.ads.internal.util.client.zzo.zzh(DwaEpyvxz.BxQu);
                if (zzbqbVar.zzj() == 0) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Starting reload.");
                    zzbqbVar.zzk(2);
                    zzbqbVar.zza(null);
                }
                this.zza.zzn("/requestReload", (zzblx) this.zzb.zza());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
