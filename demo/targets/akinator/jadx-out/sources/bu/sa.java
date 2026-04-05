package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class sa extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10977c;

    /* renamed from: e, reason: collision with root package name */
    public final int f10978e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10979f;

    public sa(mt.g0 g0Var, st.o oVar, int i10, boolean z10) {
        super(g0Var);
        this.f10977c = oVar;
        this.f10978e = i10;
        this.f10979f = z10;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        mt.g0 g0Var = this.f10053b;
        st.o oVar = this.f10977c;
        if (k9.tryScalarXMapSubscribe(g0Var, i0Var, oVar)) {
            return;
        }
        g0Var.subscribe(new ra(i0Var, oVar, this.f10978e, this.f10979f));
    }
}
