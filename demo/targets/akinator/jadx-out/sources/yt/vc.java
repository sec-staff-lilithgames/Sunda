package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class vc extends a {

    /* renamed from: e, reason: collision with root package name */
    public final tw.b f96467e;

    public vc(mt.l lVar, tw.b bVar) {
        super(lVar);
        this.f96467e = bVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        uc ucVar = new uc(cVar);
        cVar.onSubscribe(ucVar);
        this.f96467e.subscribe(ucVar.f96419g);
        this.f95121c.subscribe((mt.q) ucVar);
    }
}
