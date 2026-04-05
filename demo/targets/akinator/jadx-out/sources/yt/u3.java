package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u3 extends mt.n0 implements vt.b {

    /* renamed from: b, reason: collision with root package name */
    public final mt.l f96395b;

    /* renamed from: c, reason: collision with root package name */
    public final long f96396c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f96397e;

    public u3(mt.l lVar, long j10, Object obj) {
        this.f96395b = lVar;
        this.f96396c = j10;
        this.f96397e = obj;
    }

    @Override // vt.b
    public mt.l fuseToFlowable() {
        return mu.a.onAssembly(new q3(this.f96395b, this.f96396c, this.f96397e, true));
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f96395b.subscribe((mt.q) new t3(q0Var, this.f96396c, this.f96397e));
    }
}
