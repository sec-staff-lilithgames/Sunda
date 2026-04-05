package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d0 extends mt.s {

    /* renamed from: b, reason: collision with root package name */
    public final mt.y f98561b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.i f98562c;

    public d0(mt.y yVar, mt.i iVar) {
        this.f98561b = yVar;
        this.f98562c = iVar;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f98562c.subscribe(new c0(vVar, this.f98561b));
    }
}
