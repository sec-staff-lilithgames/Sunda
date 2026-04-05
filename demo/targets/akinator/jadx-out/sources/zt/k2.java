package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k2 extends mt.n0 implements vt.f, vt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.y f98673b;

    public k2(mt.y yVar) {
        this.f98673b = yVar;
    }

    @Override // vt.c
    public mt.s fuseToMaybe() {
        return mu.a.onAssembly(new i2(this.f98673b));
    }

    @Override // vt.f
    public mt.y source() {
        return this.f98673b;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f98673b.subscribe(new j2(q0Var));
    }
}
