package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k7 extends AtomicReference implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final l7 f95810b;

    public k7(l7 l7Var) {
        this.f95810b = l7Var;
    }

    @Override // mt.v
    public void onComplete() {
        l7 l7Var = this.f95810b;
        l7Var.f95868n = 2;
        if (l7Var.getAndIncrement() == 0) {
            l7Var.a();
        }
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        l7 l7Var = this.f95810b;
        if (!l7Var.f95860f.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        hu.g.cancel(l7Var.f95858c);
        if (l7Var.getAndIncrement() == 0) {
            l7Var.a();
        }
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        l7 l7Var = this.f95810b;
        if (l7Var.compareAndSet(0, 1)) {
            long j10 = l7Var.f95869o;
            if (l7Var.f95861g.get() != j10) {
                l7Var.f95869o = j10 + 1;
                l7Var.f95857b.onNext(obj);
                l7Var.f95868n = 2;
            } else {
                l7Var.f95865k = obj;
                l7Var.f95868n = 1;
                if (l7Var.decrementAndGet() == 0) {
                    return;
                }
            }
        } else {
            l7Var.f95865k = obj;
            l7Var.f95868n = 1;
            if (l7Var.getAndIncrement() != 0) {
                return;
            }
        }
        l7Var.a();
    }
}
