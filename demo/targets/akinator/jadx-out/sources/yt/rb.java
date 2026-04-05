package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class rb implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96275b;

    /* renamed from: c, reason: collision with root package name */
    public long f96276c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f96277e;

    public rb(tw.c cVar, long j10) {
        this.f96275b = cVar;
        this.f96276c = j10;
    }

    @Override // tw.d
    public void cancel() {
        this.f96277e.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96275b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f96275b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        long j10 = this.f96276c;
        if (j10 != 0) {
            this.f96276c = j10 - 1;
        } else {
            this.f96275b.onNext(obj);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96277e, dVar)) {
            long j10 = this.f96276c;
            this.f96277e = dVar;
            this.f96275b.onSubscribe(this);
            dVar.request(j10);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        this.f96277e.request(j10);
    }
}
