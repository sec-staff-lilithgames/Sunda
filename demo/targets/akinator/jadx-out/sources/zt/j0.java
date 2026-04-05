package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j0 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.a f98654c;

    public j0(mt.y yVar, st.a aVar) {
        super(yVar);
        this.f98654c = aVar;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f98526b.subscribe(new i0(vVar, this.f98654c));
    }
}
