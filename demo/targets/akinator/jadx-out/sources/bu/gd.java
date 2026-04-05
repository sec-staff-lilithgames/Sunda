package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class gd implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final fd f10368b;

    public gd(fd fdVar) {
        this.f10368b = fdVar;
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10368b.otherError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10368b.lazySet(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        this.f10368b.setOther(cVar);
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
    }
}
