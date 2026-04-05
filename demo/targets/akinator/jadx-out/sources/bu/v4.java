package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v4 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11117b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f11118c;

    public v4(mt.i0 i0Var) {
        this.f11117b = i0Var;
    }

    @Override // pt.c
    public void dispose() {
        this.f11118c.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11118c.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f11117b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f11117b.onError(th2);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        this.f11118c = cVar;
        this.f11117b.onSubscribe(this);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
    }
}
