package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g2 extends mt.c implements vt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.y f98618b;

    public g2(mt.y yVar) {
        this.f98618b = yVar;
    }

    @Override // vt.c
    public mt.s fuseToMaybe() {
        return mu.a.onAssembly(new e2(this.f98618b));
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        this.f98618b.subscribe(new f2(fVar));
    }
}
