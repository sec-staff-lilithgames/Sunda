package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t5 extends mt.c implements vt.b {

    /* renamed from: b, reason: collision with root package name */
    public final mt.l f96359b;

    public t5(mt.l lVar) {
        this.f96359b = lVar;
    }

    @Override // vt.b
    public mt.l fuseToFlowable() {
        return mu.a.onAssembly(new r5(this.f96359b));
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        this.f96359b.subscribe((mt.q) new s5(fVar));
    }
}
