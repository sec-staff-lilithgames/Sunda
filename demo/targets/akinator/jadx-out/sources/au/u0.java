package au;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u0 extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f8207b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f8208c;

    public u0(mt.t0 t0Var, st.o oVar) {
        this.f8207b = t0Var;
        this.f8208c = oVar;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        t0 t0Var = new t0(i0Var, this.f8208c);
        i0Var.onSubscribe(t0Var);
        this.f8207b.subscribe(t0Var);
    }
}
