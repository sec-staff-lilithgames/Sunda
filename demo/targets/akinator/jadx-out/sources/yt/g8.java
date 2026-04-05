package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g8 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.o f95539e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f95540f;

    public g8(mt.l lVar, st.o oVar, boolean z10) {
        super(lVar);
        this.f95539e = oVar;
        this.f95540f = z10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        f8 f8Var = new f8(cVar, this.f95539e, this.f95540f);
        cVar.onSubscribe(f8Var);
        this.f95121c.subscribe((mt.q) f8Var);
    }
}
