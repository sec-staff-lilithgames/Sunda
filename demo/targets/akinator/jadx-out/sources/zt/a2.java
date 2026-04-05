package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a2 extends mt.s implements vt.i {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f98530b;

    public a2(mt.t0 t0Var) {
        this.f98530b = t0Var;
    }

    @Override // vt.i
    public mt.t0 source() {
        return this.f98530b;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f98530b.subscribe(new z1(vVar));
    }
}
