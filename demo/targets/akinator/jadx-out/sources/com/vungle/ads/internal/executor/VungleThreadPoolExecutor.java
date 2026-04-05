package com.vungle.ads.internal.executor;

import com.google.firebase.messaging.m;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.internal.task.PriorityRunnable;
import com.vungle.ads.internal.util.Logger;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kv.a;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VungleThreadPoolExecutor extends ThreadPoolExecutor implements AutoCloseable {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "VungleThreadPool";
    private final NamedThreadFactory threadFactory;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> Callable<T> getWrappedCallableWithFallback(Callable<T> callable, a aVar) {
            return new m(1, callable, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: getWrappedCallableWithFallback$lambda-0, reason: not valid java name */
        public static final Object m3608getWrappedCallableWithFallback$lambda0(Callable command, a failFallback) {
            e0.checkNotNullParameter(command, "$command");
            e0.checkNotNullParameter(failFallback, "$failFallback");
            try {
                return command.call();
            } catch (OutOfMemoryError unused) {
                failFallback.invoke();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ComparableRunnable getWrappedRunnableWithFail(final Runnable runnable, final Runnable runnable2) {
            return runnable instanceof PriorityRunnable ? new PriorityRunnable() { // from class: com.vungle.ads.internal.executor.VungleThreadPoolExecutor$Companion$getWrappedRunnableWithFail$1
                @Override // com.vungle.ads.internal.task.PriorityRunnable, java.lang.Comparable
                public int compareTo(Object other) {
                    e0.checkNotNullParameter(other, "other");
                    if (!(other instanceof PriorityRunnable)) {
                        return 0;
                    }
                    return e0.compare(((PriorityRunnable) other).getPriority(), getPriority());
                }

                @Override // com.vungle.ads.internal.task.PriorityRunnable
                public int getPriority() {
                    return ((PriorityRunnable) runnable).getPriority();
                }

                @Override // java.lang.Runnable
                public void run() {
                    VungleThreadPoolExecutor.Companion.wrapRunnableWithFail(runnable, runnable2);
                }
            } : new ComparableRunnable() { // from class: com.vungle.ads.internal.executor.VungleThreadPoolExecutor$Companion$getWrappedRunnableWithFail$2
                @Override // java.lang.Comparable
                public int compareTo(Object other) {
                    e0.checkNotNullParameter(other, "other");
                    Runnable runnable3 = runnable;
                    if (runnable3 instanceof PriorityRunnable) {
                        return ((PriorityRunnable) runnable3).compareTo(other);
                    }
                    return 0;
                }

                @Override // java.lang.Runnable
                public void run() {
                    VungleThreadPoolExecutor.Companion.wrapRunnableWithFail(runnable, runnable2);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void wrapRunnableWithFail(Runnable runnable, Runnable runnable2) {
            try {
                runnable.run();
            } catch (OutOfMemoryError unused) {
                runnable2.run();
            }
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ComparableRunnable extends Comparable<Object>, Runnable {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.vungle.ads.internal.executor.VungleThreadPoolExecutor$submit$3, reason: invalid class name */
    public static final class AnonymousClass3 extends f0 implements a {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3609invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3609invoke() {
            new OutOfMemory("submit callable error in " + VungleThreadPoolExecutor.this.executorName()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    public VungleThreadPoolExecutor(int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, NamedThreadFactory namedThreadFactory) {
        super(i10, i11, j10, timeUnit, blockingQueue, namedThreadFactory);
        this.threadFactory = namedThreadFactory;
        allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: execute$lambda-0, reason: not valid java name */
    public static final void m3605execute$lambda0(VungleThreadPoolExecutor this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        new OutOfMemory("execute error in " + this$0.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String executorName() {
        String name;
        NamedThreadFactory namedThreadFactory = this.threadFactory;
        return (namedThreadFactory == null || (name = namedThreadFactory.getName()) == null) ? "VungleThreadPoolExecutor" : name;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submit$lambda-1, reason: not valid java name */
    public static final void m3606submit$lambda1(VungleThreadPoolExecutor this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        new OutOfMemory("submit error in " + this$0.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submit$lambda-2, reason: not valid java name */
    public static final void m3607submit$lambda2(VungleThreadPoolExecutor this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        new OutOfMemory("submit error with result in " + this$0.executorName()).logErrorNoReturnValue$vungle_ads_release();
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

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable command) {
        e0.checkNotNullParameter(command, "command");
        try {
            super.execute(Companion.getWrappedRunnableWithFail(command, new com.vungle.ads.a(this, 2)));
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "execute exception", e10);
        } catch (OutOfMemoryError e11) {
            String str = "execute error in " + executorName() + ": " + e11.getLocalizedMessage();
            Logger.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final NamedThreadFactory getThreadFactory() {
        return this.threadFactory;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable task) {
        e0.checkNotNullParameter(task, "task");
        try {
            Future<?> futureSubmit = super.submit(Companion.getWrappedRunnableWithFail(task, new com.vungle.ads.a(this, 3)));
            e0.checkNotNullExpressionValue(futureSubmit, "{\n            super.subm…\n            })\n        }");
            return futureSubmit;
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "submit exception", e10);
            return new FutureResult(null);
        } catch (OutOfMemoryError e11) {
            String str = "submit error in " + executorName() + ": " + e11.getLocalizedMessage();
            Logger.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            return new FutureResult(null);
        }
    }

    public final Future<?> submit$vungle_ads_release(Runnable task, Runnable fail) {
        e0.checkNotNullParameter(task, "task");
        e0.checkNotNullParameter(fail, "fail");
        try {
            Future<?> futureSubmit = super.submit(Companion.getWrappedRunnableWithFail(task, fail));
            e0.checkNotNullExpressionValue(futureSubmit, "{\n            super.subm…il(task, fail))\n        }");
            return futureSubmit;
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "submit exception with fail", e10);
            fail.run();
            return new FutureResult(null);
        } catch (OutOfMemoryError e11) {
            String str = "submit error with fail in " + executorName() + ": " + e11.getLocalizedMessage();
            Logger.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            fail.run();
            return new FutureResult(null);
        }
    }

    public final void execute(Runnable command, Runnable fail) {
        e0.checkNotNullParameter(command, "command");
        e0.checkNotNullParameter(fail, "fail");
        try {
            super.execute(Companion.getWrappedRunnableWithFail(command, fail));
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "execute exception with fail", e10);
            fail.run();
        } catch (OutOfMemoryError e11) {
            String str = "execute error with fail in " + executorName() + ": " + e11.getLocalizedMessage();
            Logger.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            fail.run();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable task, T t10) {
        e0.checkNotNullParameter(task, "task");
        try {
            Future<T> futureSubmit = super.submit(Companion.getWrappedRunnableWithFail(task, new com.vungle.ads.a(this, 1)), t10);
            e0.checkNotNullExpressionValue(futureSubmit, "{\n            super.subm…     }, result)\n        }");
            return futureSubmit;
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "submit exception with result", e10);
            return new FutureResult(null);
        } catch (OutOfMemoryError e11) {
            String str = "submit error with result in " + executorName() + ": " + e11.getLocalizedMessage();
            Logger.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            return new FutureResult(null);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> task) {
        e0.checkNotNullParameter(task, "task");
        try {
            Future<T> futureSubmit = super.submit(Companion.getWrappedCallableWithFallback(task, new AnonymousClass3()));
            e0.checkNotNullExpressionValue(futureSubmit, "override fun <T> submit(…Future<T>\n        }\n    }");
            return futureSubmit;
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "submit exception callable: " + e10);
            return new FutureResult(null);
        } catch (OutOfMemoryError e11) {
            String str = "submit error callable in " + executorName() + ": " + e11.getLocalizedMessage();
            Logger.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            return new FutureResult(null);
        }
    }
}
