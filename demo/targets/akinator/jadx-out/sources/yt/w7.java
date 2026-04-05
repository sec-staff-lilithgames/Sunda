package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w7 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final int f96489e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f96490f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f96491g;

    /* renamed from: h, reason: collision with root package name */
    public final st.a f96492h;

    public w7(mt.l lVar, int i10, boolean z10, boolean z11, st.a aVar) {
        super(lVar);
        this.f96489e = i10;
        this.f96490f = z10;
        this.f96491g = z11;
        this.f96492h = aVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new v7(cVar, this.f96489e, this.f96490f, this.f96491g, this.f96492h));
    }
}
