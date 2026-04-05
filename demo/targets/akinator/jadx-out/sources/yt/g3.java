package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g3 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.g f95514e;

    public g3(mt.l lVar, st.g gVar) {
        super(lVar);
        this.f95514e = gVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        boolean z10 = cVar instanceof vt.a;
        st.g gVar = this.f95514e;
        mt.l lVar = this.f95121c;
        if (z10) {
            lVar.subscribe((mt.q) new e3((vt.a) cVar, gVar));
        } else {
            lVar.subscribe((mt.q) new f3(cVar, gVar));
        }
    }
}
