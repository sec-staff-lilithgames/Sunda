package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ob extends mt.s implements vt.b {

    /* renamed from: b, reason: collision with root package name */
    public final mt.l f96083b;

    public ob(mt.l lVar) {
        this.f96083b = lVar;
    }

    @Override // vt.b
    public mt.l fuseToFlowable() {
        return mu.a.onAssembly(new mb(this.f96083b, null, false));
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f96083b.subscribe((mt.q) new nb(vVar));
    }
}
