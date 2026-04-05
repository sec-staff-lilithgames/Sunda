package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e3 extends mt.n0 implements vt.d {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f10248b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10249c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10250e;

    public e3(mt.g0 g0Var, long j10, Object obj) {
        this.f10248b = g0Var;
        this.f10249c = j10;
        this.f10250e = obj;
    }

    @Override // vt.d
    public mt.b0 fuseToObservable() {
        return mu.a.onAssembly(new a3(this.f10248b, this.f10249c, this.f10250e, true));
    }

    @Override // mt.n0
    public void subscribeActual(mt.q0 q0Var) {
        this.f10248b.subscribe(new d3(q0Var, this.f10249c, this.f10250e));
    }
}
