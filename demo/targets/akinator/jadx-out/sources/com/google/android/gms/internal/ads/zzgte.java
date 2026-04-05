package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzgte extends AbstractExecutorService implements zzgus, AutoCloseable {
    @Override // com.google.android.gms.internal.ads.zzgus, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
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

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzgvh.zze(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgus
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (n1) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgus
    /* renamed from: zza */
    public final n1 submit(Runnable runnable) {
        return (n1) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgus
    /* renamed from: zzb */
    public final n1 submit(Runnable runnable, Object obj) {
        return (n1) super.submit(runnable, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgus
    /* renamed from: zzc */
    public final n1 submit(Callable callable) {
        return (n1) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzgvh(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgus
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (n1) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgus
    public final /* synthetic */ Future submit(Callable callable) {
        return (n1) super.submit(callable);
    }
}
