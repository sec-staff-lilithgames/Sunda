package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o3 extends AtomicReference implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f98715b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.t0 f98716c;

    public o3(mt.q0 q0Var, mt.t0 t0Var) {
        this.f98715b = q0Var;
        this.f98716c = t0Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.v
    public void onComplete() {
        pt.c cVar = (pt.c) get();
        if (cVar == tt.d.f87352b || !compareAndSet(cVar, null)) {
            return;
        }
        this.f98716c.subscribe(new n3(this.f98715b, this));
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98715b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar)) {
            this.f98715b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98715b.onSuccess(obj);
    }
}
