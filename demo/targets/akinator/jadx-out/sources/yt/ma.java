package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ma extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.q f95947e;

    /* renamed from: f, reason: collision with root package name */
    public final long f95948f;

    public ma(mt.l lVar, long j10, st.q qVar) {
        super(lVar);
        this.f95947e = qVar;
        this.f95948f = j10;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        hu.f fVar = new hu.f(false);
        cVar.onSubscribe(fVar);
        new la(cVar, this.f95948f, this.f95947e, fVar, this.f95121c).a();
    }
}
