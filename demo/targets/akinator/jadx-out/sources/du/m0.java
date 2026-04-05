package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m0 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52782b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f52783c;

    public m0(mt.t0 t0Var, st.g gVar) {
        this.f52782b = t0Var;
        this.f52783c = gVar;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f52782b.subscribe(new l0(q0Var, this.f52783c));
    }
}
