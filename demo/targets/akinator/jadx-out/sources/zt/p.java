package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p extends mt.n0 implements vt.f {

    /* renamed from: b, reason: collision with root package name */
    public final mt.y f98720b;

    public p(mt.y yVar) {
        this.f98720b = yVar;
    }

    @Override // vt.f
    public mt.y source() {
        return this.f98720b;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f98720b.subscribe(new o(q0Var));
    }
}
