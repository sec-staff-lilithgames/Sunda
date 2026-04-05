package yt;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class vd implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f96468b;

    /* renamed from: c, reason: collision with root package name */
    public tw.d f96469c;

    /* renamed from: e, reason: collision with root package name */
    public Collection f96470e;

    public vd(mt.q0 q0Var, Collection collection) {
        this.f96468b = q0Var;
        this.f96470e = collection;
    }

    @Override // pt.c
    public void dispose() {
        this.f96469c.cancel();
        this.f96469c = hu.g.f59176b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f96469c == hu.g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96469c = hu.g.f59176b;
        this.f96468b.onSuccess(this.f96470e);
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f96470e = null;
        this.f96469c = hu.g.f59176b;
        this.f96468b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f96470e.add(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96469c, dVar)) {
            this.f96469c = dVar;
            this.f96468b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
