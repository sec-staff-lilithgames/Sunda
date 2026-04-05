package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m9 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final long f95946e;

    public m9(mt.l lVar, long j10) {
        super(lVar);
        this.f95946e = j10;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        hu.f fVar = new hu.f(false);
        cVar.onSubscribe(fVar);
        long j10 = this.f95946e;
        new l9(cVar, j10 != Long.MAX_VALUE ? j10 - 1 : Long.MAX_VALUE, fVar, this.f95121c).a();
    }
}
