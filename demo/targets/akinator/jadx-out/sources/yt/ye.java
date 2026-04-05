package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ye implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final ze f96622b;

    public ye(ze zeVar) {
        this.f96622b = zeVar;
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f96622b.otherError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f96622b.lazySet(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (this.f96622b.setOther(dVar)) {
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
    }
}
