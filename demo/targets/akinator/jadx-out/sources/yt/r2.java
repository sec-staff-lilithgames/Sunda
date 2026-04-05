package yt;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r2 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final long f96228e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f96229f;

    /* renamed from: g, reason: collision with root package name */
    public final mt.m0 f96230g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f96231h;

    public r2(mt.l lVar, long j10, TimeUnit timeUnit, mt.m0 m0Var, boolean z10) {
        super(lVar);
        this.f96228e = j10;
        this.f96229f = timeUnit;
        this.f96230g = m0Var;
        this.f96231h = z10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        tw.c dVar = this.f96231h ? cVar : new qu.d(cVar);
        this.f95121c.subscribe((mt.q) new q2(dVar, this.f96228e, this.f96229f, this.f96230g.createWorker(), this.f96231h));
    }
}
