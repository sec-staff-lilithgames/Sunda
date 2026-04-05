package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z0 implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final st.o f98844b;

    /* renamed from: c, reason: collision with root package name */
    public final y0 f98845c;

    public z0(mt.v vVar, st.o oVar, st.c cVar) {
        this.f98845c = new y0(vVar, cVar);
        this.f98844b = oVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this.f98845c);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) this.f98845c.get());
    }

    @Override // mt.v
    public void onComplete() {
        this.f98845c.f98833b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98845c.f98833b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        y0 y0Var = this.f98845c;
        if (tt.d.setOnce(y0Var, cVar)) {
            y0Var.f98833b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        y0 y0Var = this.f98845c;
        try {
            mt.y yVar = (mt.y) ut.o0.requireNonNull(this.f98844b.apply(obj), "The mapper returned a null MaybeSource");
            if (tt.d.replace(y0Var, null)) {
                y0Var.f98835e = obj;
                yVar.subscribe(y0Var);
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            y0Var.f98833b.onError(th2);
        }
    }
}
