package fu;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class u extends m0.a {

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f56107b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f56108c;

    public u(ThreadFactory threadFactory) {
        this.f56107b = f0.create(threadFactory);
    }

    @Override // mt.m0.a, pt.c
    public void dispose() {
        if (this.f56108c) {
            return;
        }
        this.f56108c = true;
        this.f56107b.shutdownNow();
    }

    @Override // mt.m0.a, pt.c
    public boolean isDisposed() {
        return this.f56108c;
    }

    @Override // mt.m0.a
    public pt.c schedule(Runnable runnable) {
        return schedule(runnable, 0L, null);
    }

    public a0 scheduleActual(Runnable runnable, long j10, TimeUnit timeUnit, tt.c cVar) {
        a0 a0Var = new a0(mu.a.onSchedule(runnable), cVar);
        if (cVar != null && !cVar.add(a0Var)) {
            return a0Var;
        }
        ScheduledExecutorService scheduledExecutorService = this.f56107b;
        try {
            a0Var.setFuture(j10 <= 0 ? scheduledExecutorService.submit((Callable) a0Var) : scheduledExecutorService.schedule((Callable) a0Var, j10, timeUnit));
            return a0Var;
        } catch (RejectedExecutionException e10) {
            if (cVar != null) {
                cVar.remove(a0Var);
            }
            mu.a.onError(e10);
            return a0Var;
        }
    }

    public pt.c scheduleDirect(Runnable runnable, long j10, TimeUnit timeUnit) {
        z zVar = new z(mu.a.onSchedule(runnable));
        ScheduledExecutorService scheduledExecutorService = this.f56107b;
        try {
            zVar.setFuture(j10 <= 0 ? scheduledExecutorService.submit(zVar) : scheduledExecutorService.schedule(zVar, j10, timeUnit));
            return zVar;
        } catch (RejectedExecutionException e10) {
            mu.a.onError(e10);
            return tt.e.f87354b;
        }
    }

    public pt.c schedulePeriodicallyDirect(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Runnable runnableOnSchedule = mu.a.onSchedule(runnable);
        tt.e eVar = tt.e.f87354b;
        if (j11 > 0) {
            y yVar = new y(runnableOnSchedule);
            try {
                yVar.setFuture(this.f56107b.scheduleAtFixedRate(yVar, j10, j11, timeUnit));
                return yVar;
            } catch (RejectedExecutionException e10) {
                mu.a.onError(e10);
                return eVar;
            }
        }
        ScheduledExecutorService scheduledExecutorService = this.f56107b;
        o oVar = new o(runnableOnSchedule, scheduledExecutorService);
        try {
            oVar.a(j10 <= 0 ? scheduledExecutorService.submit(oVar) : scheduledExecutorService.schedule(oVar, j10, timeUnit));
            return oVar;
        } catch (RejectedExecutionException e11) {
            mu.a.onError(e11);
            return eVar;
        }
    }

    public void shutdown() {
        if (this.f56108c) {
            return;
        }
        this.f56108c = true;
        this.f56107b.shutdown();
    }

    @Override // mt.m0.a
    public pt.c schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f56108c ? tt.e.f87354b : scheduleActual(runnable, j10, timeUnit, null);
    }
}
