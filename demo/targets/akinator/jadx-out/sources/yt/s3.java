package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s3 extends mt.s implements vt.b {

    /* renamed from: b, reason: collision with root package name */
    public final mt.l f96305b;

    /* renamed from: c, reason: collision with root package name */
    public final long f96306c;

    public s3(mt.l lVar, long j10) {
        this.f96305b = lVar;
        this.f96306c = j10;
    }

    @Override // vt.b
    public mt.l fuseToFlowable() {
        return mu.a.onAssembly(new q3(this.f96305b, this.f96306c, null, false));
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f96305b.subscribe((mt.q) new r3(vVar, this.f96306c));
    }
}
