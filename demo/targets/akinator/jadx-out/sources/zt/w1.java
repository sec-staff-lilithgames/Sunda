package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w1 extends mt.s implements vt.e {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i f98812b;

    public w1(mt.i iVar) {
        this.f98812b = iVar;
    }

    @Override // vt.e
    public mt.i source() {
        return this.f98812b;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f98812b.subscribe(new v1(vVar));
    }
}
