package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n7 extends AtomicReference implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final o7 f95999b;

    public n7(o7 o7Var) {
        this.f95999b = o7Var;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        o7 o7Var = this.f95999b;
        if (!o7Var.f96058f.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        hu.g.cancel(o7Var.f96056c);
        if (o7Var.getAndIncrement() == 0) {
            o7Var.a();
        }
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        o7 o7Var = this.f95999b;
        if (o7Var.compareAndSet(0, 1)) {
            long j10 = o7Var.f96067o;
            if (o7Var.f96059g.get() != j10) {
                o7Var.f96067o = j10 + 1;
                o7Var.f96055b.onNext(obj);
                o7Var.f96066n = 2;
            } else {
                o7Var.f96063k = obj;
                o7Var.f96066n = 1;
                if (o7Var.decrementAndGet() == 0) {
                    return;
                }
            }
        } else {
            o7Var.f96063k = obj;
            o7Var.f96066n = 1;
            if (o7Var.getAndIncrement() != 0) {
                return;
            }
        }
        o7Var.a();
    }
}
