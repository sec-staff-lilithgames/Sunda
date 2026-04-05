package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u6 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.o f11079c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11080e;

    public u6(mt.g0 g0Var, st.o oVar, boolean z10) {
        super(g0Var);
        this.f11079c = oVar;
        this.f11080e = z10;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        t6 t6Var = new t6(i0Var, this.f11079c, this.f11080e);
        i0Var.onSubscribe(t6Var.f11036f);
        this.f10053b.subscribe(t6Var);
    }
}
