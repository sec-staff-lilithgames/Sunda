package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcus {
    private final zzebk zza;
    private final zzfgn zzb;
    private final zzfks zzc;
    private final zzcns zzd;
    private final zzelc zze;
    private final zzded zzf;
    private zzfgf zzg;
    private final zzecv zzh;
    private final zzcxs zzi;
    private final Executor zzj;
    private final zzecg zzk;
    private final zzehp zzl;

    public zzcus(zzebk zzebkVar, zzfgn zzfgnVar, zzfks zzfksVar, zzcns zzcnsVar, zzelc zzelcVar, zzded zzdedVar, zzfgf zzfgfVar, zzecv zzecvVar, zzcxs zzcxsVar, Executor executor, zzecg zzecgVar, zzehp zzehpVar) {
        this.zza = zzebkVar;
        this.zzb = zzfgnVar;
        this.zzc = zzfksVar;
        this.zzd = zzcnsVar;
        this.zze = zzelcVar;
        this.zzf = zzdedVar;
        this.zzg = zzfgfVar;
        this.zzh = zzecvVar;
        this.zzi = zzcxsVar;
        this.zzj = executor;
        this.zzk = zzecgVar;
        this.zzl = zzehpVar;
    }

    public final n1 zza(n1 n1Var) {
        if (this.zzg != null) {
            zzfks zzfksVar = this.zzc;
            zzfkm zzfkmVar = zzfkm.SERVER_TRANSACTION;
            Objects.requireNonNull(zzfksVar);
            return zzfkd.zza(zzgui.zza(this.zzg), zzfkmVar, zzfksVar).zzi();
        }
        com.google.android.gms.ads.internal.zzt.zzj().zzb();
        zzfkj zzfkjVarZza = this.zzc.zza(zzfkm.SERVER_TRANSACTION, n1Var);
        final zzecg zzecgVar = this.zzk;
        Objects.requireNonNull(zzecgVar);
        return zzfkjVarZza.zzc(new zzgtq() { // from class: com.google.android.gms.internal.ads.zzcur
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return zzecgVar.zza((zzbxj) obj);
            }
        }).zzi();
    }

    public final n1 zzb() {
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.zzb.zzd;
        if (zzmVar.zzx == null && zzmVar.zzs == null) {
            return zza(this.zzi.zzb());
        }
        zzfks zzfksVar = this.zzc;
        zzfkm zzfkmVar = zzfkm.PRELOADED_LOADER;
        Objects.requireNonNull(zzfksVar);
        return zzfkd.zza(this.zza.zza(), zzfkmVar, zzfksVar).zzi();
    }

    public final n1 zzc(n1 n1Var) {
        zzfkj zzfkjVarZzc = this.zzc.zza(zzfkm.RENDERER, n1Var).zzb(new zzfjx() { // from class: com.google.android.gms.internal.ads.zzcuq
            @Override // com.google.android.gms.internal.ads.zzfjx
            public final /* synthetic */ Object zza(Object obj) throws Exception {
                zzfgf zzfgfVar = (zzfgf) obj;
                this.zza.zzi(zzfgfVar);
                return zzfgfVar;
            }
        }).zzc(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgh)).booleanValue()) {
            zzfkjVarZzc = zzfkjVarZzc.zzh(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgi)).intValue(), TimeUnit.SECONDS);
        }
        return zzfkjVarZzc.zzi();
    }

    public final zzded zzd() {
        return this.zzf;
    }

    public final n1 zze(final zzfij zzfijVar) {
        zzfjz zzfjzVarZzi = this.zzc.zza(zzfkm.GET_CACHE_KEY, this.zzi.zzb()).zzc(new zzgtq() { // from class: com.google.android.gms.internal.ads.zzcup
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return this.zza.zzj(zzfijVar, (zzbxj) obj);
            }
        }).zzi();
        zzgui.zzr(zzfjzVarZzi, new zzcun(this), this.zzj);
        return zzfjzVarZzi;
    }

    public final n1 zzf(zzbxj zzbxjVar) {
        zzfjz zzfjzVarZzi = this.zzc.zza(zzfkm.NOTIFY_CACHE_HIT, this.zzh.zzb(zzbxjVar)).zzi();
        zzgui.zzr(zzfjzVarZzi, new zzcuo(this), this.zzj);
        return zzfjzVarZzi;
    }

    public final com.google.android.gms.ads.internal.client.zze zzg(Throwable th2) {
        return zzfhp.zzb(th2, this.zzl);
    }

    public final void zzh(zzfgf zzfgfVar) {
        this.zzg = zzfgfVar;
    }

    public final /* synthetic */ zzfgf zzi(zzfgf zzfgfVar) throws Exception {
        this.zzd.zza(zzfgfVar);
        return zzfgfVar;
    }

    public final /* synthetic */ n1 zzj(zzfij zzfijVar, zzbxj zzbxjVar) {
        zzbxjVar.zzi = zzfijVar;
        return this.zzh.zza(zzbxjVar);
    }

    public final /* synthetic */ zzded zzk() {
        return this.zzf;
    }
}
