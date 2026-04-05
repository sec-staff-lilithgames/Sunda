package au;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.l f8156b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f8157c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8158e;

    public p(mt.l lVar, st.o oVar, boolean z10) {
        this.f8156b = lVar;
        this.f8157c = oVar;
        this.f8158e = z10;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        this.f8156b.subscribe((mt.q) new o(fVar, this.f8157c, this.f8158e));
    }
}
