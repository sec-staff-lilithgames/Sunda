package au;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final mt.l f8096c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f8097e;

    /* renamed from: f, reason: collision with root package name */
    public final iu.k f8098f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8099g;

    public j(mt.l lVar, st.o oVar, iu.k kVar, int i10) {
        this.f8096c = lVar;
        this.f8097e = oVar;
        this.f8098f = kVar;
        this.f8099g = i10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f8096c.subscribe((mt.q) new i(cVar, this.f8097e, this.f8099g, this.f8098f));
    }
}
