package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f7 implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final pu.d f10306b;

    /* renamed from: c, reason: collision with root package name */
    public final g7 f10307c;

    public f7(pu.d dVar, g7 g7Var) {
        this.f10306b = dVar;
        this.f10307c = g7Var;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10306b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10306b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10306b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f10307c, cVar);
    }
}
