package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g0 implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98613b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f98614c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f98615e;

    public g0(mt.v vVar, st.g gVar) {
        this.f98613b = vVar;
        this.f98614c = gVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f98615e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f98615e.isDisposed();
    }

    @Override // mt.v
    public void onComplete() {
        this.f98613b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98613b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98615e, cVar)) {
            this.f98615e = cVar;
            this.f98613b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98613b.onSuccess(obj);
        try {
            this.f98614c.accept(obj);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
        }
    }
}
