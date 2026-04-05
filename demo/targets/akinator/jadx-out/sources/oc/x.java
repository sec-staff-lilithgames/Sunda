package oc;

import java.io.IOException;
import oc.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x extends f {

    /* renamed from: i, reason: collision with root package name */
    public static final x f78959i = new x(yc.v.class, Boolean.TRUE);

    public static x getInstance() {
        return f78959i;
    }

    @Override // oc.f
    public final jc.q V(boolean z10, boolean z11) {
        return new x(this, z10, z11);
    }

    @Override // jc.q
    public yc.v deserialize(ub.u uVar, jc.k kVar) throws IOException {
        yc.o nodeFactory = kVar.getNodeFactory();
        if (uVar.isExpectedStartObjectToken()) {
            yc.v vVarObjectNode = nodeFactory.objectNode();
            X(uVar, kVar, nodeFactory, new f.a(), vVarObjectNode);
            return vVarObjectNode;
        }
        if (uVar.hasToken(ub.z.FIELD_NAME)) {
            return Y(uVar, kVar, nodeFactory, new f.a());
        }
        if (uVar.hasToken(ub.z.END_OBJECT)) {
            return nodeFactory.objectNode();
        }
        return (yc.v) kVar.handleUnexpectedToken(yc.v.class, uVar);
    }

    @Override // jc.q
    public yc.v deserialize(ub.u uVar, jc.k kVar, yc.v vVar) throws IOException {
        if (!uVar.isExpectedStartObjectToken() && !uVar.hasToken(ub.z.FIELD_NAME)) {
            return (yc.v) kVar.handleUnexpectedToken(yc.v.class, uVar);
        }
        return (yc.v) g0(uVar, kVar, vVar, new f.a());
    }
}
