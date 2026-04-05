package ao;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class d2 extends j {

    /* renamed from: k, reason: collision with root package name */
    public final m0 f7613k;

    public d2(m0 m0Var) {
        this.f7613k = m0Var;
    }

    @Override // ao.j, ao.a, ao.m0
    public boolean canUpdateMediaItem(gn.p0 p0Var) {
        return this.f7613k.canUpdateMediaItem(p0Var);
    }

    @Override // ao.j, ao.a, ao.m0
    public i0 createPeriod(k0 k0Var, go.c cVar, long j10) {
        return this.f7613k.createPeriod(k0Var, cVar, j10);
    }

    @Override // ao.a
    public final void e(ln.g0 g0Var) {
        this.f7702j = g0Var;
        this.f7701i = io.bidmachine.media3.common.util.a1.createHandlerForCurrentLooper();
        prepareSourceInternal();
    }

    @Override // ao.j
    public final k0 g(Object obj, k0 k0Var) {
        return l(k0Var);
    }

    @Override // ao.j, ao.a, ao.m0
    public gn.u1 getInitialTimeline() {
        return this.f7613k.getInitialTimeline();
    }

    @Override // ao.j, ao.a, ao.m0
    public gn.p0 getMediaItem() {
        return this.f7613k.getMediaItem();
    }

    @Override // ao.j
    public final long h(Object obj, long j10) {
        return j10;
    }

    @Override // ao.j
    public final int i(Object obj, int i10) {
        return i10;
    }

    @Override // ao.j, ao.a, ao.m0
    public boolean isSingleWindow() {
        return this.f7613k.isSingleWindow();
    }

    @Override // ao.j
    public final void j(Object obj, m0 m0Var, gn.u1 u1Var) {
        m(u1Var);
    }

    public abstract void m(gn.u1 u1Var);

    public void prepareSourceInternal() {
        k(null, this.f7613k);
    }

    @Override // ao.j, ao.a, ao.m0
    public void releasePeriod(i0 i0Var) {
        this.f7613k.releasePeriod(i0Var);
    }

    @Override // ao.j, ao.a, ao.m0
    public void updateMediaItem(gn.p0 p0Var) {
        this.f7613k.updateMediaItem(p0Var);
    }

    public k0 l(k0 k0Var) {
        return k0Var;
    }
}
