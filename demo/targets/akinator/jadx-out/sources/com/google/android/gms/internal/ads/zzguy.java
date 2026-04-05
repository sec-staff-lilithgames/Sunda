package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzguy extends zzguu implements zzgut {
    final ScheduledExecutorService zza;

    public zzguy(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgut, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzd */
    public final zzgur schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzgvh zzgvhVarZze = zzgvh.zze(runnable, null);
        return new zzguw(zzgvhVarZze, scheduledExecutorService.schedule(zzgvhVarZze, j10, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgut, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zze */
    public final zzgur schedule(Callable callable, long j10, TimeUnit timeUnit) {
        zzgvh zzgvhVar = new zzgvh(callable);
        return new zzguw(zzgvhVar, this.zza.schedule(zzgvhVar, j10, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgut, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzf */
    public final zzgur scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        zzgux zzguxVar = new zzgux(runnable);
        return new zzguw(zzguxVar, this.zza.scheduleAtFixedRate(zzguxVar, j10, j11, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgut, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzg */
    public final zzgur scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        zzgux zzguxVar = new zzgux(runnable);
        return new zzguw(zzguxVar, this.zza.scheduleWithFixedDelay(zzguxVar, j10, j11, timeUnit));
    }
}
