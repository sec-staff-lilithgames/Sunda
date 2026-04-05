package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbpg implements zzblx {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbqa zzb;
    final /* synthetic */ zzbow zzc;
    final /* synthetic */ zzbqb zzd;

    public zzbpg(zzbqb zzbqbVar, long j10, zzbqa zzbqaVar, zzbow zzbowVar) {
        this.zza = j10;
        this.zzb = zzbqaVar;
        this.zzc = zzbowVar;
        Objects.requireNonNull(zzbqbVar);
        this.zzd = zzbqbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 42);
        sb2.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb2.append(jCurrentTimeMillis);
        sb2.append(" ms.");
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        zzbqb zzbqbVar = this.zzd;
        synchronized (zzbqbVar.zzf()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            zzbqa zzbqaVar = this.zzb;
            if (zzbqaVar.zzi() != -1 && zzbqaVar.zzi() != 1) {
                zzbqbVar.zzk(0);
                zzbow zzbowVar = this.zzc;
                zzbowVar.zzm("/log", zzblw.zzg);
                zzbowVar.zzm("/result", zzblw.zzo);
                zzbqaVar.zzf(zzbowVar);
                zzbqbVar.zzi(zzbqaVar);
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
