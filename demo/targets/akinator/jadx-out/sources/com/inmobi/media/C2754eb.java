package com.inmobi.media;

import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.eb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2754eb extends ThreadPoolExecutor implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f32819a = 0;

    public C2754eb(TimeUnit timeUnit, PriorityBlockingQueue priorityBlockingQueue, Q5 q52) {
        super(1, 1, 0L, timeUnit, priorityBlockingQueue, q52);
    }

    @Override // java.lang.AutoCloseable
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
    public final RunnableFuture newTaskFor(Callable callable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callable, "callable");
        return (RunnableFuture) callable;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        return (RunnableFuture) runnable;
    }
}
