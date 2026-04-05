package au;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final mt.l f8209c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f8210e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8211f;

    public v(mt.l lVar, st.o oVar, boolean z10) {
        this.f8209c = lVar;
        this.f8210e = oVar;
        this.f8211f = z10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f8209c.subscribe((mt.q) new u(cVar, this.f8210e, this.f8211f));
    }
}
