package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f1 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10292c;

    /* renamed from: e, reason: collision with root package name */
    public final int f10293e;

    /* renamed from: f, reason: collision with root package name */
    public final iu.k f10294f;

    public f1(mt.g0 g0Var, st.o oVar, int i10, iu.k kVar) {
        super(g0Var);
        this.f10292c = oVar;
        this.f10294f = kVar;
        this.f10293e = Math.max(8, i10);
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        mt.g0 g0Var = this.f10053b;
        st.o oVar = this.f10292c;
        if (k9.tryScalarXMapSubscribe(g0Var, i0Var, oVar)) {
            return;
        }
        iu.k kVar = iu.k.f68411b;
        int i10 = this.f10293e;
        iu.k kVar2 = this.f10294f;
        if (kVar2 == kVar) {
            g0Var.subscribe(new e1(new ku.m(i0Var), oVar, i10));
        } else {
            g0Var.subscribe(new c1(i0Var, oVar, i10, kVar2 == iu.k.f68413e));
        }
    }
}
