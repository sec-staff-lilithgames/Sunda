package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v implements mt.q0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f52855b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f52856c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f52857e;

    public v(mt.v vVar, st.o oVar) {
        this.f52855b = vVar;
        this.f52856c = oVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f52857e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f52857e.isDisposed();
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52855b.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f52857e, cVar)) {
            this.f52857e = cVar;
            this.f52855b.onSubscribe(this);
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        mt.v vVar = this.f52855b;
        try {
            mt.a0 a0Var = (mt.a0) ut.o0.requireNonNull(this.f52856c.apply(obj), "The selector returned a null Notification");
            if (a0Var.isOnNext()) {
                vVar.onSuccess(a0Var.getValue());
            } else if (a0Var.isOnComplete()) {
                vVar.onComplete();
            } else {
                vVar.onError(a0Var.getError());
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            vVar.onError(th2);
        }
    }
}
