package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.q f10992c;

    public t(mt.g0 g0Var, st.q qVar) {
        super(g0Var);
        this.f10992c = qVar;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new s(i0Var, this.f10992c));
    }
}
