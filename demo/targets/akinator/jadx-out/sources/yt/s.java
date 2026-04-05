package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s extends hu.c implements mt.q {

    /* renamed from: e, reason: collision with root package name */
    public final st.q f96288e;

    /* renamed from: f, reason: collision with root package name */
    public tw.d f96289f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f96290g;

    public s(tw.c cVar, st.q qVar) {
        super(cVar);
        this.f96288e = qVar;
    }

    @Override // hu.c, hu.a, vt.l, tw.d
    public void cancel() {
        super.cancel();
        this.f96289f.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f96290g) {
            return;
        }
        this.f96290g = true;
        complete(Boolean.FALSE);
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96290g) {
            mu.a.onError(th2);
        } else {
            this.f96290g = true;
            this.f59162b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f96290g) {
            return;
        }
        try {
            if (this.f96288e.test(obj)) {
                this.f96290g = true;
                this.f96289f.cancel();
                complete(Boolean.TRUE);
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f96289f.cancel();
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96289f, dVar)) {
            this.f96289f = dVar;
            this.f59162b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
