package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p1 extends mt.s {

    /* renamed from: b, reason: collision with root package name */
    public final mt.y f98725b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f98726c;

    public p1(mt.y yVar, st.o oVar) {
        this.f98725b = yVar;
        this.f98726c = oVar;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f98725b.subscribe(new n1(vVar, this.f98726c));
    }
}
