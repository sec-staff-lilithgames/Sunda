package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d3 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.o f95336e;

    /* renamed from: f, reason: collision with root package name */
    public final st.d f95337f;

    public d3(mt.l lVar, st.o oVar, st.d dVar) {
        super(lVar);
        this.f95336e = oVar;
        this.f95337f = dVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        boolean z10 = cVar instanceof vt.a;
        st.d dVar = this.f95337f;
        st.o oVar = this.f95336e;
        mt.l lVar = this.f95121c;
        if (z10) {
            lVar.subscribe((mt.q) new b3((vt.a) cVar, oVar, dVar));
        } else {
            lVar.subscribe((mt.q) new c3(cVar, oVar, dVar));
        }
    }
}
