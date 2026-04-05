package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class uc extends a {

    /* renamed from: c, reason: collision with root package name */
    public final mt.g0 f11103c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f11104e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11105f;

    public uc(mt.g0 g0Var, mt.g0 g0Var2, st.o oVar, int i10) {
        super(g0Var);
        this.f11103c = g0Var2;
        this.f11104e = oVar;
        this.f11105f = i10;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new sc(new ku.m(i0Var), this.f11103c, this.f11104e, this.f11105f));
    }
}
