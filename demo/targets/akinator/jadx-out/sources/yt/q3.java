package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q3 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final long f96172e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f96173f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f96174g;

    public q3(mt.l lVar, long j10, Object obj, boolean z10) {
        super(lVar);
        this.f96172e = j10;
        this.f96173f = obj;
        this.f96174g = z10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new p3(cVar, this.f96172e, this.f96173f, this.f96174g));
    }
}
