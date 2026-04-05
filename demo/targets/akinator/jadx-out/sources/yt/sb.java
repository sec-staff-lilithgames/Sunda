package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class sb extends a {

    /* renamed from: e, reason: collision with root package name */
    public final long f96321e;

    public sb(mt.l lVar, long j10) {
        super(lVar);
        this.f96321e = j10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new rb(cVar, this.f96321e));
    }
}
