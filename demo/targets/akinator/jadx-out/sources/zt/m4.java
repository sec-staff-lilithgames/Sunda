package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m4 extends mt.n0 implements vt.f {

    /* renamed from: b, reason: collision with root package name */
    public final mt.y f98696b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f98697c;

    public m4(mt.y yVar, Object obj) {
        this.f98696b = yVar;
        this.f98697c = obj;
    }

    @Override // vt.f
    public mt.y source() {
        return this.f98696b;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f98696b.subscribe(new l4(q0Var, this.f98697c));
    }
}
