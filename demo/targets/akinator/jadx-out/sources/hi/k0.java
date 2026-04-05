package hi;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class k0 {
    public static void a(String str, ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Runtime.getRuntime().addShutdownHook(new Thread(new j0(str, executorService), a.b.k("Crashlytics Shutdown Hook for ", str)));
    }

    public static Executor buildSequentialExecutor(Executor executor) {
        return ci.m.newSequentialExecutor(executor);
    }

    public static ExecutorService buildSingleThreadExecutorService(String str) {
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), getNamedThreadFactory(str), new ThreadPoolExecutor.DiscardPolicy()));
        a(str, executorServiceUnconfigurableExecutorService);
        return executorServiceUnconfigurableExecutorService;
    }

    public static ScheduledExecutorService buildSingleThreadScheduledExecutorService(String str) {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(getNamedThreadFactory(str));
        a(str, scheduledExecutorServiceNewSingleThreadScheduledExecutor);
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    public static ThreadFactory getNamedThreadFactory(String str) {
        return new i0(str, new AtomicLong(1L));
    }
}
