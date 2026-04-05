package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u9 extends rt.a {

    /* renamed from: c, reason: collision with root package name */
    public final rt.a f96411c;

    /* renamed from: e, reason: collision with root package name */
    public final mt.l f96412e;

    public u9(rt.a aVar, mt.l lVar) {
        this.f96411c = aVar;
        this.f96412e = lVar;
    }

    @Override // rt.a
    public void connect(st.g gVar) {
        this.f96411c.connect(gVar);
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f96412e.subscribe(cVar);
    }
}
