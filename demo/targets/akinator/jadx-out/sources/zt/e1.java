package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e1 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final mt.y f98585c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f98586e;

    public e1(mt.y yVar, st.o oVar) {
        this.f98585c = yVar;
        this.f98586e = oVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f98585c.subscribe(new d1(cVar, this.f98586e));
    }
}
