package yt;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class rc extends a {

    /* renamed from: e, reason: collision with root package name */
    public final long f96278e;

    /* renamed from: f, reason: collision with root package name */
    public final long f96279f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeUnit f96280g;

    /* renamed from: h, reason: collision with root package name */
    public final mt.m0 f96281h;

    /* renamed from: i, reason: collision with root package name */
    public final int f96282i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f96283j;

    public rc(mt.l lVar, long j10, long j11, TimeUnit timeUnit, mt.m0 m0Var, int i10, boolean z10) {
        super(lVar);
        this.f96278e = j10;
        this.f96279f = j11;
        this.f96280g = timeUnit;
        this.f96281h = m0Var;
        this.f96282i = i10;
        this.f96283j = z10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new qc(cVar, this.f96278e, this.f96279f, this.f96280g, this.f96281h, this.f96282i, this.f96283j));
    }
}
