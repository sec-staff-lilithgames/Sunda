package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a1 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.o f98528c;

    /* renamed from: e, reason: collision with root package name */
    public final st.c f98529e;

    public a1(mt.y yVar, st.o oVar, st.c cVar) {
        super(yVar);
        this.f98528c = oVar;
        this.f98529e = cVar;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f98526b.subscribe(new z0(vVar, this.f98528c, this.f98529e));
    }
}
