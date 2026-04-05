package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class gc extends a {

    /* renamed from: e, reason: collision with root package name */
    public final tw.b f95552e;

    public gc(mt.l lVar, tw.b bVar) {
        super(lVar);
        this.f95552e = bVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        fc fcVar = new fc(this.f95552e, cVar);
        cVar.onSubscribe(fcVar.f95489e);
        this.f95121c.subscribe((mt.q) fcVar);
    }
}
