package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b9 extends hu.c implements mt.q {

    /* renamed from: e, reason: collision with root package name */
    public final st.c f95229e;

    /* renamed from: f, reason: collision with root package name */
    public tw.d f95230f;

    public b9(tw.c cVar, st.c cVar2) {
        super(cVar);
        this.f95229e = cVar2;
    }

    @Override // hu.c, hu.a, vt.l, tw.d
    public void cancel() {
        super.cancel();
        this.f95230f.cancel();
        this.f95230f = hu.g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        tw.d dVar = this.f95230f;
        hu.g gVar = hu.g.f59176b;
        if (dVar == gVar) {
            return;
        }
        this.f95230f = gVar;
        Object obj = this.f59163c;
        if (obj != null) {
            complete(obj);
        } else {
            this.f59162b.onComplete();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        tw.d dVar = this.f95230f;
        hu.g gVar = hu.g.f59176b;
        if (dVar == gVar) {
            mu.a.onError(th2);
        } else {
            this.f95230f = gVar;
            this.f59162b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95230f == hu.g.f59176b) {
            return;
        }
        Object obj2 = this.f59163c;
        if (obj2 == null) {
            this.f59163c = obj;
            return;
        }
        try {
            this.f59163c = ut.o0.requireNonNull(this.f95229e.apply(obj2, obj), "The reducer returned a null value");
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f95230f.cancel();
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95230f, dVar)) {
            this.f95230f = dVar;
            this.f59162b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
