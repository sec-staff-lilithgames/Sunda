package n0;

import a2.a3;
import a2.g5;
import j1.f2;
import p0.a6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a1 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.v f74967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f2 f74968f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f74969g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f74970h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74971i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0.v f74972j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f74973k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kv.p f74974l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(e1.v vVar, f2 f2Var, long j10, float f10, int i10, d0.v vVar2, float f11, kv.p pVar) {
        super(2);
        this.f74967e = vVar;
        this.f74968f = f2Var;
        this.f74969g = j10;
        this.f74970h = f10;
        this.f74971i = i10;
        this.f74972j = vVar2;
        this.f74973k = f11;
        this.f74974l = pVar;
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
        z zVar = (z) wVar.consume(c0.getLocalElevationOverlay());
        int i11 = this.f74971i;
        e1.v vVarPointerInput = u1.i1.pointerInput(e2.v.semantics(g1.m5663access$surface8ww4TTg(this.f74967e, this.f74968f, g1.m5664access$surfaceColorAtElevationcq6XJ1M(this.f74969g, zVar, this.f74970h, wVar, (i11 >> 6) & 14), this.f74972j, this.f74973k), false, u0.f75199e), tu.x0.f87415a, new v0(2, null));
        wVar.startReplaceableGroup(733328855);
        x1.x0 x0VarRememberBoxMeasurePolicy = g0.d0.rememberBoxMeasurePolicy(e1.d.f53469a.getTopStart(), true, wVar, 48);
        wVar.startReplaceableGroup(-1323940314);
        s2.e eVar = (s2.e) wVar.consume(a3.getLocalDensity());
        s2.x xVar = (s2.x) wVar.consume(a3.getLocalLayoutDirection());
        g5 g5Var = (g5) wVar.consume(a3.getLocalViewConfiguration());
        z1.f fVar = z1.g.Z8;
        kv.a constructor = fVar.getConstructor();
        kv.q qVarMaterializerOf = x1.g0.materializerOf(vVarPointerInput);
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
        a6.m5787setimpl(wVarM5780constructorimpl, xVar, a.b.v(fVar, wVarM5780constructorimpl, x0VarRememberBoxMeasurePolicy, wVarM5780constructorimpl, eVar));
        a.b.y(0, qVarMaterializerOf, a.b.w(fVar, wVarM5780constructorimpl, g5Var, wVar, wVar), wVar, 2058660585);
        wVar.startReplaceableGroup(-2137368960);
        wVar.startReplaceableGroup(1539610176);
        this.f74974l.invoke(wVar, Integer.valueOf((i11 >> 18) & 14));
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
        wVar.endNode();
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
    }
}
