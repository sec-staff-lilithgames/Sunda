package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m3 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.g f95926e;

    /* renamed from: f, reason: collision with root package name */
    public final st.g f95927f;

    /* renamed from: g, reason: collision with root package name */
    public final st.a f95928g;

    /* renamed from: h, reason: collision with root package name */
    public final st.a f95929h;

    public m3(mt.l lVar, st.g gVar, st.g gVar2, st.a aVar, st.a aVar2) {
        super(lVar);
        this.f95926e = gVar;
        this.f95927f = gVar2;
        this.f95928g = aVar;
        this.f95929h = aVar2;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        boolean z10 = cVar instanceof vt.a;
        mt.l lVar = this.f95121c;
        if (z10) {
            lVar.subscribe((mt.q) new k3((vt.a) cVar, this.f95926e, this.f95927f, this.f95928g, this.f95929h));
        } else {
            lVar.subscribe((mt.q) new l3(cVar, this.f95926e, this.f95927f, this.f95928g, this.f95929h));
        }
    }
}
