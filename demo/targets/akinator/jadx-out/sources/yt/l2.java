package yt;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l2 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final long f95841e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f95842f;

    /* renamed from: g, reason: collision with root package name */
    public final mt.m0 f95843g;

    public l2(mt.l lVar, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        super(lVar);
        this.f95841e = j10;
        this.f95842f = timeUnit;
        this.f95843g = m0Var;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new k2(new qu.d(cVar), this.f95841e, this.f95842f, this.f95843g.createWorker()));
    }
}
