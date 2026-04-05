package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x9 extends mt.s {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f11219b;

    public x9(mt.g0 g0Var) {
        this.f11219b = g0Var;
    }

    @Override // mt.s
    public void subscribeActual(mt.v vVar) {
        this.f11219b.subscribe(new w9(vVar));
    }
}
