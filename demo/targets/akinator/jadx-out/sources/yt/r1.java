package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r1 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final mt.y f96227e;

    public r1(mt.l lVar, mt.y yVar) {
        super(lVar);
        this.f96227e = yVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new q1(cVar, this.f96227e));
    }
}
