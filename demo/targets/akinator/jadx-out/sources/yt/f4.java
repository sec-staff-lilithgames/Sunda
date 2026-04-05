package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f4 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.o f95468e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95469f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f95470g;

    public f4(mt.l lVar, st.o oVar, boolean z10, int i10) {
        super(lVar);
        this.f95468e = oVar;
        this.f95470g = z10;
        this.f95469f = i10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new e4(this.f95469f, this.f95468e, cVar, this.f95470g));
    }
}
