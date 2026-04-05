package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m2 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public mt.i0 f10637b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f10638c;

    @Override // pt.c
    public void dispose() {
        pt.c cVar = this.f10638c;
        this.f10638c = iu.i.f68409b;
        this.f10637b = iu.i.asObserver();
        cVar.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10638c.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        mt.i0 i0Var = this.f10637b;
        this.f10638c = iu.i.f68409b;
        this.f10637b = iu.i.asObserver();
        i0Var.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        mt.i0 i0Var = this.f10637b;
        this.f10638c = iu.i.f68409b;
        this.f10637b = iu.i.asObserver();
        i0Var.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10637b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10638c, cVar)) {
            this.f10638c = cVar;
            this.f10637b.onSubscribe(this);
        }
    }
}
