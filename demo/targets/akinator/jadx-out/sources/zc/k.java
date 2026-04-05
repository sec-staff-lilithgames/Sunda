package zc;

import jc.s0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k extends l {
    public k() {
    }

    @Override // zc.l
    public l copy() {
        return new k(this);
    }

    @Override // zc.l
    public l withCaches(lc.b bVar) {
        return new k(this, new r(((lc.s) bVar).forSerializerCache(this.f69445b)));
    }

    public k(k kVar) {
        super(kVar);
    }

    @Override // zc.l
    public k createInstance(s0 s0Var, s sVar) {
        return new k(this, s0Var, sVar);
    }
}
