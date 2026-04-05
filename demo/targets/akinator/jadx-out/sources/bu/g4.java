package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g4 implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10350b;

    /* renamed from: c, reason: collision with root package name */
    public tw.d f10351c;

    public g4(mt.i0 i0Var) {
        this.f10350b = i0Var;
    }

    @Override // pt.c
    public void dispose() {
        this.f10351c.cancel();
        this.f10351c = hu.g.f59176b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10351c == hu.g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f10350b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f10350b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f10350b.onNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f10351c, dVar)) {
            this.f10351c = dVar;
            this.f10350b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
