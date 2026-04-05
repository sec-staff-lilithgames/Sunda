package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g0 implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93412b;

    public g0(mt.f fVar) {
        this.f93412b = fVar;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f93412b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f93412b.onError(th2);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        this.f93412b.onSubscribe(cVar);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
    }
}
