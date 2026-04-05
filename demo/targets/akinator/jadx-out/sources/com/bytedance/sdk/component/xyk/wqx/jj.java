package com.bytedance.sdk.component.xyk.wqx;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends ThreadPoolExecutor implements AutoCloseable {

    /* renamed from: cm, reason: collision with root package name */
    private int f19047cm;

    /* renamed from: jd, reason: collision with root package name */
    private int f19048jd;
    private final String jpo;
    private boolean my;
    private int wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {
        private String jpo = "cache";

        /* renamed from: jd, reason: collision with root package name */
        private int f19051jd = 4;
        private int wqx = 100;

        /* renamed from: cm, reason: collision with root package name */
        private int f19050cm = 0;
        private long my = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;

        /* renamed from: jj, reason: collision with root package name */
        private boolean f19052jj = false;

        /* renamed from: qk, reason: collision with root package name */
        private TimeUnit f19053qk = TimeUnit.MILLISECONDS;
        private boolean xyk = false;
        private BlockingQueue<Runnable> zz = new PriorityBlockingQueue();

        /* renamed from: yd, reason: collision with root package name */
        private ThreadFactory f19054yd = null;

        public jpo cm(int i10) {
            return this;
        }

        public jpo my(int i10) {
            return this;
        }

        public jpo jd(int i10) {
            this.wqx = i10;
            return this;
        }

        public jpo jpo(String str) {
            this.jpo = str;
            return this;
        }

        public jpo wqx(int i10) {
            this.f19050cm = i10;
            return this;
        }

        public jpo jd(boolean z10) {
            this.xyk = z10;
            return this;
        }

        public jpo jpo(int i10) {
            this.f19051jd = i10;
            return this;
        }

        public jpo jpo(long j10) {
            this.my = j10;
            return this;
        }

        public jpo jpo(boolean z10) {
            this.f19052jj = z10;
            return this;
        }

        public jj jpo() {
            if (this.f19054yd == null) {
                this.f19054yd = new cm(this.jpo);
            }
            if (this.f19051jd < 0) {
                this.f19051jd = 8;
            }
            if (this.f19051jd == 0) {
                this.zz = new SynchronousQueue();
            }
            if (this.zz == null) {
                this.zz = new LinkedBlockingQueue();
            }
            if (this.wqx > 100) {
                this.wqx = 100;
            }
            int i10 = this.wqx;
            int i11 = this.f19051jd;
            if (i10 < i11) {
                this.wqx = i11;
            }
            return new jj(this);
        }
    }

    private void jd() {
        try {
            if (this.f19048jd != 0 && getCorePoolSize() < this.wqx) {
                int size = getQueue().size();
                if (getActiveCount() < this.f19048jd || size < this.f19047cm) {
                    return;
                }
                setCorePoolSize(this.wqx);
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    private void wqx() {
        try {
            if (this.f19048jd != 0 && getCorePoolSize() > this.f19048jd && getQueue().size() == 0) {
                setCorePoolSize(this.f19048jd);
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th2) {
        boolean z10 = runnable instanceof jd;
        if (z10) {
            ((jd) runnable).wqx(SystemClock.elapsedRealtime());
        }
        super.afterExecute(runnable, th2);
        if (z10) {
            jd jdVar = (jd) runnable;
            jdVar.jd();
            jdVar.jpo();
            jdVar.wqx();
            jdVar.cm();
            jdVar.my();
        }
        wqx();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof jd) {
            ((jd) runnable).jd(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
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
    public void execute(Runnable runnable) {
        com.bytedance.sdk.component.xyk.wqx.jpo jpoVarJpo;
        if (!(runnable instanceof jd)) {
            runnable = new jd("unknown", runnable) { // from class: com.bytedance.sdk.component.xyk.wqx.jj.2
                @Override // java.lang.Runnable
                public void run() {
                    Runnable runnableJj = jj();
                    if (runnableJj != null) {
                        runnableJj.run();
                    }
                }
            };
        }
        if (!"cache".equals(this.jpo)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(cm.jpo(this.jpo)) && (jpoVarJpo = wqx.jpo()) != null) {
                jpoVarJpo.jpo(this, (jd) runnable);
            }
        }
        ((jd) runnable).jpo(SystemClock.elapsedRealtime());
        try {
            super.execute(runnable);
            jd();
        } catch (Throwable th2) {
            jpo(runnable, th2);
        }
    }

    public void jpo(jpo jpoVar) {
        try {
            if (jpoVar.f19051jd >= 0 && this.f19048jd != jpoVar.f19051jd) {
                int i10 = jpoVar.f19051jd;
                this.f19048jd = i10;
                setCorePoolSize(i10);
            }
            this.wqx = jpoVar.wqx;
            this.f19047cm = jpoVar.f19050cm;
            allowCoreThreadTimeOut(jpoVar.f19052jj);
            this.my = jpoVar.xyk;
        } catch (Throwable th2) {
            th2.getMessage();
        }
        String unused = jpoVar.jpo;
        int unused2 = jpoVar.f19051jd;
        int unused3 = jpoVar.wqx;
        long unused4 = jpoVar.my;
        int unused5 = jpoVar.f19050cm;
        boolean unused6 = jpoVar.xyk;
        BlockingQueue unused7 = jpoVar.zz;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.jpo)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return "aidl".equals(this.jpo) ? Collections.EMPTY_LIST : super.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        int iJpo;
        String strJd;
        runnable.getClass();
        final RunnableFuture runnableFutureNewTaskFor = newTaskFor(runnable, null);
        if (runnable instanceof jd) {
            jd jdVar = (jd) runnable;
            iJpo = jdVar.jpo();
            strJd = jdVar.jd();
        } else {
            iJpo = 6;
            strJd = "";
        }
        if (iJpo == 0 || TextUtils.isEmpty(strJd)) {
            new RuntimeException();
        }
        execute(new jd(iJpo, strJd) { // from class: com.bytedance.sdk.component.xyk.wqx.jj.1
            @Override // java.lang.Runnable
            public void run() {
                runnableFutureNewTaskFor.run();
            }
        });
        return runnableFutureNewTaskFor;
    }

    private jj(jpo jpoVar) {
        super(jpoVar.f19051jd, Integer.MAX_VALUE, jpoVar.my, jpoVar.f19053qk, (BlockingQueue<Runnable>) jpoVar.zz, jpoVar.f19054yd);
        this.my = false;
        String unused = jpoVar.jpo;
        int unused2 = jpoVar.f19051jd;
        int unused3 = jpoVar.wqx;
        long unused4 = jpoVar.my;
        int unused5 = jpoVar.f19050cm;
        boolean unused6 = jpoVar.xyk;
        BlockingQueue unused7 = jpoVar.zz;
        this.jpo = jpoVar.jpo;
        this.f19048jd = jpoVar.f19051jd;
        this.wqx = jpoVar.wqx;
        this.f19047cm = jpoVar.f19050cm;
        allowCoreThreadTimeOut(jpoVar.f19052jj);
        this.my = jpoVar.xyk;
    }

    private void jpo(Runnable runnable, Throwable th2) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Handler handlerJd = wqx.jd();
                if (handlerJd != null) {
                    handlerJd.post(runnable);
                    return;
                }
                return;
            }
            runnable.run();
        } catch (Throwable unused) {
        }
    }

    public boolean jpo() {
        return this.my;
    }
}
