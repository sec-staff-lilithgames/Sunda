package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w0 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52864b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f52865c;

    public w0(mt.t0 t0Var, st.o oVar) {
        this.f52865c = oVar;
        this.f52864b = t0Var;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f52864b.subscribe(new v0(q0Var, this.f52865c));
    }
}
