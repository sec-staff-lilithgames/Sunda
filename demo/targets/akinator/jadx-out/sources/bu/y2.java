package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y2 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.g f11239c;

    /* renamed from: e, reason: collision with root package name */
    public final st.a f11240e;

    public y2(mt.b0 b0Var, st.g gVar, st.a aVar) {
        super(b0Var);
        this.f11239c = gVar;
        this.f11240e = aVar;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new wt.m(i0Var, this.f11239c, this.f11240e));
    }
}
