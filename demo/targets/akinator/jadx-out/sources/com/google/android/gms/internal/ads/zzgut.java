package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface zzgut extends ScheduledExecutorService, zzgus, AutoCloseable {
    @Override // com.google.android.gms.internal.ads.zzgus, java.lang.AutoCloseable
    /* synthetic */ default void close() throws InterruptedException {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z10 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z10) {
                    shutdownNow();
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    zzgur schedule(Runnable runnable, long j10, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    zzgur schedule(Callable callable, long j10, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    zzgur scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    zzgur scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit);
}
