package au;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final mt.i f8029c;

    /* renamed from: e, reason: collision with root package name */
    public final tw.b f8030e;

    public d(mt.i iVar, tw.b bVar) {
        this.f8029c = iVar;
        this.f8030e = bVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f8029c.subscribe(new c(this.f8030e, cVar));
    }
}
