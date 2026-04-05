package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z9 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f11316b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11317c;

    public z9(mt.g0 g0Var, Object obj) {
        this.f11316b = g0Var;
        this.f11317c = obj;
    }

    @Override // mt.n0
    public void subscribeActual(mt.q0 q0Var) {
        this.f11316b.subscribe(new y9(q0Var, this.f11317c));
    }
}
