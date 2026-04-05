package mc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o extends p {
    public o(s sVar) {
        super(sVar, new r());
    }

    @Override // mc.p
    public p copy() {
        dd.i.verifyMustOverride(o.class, this, "copy");
        return new o(this);
    }

    @Override // mc.p
    public p createDummyInstance(jc.j jVar) {
        return new o(this, jVar);
    }

    @Override // mc.p
    public p createInstance(jc.j jVar, ub.u uVar, jc.n nVar) {
        return new o(this, jVar, uVar, nVar);
    }

    @Override // mc.p
    public p with(s sVar) {
        return new o(this, sVar);
    }

    @Override // mc.p
    public p withCaches(lc.b bVar) {
        return new o(this, new r(((lc.s) bVar).forDeserializerCache(this.f69327e)));
    }
}
