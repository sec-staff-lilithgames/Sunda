package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class zd extends a {

    /* renamed from: e, reason: collision with root package name */
    public final mt.m0 f96655e;

    public zd(mt.l lVar, mt.m0 m0Var) {
        super(lVar);
        this.f96655e = m0Var;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new yd(cVar, this.f96655e));
    }
}
