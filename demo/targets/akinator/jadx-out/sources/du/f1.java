package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f1 extends mt.s {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52725b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f52726c;

    public f1(mt.t0 t0Var, st.o oVar) {
        this.f52726c = oVar;
        this.f52725b = t0Var;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f52725b.subscribe(new e1(vVar, this.f52726c));
    }
}
