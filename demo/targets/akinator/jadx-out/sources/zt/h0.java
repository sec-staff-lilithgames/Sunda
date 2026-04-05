package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h0 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.g f98627c;

    public h0(mt.y yVar, st.g gVar) {
        super(yVar);
        this.f98627c = gVar;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f98526b.subscribe(new g0(vVar, this.f98627c));
    }
}
