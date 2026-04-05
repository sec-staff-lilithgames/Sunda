package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a0 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final tw.b f98527c;

    public a0(mt.y yVar, tw.b bVar) {
        super(yVar);
        this.f98527c = bVar;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f98527c.subscribe(new z(vVar, this.f98526b));
    }
}
