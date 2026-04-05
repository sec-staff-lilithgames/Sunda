package fu;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u0 extends m0.a {

    /* renamed from: b, reason: collision with root package name */
    public final PriorityBlockingQueue f56109b = new PriorityBlockingQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f56110c = new AtomicInteger();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f56111e = new AtomicInteger();

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f56112f;

    public final pt.c a(Runnable runnable, long j10) {
        tt.e eVar = tt.e.f87354b;
        if (!this.f56112f) {
            s0 s0Var = new s0(runnable, Long.valueOf(j10), this.f56111e.incrementAndGet());
            this.f56109b.add(s0Var);
            if (this.f56110c.getAndIncrement() != 0) {
                return pt.d.fromRunnable(new t0(this, s0Var));
            }
            int iAddAndGet = 1;
            while (!this.f56112f) {
                s0 s0Var2 = (s0) this.f56109b.poll();
                if (s0Var2 == null) {
                    iAddAndGet = this.f56110c.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                    }
                } else if (!s0Var2.f56102f) {
                    s0Var2.f56099b.run();
                }
            }
            this.f56109b.clear();
            return eVar;
        }
        return eVar;
    }

    @Override // mt.m0.a, pt.c
    public void dispose() {
        this.f56112f = true;
    }

    @Override // mt.m0.a, pt.c
    public boolean isDisposed() {
        return this.f56112f;
    }

    @Override // mt.m0.a
    public pt.c schedule(Runnable runnable) {
        return a(runnable, now(TimeUnit.MILLISECONDS));
    }

    @Override // mt.m0.a
    public pt.c schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j10) + now(TimeUnit.MILLISECONDS);
        return a(new r0(runnable, this, millis), millis);
    }
}
