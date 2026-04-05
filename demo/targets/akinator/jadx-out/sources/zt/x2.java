package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x2 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f98825c;

    public x2(mt.y yVar, mt.m0 m0Var) {
        super(yVar);
        this.f98825c = m0Var;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f98526b.subscribe(new w2(vVar, this.f98825c));
    }
}
