package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h4 extends mt.l implements vt.f {

    /* renamed from: c, reason: collision with root package name */
    public final mt.y f98633c;

    public h4(mt.y yVar) {
        this.f98633c = yVar;
    }

    @Override // vt.f
    public mt.y source() {
        return this.f98633c;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f98633c.subscribe(new g4(cVar));
    }
}
