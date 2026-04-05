package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t8 implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96362b;

    /* renamed from: c, reason: collision with root package name */
    public final r8 f96363c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f96364e;

    public t8(tw.c cVar, r8 r8Var) {
        this.f96362b = cVar;
        this.f96363c = r8Var;
    }

    @Override // tw.d
    public void cancel() {
        this.f96364e.cancel();
        this.f96363c.dispose();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96362b.onComplete();
        this.f96363c.dispose();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f96362b.onError(th2);
        this.f96363c.dispose();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f96362b.onNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96364e, dVar)) {
            this.f96364e = dVar;
            this.f96362b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        this.f96364e.request(j10);
    }
}
