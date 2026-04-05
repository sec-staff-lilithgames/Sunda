package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j3 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f98660c;

    public j3(mt.y yVar, mt.m0 m0Var) {
        super(yVar);
        this.f98660c = m0Var;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        h3 h3Var = new h3(vVar);
        vVar.onSubscribe(h3Var);
        h3Var.f98631b.replace(this.f98660c.scheduleDirect(new i3(h3Var, this.f98526b)));
    }
}
