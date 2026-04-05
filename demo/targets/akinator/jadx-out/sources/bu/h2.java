package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h2 implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i2 f10377b;

    public h2(i2 i2Var) {
        this.f10377b = i2Var;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10377b.f10408c.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10377b.f10408c.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10377b.f10408c.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        this.f10377b.f10407b.update(cVar);
    }
}
