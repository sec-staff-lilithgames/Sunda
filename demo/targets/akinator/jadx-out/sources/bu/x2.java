package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x2 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.g f11200c;

    /* renamed from: e, reason: collision with root package name */
    public final st.g f11201e;

    /* renamed from: f, reason: collision with root package name */
    public final st.a f11202f;

    /* renamed from: g, reason: collision with root package name */
    public final st.a f11203g;

    public x2(mt.g0 g0Var, st.g gVar, st.g gVar2, st.a aVar, st.a aVar2) {
        super(g0Var);
        this.f11200c = gVar;
        this.f11201e = gVar2;
        this.f11202f = aVar;
        this.f11203g = aVar2;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new w2(i0Var, this.f11200c, this.f11201e, this.f11202f, this.f11203g));
    }
}
