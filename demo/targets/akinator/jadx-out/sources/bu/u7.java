package bu;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u7 extends AtomicInteger implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11081b;

    /* renamed from: c, reason: collision with root package name */
    public final tt.h f11082c;

    /* renamed from: e, reason: collision with root package name */
    public final mt.g0 f11083e;

    /* renamed from: f, reason: collision with root package name */
    public long f11084f;

    public u7(mt.i0 i0Var, long j10, tt.h hVar, mt.g0 g0Var) {
        this.f11081b = i0Var;
        this.f11082c = hVar;
        this.f11083e = g0Var;
        this.f11084f = j10;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.f11082c.isDisposed()) {
                this.f11083e.subscribe(this);
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        long j10 = this.f11084f;
        if (j10 != Long.MAX_VALUE) {
            this.f11084f = j10 - 1;
        }
        if (j10 != 0) {
            a();
        } else {
            this.f11081b.onComplete();
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f11081b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f11081b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        this.f11082c.replace(cVar);
    }
}
