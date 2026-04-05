package yt;

import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u7 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final mt.m0 f96405e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f96406f;

    /* renamed from: g, reason: collision with root package name */
    public final int f96407g;

    public u7(mt.l lVar, mt.m0 m0Var, boolean z10, int i10) {
        super(lVar);
        this.f96405e = m0Var;
        this.f96406f = z10;
        this.f96407g = i10;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        m0.a aVarCreateWorker = this.f96405e.createWorker();
        boolean z10 = cVar instanceof vt.a;
        int i10 = this.f96407g;
        boolean z11 = this.f96406f;
        mt.l lVar = this.f95121c;
        if (z10) {
            lVar.subscribe((mt.q) new s7((vt.a) cVar, aVarCreateWorker, z11, i10));
        } else {
            lVar.subscribe((mt.q) new t7(cVar, aVarCreateWorker, z11, i10));
        }
    }
}
