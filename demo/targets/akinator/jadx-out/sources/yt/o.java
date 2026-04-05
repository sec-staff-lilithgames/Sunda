package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o extends mt.n0 implements vt.b {

    /* renamed from: b, reason: collision with root package name */
    public final mt.l f96023b;

    /* renamed from: c, reason: collision with root package name */
    public final st.q f96024c;

    public o(mt.l lVar, st.q qVar) {
        this.f96023b = lVar;
        this.f96024c = qVar;
    }

    @Override // vt.b
    public mt.l fuseToFlowable() {
        return mu.a.onAssembly(new m(this.f96023b, this.f96024c));
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f96023b.subscribe((mt.q) new n(q0Var, this.f96024c));
    }
}
