package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s6 implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f96311b;

    /* renamed from: c, reason: collision with root package name */
    public tw.d f96312c;

    /* renamed from: e, reason: collision with root package name */
    public Object f96313e;

    public s6(mt.v vVar) {
        this.f96311b = vVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f96312c.cancel();
        this.f96312c = hu.g.f59176b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f96312c == hu.g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96312c = hu.g.f59176b;
        Object obj = this.f96313e;
        mt.v vVar = this.f96311b;
        if (obj == null) {
            vVar.onComplete();
        } else {
            this.f96313e = null;
            vVar.onSuccess(obj);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f96312c = hu.g.f59176b;
        this.f96313e = null;
        this.f96311b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f96313e = obj;
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96312c, dVar)) {
            this.f96312c = dVar;
            this.f96311b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
