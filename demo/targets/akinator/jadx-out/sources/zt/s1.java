package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s1 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.o f98766c;

    public s1(mt.y yVar, st.o oVar) {
        super(yVar);
        this.f98766c = oVar;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f98526b.subscribe(new r1(vVar, this.f98766c));
    }
}
