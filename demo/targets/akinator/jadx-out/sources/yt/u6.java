package yt;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u6 implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f96401b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f96402c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f96403e;

    /* renamed from: f, reason: collision with root package name */
    public Object f96404f;

    public u6(mt.q0 q0Var, Object obj) {
        this.f96401b = q0Var;
        this.f96402c = obj;
    }

    @Override // pt.c
    public void dispose() {
        this.f96403e.cancel();
        this.f96403e = hu.g.f59176b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f96403e == hu.g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96403e = hu.g.f59176b;
        Object obj = this.f96404f;
        mt.q0 q0Var = this.f96401b;
        if (obj != null) {
            this.f96404f = null;
            q0Var.onSuccess(obj);
            return;
        }
        Object obj2 = this.f96402c;
        if (obj2 != null) {
            q0Var.onSuccess(obj2);
        } else {
            q0Var.onError(new NoSuchElementException());
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f96403e = hu.g.f59176b;
        this.f96404f = null;
        this.f96401b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f96404f = obj;
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96403e, dVar)) {
            this.f96403e = dVar;
            this.f96401b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
