package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p1 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final mt.i f96097e;

    public p1(mt.l lVar, mt.i iVar) {
        super(lVar);
        this.f96097e = iVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new o1(cVar, this.f96097e));
    }
}
