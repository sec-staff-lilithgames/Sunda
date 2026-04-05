package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z5 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f11304b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11305c;

    public z5(mt.g0 g0Var, Object obj) {
        this.f11304b = g0Var;
        this.f11305c = obj;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f11304b.subscribe(new y5(q0Var, this.f11305c));
    }
}
