package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l3 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10571c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10572e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10573f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10574g;

    public l3(mt.g0 g0Var, st.o oVar, boolean z10, int i10, int i11) {
        super(g0Var);
        this.f10571c = oVar;
        this.f10572e = z10;
        this.f10573f = i10;
        this.f10574g = i11;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        st.o oVar = this.f10571c;
        mt.g0 g0Var = this.f10053b;
        if (k9.tryScalarXMapSubscribe(g0Var, i0Var, oVar)) {
            return;
        }
        g0Var.subscribe(new k3(this.f10573f, this.f10574g, i0Var, this.f10571c, this.f10572e));
    }
}
