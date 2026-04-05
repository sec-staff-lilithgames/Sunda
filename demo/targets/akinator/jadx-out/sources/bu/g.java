package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g extends ku.i {

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f10325c;

    public f getIterable() {
        return new f(this);
    }

    @Override // ku.i, mt.i0, mt.f
    public void onComplete() {
        this.f10325c = iu.u.complete();
    }

    @Override // ku.i, mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10325c = iu.u.error(th2);
    }

    @Override // ku.i, mt.i0
    public void onNext(Object obj) {
        this.f10325c = iu.u.next(obj);
    }
}
