package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d3 implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98572b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f98573c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f98574e;

    public d3(mt.v vVar, st.o oVar) {
        this.f98572b = vVar;
        this.f98573c = oVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f98574e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f98574e.isDisposed();
    }

    @Override // mt.v
    public void onComplete() {
        this.f98572b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        mt.v vVar = this.f98572b;
        try {
            vVar.onSuccess(ut.o0.requireNonNull(this.f98573c.apply(th2), "The valueSupplier returned a null value"));
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            vVar.onError(new qt.c(th2, th3));
        }
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98574e, cVar)) {
            this.f98574e = cVar;
            this.f98572b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98572b.onSuccess(obj);
    }
}
