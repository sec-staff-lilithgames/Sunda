package s8;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h implements ExecutorService, AutoCloseable {

    /* renamed from: c, reason: collision with root package name */
    public static final long f85502c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: e, reason: collision with root package name */
    public static volatile int f85503e;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadPoolExecutor f85504b;

    public h(ThreadPoolExecutor threadPoolExecutor) {
        this.f85504b = threadPoolExecutor;
    }

    public static int calculateBestThreadCount() {
        if (f85503e == 0) {
            f85503e = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return f85503e;
    }

    public static a newAnimationBuilder() {
        return new a(true).setThreadCount(calculateBestThreadCount() >= 4 ? 2 : 1).setName("animation");
    }

    public static h newAnimationExecutor() {
        return newAnimationBuilder().build();
    }

    public static a newDiskCacheBuilder() {
        return new a(true).setThreadCount(1).setName("disk-cache");
    }

    public static h newDiskCacheExecutor() {
        return newDiskCacheBuilder().build();
    }

    public static a newSourceBuilder() {
        return new a(false).setThreadCount(calculateBestThreadCount()).setName("source");
    }

    public static h newSourceExecutor() {
        return newSourceBuilder().build();
    }

    public static h newUnlimitedSourceExecutor() {
        return new h(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f85502c, TimeUnit.MILLISECONDS, new SynchronousQueue(), new e(new c(), "source-unlimited", g.f85501a, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f85504b.awaitTermination(j10, timeUnit);
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

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f85504b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f85504b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f85504b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f85504b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f85504b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f85504b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f85504b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f85504b.submit(runnable);
    }

    public String toString() {
        return this.f85504b.toString();
    }

    @Deprecated
    public static h newAnimationExecutor(int i10, g gVar) {
        return newAnimationBuilder().setThreadCount(i10).setUncaughtThrowableStrategy(gVar).build();
    }

    @Deprecated
    public static h newDiskCacheExecutor(g gVar) {
        return newDiskCacheBuilder().setUncaughtThrowableStrategy(gVar).build();
    }

    @Deprecated
    public static h newSourceExecutor(g gVar) {
        return newSourceBuilder().setUncaughtThrowableStrategy(gVar).build();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f85504b.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f85504b.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f85504b.submit(runnable, t10);
    }

    @Deprecated
    public static h newDiskCacheExecutor(int i10, String str, g gVar) {
        return newDiskCacheBuilder().setThreadCount(i10).setName(str).setUncaughtThrowableStrategy(gVar).build();
    }

    @Deprecated
    public static h newSourceExecutor(int i10, String str, g gVar) {
        return newSourceBuilder().setThreadCount(i10).setName(str).setUncaughtThrowableStrategy(gVar).build();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f85504b.submit(callable);
    }
}
