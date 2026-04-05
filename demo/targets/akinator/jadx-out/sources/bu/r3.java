package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r3 extends mt.c implements vt.d {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f10890b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10891c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10892e;

    public r3(mt.g0 g0Var, st.o oVar, boolean z10) {
        this.f10890b = g0Var;
        this.f10891c = oVar;
        this.f10892e = z10;
    }

    @Override // vt.d
    public mt.b0 fuseToObservable() {
        return mu.a.onAssembly(new o3(this.f10890b, this.f10891c, this.f10892e));
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        this.f10890b.subscribe(new q3(fVar, this.f10891c, this.f10892e));
    }
}
