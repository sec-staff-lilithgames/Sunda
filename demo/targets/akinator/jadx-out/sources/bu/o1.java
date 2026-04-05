package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o1 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10722b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f10723c;

    /* renamed from: e, reason: collision with root package name */
    public long f10724e;

    public o1(mt.i0 i0Var) {
        this.f10722b = i0Var;
    }

    @Override // pt.c
    public void dispose() {
        this.f10723c.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10723c.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        Long lValueOf = Long.valueOf(this.f10724e);
        mt.i0 i0Var = this.f10722b;
        i0Var.onNext(lValueOf);
        i0Var.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10722b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10724e++;
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10723c, cVar)) {
            this.f10723c = cVar;
            this.f10722b.onSubscribe(this);
        }
    }
}
