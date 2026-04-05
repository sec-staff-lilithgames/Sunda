package ak;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b implements a {
    @Override // ak.a
    public void executeOneOff(String str, String str2, d dVar, Runnable runnable) {
        new Thread(runnable, str2).start();
    }

    @Override // ak.a
    public ScheduledExecutorService newScheduledThreadPool(int i10, d dVar) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(i10));
    }

    @Override // ak.a
    public ExecutorService newSingleThreadExecutor(d dVar) {
        return newThreadPool(1, dVar);
    }

    @Override // ak.a
    public ExecutorService newThreadPool(d dVar) {
        return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    }

    @Override // ak.a
    public Future<?> submitOneOff(String str, String str2, d dVar, Runnable runnable) {
        FutureTask futureTask = new FutureTask(runnable, null);
        new Thread(futureTask, str2).start();
        return futureTask;
    }

    @Override // ak.a
    public ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory, d dVar) {
        return newThreadPool(1, threadFactory, dVar);
    }

    @Override // ak.a
    public ExecutorService newThreadPool(ThreadFactory threadFactory, d dVar) {
        return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(threadFactory));
    }

    @Override // ak.a
    public ScheduledExecutorService newScheduledThreadPool(int i10, ThreadFactory threadFactory, d dVar) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(i10, threadFactory));
    }

    @Override // ak.a
    public ExecutorService newThreadPool(int i10, d dVar) {
        return newThreadPool(i10, Executors.defaultThreadFactory(), dVar);
    }

    @Override // ak.a
    public ExecutorService newThreadPool(int i10, ThreadFactory threadFactory, d dVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
