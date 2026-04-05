package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l extends hu.c implements mt.q {

    /* renamed from: e, reason: collision with root package name */
    public final st.q f95832e;

    /* renamed from: f, reason: collision with root package name */
    public tw.d f95833f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f95834g;

    public l(tw.c cVar, st.q qVar) {
        super(cVar);
        this.f95832e = qVar;
    }

    @Override // hu.c, hu.a, vt.l, tw.d
    public void cancel() {
        super.cancel();
        this.f95833f.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95834g) {
            return;
        }
        this.f95834g = true;
        complete(Boolean.TRUE);
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95834g) {
            mu.a.onError(th2);
        } else {
            this.f95834g = true;
            this.f59162b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95834g) {
            return;
        }
        try {
            if (this.f95832e.test(obj)) {
                return;
            }
            this.f95834g = true;
            this.f95833f.cancel();
            complete(Boolean.FALSE);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f95833f.cancel();
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95833f, dVar)) {
            this.f95833f = dVar;
            this.f59162b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
