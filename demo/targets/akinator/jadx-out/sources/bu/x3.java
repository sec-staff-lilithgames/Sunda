package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x3 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.o f11204c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11205e;

    public x3(mt.g0 g0Var, st.o oVar, boolean z10) {
        super(g0Var);
        this.f11204c = oVar;
        this.f11205e = z10;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new w3(i0Var, this.f11204c, this.f11205e));
    }
}
