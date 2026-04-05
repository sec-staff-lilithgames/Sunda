package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h1 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10373c;

    /* renamed from: e, reason: collision with root package name */
    public final iu.k f10374e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10375f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10376g;

    public h1(mt.g0 g0Var, st.o oVar, iu.k kVar, int i10, int i11) {
        super(g0Var);
        this.f10373c = oVar;
        this.f10374e = kVar;
        this.f10375f = i10;
        this.f10376g = i11;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new g1(i0Var, this.f10373c, this.f10375f, this.f10376g, this.f10374e));
    }
}
