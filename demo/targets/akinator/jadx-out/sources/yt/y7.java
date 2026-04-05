package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y7 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final long f96599e;

    /* renamed from: f, reason: collision with root package name */
    public final st.a f96600f;

    /* renamed from: g, reason: collision with root package name */
    public final mt.a f96601g;

    public y7(mt.l lVar, long j10, st.a aVar, mt.a aVar2) {
        super(lVar);
        this.f96599e = j10;
        this.f96600f = aVar;
        this.f96601g = aVar2;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new x7(cVar, this.f96600f, this.f96601g, this.f96599e));
    }
}
