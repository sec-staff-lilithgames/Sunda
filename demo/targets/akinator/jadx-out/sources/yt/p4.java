package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p4 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.o f96106e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f96107f;

    /* renamed from: g, reason: collision with root package name */
    public final int f96108g;

    public p4(mt.l lVar, st.o oVar, boolean z10, int i10) {
        super(lVar);
        this.f96106e = oVar;
        this.f96107f = z10;
        this.f96108g = i10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new o4(this.f96108g, this.f96106e, cVar, this.f96107f));
    }
}
