package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class fe extends a {

    /* renamed from: e, reason: collision with root package name */
    public final long f95493e;

    /* renamed from: f, reason: collision with root package name */
    public final long f95494f;

    /* renamed from: g, reason: collision with root package name */
    public final int f95495g;

    public fe(mt.l lVar, long j10, long j11, int i10) {
        super(lVar);
        this.f95493e = j10;
        this.f95494f = j11;
        this.f95495g = i10;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        long j10 = this.f95494f;
        long j11 = this.f95493e;
        mt.l lVar = this.f95121c;
        if (j10 == j11) {
            lVar.subscribe((mt.q) new ce(cVar, j11, this.f95495g));
            return;
        }
        if (j10 > j11) {
            lVar.subscribe((mt.q) new ee(cVar, this.f95493e, this.f95494f, this.f95495g));
        } else {
            lVar.subscribe((mt.q) new de(cVar, this.f95493e, this.f95494f, this.f95495g));
        }
    }
}
