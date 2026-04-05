package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m7 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final mt.y f95941e;

    public m7(mt.l lVar, mt.y yVar) {
        super(lVar);
        this.f95941e = yVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        l7 l7Var = new l7(cVar);
        cVar.onSubscribe(l7Var);
        this.f95121c.subscribe((mt.q) l7Var);
        this.f95941e.subscribe(l7Var.f95859e);
    }
}
