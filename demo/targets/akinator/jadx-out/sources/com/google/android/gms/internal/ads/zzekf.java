package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzekf {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzctr zzc;
    private final zzekv zzd;
    private final zzfnc zze;
    private final zzgvb zzf = zzgvb.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzekg zzh;
    private zzfgf zzi;

    public zzekf(Executor executor, ScheduledExecutorService scheduledExecutorService, zzctr zzctrVar, zzekv zzekvVar, zzfnc zzfncVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzctrVar;
        this.zzd = zzekvVar;
        this.zze = zzfncVar;
    }

    private final synchronized n1 zzd(zzffu zzffuVar) {
        Iterator it = zzffuVar.zza.iterator();
        while (it.hasNext()) {
            zzehk zzehkVarZza = this.zzc.zza(zzffuVar.zzb, (String) it.next());
            if (zzehkVarZza != null && zzehkVarZza.zza(this.zzi, zzffuVar)) {
                return zzgui.zzi(zzehkVarZza.zzb(this.zzi, zzffuVar), zzffuVar.zzR, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgui.zzc(new zzdzv(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zzb(zzffu zzffuVar) {
        n1 n1VarZzd = zzd(zzffuVar);
        this.zzd.zze(this.zzi, zzffuVar, n1VarZzd, this.zze);
        zzgui.zzr(n1VarZzd, new zzeke(this, zzffuVar), this.zza);
    }

    public final synchronized n1 zza(zzfgf zzfgfVar) {
        try {
            if (!this.zzg.getAndSet(true)) {
                List list = zzfgfVar.zzb.zza;
                if (list.isEmpty()) {
                    this.zzf.zzb(new zzekz(3, zzelc.zzb(zzfgfVar)));
                } else {
                    this.zzi = zzfgfVar;
                    zzekv zzekvVar = this.zzd;
                    this.zzh = new zzekg(zzfgfVar, zzekvVar, this.zzf);
                    zzekvVar.zzc(list);
                    zzffu zzffuVarZza = this.zzh.zza();
                    while (zzffuVarZza != null) {
                        zzb(zzffuVarZza);
                        zzffuVarZza = this.zzh.zza();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.zzf;
    }

    public final /* synthetic */ zzekg zzc() {
        return this.zzh;
    }
}
