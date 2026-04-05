package oc;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class c1 extends s0 {
    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        kVar.handleBadMerge(this);
        return deserialize(uVar, kVar);
    }

    @Override // oc.s0, jc.q
    public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        return gVar.deserializeTypedFromScalar(uVar, kVar);
    }

    @Override // jc.q
    public dd.a getEmptyAccessPattern() {
        return dd.a.f51982c;
    }

    @Override // jc.q, mc.v
    public dd.a getNullAccessPattern() {
        return dd.a.f51981b;
    }

    @Override // jc.q
    public cd.h logicalType() {
        return cd.h.f12151o;
    }

    @Override // jc.q
    public Boolean supportsUpdate(jc.j jVar) {
        return Boolean.FALSE;
    }
}
