package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j1 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.o f95712e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95713f;

    /* renamed from: g, reason: collision with root package name */
    public final iu.k f95714g;

    public j1(mt.l lVar, st.o oVar, int i10, iu.k kVar) {
        super(lVar);
        this.f95712e = oVar;
        this.f95713f = i10;
        this.f95714g = kVar;
    }

    public static <T, R> tw.c subscribe(tw.c cVar, st.o oVar, int i10, iu.k kVar) {
        int iOrdinal = kVar.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? new f1(cVar, oVar, i10) : new e1(i10, oVar, cVar, true) : new e1(i10, oVar, cVar, false);
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        mt.l lVar = this.f95121c;
        st.o oVar = this.f95712e;
        if (za.tryScalarXMapSubscribe(lVar, cVar, oVar)) {
            return;
        }
        lVar.subscribe(subscribe(cVar, oVar, this.f95713f, this.f95714g));
    }
}
