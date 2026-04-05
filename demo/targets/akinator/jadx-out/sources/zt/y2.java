package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y2 implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98837b;

    /* renamed from: c, reason: collision with root package name */
    public final st.q f98838c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f98839e;

    public y2(mt.v vVar, st.q qVar) {
        this.f98837b = vVar;
        this.f98838c = qVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f98839e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f98839e.isDisposed();
    }

    @Override // mt.v
    public void onComplete() {
        this.f98837b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        mt.v vVar = this.f98837b;
        try {
            if (this.f98838c.test(th2)) {
                vVar.onComplete();
            } else {
                vVar.onError(th2);
            }
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            vVar.onError(new qt.c(th2, th3));
        }
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98839e, cVar)) {
            this.f98839e = cVar;
            this.f98837b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98837b.onSuccess(obj);
    }
}
