package oc;

import java.io.IOException;
import oc.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y extends f {

    /* renamed from: i, reason: collision with root package name */
    public static final y f78962i = new y(jc.t.class, null);

    public static jc.q getDeserializer(Class<?> cls) {
        return cls == yc.v.class ? x.getInstance() : cls == yc.a.class ? w.getInstance() : f78962i;
    }

    @Override // oc.f
    public final jc.q V(boolean z10, boolean z11) {
        return new y(this, z10, z11);
    }

    @Override // oc.f, mc.k
    public /* bridge */ /* synthetic */ jc.q createContextual(jc.k kVar, jc.g gVar) throws jc.r {
        return super.createContextual(kVar, gVar);
    }

    @Override // oc.f, oc.s0, jc.q
    public /* bridge */ /* synthetic */ Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        return super.deserializeWithType(uVar, kVar, gVar);
    }

    @Override // jc.q, mc.v
    public Object getAbsentValue(jc.k kVar) {
        return null;
    }

    @Override // oc.f, jc.q
    public /* bridge */ /* synthetic */ boolean isCachable() {
        return super.isCachable();
    }

    @Override // oc.f, jc.q
    public /* bridge */ /* synthetic */ cd.h logicalType() {
        return super.logicalType();
    }

    @Override // oc.f, jc.q
    public Boolean supportsUpdate(jc.j jVar) {
        return this.f78849f;
    }

    @Override // jc.q
    public jc.t deserialize(ub.u uVar, jc.k kVar) throws IOException {
        f.a aVar = new f.a();
        yc.o nodeFactory = kVar.getNodeFactory();
        int iCurrentTokenId = uVar.currentTokenId();
        if (iCurrentTokenId == 1) {
            yc.v vVarObjectNode = nodeFactory.objectNode();
            X(uVar, kVar, nodeFactory, aVar, vVarObjectNode);
            return vVarObjectNode;
        }
        if (iCurrentTokenId == 2) {
            return nodeFactory.objectNode();
        }
        if (iCurrentTokenId != 3) {
            return iCurrentTokenId != 5 ? W(uVar, kVar) : Y(uVar, kVar, nodeFactory, aVar);
        }
        yc.a aVarArrayNode = nodeFactory.arrayNode();
        X(uVar, kVar, nodeFactory, aVar, aVarArrayNode);
        return aVarArrayNode;
    }

    @Override // jc.q, mc.v
    public jc.t getNullValue(jc.k kVar) {
        return kVar.getNodeFactory().nullNode();
    }
}
