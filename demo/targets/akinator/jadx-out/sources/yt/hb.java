package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class hb extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final tw.b f95598c;

    /* renamed from: e, reason: collision with root package name */
    public final tw.b f95599e;

    /* renamed from: f, reason: collision with root package name */
    public final st.d f95600f;

    /* renamed from: g, reason: collision with root package name */
    public final int f95601g;

    public hb(tw.b bVar, tw.b bVar2, st.d dVar, int i10) {
        this.f95598c = bVar;
        this.f95599e = bVar2;
        this.f95600f = dVar;
        this.f95601g = i10;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        eb ebVar = new eb(cVar, this.f95601g, this.f95600f);
        cVar.onSubscribe(ebVar);
        this.f95598c.subscribe(ebVar.f95433f);
        this.f95599e.subscribe(ebVar.f95434g);
    }
}
