package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u1 extends hu.c implements mt.q {

    /* renamed from: e, reason: collision with root package name */
    public tw.d f96391e;

    /* renamed from: f, reason: collision with root package name */
    public long f96392f;

    @Override // hu.c, hu.a, vt.l, tw.d
    public void cancel() {
        super.cancel();
        this.f96391e.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        complete(Long.valueOf(this.f96392f));
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f59162b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f96392f++;
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96391e, dVar)) {
            this.f96391e = dVar;
            this.f59162b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
