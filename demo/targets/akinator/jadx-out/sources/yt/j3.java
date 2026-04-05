package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j3 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.a f95719e;

    public j3(mt.l lVar, st.a aVar) {
        super(lVar);
        this.f95719e = aVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        boolean z10 = cVar instanceof vt.a;
        st.a aVar = this.f95719e;
        mt.l lVar = this.f95121c;
        if (z10) {
            lVar.subscribe((mt.q) new h3((vt.a) cVar, aVar));
        } else {
            lVar.subscribe((mt.q) new i3(cVar, aVar));
        }
    }
}
