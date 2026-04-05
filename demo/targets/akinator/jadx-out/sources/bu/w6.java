package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w6 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.o f11172c;

    public w6(mt.g0 g0Var, st.o oVar) {
        super(g0Var);
        this.f11172c = oVar;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new v6(i0Var, this.f11172c));
    }
}
