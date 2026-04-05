package sh;

import j$.time.Duration;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class p0 extends k {
    public static <V> p0 from(n1 n1Var) {
        return n1Var instanceof p0 ? (p0) n1Var : new q0(n1Var);
    }

    public final void addCallback(t0 t0Var, Executor executor) {
        b1.addCallback(this, t0Var, executor);
    }

    public final <X extends Throwable> p0 catching(Class<X> cls, mh.v0 v0Var, Executor executor) {
        return (p0) b1.catching(this, cls, v0Var, executor);
    }

    public final <X extends Throwable> p0 catchingAsync(Class<X> cls, e0 e0Var, Executor executor) {
        return (p0) b1.catchingAsync(this, cls, e0Var, executor);
    }

    public final <T> p0 transform(mh.v0 v0Var, Executor executor) {
        return (p0) b1.transform(this, v0Var, executor);
    }

    public final <T> p0 transformAsync(e0 e0Var, Executor executor) {
        return (p0) b1.transformAsync(this, e0Var, executor);
    }

    public final p0 withTimeout(Duration duration, ScheduledExecutorService scheduledExecutorService) {
        return withTimeout(kc.p.U(duration), TimeUnit.NANOSECONDS, scheduledExecutorService);
    }

    public final p0 withTimeout(long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (p0) b1.withTimeout(this, j10, timeUnit, scheduledExecutorService);
    }

    @Deprecated
    public static <V> p0 from(p0 p0Var) {
        return (p0) mh.p1.checkNotNull(p0Var);
    }
}
