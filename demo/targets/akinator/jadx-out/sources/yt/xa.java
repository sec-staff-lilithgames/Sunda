package yt;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class xa extends a {

    /* renamed from: e, reason: collision with root package name */
    public final long f96565e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f96566f;

    /* renamed from: g, reason: collision with root package name */
    public final mt.m0 f96567g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f96568h;

    public xa(mt.l lVar, long j10, TimeUnit timeUnit, mt.m0 m0Var, boolean z10) {
        super(lVar);
        this.f96565e = j10;
        this.f96566f = timeUnit;
        this.f96567g = m0Var;
        this.f96568h = z10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        qu.d dVar = new qu.d(cVar);
        boolean z10 = this.f96568h;
        mt.l lVar = this.f95121c;
        if (z10) {
            lVar.subscribe((mt.q) new ua(dVar, this.f96565e, this.f96566f, this.f96567g));
        } else {
            lVar.subscribe((mt.q) new va(dVar, this.f96565e, this.f96566f, this.f96567g));
        }
    }
}
