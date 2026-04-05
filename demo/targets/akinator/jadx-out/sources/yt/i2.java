package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i2 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.o f95644e;

    public i2(mt.l lVar, st.o oVar) {
        super(lVar);
        this.f95644e = oVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new h2(new qu.d(cVar), this.f95644e));
    }
}
