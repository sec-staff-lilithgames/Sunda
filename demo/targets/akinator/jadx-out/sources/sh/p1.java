package sh;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface p1 extends ExecutorService, AutoCloseable {
    @Override // java.util.concurrent.ExecutorService
    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException;

    @Override // java.util.concurrent.ExecutorService
    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException;

    @Override // java.util.concurrent.ExecutorService
    n1 submit(Runnable runnable);

    @Override // java.util.concurrent.ExecutorService
    <T> n1 submit(Runnable runnable, T t10);

    @Override // java.util.concurrent.ExecutorService
    <T> n1 submit(Callable<T> callable);

    @Override // java.util.concurrent.ExecutorService
    /* bridge */ /* synthetic */ default Future submit(Runnable runnable, Object obj) {
        return submit(runnable, (Runnable) obj);
    }
}
