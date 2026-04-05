package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w1 implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f96480b;

    /* renamed from: c, reason: collision with root package name */
    public tw.d f96481c;

    /* renamed from: e, reason: collision with root package name */
    public long f96482e;

    public w1(mt.q0 q0Var) {
        this.f96480b = q0Var;
    }

    @Override // pt.c
    public void dispose() {
        this.f96481c.cancel();
        this.f96481c = hu.g.f59176b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f96481c == hu.g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96481c = hu.g.f59176b;
        this.f96480b.onSuccess(Long.valueOf(this.f96482e));
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f96481c = hu.g.f59176b;
        this.f96480b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f96482e++;
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96481c, dVar)) {
            this.f96481c = dVar;
            this.f96480b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
