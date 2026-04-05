package yt;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class xe extends a {

    /* renamed from: e, reason: collision with root package name */
    public final long f96572e;

    /* renamed from: f, reason: collision with root package name */
    public final long f96573f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeUnit f96574g;

    /* renamed from: h, reason: collision with root package name */
    public final mt.m0 f96575h;

    /* renamed from: i, reason: collision with root package name */
    public final long f96576i;

    /* renamed from: j, reason: collision with root package name */
    public final int f96577j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f96578k;

    public xe(mt.l lVar, long j10, long j11, TimeUnit timeUnit, mt.m0 m0Var, long j12, int i10, boolean z10) {
        super(lVar);
        this.f96572e = j10;
        this.f96573f = j11;
        this.f96574g = timeUnit;
        this.f96575h = m0Var;
        this.f96576i = j12;
        this.f96577j = i10;
        this.f96578k = z10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        qu.d dVar = new qu.d(cVar);
        long j10 = this.f96572e;
        long j11 = this.f96573f;
        mt.l lVar = this.f95121c;
        if (j10 != j11) {
            lVar.subscribe((mt.q) new we(dVar, j10, j11, this.f96574g, this.f96575h.createWorker(), this.f96577j));
            return;
        }
        long j12 = this.f96576i;
        if (j12 == Long.MAX_VALUE) {
            lVar.subscribe((mt.q) new te(dVar, j10, this.f96574g, this.f96575h, this.f96577j));
        } else {
            lVar.subscribe((mt.q) new se(dVar, j10, this.f96574g, this.f96575h, this.f96577j, j12, this.f96578k));
        }
    }
}
