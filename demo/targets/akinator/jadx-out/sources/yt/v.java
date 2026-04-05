package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v extends mt.n0 implements vt.b {

    /* renamed from: b, reason: collision with root package name */
    public final mt.l f96423b;

    /* renamed from: c, reason: collision with root package name */
    public final st.q f96424c;

    public v(mt.l lVar, st.q qVar) {
        this.f96423b = lVar;
        this.f96424c = qVar;
    }

    @Override // vt.b
    public mt.l fuseToFlowable() {
        return mu.a.onAssembly(new t(this.f96423b, this.f96424c));
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f96423b.subscribe((mt.q) new u(q0Var, this.f96424c));
    }
}
