package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r3 implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f96232b;

    /* renamed from: c, reason: collision with root package name */
    public final long f96233c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f96234e;

    /* renamed from: f, reason: collision with root package name */
    public long f96235f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f96236g;

    public r3(mt.v vVar, long j10) {
        this.f96232b = vVar;
        this.f96233c = j10;
    }

    @Override // pt.c
    public void dispose() {
        this.f96234e.cancel();
        this.f96234e = hu.g.f59176b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f96234e == hu.g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96234e = hu.g.f59176b;
        if (this.f96236g) {
            return;
        }
        this.f96236g = true;
        this.f96232b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96236g) {
            mu.a.onError(th2);
            return;
        }
        this.f96236g = true;
        this.f96234e = hu.g.f59176b;
        this.f96232b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f96236g) {
            return;
        }
        long j10 = this.f96235f;
        if (j10 != this.f96233c) {
            this.f96235f = j10 + 1;
            return;
        }
        this.f96236g = true;
        this.f96234e.cancel();
        this.f96234e = hu.g.f59176b;
        this.f96232b.onSuccess(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96234e, dVar)) {
            this.f96234e = dVar;
            this.f96232b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
