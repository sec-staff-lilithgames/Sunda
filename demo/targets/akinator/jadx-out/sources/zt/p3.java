package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p3 extends mt.n0 implements vt.f {

    /* renamed from: b, reason: collision with root package name */
    public final mt.y f98728b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.t0 f98729c;

    public p3(mt.y yVar, mt.t0 t0Var) {
        this.f98728b = yVar;
        this.f98729c = t0Var;
    }

    @Override // vt.f
    public mt.y source() {
        return this.f98728b;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f98728b.subscribe(new o3(q0Var, this.f98729c));
    }
}
