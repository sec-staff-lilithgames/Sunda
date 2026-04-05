package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o5 implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96047b;

    /* renamed from: c, reason: collision with root package name */
    public tw.d f96048c;

    public o5(tw.c cVar) {
        this.f96047b = cVar;
    }

    @Override // tw.d
    public void cancel() {
        this.f96048c.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96047b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f96047b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f96047b.onNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96048c, dVar)) {
            this.f96048c = dVar;
            this.f96047b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        this.f96048c.request(j10);
    }
}
