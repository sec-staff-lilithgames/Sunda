package xr;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wr.m6 f92464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g6 f92465c;

    public e6(g6 g6Var, wr.m6 m6Var) {
        this.f92465c = g6Var;
        this.f92464b = m6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f92465c.f92557c.f92632y.getState() == wr.f0.f90916g) {
            return;
        }
        b6 b6Var = this.f92465c.f92557c.f92631x;
        g6 g6Var = this.f92465c;
        b6 b6Var2 = g6Var.f92555a;
        if (b6Var == b6Var2) {
            g6Var.f92557c.f92631x = null;
            this.f92465c.f92557c.f92621n.reset();
            i6.a(this.f92465c.f92557c, wr.f0.f90915f);
            return;
        }
        i6 i6Var = g6Var.f92557c;
        if (i6Var.f92630w == b6Var2) {
            mh.p1.checkState(i6Var.f92632y.getState() == wr.f0.f90912b, "Expected state is CONNECTING, actual state is %s", this.f92465c.f92557c.f92632y.getState());
            this.f92465c.f92557c.f92621n.increment();
            if (this.f92465c.f92557c.f92621n.isValid()) {
                i6.b(this.f92465c.f92557c);
                return;
            }
            i6 i6Var2 = this.f92465c.f92557c;
            i6Var2.f92630w = null;
            i6Var2.f92621n.reset();
            i6 i6Var3 = this.f92465c.f92557c;
            wr.m6 m6Var = this.f92464b;
            i6Var3.f92620m.throwIfNotInThisSynchronizationContext();
            i6Var3.c(wr.g0.forTransientFailure(m6Var));
            if (i6Var3.f92623p == null) {
                i6Var3.f92623p = i6Var3.f92611d.get();
            }
            long jNextBackoffNanos = i6Var3.f92623p.nextBackoffNanos();
            mh.t2 t2Var = i6Var3.f92624q;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jElapsed = jNextBackoffNanos - t2Var.elapsed(timeUnit);
            i6Var3.f92618k.log(wr.l.f91018c, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", i6.d(m6Var), Long.valueOf(jElapsed));
            mh.p1.checkState(i6Var3.f92625r == null, "previous reconnectTask is not done");
            i6Var3.f92625r = i6Var3.f92620m.schedule(new p5(i6Var3), jElapsed, timeUnit, i6Var3.f92614g);
        }
    }
}
