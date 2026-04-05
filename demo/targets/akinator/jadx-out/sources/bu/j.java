package bu;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j extends ku.j {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayBlockingQueue f10440c = new ArrayBlockingQueue(1);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f10441e = new AtomicInteger();

    @Override // ku.j, mt.i0, mt.f
    public void onError(Throwable th2) {
        mu.a.onError(th2);
    }

    public mt.a0 takeNext() throws InterruptedException {
        this.f10441e.set(1);
        iu.f.verifyNonBlocking();
        return (mt.a0) this.f10440c.take();
    }

    @Override // ku.j, mt.i0
    public void onNext(mt.a0 a0Var) {
        if (this.f10441e.getAndSet(0) != 1 && a0Var.isOnNext()) {
            return;
        }
        while (true) {
            ArrayBlockingQueue arrayBlockingQueue = this.f10440c;
            if (arrayBlockingQueue.offer(a0Var)) {
                return;
            }
            mt.a0 a0Var2 = (mt.a0) arrayBlockingQueue.poll();
            if (a0Var2 != null && !a0Var2.isOnNext()) {
                a0Var = a0Var2;
            }
        }
    }

    @Override // ku.j, mt.i0, mt.f
    public void onComplete() {
    }
}
