package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n3 implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95985b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f95986c;

    /* renamed from: e, reason: collision with root package name */
    public final st.p f95987e;

    /* renamed from: f, reason: collision with root package name */
    public final st.a f95988f;

    /* renamed from: g, reason: collision with root package name */
    public tw.d f95989g;

    public n3(tw.c cVar, st.g gVar, st.p pVar, st.a aVar) {
        this.f95985b = cVar;
        this.f95986c = gVar;
        this.f95988f = aVar;
        this.f95987e = pVar;
    }

    @Override // tw.d
    public void cancel() {
        tw.d dVar = this.f95989g;
        hu.g gVar = hu.g.f59176b;
        if (dVar != gVar) {
            this.f95989g = gVar;
            try {
                this.f95988f.run();
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                mu.a.onError(th2);
            }
            dVar.cancel();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95989g != hu.g.f59176b) {
            this.f95985b.onComplete();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95989g != hu.g.f59176b) {
            this.f95985b.onError(th2);
        } else {
            mu.a.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f95985b.onNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        tw.c cVar = this.f95985b;
        try {
            this.f95986c.accept(dVar);
            if (hu.g.validate(this.f95989g, dVar)) {
                this.f95989g = dVar;
                cVar.onSubscribe(this);
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            dVar.cancel();
            this.f95989g = hu.g.f59176b;
            hu.d.error(th2, cVar);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        try {
            ((ut.q) this.f95987e).accept(j10);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
        }
        this.f95989g.request(j10);
    }
}
