package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q0 extends AtomicReference implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final p0 f98732b;

    /* renamed from: c, reason: collision with root package name */
    public Object f98733c;

    public q0(p0 p0Var) {
        this.f98732b = p0Var;
    }

    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // mt.v
    public void onComplete() {
        this.f98732b.a();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        p0 p0Var = this.f98732b;
        if (p0Var.getAndSet(0) <= 0) {
            mu.a.onError(th2);
            return;
        }
        q0 q0Var = p0Var.f98722c;
        if (this == q0Var) {
            p0Var.f98723e.dispose();
        } else {
            q0Var.dispose();
        }
        p0Var.f98721b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98733c = obj;
        this.f98732b.a();
    }
}
