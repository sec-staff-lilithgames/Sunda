package xr;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import xr.f4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o0 implements vc {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f92834f = Logger.getLogger(o0.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f92835a;

    /* renamed from: b, reason: collision with root package name */
    public final wr.u6 f92836b;

    /* renamed from: c, reason: collision with root package name */
    public final f4.a f92837c;

    /* renamed from: d, reason: collision with root package name */
    public n0 f92838d;

    /* renamed from: e, reason: collision with root package name */
    public wr.t6 f92839e;

    public o0(f4.a aVar, ScheduledExecutorService scheduledExecutorService, wr.u6 u6Var) {
        this.f92837c = aVar;
        this.f92835a = scheduledExecutorService;
        this.f92836b = u6Var;
    }

    @Override // xr.vc
    public void reset() {
        wr.u6 u6Var = this.f92836b;
        u6Var.throwIfNotInThisSynchronizationContext();
        u6Var.execute(new on.w(this, 25));
    }

    @Override // xr.vc
    public void schedule(Runnable runnable) {
        this.f92836b.throwIfNotInThisSynchronizationContext();
        if (this.f92838d == null) {
            this.f92838d = this.f92837c.get();
        }
        wr.t6 t6Var = this.f92839e;
        if (t6Var == null || !t6Var.isPending()) {
            long jNextBackoffNanos = this.f92838d.nextBackoffNanos();
            this.f92839e = this.f92836b.schedule(runnable, jNextBackoffNanos, TimeUnit.NANOSECONDS, this.f92835a);
            f92834f.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jNextBackoffNanos));
        }
    }
}
