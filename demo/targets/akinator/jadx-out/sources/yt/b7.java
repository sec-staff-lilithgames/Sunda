package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b7 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.o f95225e;

    public b7(mt.l lVar, st.o oVar) {
        super(lVar);
        this.f95225e = oVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        boolean z10 = cVar instanceof vt.a;
        st.o oVar = this.f95225e;
        mt.l lVar = this.f95121c;
        if (z10) {
            lVar.subscribe((mt.q) new z6((vt.a) cVar, oVar));
        } else {
            lVar.subscribe((mt.q) new a7(cVar, oVar));
        }
    }
}
