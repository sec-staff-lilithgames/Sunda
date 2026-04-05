package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v2 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.a f11115c;

    public v2(mt.g0 g0Var, st.a aVar) {
        super(g0Var);
        this.f11115c = aVar;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new u2(i0Var, this.f11115c));
    }
}
