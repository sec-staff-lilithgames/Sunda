package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y6 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final long f96598e;

    public y6(mt.l lVar, long j10) {
        super(lVar);
        this.f96598e = j10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new x6(cVar, this.f96598e));
    }
}
