package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class jc extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.o f95753e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95754f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f95755g;

    public jc(mt.l lVar, st.o oVar, int i10, boolean z10) {
        super(lVar);
        this.f95753e = oVar;
        this.f95754f = i10;
        this.f95755g = z10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        mt.l lVar = this.f95121c;
        st.o oVar = this.f95753e;
        if (za.tryScalarXMapSubscribe(lVar, cVar, oVar)) {
            return;
        }
        lVar.subscribe((mt.q) new ic(this.f95754f, oVar, cVar, this.f95755g));
    }
}
