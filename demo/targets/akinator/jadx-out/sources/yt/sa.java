package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class sa implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final ra f96320b;

    public sa(ra raVar) {
        this.f96320b = raVar;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96320b.complete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f96320b.error(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f96320b.c();
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.setOnce(this.f96320b.f96273f, dVar, Long.MAX_VALUE);
    }
}
