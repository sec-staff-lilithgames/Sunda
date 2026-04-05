package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final y f98841b;

    /* renamed from: c, reason: collision with root package name */
    public mt.y f98842c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f98843e;

    public z(mt.v vVar, mt.y yVar) {
        this.f98841b = new y(vVar);
        this.f98842c = yVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f98843e.cancel();
        this.f98843e = hu.g.f59176b;
        tt.d.dispose(this.f98841b);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) this.f98841b.get());
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        tw.d dVar = this.f98843e;
        hu.g gVar = hu.g.f59176b;
        if (dVar != gVar) {
            this.f98843e = gVar;
            mt.y yVar = this.f98842c;
            this.f98842c = null;
            yVar.subscribe(this.f98841b);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        tw.d dVar = this.f98843e;
        hu.g gVar = hu.g.f59176b;
        if (dVar == gVar) {
            mu.a.onError(th2);
        } else {
            this.f98843e = gVar;
            this.f98841b.f98832b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        tw.d dVar = this.f98843e;
        hu.g gVar = hu.g.f59176b;
        if (dVar != gVar) {
            dVar.cancel();
            this.f98843e = gVar;
            mt.y yVar = this.f98842c;
            this.f98842c = null;
            yVar.subscribe(this.f98841b);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f98843e, dVar)) {
            this.f98843e = dVar;
            this.f98841b.f98832b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
