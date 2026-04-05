package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a9 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final long f95151c;

    /* renamed from: e, reason: collision with root package name */
    public final long f95152e;

    public a9(long j10, long j11) {
        this.f95151c = j10;
        this.f95152e = j10 + j11;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        if (cVar instanceof vt.a) {
            cVar.onSubscribe(new z8((vt.a) cVar, this.f95151c, this.f95152e, 0));
        } else {
            cVar.onSubscribe(new z8(cVar, this.f95151c, this.f95152e, 1));
        }
    }
}
