package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g3 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.g f98619c;

    /* renamed from: e, reason: collision with root package name */
    public final st.g f98620e;

    /* renamed from: f, reason: collision with root package name */
    public final st.g f98621f;

    /* renamed from: g, reason: collision with root package name */
    public final st.a f98622g;

    /* renamed from: h, reason: collision with root package name */
    public final st.a f98623h;

    /* renamed from: i, reason: collision with root package name */
    public final st.a f98624i;

    public g3(mt.y yVar, st.g gVar, st.g gVar2, st.g gVar3, st.a aVar, st.a aVar2, st.a aVar3) {
        super(yVar);
        this.f98619c = gVar;
        this.f98620e = gVar2;
        this.f98621f = gVar3;
        this.f98622g = aVar;
        this.f98623h = aVar2;
        this.f98624i = aVar3;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f98526b.subscribe(new f3(vVar, this));
    }
}
