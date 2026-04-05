package g0;

import a2.g5;
import p0.a6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class l3 {
    public static final void Spacer(e1.v modifier, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(modifier, "modifier");
        wVar.startReplaceableGroup(-72882467);
        s2.e eVar = (s2.e) a.b.d(wVar, -1323940314);
        s2.x xVar = (s2.x) wVar.consume(a2.a3.getLocalLayoutDirection());
        g5 g5Var = (g5) wVar.consume(a2.a3.getLocalViewConfiguration());
        z1.f fVar = z1.g.Z8;
        kv.a constructor = fVar.getConstructor();
        kv.q qVarMaterializerOf = x1.g0.materializerOf(modifier);
        if (wVar.getApplier() == null) {
            p0.p.invalidApplier();
        }
        wVar.startReusableNode();
        if (wVar.getInserting()) {
            wVar.createNode(constructor);
        } else {
            wVar.useNode();
        }
        wVar.disableReusing();
        p0.w wVarM5780constructorimpl = a6.m5780constructorimpl(wVar);
        a6.m5787setimpl(wVarM5780constructorimpl, n3.f56532a, fVar.getSetMeasurePolicy());
        a6.m5787setimpl(wVarM5780constructorimpl, eVar, fVar.getSetDensity());
        a6.m5787setimpl(wVarM5780constructorimpl, xVar, fVar.getSetLayoutDirection());
        a.b.y(0, qVarMaterializerOf, a.b.w(fVar, wVarM5780constructorimpl, g5Var, wVar, wVar), wVar, 2058660585);
        wVar.startReplaceableGroup(1142320198);
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
        wVar.endNode();
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
    }
}
