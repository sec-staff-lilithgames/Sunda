package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ne extends a {

    /* renamed from: e, reason: collision with root package name */
    public final tw.b f96020e;

    /* renamed from: f, reason: collision with root package name */
    public final st.o f96021f;

    /* renamed from: g, reason: collision with root package name */
    public final int f96022g;

    public ne(mt.l lVar, tw.b bVar, st.o oVar, int i10) {
        super(lVar);
        this.f96020e = bVar;
        this.f96021f = oVar;
        this.f96022g = i10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new le(new qu.d(cVar), this.f96020e, this.f96021f, this.f96022g));
    }
}
