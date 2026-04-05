package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z3 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final mt.y f98849c;

    /* renamed from: e, reason: collision with root package name */
    public final mt.y f98850e;

    public z3(mt.y yVar, mt.y yVar2, mt.y yVar3) {
        super(yVar);
        this.f98849c = yVar2;
        this.f98850e = yVar3;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        x3 x3Var = new x3(vVar, this.f98850e);
        vVar.onSubscribe(x3Var);
        this.f98849c.subscribe(x3Var.f98827c);
        this.f98526b.subscribe(x3Var);
    }
}
