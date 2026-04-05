package au;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final mt.l f8129c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f8130e;

    /* renamed from: f, reason: collision with root package name */
    public final iu.k f8131f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8132g;

    public m(mt.l lVar, st.o oVar, iu.k kVar, int i10) {
        this.f8129c = lVar;
        this.f8130e = oVar;
        this.f8131f = kVar;
        this.f8132g = i10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f8129c.subscribe((mt.q) new l(cVar, this.f8130e, this.f8132g, this.f8131f));
    }
}
