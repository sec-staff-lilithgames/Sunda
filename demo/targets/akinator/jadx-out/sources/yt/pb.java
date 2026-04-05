package yt;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class pb implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f96129b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f96130c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f96131e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f96132f;

    /* renamed from: g, reason: collision with root package name */
    public Object f96133g;

    public pb(mt.q0 q0Var, Object obj) {
        this.f96129b = q0Var;
        this.f96130c = obj;
    }

    @Override // pt.c
    public void dispose() {
        this.f96131e.cancel();
        this.f96131e = hu.g.f59176b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f96131e == hu.g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f96132f) {
            return;
        }
        this.f96132f = true;
        this.f96131e = hu.g.f59176b;
        Object obj = this.f96133g;
        this.f96133g = null;
        if (obj == null) {
            obj = this.f96130c;
        }
        mt.q0 q0Var = this.f96129b;
        if (obj != null) {
            q0Var.onSuccess(obj);
        } else {
            q0Var.onError(new NoSuchElementException());
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96132f) {
            mu.a.onError(th2);
            return;
        }
        this.f96132f = true;
        this.f96131e = hu.g.f59176b;
        this.f96129b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f96132f) {
            return;
        }
        if (this.f96133g == null) {
            this.f96133g = obj;
            return;
        }
        this.f96132f = true;
        this.f96131e.cancel();
        this.f96131e = hu.g.f59176b;
        this.f96129b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96131e, dVar)) {
            this.f96131e = dVar;
            this.f96129b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
