package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n0 extends mt.s {

    /* renamed from: b, reason: collision with root package name */
    public final mt.y f98700b;

    /* renamed from: c, reason: collision with root package name */
    public final st.a f98701c;

    public n0(mt.y yVar, st.a aVar) {
        this.f98700b = yVar;
        this.f98701c = aVar;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f98700b.subscribe(new m0(this, vVar));
    }
}
