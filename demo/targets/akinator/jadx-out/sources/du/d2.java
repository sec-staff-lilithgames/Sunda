package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d2 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52707b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f52708c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f52709e;

    public d2(mt.t0 t0Var, st.o oVar, Object obj) {
        this.f52707b = t0Var;
        this.f52708c = oVar;
        this.f52709e = obj;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f52707b.subscribe(new c2(this, q0Var));
    }
}
