package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g extends qu.a {

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f95504c;

    public f getIterable() {
        return new f(this);
    }

    @Override // qu.a, mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95504c = iu.u.complete();
    }

    @Override // qu.a, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f95504c = iu.u.error(th2);
    }

    @Override // qu.a, mt.q, tw.c
    public void onNext(Object obj) {
        this.f95504c = iu.u.next(obj);
    }
}
