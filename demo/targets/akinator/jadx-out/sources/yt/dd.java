package yt;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class dd extends a {

    /* renamed from: e, reason: collision with root package name */
    public final long f95379e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f95380f;

    /* renamed from: g, reason: collision with root package name */
    public final mt.m0 f95381g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f95382h;

    public dd(mt.l lVar, long j10, TimeUnit timeUnit, mt.m0 m0Var, boolean z10) {
        super(lVar);
        this.f95379e = j10;
        this.f95380f = timeUnit;
        this.f95381g = m0Var;
        this.f95382h = z10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new cd(cVar, this.f95379e, this.f95380f, this.f95381g.createWorker(), this.f95382h));
    }
}
