package v2;

import a2.a3;
import a2.g5;
import p0.a6;
import p0.v5;
import tu.x0;
import x1.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f88924e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v5 f88925f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a0 a0Var, v5 v5Var) {
        super(2);
        this.f88924e = a0Var;
        this.f88925f = v5Var;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        if ((i10 & 11) == 2 && wVar.getSkipping()) {
            wVar.skipToGroupEnd();
            return;
        }
        e1.v vVarSemantics$default = e2.v.semantics$default(e1.t.f53496b, false, n.f88921e, 1, null);
        a0 a0Var = this.f88924e;
        e1.v vVarAlpha = g1.a.alpha(n1.onSizeChanged(vVarSemantics$default, new o(a0Var)), a0Var.getCanCalculatePosition() ? 1.0f : 0.0f);
        z0.b bVarComposableLambda = z0.u.composableLambda(wVar, 606497925, true, new p(this.f88925f));
        wVar.startReplaceableGroup(1406149896);
        s sVar = s.f88929a;
        s2.e eVar = (s2.e) a.b.d(wVar, -1323940314);
        s2.x xVar = (s2.x) wVar.consume(a3.getLocalLayoutDirection());
        g5 g5Var = (g5) wVar.consume(a3.getLocalViewConfiguration());
        z1.f fVar = z1.g.Z8;
        kv.a constructor = fVar.getConstructor();
        kv.q qVarMaterializerOf = x1.g0.materializerOf(vVarAlpha);
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
        a6.m5787setimpl(wVarM5780constructorimpl, sVar, fVar.getSetMeasurePolicy());
        a6.m5787setimpl(wVarM5780constructorimpl, eVar, fVar.getSetDensity());
        a6.m5787setimpl(wVarM5780constructorimpl, xVar, fVar.getSetLayoutDirection());
        a.b.y(0, qVarMaterializerOf, a.b.w(fVar, wVarM5780constructorimpl, g5Var, wVar, wVar), wVar, 2058660585);
        bVarComposableLambda.invoke(wVar, 6);
        wVar.endReplaceableGroup();
        wVar.endNode();
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
    }
}
