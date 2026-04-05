package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l1 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.o f95837e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95838f;

    /* renamed from: g, reason: collision with root package name */
    public final int f95839g;

    /* renamed from: h, reason: collision with root package name */
    public final iu.k f95840h;

    public l1(mt.l lVar, st.o oVar, int i10, int i11, iu.k kVar) {
        super(lVar);
        this.f95837e = oVar;
        this.f95838f = i10;
        this.f95839g = i11;
        this.f95840h = kVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new k1(cVar, this.f95837e, this.f95838f, this.f95839g, this.f95840h));
    }
}
