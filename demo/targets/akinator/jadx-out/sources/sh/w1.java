package sh;

import com.applovin.impl.f9;
import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import j$.time.Duration;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class w1 {
    public static void a(ThreadPoolExecutor threadPoolExecutor) {
        threadPoolExecutor.setThreadFactory(new c2().setDaemon(true).setThreadFactory(threadPoolExecutor.getThreadFactory()).build());
    }

    public static void addDelayedShutdownHook(ExecutorService executorService, Duration duration) {
        addDelayedShutdownHook(executorService, kc.p.U(duration), TimeUnit.NANOSECONDS);
    }

    public static Executor b(final Executor executor, final o0 o0Var) {
        mh.p1.checkNotNull(executor);
        mh.p1.checkNotNull(o0Var);
        return executor == directExecutor() ? executor : new Executor() { // from class: sh.r1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e10) {
                    o0Var.setException(e10);
                }
            }
        };
    }

    public static Executor directExecutor() {
        return l0.f85835b;
    }

    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor, Duration duration) {
        return getExitingExecutorService(threadPoolExecutor, kc.p.U(duration), TimeUnit.NANOSECONDS);
    }

    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, Duration duration) {
        return getExitingScheduledExecutorService(scheduledThreadPoolExecutor, kc.p.U(duration), TimeUnit.NANOSECONDS);
    }

    public static p1 listeningDecorator(ExecutorService executorService) {
        return executorService instanceof p1 ? (p1) executorService : executorService instanceof ScheduledExecutorService ? new v1((ScheduledExecutorService) executorService) : new s1(executorService);
    }

    public static p1 newDirectExecutorService() {
        return new m0();
    }

    public static Executor newSequentialExecutor(Executor executor) {
        return new z1(executor);
    }

    public static boolean shutdownAndAwaitTermination(ExecutorService executorService, Duration duration) {
        return shutdownAndAwaitTermination(executorService, kc.p.U(duration), TimeUnit.NANOSECONDS);
    }

    public static void addDelayedShutdownHook(ExecutorService executorService, long j10, TimeUnit timeUnit) {
        mh.p1.checkNotNull(executorService);
        mh.p1.checkNotNull(timeUnit);
        String str = "DelayedShutdownHook-for-" + executorService;
        f9 f9Var = new f9(executorService, j10, timeUnit, 6);
        mh.p1.checkNotNull(str);
        mh.p1.checkNotNull(f9Var);
        Thread threadNewThread = platformThreadFactory().newThread(f9Var);
        Objects.requireNonNull(threadNewThread);
        try {
            threadNewThread.setName(str);
        } catch (SecurityException unused) {
        }
        Runtime.getRuntime().addShutdownHook(threadNewThread);
    }

    public static ThreadFactory platformThreadFactory() throws Throwable {
        if (System.getProperty("com.google.appengine.runtime.environment") != null) {
            try {
                Class.forName("com.google.appengine.api.utils.SystemProperty");
                if (Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", null).invoke(null, null) != null) {
                    try {
                        return (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod(NyKZx.xmdFtbeqYpjiZ, null).invoke(null, null);
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException e10) {
                        throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e10);
                    } catch (InvocationTargetException e11) {
                        throw e11.getCause();
                    }
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return Executors.defaultThreadFactory();
    }

    public static boolean shutdownAndAwaitTermination(ExecutorService executorService, long j10, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j10) / 2;
        executorService.shutdown();
        try {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (!executorService.awaitTermination(nanos, timeUnit2)) {
                executorService.shutdownNow();
                executorService.awaitTermination(nanos, timeUnit2);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            executorService.shutdownNow();
        }
        return executorService.isTerminated();
    }

    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor, long j10, TimeUnit timeUnit) {
        a(threadPoolExecutor);
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
        mh.p1.checkNotNull(threadPoolExecutor);
        mh.p1.checkNotNull(timeUnit);
        String str = "DelayedShutdownHook-for-" + threadPoolExecutor;
        f9 f9Var = new f9(threadPoolExecutor, j10, timeUnit, 6);
        mh.p1.checkNotNull(str);
        mh.p1.checkNotNull(f9Var);
        Thread threadNewThread = platformThreadFactory().newThread(f9Var);
        Objects.requireNonNull(threadNewThread);
        try {
            threadNewThread.setName(str);
        } catch (SecurityException unused) {
        }
        Runtime.getRuntime().addShutdownHook(threadNewThread);
        return executorServiceUnconfigurableExecutorService;
    }

    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j10, TimeUnit timeUnit) {
        a(scheduledThreadPoolExecutor);
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(scheduledThreadPoolExecutor);
        mh.p1.checkNotNull(scheduledThreadPoolExecutor);
        mh.p1.checkNotNull(timeUnit);
        String str = "DelayedShutdownHook-for-" + scheduledThreadPoolExecutor;
        f9 f9Var = new f9(scheduledThreadPoolExecutor, j10, timeUnit, 6);
        mh.p1.checkNotNull(str);
        mh.p1.checkNotNull(f9Var);
        Thread threadNewThread = platformThreadFactory().newThread(f9Var);
        Objects.requireNonNull(threadNewThread);
        try {
            threadNewThread.setName(str);
        } catch (SecurityException unused) {
        }
        Runtime.getRuntime().addShutdownHook(threadNewThread);
        return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static q1 listeningDecorator(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService instanceof q1) {
            return (q1) scheduledExecutorService;
        }
        return new v1(scheduledExecutorService);
    }

    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a(threadPoolExecutor);
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
        mh.p1.checkNotNull(threadPoolExecutor);
        mh.p1.checkNotNull(timeUnit);
        String str = "DelayedShutdownHook-for-" + threadPoolExecutor;
        f9 f9Var = new f9(threadPoolExecutor, 120L, timeUnit, 6);
        mh.p1.checkNotNull(str);
        mh.p1.checkNotNull(f9Var);
        Thread threadNewThread = platformThreadFactory().newThread(f9Var);
        Objects.requireNonNull(threadNewThread);
        try {
            threadNewThread.setName(str);
        } catch (SecurityException unused) {
        }
        Runtime.getRuntime().addShutdownHook(threadNewThread);
        return executorServiceUnconfigurableExecutorService;
    }

    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a(scheduledThreadPoolExecutor);
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(scheduledThreadPoolExecutor);
        mh.p1.checkNotNull(scheduledThreadPoolExecutor);
        mh.p1.checkNotNull(timeUnit);
        String str = "DelayedShutdownHook-for-" + scheduledThreadPoolExecutor;
        f9 f9Var = new f9(scheduledThreadPoolExecutor, 120L, timeUnit, 6);
        mh.p1.checkNotNull(str);
        mh.p1.checkNotNull(f9Var);
        Thread threadNewThread = platformThreadFactory().newThread(f9Var);
        Objects.requireNonNull(threadNewThread);
        try {
            threadNewThread.setName(str);
        } catch (SecurityException unused) {
        }
        Runtime.getRuntime().addShutdownHook(threadNewThread);
        return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }
}
