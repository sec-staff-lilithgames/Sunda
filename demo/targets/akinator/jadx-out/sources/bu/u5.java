package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u5 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final mt.g0 f11075c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f11076e;

    /* renamed from: f, reason: collision with root package name */
    public final st.o f11077f;

    /* renamed from: g, reason: collision with root package name */
    public final st.c f11078g;

    public u5(mt.g0 g0Var, mt.g0 g0Var2, st.o oVar, st.o oVar2, st.c cVar) {
        super(g0Var);
        this.f11075c = g0Var2;
        this.f11076e = oVar;
        this.f11077f = oVar2;
        this.f11078g = cVar;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        t5 t5Var = new t5(i0Var, this.f11076e, this.f11077f, this.f11078g);
        i0Var.onSubscribe(t5Var);
        r4 r4Var = new r4(t5Var, true);
        pt.b bVar = t5Var.f11022e;
        bVar.add(r4Var);
        r4 r4Var2 = new r4(t5Var, false);
        bVar.add(r4Var2);
        this.f10053b.subscribe(r4Var);
        this.f11075c.subscribe(r4Var2);
    }
}
