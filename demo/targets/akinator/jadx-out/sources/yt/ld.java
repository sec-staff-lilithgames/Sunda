package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ld implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95897b;

    /* renamed from: c, reason: collision with root package name */
    public final hu.f f95898c;

    public ld(tw.c cVar, hu.f fVar) {
        this.f95897b = cVar;
        this.f95898c = fVar;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95897b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f95897b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f95897b.onNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        this.f95898c.setSubscription(dVar);
    }
}
