package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l0 implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52772b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f52773c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f52774e;

    public l0(mt.q0 q0Var, st.g gVar) {
        this.f52772b = q0Var;
        this.f52773c = gVar;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        if (this.f52774e) {
            mu.a.onError(th2);
        } else {
            this.f52772b.onError(th2);
        }
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        mt.q0 q0Var = this.f52772b;
        try {
            this.f52773c.accept(cVar);
            q0Var.onSubscribe(cVar);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f52774e = true;
            cVar.dispose();
            tt.e.error(th2, q0Var);
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        if (this.f52774e) {
            return;
        }
        this.f52772b.onSuccess(obj);
    }
}
