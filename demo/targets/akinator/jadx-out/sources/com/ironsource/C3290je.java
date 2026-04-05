package com.ironsource;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.je, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3290je extends ScheduledThreadPoolExecutor implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    private final kv.l f37038a;

    /* renamed from: b, reason: collision with root package name */
    private final kv.l f37039b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.je$b */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f37041a = new b();

        public b() {
            super(1);
        }

        public final void a(String it) {
            kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return tu.x0.f87415a;
        }
    }

    public C3290je() {
        this(0, null, null, 7, null);
    }

    private final String a(String str) {
        return w0.i.d(C3290je.class.getName(), " RuntimeException caught: ", str);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th2) throws ExecutionException, InterruptedException {
        super.afterExecute(runnable, th2);
        if (th2 != null) {
            this.f37039b.invoke(a(th2.toString()));
            this.f37038a.invoke(th2);
            return;
        }
        if ((runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException e10) {
                C3422r4.d().a(e10);
                this.f37039b.invoke(a(e10.toString()));
                Thread.currentThread().interrupt();
            } catch (CancellationException e11) {
                C3422r4.d().a(e11);
                this.f37039b.invoke(a(e11.toString()));
                this.f37038a.invoke(e11);
            } catch (ExecutionException e12) {
                C3422r4.d().a(e12);
                this.f37039b.invoke(a(e12.toString()));
                this.f37038a.invoke(e12.getCause());
            }
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

    public /* synthetic */ C3290je(int i10, kv.l lVar, kv.l lVar2, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? C3308ke.f37105a : i10, (i11 & 2) != 0 ? a.f37040a : lVar, (i11 & 4) != 0 ? b.f37041a : lVar2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3290je(int i10, kv.l report, kv.l log) {
        super(i10, new ThreadFactoryC3233ga());
        kotlin.jvm.internal.e0.checkNotNullParameter(report, "report");
        kotlin.jvm.internal.e0.checkNotNullParameter(log, "log");
        this.f37038a = report;
        this.f37039b = log;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.je$a */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37040a = new a();

        public a() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return tu.x0.f87415a;
        }

        public final void a(Throwable th2) {
        }
    }
}
