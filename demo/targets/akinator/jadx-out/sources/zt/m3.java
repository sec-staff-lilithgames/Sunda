package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m3 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final mt.y f98695c;

    public m3(mt.y yVar, mt.y yVar2) {
        super(yVar);
        this.f98695c = yVar2;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f98526b.subscribe(new l3(vVar, this.f98695c));
    }
}
