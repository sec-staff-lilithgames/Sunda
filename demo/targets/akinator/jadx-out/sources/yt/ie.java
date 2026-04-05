package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ie extends a {

    /* renamed from: e, reason: collision with root package name */
    public final tw.b f95707e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95708f;

    public ie(mt.l lVar, tw.b bVar, int i10) {
        super(lVar);
        this.f95707e = bVar;
        this.f95708f = i10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        he heVar = new he(cVar, this.f95708f);
        cVar.onSubscribe(heVar);
        heVar.f95621h.offer(he.f95615o);
        heVar.a();
        this.f95707e.subscribe(heVar.f95618e);
        this.f95121c.subscribe((mt.q) heVar);
    }
}
