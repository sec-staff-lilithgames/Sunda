package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class bb extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.c f95232e;

    public bb(mt.l lVar, st.c cVar) {
        super(lVar);
        this.f95232e = cVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new ab(cVar, this.f95232e));
    }
}
