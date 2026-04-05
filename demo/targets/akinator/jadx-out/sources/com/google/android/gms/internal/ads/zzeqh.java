package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeqh implements zzeya {
    private final n1 zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzeqh(n1 n1Var, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = n1Var;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        n1 n1Var = this.zza;
        zzeqg zzeqgVar = zzeqg.zza;
        Executor executor = this.zzb;
        n1 n1VarZzj = zzgui.zzj(n1Var, zzeqgVar, executor);
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzny)).intValue() > 0) {
            n1VarZzj = zzgui.zzi(n1VarZzj, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(r1)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgui.zzh(n1VarZzj, Throwable.class, zzeqf.zza, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 6;
    }
}
