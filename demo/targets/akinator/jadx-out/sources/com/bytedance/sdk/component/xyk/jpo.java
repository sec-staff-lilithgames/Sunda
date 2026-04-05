package com.bytedance.sdk.component.xyk;

import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class jpo extends ThreadPoolExecutor implements AutoCloseable {
    private String jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.component.xyk.jpo$jpo, reason: collision with other inner class name */
    public static class C0094jpo {
        private RejectedExecutionHandler xyk;
        private String jpo = "io";

        /* renamed from: jd, reason: collision with root package name */
        private int f19036jd = 1;
        private long wqx = 30;

        /* renamed from: cm, reason: collision with root package name */
        private TimeUnit f19035cm = TimeUnit.SECONDS;
        private int my = Integer.MAX_VALUE;

        /* renamed from: jj, reason: collision with root package name */
        private BlockingQueue<Runnable> f19037jj = null;

        /* renamed from: qk, reason: collision with root package name */
        private ThreadFactory f19038qk = null;
        private int zz = 5;

        public C0094jpo jd(int i10) {
            this.zz = i10;
            return this;
        }

        public C0094jpo jpo(String str) {
            this.jpo = str;
            return this;
        }

        public C0094jpo jpo(int i10) {
            this.f19036jd = i10;
            return this;
        }

        public C0094jpo jpo(long j10) {
            this.wqx = j10;
            return this;
        }

        public C0094jpo jpo(TimeUnit timeUnit) {
            this.f19035cm = timeUnit;
            return this;
        }

        public C0094jpo jpo(BlockingQueue<Runnable> blockingQueue) {
            this.f19037jj = blockingQueue;
            return this;
        }

        public C0094jpo jpo(ThreadFactory threadFactory) {
            this.f19038qk = threadFactory;
            return this;
        }

        public C0094jpo jpo(RejectedExecutionHandler rejectedExecutionHandler) {
            this.xyk = rejectedExecutionHandler;
            return this;
        }

        public jpo jpo() {
            if (this.f19038qk == null) {
                this.f19038qk = my.jpo().createThreadFactory(this.zz, this.jpo);
            }
            if (this.xyk == null) {
                this.xyk = jj.xyk();
            }
            if (this.f19037jj == null) {
                this.f19037jj = new LinkedBlockingQueue();
            }
            return new jpo(this.jpo, this.f19036jd, this.my, this.wqx, this.f19035cm, this.f19037jj, this.f19038qk, this.xyk);
        }
    }

    public jpo(String str, int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i10, i11, j10, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.jpo = str;
    }

    private void jpo(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError e10) {
            jpo(runnable, e10);
        } catch (Throwable th2) {
            jpo(runnable, th2);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th2) {
        BlockingQueue<Runnable> queue;
        super.afterExecute(runnable, th2);
        if (!jj.qk() || TextUtils.isEmpty(this.jpo) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.jpo;
        str.getClass();
        switch (str) {
            case "io":
                jpo(queue, 2);
                break;
            case "log":
                jpo(queue, 4);
                break;
            case "aidl":
                jpo(queue, 2);
                break;
        }
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
    public void execute(final Runnable runnable) {
        BlockingQueue<Runnable> queue;
        if (runnable instanceof xyk) {
            jpo(new jd((xyk) runnable, this));
        } else {
            jpo(new jd(new xyk("unknown") { // from class: com.bytedance.sdk.component.xyk.jpo.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                }
            }, this));
        }
        if (!jj.qk() || TextUtils.isEmpty(this.jpo) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.jpo;
        str.getClass();
        switch (str) {
            case "io":
                jpo(queue, jj.jpo + 2, getCorePoolSize() * 2);
                break;
            case "log":
                jpo(queue, 8, 8);
                break;
            case "aidl":
                jpo(queue, 5, 5);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("io".equals(this.jpo) || "aidl".equals(this.jpo)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return ("io".equals(this.jpo) || "aidl".equals(this.jpo)) ? Collections.EMPTY_LIST : super.shutdownNow();
    }

    private void jpo(Runnable runnable, OutOfMemoryError outOfMemoryError) {
        jpo(runnable, (Throwable) outOfMemoryError);
    }

    private void jpo(Runnable runnable, Throwable th2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                runnable.run();
            } catch (Throwable unused) {
            }
        }
    }

    private void jpo(BlockingQueue<Runnable> blockingQueue, int i10) {
        if (getCorePoolSize() == i10 || blockingQueue == null || blockingQueue.size() > 0) {
            return;
        }
        try {
            setCorePoolSize(i10);
            getCorePoolSize();
            getMaximumPoolSize();
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    private void jpo(BlockingQueue<Runnable> blockingQueue, int i10, int i11) {
        if (getCorePoolSize() == i10 || blockingQueue == null || blockingQueue.size() < i11) {
            return;
        }
        try {
            setCorePoolSize(i10);
            getCorePoolSize();
            getMaximumPoolSize();
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public String jpo() {
        return this.jpo;
    }
}
