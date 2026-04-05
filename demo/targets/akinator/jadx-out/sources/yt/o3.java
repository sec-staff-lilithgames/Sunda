package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o3 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.g f96033e;

    /* renamed from: f, reason: collision with root package name */
    public final st.p f96034f;

    /* renamed from: g, reason: collision with root package name */
    public final st.a f96035g;

    public o3(mt.l lVar, st.g gVar, st.p pVar, st.a aVar) {
        super(lVar);
        this.f96033e = gVar;
        this.f96034f = pVar;
        this.f96035g = aVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new n3(cVar, this.f96033e, this.f96034f, this.f96035g));
    }
}
