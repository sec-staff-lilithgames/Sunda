package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c9 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.c f95261e;

    public c9(mt.l lVar, st.c cVar) {
        super(lVar);
        this.f95261e = cVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new b9(cVar, this.f95261e));
    }
}
