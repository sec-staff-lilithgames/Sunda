package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class nb implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f96008b;

    /* renamed from: c, reason: collision with root package name */
    public tw.d f96009c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f96010e;

    /* renamed from: f, reason: collision with root package name */
    public Object f96011f;

    public nb(mt.v vVar) {
        this.f96008b = vVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f96009c.cancel();
        this.f96009c = hu.g.f59176b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f96009c == hu.g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f96010e) {
            return;
        }
        this.f96010e = true;
        this.f96009c = hu.g.f59176b;
        Object obj = this.f96011f;
        this.f96011f = null;
        mt.v vVar = this.f96008b;
        if (obj == null) {
            vVar.onComplete();
        } else {
            vVar.onSuccess(obj);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96010e) {
            mu.a.onError(th2);
            return;
        }
        this.f96010e = true;
        this.f96009c = hu.g.f59176b;
        this.f96008b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f96010e) {
            return;
        }
        if (this.f96011f == null) {
            this.f96011f = obj;
            return;
        }
        this.f96010e = true;
        this.f96009c.cancel();
        this.f96009c = hu.g.f59176b;
        this.f96008b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96009c, dVar)) {
            this.f96009c = dVar;
            this.f96008b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
