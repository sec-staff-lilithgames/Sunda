package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y4 extends mt.c implements vt.d {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f11244b;

    public y4(mt.g0 g0Var) {
        this.f11244b = g0Var;
    }

    @Override // vt.d
    public mt.b0 fuseToObservable() {
        return mu.a.onAssembly(new w4(this.f11244b));
    }

    @Override // mt.c
    public void subscribeActual(mt.f fVar) {
        this.f11244b.subscribe(new x4(fVar));
    }
}
