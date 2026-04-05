package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s3 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final mt.y f98769c;

    public s3(mt.y yVar, mt.y yVar2) {
        super(yVar);
        this.f98769c = yVar2;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        r3 r3Var = new r3(vVar);
        vVar.onSubscribe(r3Var);
        this.f98769c.subscribe(r3Var.f98759c);
        this.f98526b.subscribe(r3Var);
    }
}
