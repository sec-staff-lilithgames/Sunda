package com.applovin.impl;

import com.amazon.device.ads.DTBMetricReport;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b6 {

    /* renamed from: r, reason: collision with root package name */
    private static final ExecutorService f13630r = Executors.newFixedThreadPool(4);

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f13631a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f13632b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f13633c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f13634d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f13635e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f13636f;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f13637g;

    /* renamed from: h, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f13638h;

    /* renamed from: i, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f13639i;

    /* renamed from: k, reason: collision with root package name */
    private ExecutorService f13641k;

    /* renamed from: l, reason: collision with root package name */
    private ExecutorService f13642l;

    /* renamed from: o, reason: collision with root package name */
    private boolean f13645o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f13646p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f13647q;

    /* renamed from: j, reason: collision with root package name */
    private final Map f13640j = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    private final List f13643m = new ArrayList(5);

    /* renamed from: n, reason: collision with root package name */
    private final Object f13644n = new Object();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13648a;

        static {
            int[] iArr = new int[b.values().length];
            f13648a = iArr;
            try {
                iArr[b.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13648a[b.CACHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13648a[b.MEDIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13648a[b.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum b {
        CORE,
        CACHING,
        MEDIATION,
        TIMEOUT,
        OTHER
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends e {

        /* renamed from: f, reason: collision with root package name */
        private final long f13655f;

        public c(com.applovin.impl.sdk.k kVar, g5 g5Var, b bVar, long j10) {
            super(kVar, g5Var, bVar);
            this.f13655f = j10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final String f13656a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Thread.UncaughtExceptionHandler {
            public a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                com.applovin.impl.sdk.o unused = b6.this.f13632b;
                if (com.applovin.impl.sdk.o.a()) {
                    b6.this.f13632b.a("TaskManager", "Caught unhandled exception", th2);
                }
            }
        }

        public d(String str) {
            this.f13656a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f13656a);
            thread.setDaemon(true);
            thread.setPriority(((Integer) b6.this.f13631a.a(v4.O)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f13659a;

        /* renamed from: b, reason: collision with root package name */
        private final String f13660b;

        /* renamed from: c, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f13661c;

        /* renamed from: d, reason: collision with root package name */
        protected final g5 f13662d;

        /* renamed from: e, reason: collision with root package name */
        protected final b f13663e;

        public e(com.applovin.impl.sdk.k kVar, g5 g5Var, b bVar) {
            this.f13659a = kVar;
            this.f13661c = kVar.O();
            this.f13660b = g5Var.c();
            this.f13662d = g5Var;
            this.f13663e = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                o0.a();
                if (!this.f13659a.F0() || this.f13662d.d()) {
                    ScheduledFuture scheduledFutureB = this.f13662d.b(Thread.currentThread(), ((Long) this.f13659a.a(v4.f16055w)).longValue());
                    this.f13662d.run();
                    if (scheduledFutureB != null) {
                        scheduledFutureB.cancel(false);
                    }
                } else {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f13661c.d(this.f13660b, "Task re-scheduled...");
                    }
                    this.f13659a.r0().a(this.f13662d, this.f13663e, 2000L);
                }
            } catch (Throwable th2) {
                try {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f13661c.a(this.f13660b, "Task failed execution", th2);
                    }
                    this.f13662d.a(th2);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f13661c.d(this.f13660b, this.f13663e + " queue finished task " + this.f13662d.c());
                    }
                } finally {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f13661c.d(this.f13660b, this.f13663e + " queue finished task " + this.f13662d.c());
                    }
                }
            }
        }
    }

    public b6(com.applovin.impl.sdk.k kVar) {
        this.f13631a = kVar;
        this.f13632b = kVar.O();
        this.f13646p = ((Boolean) kVar.a(v4.R)).booleanValue();
        this.f13647q = ((Boolean) kVar.a(v4.G6)).booleanValue();
        this.f13633c = b("auxiliary_operations", ((Integer) kVar.a(v4.M)).intValue());
        this.f13634d = b("shared_thread_pool", ((Integer) kVar.a(v4.L)).intValue());
        this.f13635e = b("core", ((Integer) kVar.a(v4.S)).intValue());
        this.f13637g = b("caching", ((Integer) kVar.a(v4.T)).intValue());
        this.f13638h = b(DTBMetricReport.ADSERVER, ((Integer) kVar.a(v4.U)).intValue());
        this.f13636f = b("timeout", ((Integer) kVar.a(v4.V)).intValue());
        this.f13639i = b("other", ((Integer) kVar.a(v4.W)).intValue());
        if (((Boolean) kVar.a(v4.I0)).booleanValue() && ((Boolean) kVar.a(v4.J0)).booleanValue()) {
            this.f13641k = Executors.newFixedThreadPool(((Integer) kVar.a(v4.K0)).intValue(), new d("com.applovin.sdk.caching.shared"));
            this.f13642l = Executors.newFixedThreadPool(((Integer) kVar.a(v4.L0)).intValue(), new d("com.applovin.sdk.caching.html.shared"));
        }
    }

    public ExecutorService c() {
        return this.f13646p ? this.f13637g : f13630r;
    }

    public Executor d() {
        return this.f13646p ? this.f13635e : this.f13634d;
    }

    public ExecutorService e() {
        return this.f13642l;
    }

    public boolean f() {
        return (a() == null || e() == null) ? false : true;
    }

    public boolean g() {
        return this.f13645o;
    }

    public void h() {
        synchronized (this.f13644n) {
            try {
                this.f13645o = true;
                for (e eVar : this.f13643m) {
                    if (this.f13647q) {
                        c cVar = (c) eVar;
                        a(cVar.f13662d, cVar.f13663e, cVar.f13655f);
                    } else {
                        a(eVar.f13662d, eVar.f13663e);
                    }
                }
                this.f13643m.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i() {
        synchronized (this.f13644n) {
            this.f13645o = false;
        }
    }

    public ExecutorService a() {
        return this.f13641k;
    }

    public ScheduledFuture b(g5 g5Var, b bVar, long j10) {
        if (this.f13646p) {
            return a(new e(this.f13631a, g5Var, bVar)).schedule(g5Var, j10, TimeUnit.MILLISECONDS);
        }
        return this.f13633c.schedule(g5Var, j10, TimeUnit.MILLISECONDS);
    }

    public void a(g5 g5Var, b bVar) {
        a(g5Var, bVar, 0L);
    }

    public void a(g5 g5Var, b bVar, long j10) {
        a(g5Var, bVar, j10, false);
    }

    public void a(g5 g5Var, b bVar, long j10, boolean z10) {
        g5 g5Var2;
        long j11;
        e eVar;
        if (g5Var == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j10 >= 0) {
            if (this.f13647q) {
                g5Var2 = g5Var;
                j11 = j10;
                eVar = new c(this.f13631a, g5Var2, bVar, j11);
            } else {
                g5Var2 = g5Var;
                j11 = j10;
                eVar = new e(this.f13631a, g5Var2, bVar);
            }
            if (!b(eVar)) {
                a(eVar, j11, z10);
                return;
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f13632b.d(g5Var2.c(), "Task execution delayed until after init");
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException(p0.o2.m(j10, "Invalid delay (millis) specified: "));
    }

    public ExecutorService b() {
        return this.f13646p ? this.f13639i : this.f13633c;
    }

    private boolean b(e eVar) {
        if (eVar.f13662d.d()) {
            return false;
        }
        synchronized (this.f13644n) {
            try {
                if (this.f13645o) {
                    return false;
                }
                this.f13643m.add(eVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private ScheduledThreadPoolExecutor b(String str, int i10) {
        return new ScheduledThreadPoolExecutor(i10, new d(str));
    }

    public void a(Runnable runnable, b bVar) {
        if (this.f13646p) {
            com.applovin.impl.sdk.k kVar = this.f13631a;
            e eVar = new e(kVar, new p6(kVar, "auxiliaryOperation", runnable), bVar);
            a(eVar).submit(eVar);
            return;
        }
        this.f13633c.submit(runnable);
    }

    public Executor a(final String str) {
        return new Executor() { // from class: com.applovin.impl.r8
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f15204b.a(str, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        a(new p6(this.f13631a, str, runnable));
    }

    public void a(g5 g5Var) {
        if (g5Var != null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f13646p ? this.f13635e : this.f13634d;
            try {
                if (k7.h()) {
                    scheduledThreadPoolExecutor.submit(new e(this.f13631a, g5Var, b.CORE));
                    return;
                }
                ScheduledFuture scheduledFutureB = g5Var.b(Thread.currentThread(), ((Long) this.f13631a.a(v4.f16055w)).longValue());
                g5Var.run();
                if (scheduledFutureB != null) {
                    scheduledFutureB.cancel(false);
                    return;
                }
                return;
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f13632b.a(g5Var.c(), "Task failed execution", th2);
                }
                g5Var.a(th2);
                return;
            }
        }
        throw new IllegalArgumentException("No task specified");
    }

    public void a(g5 g5Var, h3 h3Var) {
        String strB = h3Var.b();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = (ScheduledThreadPoolExecutor) this.f13640j.get(strB);
        if (scheduledThreadPoolExecutorB == null) {
            scheduledThreadPoolExecutorB = b(strB, 1);
            this.f13640j.put(strB, scheduledThreadPoolExecutorB);
        }
        scheduledThreadPoolExecutorB.submit(new e(this.f13631a, g5Var, b.MEDIATION));
    }

    private void a(e eVar, long j10, boolean z10) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorA = this.f13646p ? a(eVar) : this.f13634d;
        if (j10 <= 0) {
            scheduledThreadPoolExecutorA.submit(eVar);
        } else if (z10) {
            g0.a(j10, this.f13631a, new s8(0, scheduledThreadPoolExecutorA, eVar));
        } else {
            scheduledThreadPoolExecutorA.schedule(eVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    private ScheduledThreadPoolExecutor a(e eVar) {
        int i10 = a.f13648a[eVar.f13663e.ordinal()];
        if (i10 == 1) {
            return this.f13635e;
        }
        if (i10 == 2) {
            return this.f13637g;
        }
        if (i10 == 3) {
            return this.f13638h;
        }
        if (i10 != 4) {
            return this.f13639i;
        }
        return this.f13636f;
    }

    public ExecutorService a(String str, int i10) {
        return Executors.newFixedThreadPool(i10, new d(str));
    }

    public List a(List list, ExecutorService executorService) {
        try {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13632b.a("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f13632b.a("TaskManager", "Awaiting tasks were interrupted", th2);
            return null;
        }
    }
}
