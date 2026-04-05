package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x extends a {

    /* renamed from: c, reason: collision with root package name */
    public final tw.b f98819c;

    public x(mt.y yVar, tw.b bVar) {
        super(yVar);
        this.f98819c = bVar;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f98526b.subscribe(new v(vVar, this.f98819c));
    }
}
