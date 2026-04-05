package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ka extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.d f95820e;

    public ka(mt.l lVar, st.d dVar) {
        super(lVar);
        this.f95820e = dVar;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        hu.f fVar = new hu.f(false);
        cVar.onSubscribe(fVar);
        new ja(cVar, this.f95820e, fVar, this.f95121c).a();
    }
}
