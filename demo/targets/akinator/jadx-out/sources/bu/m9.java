package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m9 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.c f10655c;

    public m9(mt.g0 g0Var, st.c cVar) {
        super(g0Var);
        this.f10655c = cVar;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new l9(i0Var, this.f10655c));
    }
}
