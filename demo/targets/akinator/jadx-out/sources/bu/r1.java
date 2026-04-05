package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r1 extends mt.n0 implements vt.d {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f10887b;

    public r1(mt.g0 g0Var) {
        this.f10887b = g0Var;
    }

    @Override // vt.d
    public mt.b0 fuseToObservable() {
        return mu.a.onAssembly(new p1(this.f10887b));
    }

    @Override // mt.n0
    public void subscribeActual(mt.q0 q0Var) {
        this.f10887b.subscribe(new q1(q0Var));
    }
}
