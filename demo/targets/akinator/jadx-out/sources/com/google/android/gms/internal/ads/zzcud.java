package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcud {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final n1 zzc;
    private volatile boolean zzd = true;

    public zzcud(Executor executor, ScheduledExecutorService scheduledExecutorService, n1 n1Var) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = n1Var;
    }

    public final void zza(zzguf zzgufVar) {
        zzgui.zzr(this.zzc, new zzctx(this, zzgufVar), this.zza);
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final /* synthetic */ n1 zzc(zzguf zzgufVar, n1 n1Var, zzcto zzctoVar) {
        if (zzctoVar != null) {
            zzgufVar.zzb(zzctoVar);
        }
        return zzgui.zzi(n1Var, ((Long) zzbhi.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final /* synthetic */ void zze(List list, final zzguf zzgufVar) {
        if (list == null || list.isEmpty()) {
            this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgufVar.zza(new zzdzv(3));
                }
            });
            return;
        }
        n1 n1VarZza = zzgui.zza(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final n1 n1Var = (n1) it.next();
            zzgtq zzgtqVar = new zzgtq() { // from class: com.google.android.gms.internal.ads.zzctz
                @Override // com.google.android.gms.internal.ads.zzgtq
                public final /* synthetic */ n1 zza(Object obj) {
                    zzgufVar.zza((Throwable) obj);
                    return zzgui.zza(null);
                }
            };
            Executor executor = this.zza;
            n1VarZza = zzgui.zzj(zzgui.zzh(n1VarZza, Throwable.class, zzgtqVar, executor), new zzgtq() { // from class: com.google.android.gms.internal.ads.zzcua
                @Override // com.google.android.gms.internal.ads.zzgtq
                public final /* synthetic */ n1 zza(Object obj) {
                    return this.zza.zzc(zzgufVar, n1Var, (zzcto) obj);
                }
            }, executor);
        }
        zzgui.zzr(n1VarZza, new zzcty(this, zzgufVar), this.zza);
    }

    public final /* synthetic */ void zzf() {
        zzcbv.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcub
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd();
            }
        });
    }
}
