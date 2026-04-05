package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final w f98796b;

    /* renamed from: c, reason: collision with root package name */
    public final tw.b f98797c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f98798e;

    public v(mt.v vVar, tw.b bVar) {
        this.f98796b = new w(vVar);
        this.f98797c = bVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f98798e.dispose();
        this.f98798e = tt.d.f87352b;
        hu.g.cancel(this.f98796b);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f98796b.get() == hu.g.f59176b;
    }

    @Override // mt.v
    public void onComplete() {
        this.f98798e = tt.d.f87352b;
        this.f98797c.subscribe(this.f98796b);
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98798e = tt.d.f87352b;
        w wVar = this.f98796b;
        wVar.f98808e = th2;
        this.f98797c.subscribe(wVar);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98798e, cVar)) {
            this.f98798e = cVar;
            this.f98796b.f98806b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98798e = tt.d.f87352b;
        w wVar = this.f98796b;
        wVar.f98807c = obj;
        this.f98797c.subscribe(wVar);
    }
}
