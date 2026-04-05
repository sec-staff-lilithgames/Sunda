package sh;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface q1 extends ScheduledExecutorService, p1, AutoCloseable {
    @Override // java.util.concurrent.ExecutorService, sh.p1
    /* synthetic */ List invokeAll(Collection collection) throws InterruptedException;

    @Override // java.util.concurrent.ExecutorService, sh.p1
    /* synthetic */ List invokeAll(Collection collection, long j10, TimeUnit timeUnit) throws InterruptedException;

    @Override // java.util.concurrent.ScheduledExecutorService
    /* bridge */ /* synthetic */ default ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return ((v1) this).schedule(runnable, j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    o1 schedule(Runnable runnable, long j10, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    <V> o1 schedule(Callable<V> callable, long j10, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* bridge */ /* synthetic */ default ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return ((v1) this).scheduleAtFixedRate(runnable, j10, j11, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    o1 scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* bridge */ /* synthetic */ default ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return ((v1) this).scheduleWithFixedDelay(runnable, j10, j11, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    o1 scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit);

    @Override // java.util.concurrent.ExecutorService, sh.p1
    /* bridge */ /* synthetic */ default Future submit(Runnable runnable) {
        return super.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService, sh.p1
    /* synthetic */ n1 submit(Runnable runnable);

    @Override // java.util.concurrent.ExecutorService, sh.p1
    /* synthetic */ n1 submit(Runnable runnable, Object obj);

    @Override // java.util.concurrent.ExecutorService, sh.p1
    /* synthetic */ n1 submit(Callable callable);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* bridge */ /* synthetic */ default ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        return ((v1) this).schedule(callable, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService, sh.p1
    /* bridge */ /* synthetic */ default Future submit(Runnable runnable, Object obj) {
        return super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService, sh.p1
    /* bridge */ /* synthetic */ default Future submit(Callable callable) {
        return super.submit(callable);
    }
}
