package xt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n1 extends AtomicReference implements mt.f {

    /* renamed from: b, reason: collision with root package name */
    public final o1 f93466b;

    public n1(o1 o1Var) {
        this.f93466b = o1Var;
    }

    @Override // mt.f
    public void onComplete() {
        o1 o1Var = this.f93466b;
        if (o1Var.f93472e.compareAndSet(false, true)) {
            tt.d.dispose(o1Var);
            o1Var.f93470b.onComplete();
        }
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        o1 o1Var = this.f93466b;
        if (!o1Var.f93472e.compareAndSet(false, true)) {
            mu.a.onError(th2);
        } else {
            tt.d.dispose(o1Var);
            o1Var.f93470b.onError(th2);
        }
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
