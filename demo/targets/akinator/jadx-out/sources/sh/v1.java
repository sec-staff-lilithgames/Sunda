package sh;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class v1 extends s1 implements q1 {

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f85872c;

    public v1(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f85872c = (ScheduledExecutorService) mh.p1.checkNotNull(scheduledExecutorService);
    }

    @Override // sh.q1, java.util.concurrent.ScheduledExecutorService
    public <V> o1 schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
        i2 i2Var = new i2(callable);
        return new t1(i2Var, this.f85872c.schedule(i2Var, j10, timeUnit));
    }

    @Override // sh.q1, java.util.concurrent.ScheduledExecutorService
    public o1 scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        u1 u1Var = new u1(runnable);
        return new t1(u1Var, this.f85872c.scheduleAtFixedRate(u1Var, j10, j11, timeUnit));
    }

    @Override // sh.q1, java.util.concurrent.ScheduledExecutorService
    public o1 scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        u1 u1Var = new u1(runnable);
        return new t1(u1Var, this.f85872c.scheduleWithFixedDelay(u1Var, j10, j11, timeUnit));
    }

    @Override // sh.q1, java.util.concurrent.ScheduledExecutorService
    public o1 schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        i2 i2Var = new i2(Executors.callable(runnable, null));
        return new t1(i2Var, this.f85872c.schedule(i2Var, j10, timeUnit));
    }
}
