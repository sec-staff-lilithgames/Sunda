package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s4 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final mt.g0 f10946c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f10947e;

    /* renamed from: f, reason: collision with root package name */
    public final st.o f10948f;

    /* renamed from: g, reason: collision with root package name */
    public final st.c f10949g;

    public s4(mt.g0 g0Var, mt.g0 g0Var2, st.o oVar, st.o oVar2, st.c cVar) {
        super(g0Var);
        this.f10946c = g0Var2;
        this.f10947e = oVar;
        this.f10948f = oVar2;
        this.f10949g = cVar;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        o4 o4Var = new o4(i0Var, this.f10947e, this.f10948f, this.f10949g);
        i0Var.onSubscribe(o4Var);
        r4 r4Var = new r4(o4Var, true);
        pt.b bVar = o4Var.f10731e;
        bVar.add(r4Var);
        r4 r4Var2 = new r4(o4Var, false);
        bVar.add(r4Var2);
        this.f10053b.subscribe(r4Var);
        this.f10946c.subscribe(r4Var2);
    }
}
