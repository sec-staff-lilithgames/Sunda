package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i0 implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93431b;

    /* renamed from: c, reason: collision with root package name */
    public tw.d f93432c;

    public i0(mt.f fVar) {
        this.f93431b = fVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f93432c.cancel();
        this.f93432c = hu.g.f59176b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f93432c == hu.g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f93431b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f93431b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f93432c, dVar)) {
            this.f93432c = dVar;
            this.f93431b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
    }
}
