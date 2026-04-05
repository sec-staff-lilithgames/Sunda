package xr;

import yr.r0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class k extends n implements ee, s9 {

    /* renamed from: a, reason: collision with root package name */
    public final t9 f92724a;

    /* renamed from: b, reason: collision with root package name */
    public final te f92725b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f92726c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f92727d;

    public k(yr.c1 c1Var, te teVar) {
        this.f92725b = (te) mh.p1.checkNotNull(teVar, "statsTraceCtx");
        this.f92724a = new t9(this, c1Var, teVar);
    }

    @Override // xr.n
    public final r4 a() {
        return this.f92724a;
    }

    @Override // xr.ee
    public final void cancel(wr.m6 m6Var) {
        ((yr.r0) this).f95014g.cancel(m6Var);
    }

    @Override // xr.ee
    public final void close(wr.m6 m6Var, wr.e4 e4Var) {
        mh.p1.checkNotNull(m6Var, "status");
        mh.p1.checkNotNull(e4Var, "trailers");
        if (this.f92726c) {
            return;
        }
        this.f92726c = true;
        a().close();
        wr.c4 c4Var = wr.u2.f91151b;
        e4Var.discardAll(c4Var);
        wr.c4 c4Var2 = wr.u2.f91150a;
        e4Var.discardAll(c4Var2);
        e4Var.put(c4Var, m6Var);
        if (m6Var.getDescription() != null) {
            e4Var.put(c4Var2, m6Var.getDescription());
        }
        yr.r0 r0Var = (yr.r0) this;
        r0.a aVar = r0Var.f95013f;
        mh.p1.checkState(aVar.f92671p == null, "closedStatus can only be set once");
        aVar.f92671p = m6Var;
        r0Var.f95014g.writeTrailers(e4Var, this.f92727d, m6Var);
    }

    @Override // xr.s9
    public final void deliverFrame(hf hfVar, boolean z10, boolean z11, int i10) {
        if (hfVar == null) {
            return;
        }
        if (z10) {
            z11 = false;
        }
        ((yr.r0) this).f95014g.writeFrame(hfVar, z11, i10);
    }

    @Override // xr.ee
    public wr.c getAttributes() {
        return wr.c.f90841b;
    }

    @Override // xr.ee
    public String getAuthority() {
        return null;
    }

    @Override // xr.n, xr.ue, xr.k1
    public final boolean isReady() {
        return super.isReady();
    }

    @Override // xr.ee
    public final void setDecompressor(wr.a1 a1Var) {
        ((yr.r0) this).f95013f.f92777a.setDecompressor((wr.a1) mh.p1.checkNotNull(a1Var, "decompressor"));
    }

    @Override // xr.ee
    public final void setListener(fe feVar) {
        ((yr.r0) this).f95013f.setListener(feVar);
    }

    @Override // xr.ee
    public te statsTraceContext() {
        return this.f92725b;
    }

    @Override // xr.ee
    public abstract /* synthetic */ int streamId();

    @Override // xr.ee
    public final void writeHeaders(wr.e4 e4Var, boolean z10) {
        mh.p1.checkNotNull(e4Var, "headers");
        this.f92727d = true;
        ((yr.r0) this).f95014g.writeHeaders(e4Var, z10);
    }
}
