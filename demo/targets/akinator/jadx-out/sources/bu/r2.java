package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r2 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10888c;

    /* renamed from: e, reason: collision with root package name */
    public final st.d f10889e;

    public r2(mt.g0 g0Var, st.o oVar, st.d dVar) {
        super(g0Var);
        this.f10888c = oVar;
        this.f10889e = dVar;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new q2(i0Var, this.f10888c, this.f10889e));
    }
}
