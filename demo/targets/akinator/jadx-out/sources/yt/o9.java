package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o9 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.e f96081e;

    public o9(mt.l lVar, st.e eVar) {
        super(lVar);
        this.f96081e = eVar;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        hu.f fVar = new hu.f(false);
        cVar.onSubscribe(fVar);
        new n9(cVar, this.f96081e, fVar, this.f95121c).a();
    }
}
