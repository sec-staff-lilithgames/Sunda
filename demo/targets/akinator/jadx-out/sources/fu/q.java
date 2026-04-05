package fu;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q extends m0.a implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public final p f56079c;

    /* renamed from: e, reason: collision with root package name */
    public final r f56080e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f56081f = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final pt.b f56078b = new pt.b();

    public q(p pVar) {
        r rVar;
        this.f56079c = pVar;
        ConcurrentLinkedQueue concurrentLinkedQueue = pVar.f56070c;
        pt.b bVar = pVar.f56071e;
        if (!bVar.isDisposed()) {
            while (true) {
                if (concurrentLinkedQueue.isEmpty()) {
                    r rVar2 = new r(pVar.f56074h);
                    bVar.add(rVar2);
                    rVar = rVar2;
                    break;
                } else {
                    r rVar3 = (r) concurrentLinkedQueue.poll();
                    if (rVar3 != null) {
                        rVar = rVar3;
                        break;
                    }
                }
            }
        } else {
            rVar = s.f56094k;
        }
        this.f56080e = rVar;
    }

    @Override // mt.m0.a, pt.c
    public void dispose() {
        if (this.f56081f.compareAndSet(false, true)) {
            this.f56078b.dispose();
            if (s.f56095l) {
                this.f56080e.scheduleActual(this, 0L, TimeUnit.NANOSECONDS, null);
                return;
            }
            p pVar = this.f56079c;
            pVar.getClass();
            long jNanoTime = System.nanoTime() + pVar.f56069b;
            r rVar = this.f56080e;
            rVar.setExpirationTime(jNanoTime);
            pVar.f56070c.offer(rVar);
        }
    }

    @Override // mt.m0.a, pt.c
    public boolean isDisposed() {
        return this.f56081f.get();
    }

    @Override // java.lang.Runnable
    public void run() {
        p pVar = this.f56079c;
        pVar.getClass();
        long jNanoTime = System.nanoTime() + pVar.f56069b;
        r rVar = this.f56080e;
        rVar.setExpirationTime(jNanoTime);
        pVar.f56070c.offer(rVar);
    }

    @Override // mt.m0.a
    public pt.c schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f56078b.isDisposed() ? tt.e.f87354b : this.f56080e.scheduleActual(runnable, j10, timeUnit, this.f56078b);
    }
}
