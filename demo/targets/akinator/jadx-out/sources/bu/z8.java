package bu;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z8 extends b9 {

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f11315i;

    public z8(ku.m mVar, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        super(mVar, j10, timeUnit, m0Var);
        this.f11315i = new AtomicInteger(1);
    }

    @Override // bu.b9
    public final void a() {
        Object andSet = getAndSet(null);
        ku.m mVar = this.f10123b;
        if (andSet != null) {
            mVar.onNext(andSet);
        }
        if (this.f11315i.decrementAndGet() == 0) {
            mVar.onComplete();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        AtomicInteger atomicInteger = this.f11315i;
        if (atomicInteger.incrementAndGet() == 2) {
            Object andSet = getAndSet(null);
            ku.m mVar = this.f10123b;
            if (andSet != null) {
                mVar.onNext(andSet);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                mVar.onComplete();
            }
        }
    }
}
