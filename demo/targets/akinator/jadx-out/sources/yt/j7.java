package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j7 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final mt.i f95736e;

    public j7(mt.l lVar, mt.i iVar) {
        super(lVar);
        this.f95736e = iVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        i7 i7Var = new i7(cVar);
        cVar.onSubscribe(i7Var);
        this.f95121c.subscribe((mt.q) i7Var);
        this.f95736e.subscribe(i7Var.f95672e);
    }
}
