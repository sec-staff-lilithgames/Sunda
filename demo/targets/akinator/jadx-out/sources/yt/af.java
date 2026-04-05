package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class af extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.c f95175e;

    /* renamed from: f, reason: collision with root package name */
    public final tw.b f95176f;

    public af(mt.l lVar, st.c cVar, tw.b bVar) {
        super(lVar);
        this.f95175e = cVar;
        this.f95176f = bVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        qu.d dVar = new qu.d(cVar);
        ze zeVar = new ze(dVar, this.f95175e);
        dVar.onSubscribe(zeVar);
        this.f95176f.subscribe(new ye(zeVar));
        this.f95121c.subscribe((mt.q) zeVar);
    }
}
