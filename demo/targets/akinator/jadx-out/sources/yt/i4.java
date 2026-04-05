package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i4 extends mt.c implements vt.b {

    /* renamed from: b, reason: collision with root package name */
    public final mt.l f95650b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f95651c;

    /* renamed from: e, reason: collision with root package name */
    public final int f95652e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f95653f;

    public i4(mt.l lVar, st.o oVar, boolean z10, int i10) {
        this.f95650b = lVar;
        this.f95651c = oVar;
        this.f95653f = z10;
        this.f95652e = i10;
    }

    @Override // vt.b
    public mt.l fuseToFlowable() {
        return mu.a.onAssembly(new f4(this.f95650b, this.f95651c, this.f95653f, this.f95652e));
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        this.f95650b.subscribe((mt.q) new h4(fVar, this.f95651c, this.f95653f, this.f95652e));
    }
}
