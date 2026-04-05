package n0;

import a2.a3;
import a2.g5;
import j1.f2;
import p0.a6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c1 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.v f74995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f2 f74996f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f74997g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f74998h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74999i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0.v f75000j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f75001k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f0.q f75002l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f75003m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kv.a f75004n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kv.p f75005o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(e1.v vVar, f2 f2Var, long j10, float f10, int i10, d0.v vVar2, float f11, f0.q qVar, boolean z10, kv.a aVar, kv.p pVar) {
        super(2);
        this.f74995e = vVar;
        this.f74996f = f2Var;
        this.f74997g = j10;
        this.f74998h = f10;
        this.f74999i = i10;
        this.f75000j = vVar2;
        this.f75001k = f11;
        this.f75002l = qVar;
        this.f75003m = z10;
        this.f75004n = aVar;
        this.f75005o = pVar;
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
        e1.v vVarMinimumTouchTargetSize = p1.minimumTouchTargetSize(this.f74995e);
        z zVar = (z) wVar.consume(c0.getLocalElevationOverlay());
        int i11 = this.f74999i;
        e1.v vVarM3706clickableO2vRcR0$default = d0.k0.m3706clickableO2vRcR0$default(g1.m5663access$surface8ww4TTg(vVarMinimumTouchTargetSize, this.f74996f, g1.m5664access$surfaceColorAtElevationcq6XJ1M(this.f74997g, zVar, this.f74998h, wVar, (i11 >> 12) & 14), this.f75000j, this.f75001k), this.f75002l, o0.w.m5763rememberRipple9IZ8Weo(false, 0.0f, 0L, wVar, 0, 7), this.f75003m, null, e2.m.m3822boximpl(e2.m.f53544b.m3816getButtono7Vup1c()), this.f75004n, 8, null);
        wVar.startReplaceableGroup(733328855);
        x1.x0 x0VarRememberBoxMeasurePolicy = g0.d0.rememberBoxMeasurePolicy(e1.d.f53469a.getTopStart(), true, wVar, 48);
        wVar.startReplaceableGroup(-1323940314);
        s2.e eVar = (s2.e) wVar.consume(a3.getLocalDensity());
        s2.x xVar = (s2.x) wVar.consume(a3.getLocalLayoutDirection());
        g5 g5Var = (g5) wVar.consume(a3.getLocalViewConfiguration());
        z1.f fVar = z1.g.Z8;
        kv.a constructor = fVar.getConstructor();
        kv.q qVarMaterializerOf = x1.g0.materializerOf(vVarM3706clickableO2vRcR0$default);
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
        wVar.startReplaceableGroup(-390905273);
        this.f75005o.invoke(wVar, Integer.valueOf((i11 >> 27) & 14));
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
        wVar.endNode();
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
    }
}
