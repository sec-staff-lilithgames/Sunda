package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u4 extends AtomicReference implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final t4 f98794b;

    /* renamed from: c, reason: collision with root package name */
    public final int f98795c;

    public u4(t4 t4Var, int i10) {
        this.f98794b = t4Var;
        this.f98795c = i10;
    }

    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // mt.v
    public void onComplete() {
        t4 t4Var = this.f98794b;
        if (t4Var.getAndSet(0) > 0) {
            t4Var.a(this.f98795c);
            t4Var.f98780b.onComplete();
        }
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        t4 t4Var = this.f98794b;
        if (t4Var.getAndSet(0) <= 0) {
            mu.a.onError(th2);
        } else {
            t4Var.a(this.f98795c);
            t4Var.f98780b.onError(th2);
        }
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        t4 t4Var = this.f98794b;
        mt.v vVar = t4Var.f98780b;
        Object[] objArr = t4Var.f98783f;
        objArr[this.f98795c] = obj;
        if (t4Var.decrementAndGet() == 0) {
            try {
                vVar.onSuccess(ut.o0.requireNonNull(t4Var.f98781c.apply(objArr), "The zipper returned a null value"));
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                vVar.onError(th2);
            }
        }
    }
}
