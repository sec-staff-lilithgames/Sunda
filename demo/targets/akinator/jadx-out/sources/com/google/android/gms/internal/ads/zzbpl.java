package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbpl implements zzccc {
    final /* synthetic */ zzbqa zza;
    final /* synthetic */ zzflc zzb;
    final /* synthetic */ zzbqb zzc;

    public zzbpl(zzbqb zzbqbVar, zzbqa zzbqaVar, zzflc zzflcVar) {
        this.zza = zzbqaVar;
        this.zzb = zzflcVar;
        Objects.requireNonNull(zzbqbVar);
        this.zzc = zzbqbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        zzbqb zzbqbVar = this.zzc;
        synchronized (zzbqbVar.zzf()) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
                zzbqbVar.zzk(1);
                com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
                this.zza.zzc();
                if (((Boolean) zzbgn.zzd.zze()).booleanValue() && zzbqbVar.zzg() != null) {
                    zzflp zzflpVarZzg = zzbqbVar.zzg();
                    zzflc zzflcVar = this.zzb;
                    zzflcVar.zzk("Failed loading new engine");
                    zzflcVar.zzd(false);
                    zzflpVarZzg.zzb(zzflcVar.zzm());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}
