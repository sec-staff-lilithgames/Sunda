package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class qb extends mt.n0 implements vt.b {

    /* renamed from: b, reason: collision with root package name */
    public final mt.l f96199b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f96200c;

    public qb(mt.l lVar, Object obj) {
        this.f96199b = lVar;
        this.f96200c = obj;
    }

    @Override // vt.b
    public mt.l fuseToFlowable() {
        return mu.a.onAssembly(new mb(this.f96199b, this.f96200c, true));
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f96199b.subscribe((mt.q) new pb(q0Var, this.f96200c));
    }
}
