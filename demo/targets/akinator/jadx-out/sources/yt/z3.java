package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z3 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.q f96641e;

    public z3(mt.l lVar, st.q qVar) {
        super(lVar);
        this.f96641e = qVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        boolean z10 = cVar instanceof vt.a;
        st.q qVar = this.f96641e;
        mt.l lVar = this.f95121c;
        if (z10) {
            lVar.subscribe((mt.q) new x3((vt.a) cVar, qVar));
        } else {
            lVar.subscribe((mt.q) new y3(cVar, qVar));
        }
    }
}
