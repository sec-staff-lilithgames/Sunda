package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u8 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.o f96408e;

    /* renamed from: f, reason: collision with root package name */
    public final int f96409f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f96410g;

    public u8(mt.l lVar, st.o oVar, int i10, boolean z10) {
        super(lVar);
        this.f96408e = oVar;
        this.f96409f = i10;
        this.f96410g = z10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        r8 r8Var = new r8(this.f96409f, this.f96410g);
        try {
            ((tw.b) ut.o0.requireNonNull(this.f96408e.apply(r8Var), "selector returned a null Publisher")).subscribe(new t8(cVar, r8Var));
            this.f95121c.subscribe((mt.q) r8Var);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            hu.d.error(th2, cVar);
        }
    }
}
