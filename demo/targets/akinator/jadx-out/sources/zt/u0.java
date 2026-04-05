package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u0 implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98787b;

    /* renamed from: c, reason: collision with root package name */
    public final st.q f98788c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f98789e;

    public u0(mt.v vVar, st.q qVar) {
        this.f98787b = vVar;
        this.f98788c = qVar;
    }

    @Override // pt.c
    public void dispose() {
        pt.c cVar = this.f98789e;
        this.f98789e = tt.d.f87352b;
        cVar.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f98789e.isDisposed();
    }

    @Override // mt.v
    public void onComplete() {
        this.f98787b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98787b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98789e, cVar)) {
            this.f98789e = cVar;
            this.f98787b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        mt.v vVar = this.f98787b;
        try {
            if (this.f98788c.test(obj)) {
                vVar.onSuccess(obj);
            } else {
                vVar.onComplete();
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            vVar.onError(th2);
        }
    }
}
