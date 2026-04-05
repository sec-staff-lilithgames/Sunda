package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r0 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.y f98743b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.y f98744c;

    /* renamed from: e, reason: collision with root package name */
    public final st.d f98745e;

    public r0(mt.y yVar, mt.y yVar2, st.d dVar) {
        this.f98743b = yVar;
        this.f98744c = yVar2;
        this.f98745e = dVar;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        p0 p0Var = new p0(q0Var, this.f98745e);
        q0Var.onSubscribe(p0Var);
        this.f98743b.subscribe(p0Var.f98722c);
        this.f98744c.subscribe(p0Var.f98723e);
    }
}
