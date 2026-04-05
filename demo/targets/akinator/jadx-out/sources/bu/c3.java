package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c3 extends mt.s implements vt.d {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f10163b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10164c;

    public c3(mt.g0 g0Var, long j10) {
        this.f10163b = g0Var;
        this.f10164c = j10;
    }

    @Override // vt.d
    public mt.b0 fuseToObservable() {
        return mu.a.onAssembly(new a3(this.f10163b, this.f10164c, null, false));
    }

    @Override // mt.s
    public void subscribeActual(mt.v vVar) {
        this.f10163b.subscribe(new b3(vVar, this.f10164c));
    }
}
