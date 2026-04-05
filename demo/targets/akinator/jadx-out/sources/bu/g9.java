package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g9 implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final f9 f10356b;

    public g9(f9 f9Var) {
        this.f10356b = f9Var;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10356b.complete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10356b.error(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10356b.b();
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f10356b.f10312e, cVar);
    }
}
