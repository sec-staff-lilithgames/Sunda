package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t1 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final mt.t0 f96345e;

    public t1(mt.l lVar, mt.t0 t0Var) {
        super(lVar);
        this.f96345e = t0Var;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new s1(cVar, this.f96345e));
    }
}
