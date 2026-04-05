package oc;

import java.io.IOException;
import oc.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w extends f {

    /* renamed from: i, reason: collision with root package name */
    public static final w f78957i = new w(yc.a.class, Boolean.TRUE);

    public static w getInstance() {
        return f78957i;
    }

    @Override // oc.f
    public final jc.q V(boolean z10, boolean z11) {
        return new w(this, z10, z11);
    }

    @Override // jc.q
    public yc.a deserialize(ub.u uVar, jc.k kVar) throws IOException {
        if (uVar.isExpectedStartArrayToken()) {
            yc.o nodeFactory = kVar.getNodeFactory();
            yc.a aVarArrayNode = nodeFactory.arrayNode();
            X(uVar, kVar, nodeFactory, new f.a(), aVarArrayNode);
            return aVarArrayNode;
        }
        return (yc.a) kVar.handleUnexpectedToken(yc.a.class, uVar);
    }

    @Override // jc.q
    public yc.a deserialize(ub.u uVar, jc.k kVar, yc.a aVar) throws IOException {
        if (uVar.isExpectedStartArrayToken()) {
            X(uVar, kVar, kVar.getNodeFactory(), new f.a(), aVar);
            return aVar;
        }
        return (yc.a) kVar.handleUnexpectedToken(yc.a.class, uVar);
    }
}
