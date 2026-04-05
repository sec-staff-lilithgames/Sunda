package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p7 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final mt.t0 f96123e;

    public p7(mt.l lVar, mt.t0 t0Var) {
        super(lVar);
        this.f96123e = t0Var;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        o7 o7Var = new o7(cVar);
        cVar.onSubscribe(o7Var);
        this.f95121c.subscribe((mt.q) o7Var);
        this.f96123e.subscribe(o7Var.f96057e);
    }
}
