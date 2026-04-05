package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n2 implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98704b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f98705c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f98706e;

    public n2(mt.v vVar, st.o oVar) {
        this.f98704b = vVar;
        this.f98705c = oVar;
    }

    @Override // pt.c
    public void dispose() {
        pt.c cVar = this.f98706e;
        this.f98706e = tt.d.f87352b;
        cVar.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f98706e.isDisposed();
    }

    @Override // mt.v
    public void onComplete() {
        this.f98704b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98704b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98706e, cVar)) {
            this.f98706e = cVar;
            this.f98704b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        mt.v vVar = this.f98704b;
        try {
            vVar.onSuccess(ut.o0.requireNonNull(this.f98705c.apply(obj), "The mapper returned a null item"));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            vVar.onError(th2);
        }
    }
}
