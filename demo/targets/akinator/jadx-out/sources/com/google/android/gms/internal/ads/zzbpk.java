package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbpk implements zzcce {
    final /* synthetic */ zzbqa zza;
    final /* synthetic */ zzflc zzb;
    final /* synthetic */ zzbqb zzc;

    public zzbpk(zzbqb zzbqbVar, zzbqa zzbqaVar, zzflc zzflcVar) {
        this.zza = zzbqaVar;
        this.zzb = zzflcVar;
        Objects.requireNonNull(zzbqbVar);
        this.zzc = zzbqbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcce
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        zzbqb zzbqbVar = this.zzc;
        synchronized (zzbqbVar.zzf()) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock acquired");
                zzbqbVar.zzk(0);
                if (zzbqbVar.zzh() != null && this.zza != zzbqbVar.zzh()) {
                    com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    zzbqbVar.zzh().zzc();
                }
                zzbqbVar.zzi(this.zza);
                if (((Boolean) zzbgn.zzd.zze()).booleanValue() && zzbqbVar.zzg() != null) {
                    zzflp zzflpVarZzg = zzbqbVar.zzg();
                    zzflc zzflcVar = this.zzb;
                    zzflcVar.zzd(true);
                    zzflpVarZzg.zzb(zzflcVar.zzm());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
