package zt;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l4 implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f98685b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f98686c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f98687e;

    public l4(mt.q0 q0Var, Object obj) {
        this.f98685b = q0Var;
        this.f98686c = obj;
    }

    @Override // pt.c
    public void dispose() {
        this.f98687e.dispose();
        this.f98687e = tt.d.f87352b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f98687e.isDisposed();
    }

    @Override // mt.v
    public void onComplete() {
        this.f98687e = tt.d.f87352b;
        mt.q0 q0Var = this.f98685b;
        Object obj = this.f98686c;
        if (obj != null) {
            q0Var.onSuccess(obj);
        } else {
            q0Var.onError(new NoSuchElementException("The MaybeSource is empty"));
        }
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98687e = tt.d.f87352b;
        this.f98685b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98687e, cVar)) {
            this.f98687e = cVar;
            this.f98685b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98687e = tt.d.f87352b;
        this.f98685b.onSuccess(obj);
    }
}
