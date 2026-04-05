package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class zb extends a {

    /* renamed from: e, reason: collision with root package name */
    public final tw.b f96653e;

    public zb(mt.l lVar, tw.b bVar) {
        super(lVar);
        this.f96653e = bVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        yb ybVar = new yb(cVar);
        cVar.onSubscribe(ybVar);
        this.f96653e.subscribe(ybVar.f96612f);
        this.f95121c.subscribe((mt.q) ybVar);
    }
}
