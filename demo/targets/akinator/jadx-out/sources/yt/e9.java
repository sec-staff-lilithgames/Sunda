package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e9 extends mt.s implements vt.h, vt.b {

    /* renamed from: b, reason: collision with root package name */
    public final mt.l f95426b;

    /* renamed from: c, reason: collision with root package name */
    public final st.c f95427c;

    public e9(mt.l lVar, st.c cVar) {
        this.f95426b = lVar;
        this.f95427c = cVar;
    }

    @Override // vt.b
    public mt.l fuseToFlowable() {
        return mu.a.onAssembly(new c9(this.f95426b, this.f95427c));
    }

    @Override // vt.h
    public tw.b source() {
        return this.f95426b;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f95426b.subscribe((mt.q) new d9(vVar, this.f95427c));
    }
}
