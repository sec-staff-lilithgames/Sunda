package n0;

import a2.a3;
import a2.g5;
import g0.f2;
import g0.h3;
import g0.i2;
import g0.u2;
import g0.w2;
import p0.a6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i2 f75006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.q f75007f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f75008g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i2 i2Var, kv.q qVar, int i10) {
        super(2);
        this.f75006e = i2Var;
        this.f75007f = qVar;
        this.f75008g = i10;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        if ((i10 & 11) == 2 && wVar.getSkipping()) {
            wVar.skipToGroupEnd();
            return;
        }
        b bVar = b.f74975a;
        e1.v vVarPadding = f2.padding(h3.m3889defaultMinSizeVpY3zN4(e1.t.f53496b, bVar.m5649getMinWidthD9Ej5fM(), bVar.m5648getMinHeightD9Ej5fM()), this.f75006e);
        g0.h center = g0.u.f56588a.getCenter();
        e1.c centerVertically = e1.d.f53469a.getCenterVertically();
        int i11 = ((this.f75008g >> 18) & 7168) | 432;
        wVar.startReplaceableGroup(693286680);
        x1.x0 x0VarRowMeasurePolicy = u2.rowMeasurePolicy(center, centerVertically, wVar, 54);
        s2.e eVar = (s2.e) a.b.d(wVar, -1323940314);
        s2.x xVar = (s2.x) wVar.consume(a3.getLocalLayoutDirection());
        g5 g5Var = (g5) wVar.consume(a3.getLocalViewConfiguration());
        z1.f fVar = z1.g.Z8;
        kv.a constructor = fVar.getConstructor();
        kv.q qVarMaterializerOf = x1.g0.materializerOf(vVarPadding);
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
        a6.m5787setimpl(wVarM5780constructorimpl, xVar, a.b.v(fVar, wVarM5780constructorimpl, x0VarRowMeasurePolicy, wVarM5780constructorimpl, eVar));
        a.b.y(0, qVarMaterializerOf, a.b.w(fVar, wVarM5780constructorimpl, g5Var, wVar, wVar), wVar, 2058660585);
        wVar.startReplaceableGroup(-678309503);
        this.f75007f.invoke(w2.f56611a, wVar, Integer.valueOf(((i11 >> 6) & 112) | 6));
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
        wVar.endNode();
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
    }
}
