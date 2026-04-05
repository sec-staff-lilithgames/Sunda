package fu;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p0 extends m0.a {

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f56075b;

    /* renamed from: c, reason: collision with root package name */
    public final pt.b f56076c = new pt.b();

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f56077e;

    public p0(ScheduledExecutorService scheduledExecutorService) {
        this.f56075b = scheduledExecutorService;
    }

    @Override // mt.m0.a, pt.c
    public void dispose() {
        if (this.f56077e) {
            return;
        }
        this.f56077e = true;
        this.f56076c.dispose();
    }

    @Override // mt.m0.a, pt.c
    public boolean isDisposed() {
        return this.f56077e;
    }

    @Override // mt.m0.a
    public pt.c schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        tt.e eVar = tt.e.f87354b;
        if (this.f56077e) {
            return eVar;
        }
        a0 a0Var = new a0(mu.a.onSchedule(runnable), this.f56076c);
        this.f56076c.add(a0Var);
        try {
            a0Var.setFuture(j10 <= 0 ? this.f56075b.submit((Callable) a0Var) : this.f56075b.schedule((Callable) a0Var, j10, timeUnit));
            return a0Var;
        } catch (RejectedExecutionException e10) {
            dispose();
            mu.a.onError(e10);
            return eVar;
        }
    }
}
