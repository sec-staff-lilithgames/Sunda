package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n extends mt.n0 implements vt.f {

    /* renamed from: b, reason: collision with root package name */
    public final mt.y f98698b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f98699c;

    public n(mt.y yVar, Object obj) {
        this.f98698b = yVar;
        this.f98699c = obj;
    }

    @Override // vt.f
    public mt.y source() {
        return this.f98698b;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f98698b.subscribe(new m(q0Var, this.f98699c));
    }
}
