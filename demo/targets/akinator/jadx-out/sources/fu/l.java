package fu;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l extends mt.m0 {

    /* renamed from: g, reason: collision with root package name */
    public static final mt.m0 f56043g = ou.j.single();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f56044e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f56045f;

    public l(Executor executor, boolean z10) {
        this.f56045f = executor;
        this.f56044e = z10;
    }

    @Override // mt.m0
    public m0.a createWorker() {
        return new a(this.f56045f, this.f56044e);
    }

    @Override // mt.m0
    public pt.c scheduleDirect(Runnable runnable) {
        Executor executor = this.f56045f;
        Runnable runnableOnSchedule = mu.a.onSchedule(runnable);
        try {
            if (executor instanceof ExecutorService) {
                z zVar = new z(runnableOnSchedule);
                zVar.setFuture(((ExecutorService) executor).submit(zVar));
                return zVar;
            }
            if (this.f56044e) {
                j jVar = new j(runnableOnSchedule, null);
                executor.execute(jVar);
                return jVar;
            }
            i iVar = new i(runnableOnSchedule);
            executor.execute(iVar);
            return iVar;
        } catch (RejectedExecutionException e10) {
            mu.a.onError(e10);
            return tt.e.f87354b;
        }
    }

    @Override // mt.m0
    public pt.c schedulePeriodicallyDirect(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Executor executor = this.f56045f;
        if (!(executor instanceof ScheduledExecutorService)) {
            return super.schedulePeriodicallyDirect(runnable, j10, j11, timeUnit);
        }
        try {
            y yVar = new y(mu.a.onSchedule(runnable));
            yVar.setFuture(((ScheduledExecutorService) executor).scheduleAtFixedRate(yVar, j10, j11, timeUnit));
            return yVar;
        } catch (RejectedExecutionException e10) {
            mu.a.onError(e10);
            return tt.e.f87354b;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends m0.a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f56046b;

        /* renamed from: c, reason: collision with root package name */
        public final Executor f56047c;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f56049f;

        /* renamed from: g, reason: collision with root package name */
        public final AtomicInteger f56050g = new AtomicInteger();

        /* renamed from: h, reason: collision with root package name */
        public final pt.b f56051h = new pt.b();

        /* renamed from: e, reason: collision with root package name */
        public final eu.b f56048e = new eu.b();

        public a(Executor executor, boolean z10) {
            this.f56047c = executor;
            this.f56046b = z10;
        }

        @Override // mt.m0.a, pt.c
        public void dispose() {
            if (this.f56049f) {
                return;
            }
            this.f56049f = true;
            this.f56051h.dispose();
            if (this.f56050g.getAndIncrement() == 0) {
                this.f56048e.clear();
            }
        }

        @Override // mt.m0.a, pt.c
        public boolean isDisposed() {
            return this.f56049f;
        }

        @Override // java.lang.Runnable
        public void run() {
            eu.b bVar = this.f56048e;
            int iAddAndGet = 1;
            while (!this.f56049f) {
                do {
                    Runnable runnable = (Runnable) bVar.poll();
                    if (runnable != null) {
                        runnable.run();
                    } else if (this.f56049f) {
                        bVar.clear();
                        return;
                    } else {
                        iAddAndGet = this.f56050g.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                } while (!this.f56049f);
                bVar.clear();
                return;
            }
            bVar.clear();
        }

        @Override // mt.m0.a
        public pt.c schedule(Runnable runnable) {
            pt.c iVar;
            tt.e eVar = tt.e.f87354b;
            if (this.f56049f) {
                return eVar;
            }
            Runnable runnableOnSchedule = mu.a.onSchedule(runnable);
            if (this.f56046b) {
                iVar = new j(runnableOnSchedule, this.f56051h);
                this.f56051h.add(iVar);
            } else {
                iVar = new i(runnableOnSchedule);
            }
            this.f56048e.offer(iVar);
            if (this.f56050g.getAndIncrement() != 0) {
                return iVar;
            }
            try {
                this.f56047c.execute(this);
                return iVar;
            } catch (RejectedExecutionException e10) {
                this.f56049f = true;
                this.f56048e.clear();
                mu.a.onError(e10);
                return eVar;
            }
        }

        @Override // mt.m0.a
        public pt.c schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            tt.e eVar = tt.e.f87354b;
            if (j10 <= 0) {
                return schedule(runnable);
            }
            if (this.f56049f) {
                return eVar;
            }
            tt.h hVar = new tt.h();
            tt.h hVar2 = new tt.h(hVar);
            a0 a0Var = new a0(new k(this, hVar2, mu.a.onSchedule(runnable)), this.f56051h);
            this.f56051h.add(a0Var);
            Executor executor = this.f56047c;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    a0Var.setFuture(((ScheduledExecutorService) executor).schedule((Callable) a0Var, j10, timeUnit));
                } catch (RejectedExecutionException e10) {
                    this.f56049f = true;
                    mu.a.onError(e10);
                    return eVar;
                }
            } else {
                a0Var.setFuture(new f(l.f56043g.scheduleDirect(a0Var, j10, timeUnit)));
            }
            hVar.replace(a0Var);
            return hVar2;
        }
    }

    @Override // mt.m0
    public pt.c scheduleDirect(Runnable runnable, long j10, TimeUnit timeUnit) {
        Runnable runnableOnSchedule = mu.a.onSchedule(runnable);
        Executor executor = this.f56045f;
        if (executor instanceof ScheduledExecutorService) {
            try {
                z zVar = new z(runnableOnSchedule);
                zVar.setFuture(((ScheduledExecutorService) executor).schedule(zVar, j10, timeUnit));
                return zVar;
            } catch (RejectedExecutionException e10) {
                mu.a.onError(e10);
                return tt.e.f87354b;
            }
        }
        h hVar = new h(runnableOnSchedule);
        hVar.f56027b.replace(f56043g.scheduleDirect(new g(this, hVar), j10, timeUnit));
        return hVar;
    }
}
