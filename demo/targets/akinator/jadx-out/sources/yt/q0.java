package yt;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q0 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final long f96156e;

    /* renamed from: f, reason: collision with root package name */
    public final long f96157f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeUnit f96158g;

    /* renamed from: h, reason: collision with root package name */
    public final mt.m0 f96159h;

    /* renamed from: i, reason: collision with root package name */
    public final Callable f96160i;

    /* renamed from: j, reason: collision with root package name */
    public final int f96161j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f96162k;

    public q0(mt.l lVar, long j10, long j11, TimeUnit timeUnit, mt.m0 m0Var, Callable<Collection<Object>> callable, int i10, boolean z10) {
        super(lVar);
        this.f96156e = j10;
        this.f96157f = j11;
        this.f96158g = timeUnit;
        this.f96159h = m0Var;
        this.f96160i = callable;
        this.f96161j = i10;
        this.f96162k = z10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        long j10 = this.f96156e;
        long j11 = this.f96157f;
        mt.l lVar = this.f95121c;
        if (j10 == j11 && this.f96161j == Integer.MAX_VALUE) {
            lVar.subscribe((mt.q) new n0(new qu.d(cVar), this.f96160i, this.f96156e, this.f96158g, this.f96159h));
            return;
        }
        m0.a aVarCreateWorker = this.f96159h.createWorker();
        if (j10 == j11) {
            lVar.subscribe((mt.q) new m0(new qu.d(cVar), this.f96160i, this.f96156e, this.f96158g, this.f96161j, this.f96162k, aVarCreateWorker));
            return;
        }
        lVar.subscribe((mt.q) new p0(new qu.d(cVar), this.f96160i, this.f96156e, this.f96157f, this.f96158g, aVarCreateWorker));
    }
}
