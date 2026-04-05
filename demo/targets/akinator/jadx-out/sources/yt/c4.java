package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c4 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.o f95251e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f95252f;

    /* renamed from: g, reason: collision with root package name */
    public final int f95253g;

    /* renamed from: h, reason: collision with root package name */
    public final int f95254h;

    public c4(mt.l lVar, st.o oVar, boolean z10, int i10, int i11) {
        super(lVar);
        this.f95251e = oVar;
        this.f95252f = z10;
        this.f95253g = i10;
        this.f95254h = i11;
    }

    public static <T, U> mt.q subscribe(tw.c cVar, st.o oVar, boolean z10, int i10, int i11) {
        return new b4(cVar, oVar, z10, i10, i11);
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        mt.l lVar = this.f95121c;
        st.o oVar = this.f95251e;
        if (za.tryScalarXMapSubscribe(lVar, cVar, oVar)) {
            return;
        }
        lVar.subscribe(subscribe(cVar, oVar, this.f95252f, this.f95253g, this.f95254h));
    }
}
