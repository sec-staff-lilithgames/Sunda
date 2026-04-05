package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x2 implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public tw.c f96541b;

    /* renamed from: c, reason: collision with root package name */
    public tw.d f96542c;

    @Override // tw.d
    public void cancel() {
        tw.d dVar = this.f96542c;
        this.f96542c = iu.i.f68409b;
        this.f96541b = iu.i.asSubscriber();
        dVar.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        tw.c cVar = this.f96541b;
        this.f96542c = iu.i.f68409b;
        this.f96541b = iu.i.asSubscriber();
        cVar.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        tw.c cVar = this.f96541b;
        this.f96542c = iu.i.f68409b;
        this.f96541b = iu.i.asSubscriber();
        cVar.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f96541b.onNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96542c, dVar)) {
            this.f96542c = dVar;
            this.f96541b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        this.f96542c.request(j10);
    }
}
