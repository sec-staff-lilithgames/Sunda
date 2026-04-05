package au;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.l f8060b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f8061c;

    /* renamed from: e, reason: collision with root package name */
    public final iu.k f8062e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8063f;

    public g(mt.l lVar, st.o oVar, iu.k kVar, int i10) {
        this.f8060b = lVar;
        this.f8061c = oVar;
        this.f8062e = kVar;
        this.f8063f = i10;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        this.f8060b.subscribe((mt.q) new f(fVar, this.f8061c, this.f8062e, this.f8063f));
    }
}
