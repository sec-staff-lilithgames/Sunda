package n0;

import a2.a3;
import a2.g5;
import d0.s2;
import j1.f2;
import p0.a6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.v f75237e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f2 f75238f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f75239g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f75240h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f75241i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0.v f75242j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f75243k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f0.q f75244l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s2 f75245m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f75246n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f75247o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e2.m f75248p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kv.a f75249q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kv.p f75250r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f75251s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(e1.v vVar, f2 f2Var, long j10, float f10, int i10, d0.v vVar2, float f11, f0.q qVar, s2 s2Var, boolean z10, String str, e2.m mVar, kv.a aVar, kv.p pVar, int i11) {
        super(2);
        this.f75237e = vVar;
        this.f75238f = f2Var;
        this.f75239g = j10;
        this.f75240h = f10;
        this.f75241i = i10;
        this.f75242j = vVar2;
        this.f75243k = f11;
        this.f75244l = qVar;
        this.f75245m = s2Var;
        this.f75246n = z10;
        this.f75247o = str;
        this.f75248p = mVar;
        this.f75249q = aVar;
        this.f75250r = pVar;
        this.f75251s = i11;
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
        e1.v vVarThen = g1.m5663access$surface8ww4TTg(p1.minimumTouchTargetSize(this.f75237e), this.f75238f, g1.m5664access$surfaceColorAtElevationcq6XJ1M(this.f75239g, (z) wVar.consume(c0.getLocalElevationOverlay()), this.f75240h, wVar, (this.f75241i >> 9) & 14), this.f75242j, this.f75243k).then(d0.k0.m3705clickableO2vRcR0(e1.t.f53496b, this.f75244l, this.f75245m, this.f75246n, this.f75247o, this.f75248p, this.f75249q));
        wVar.startReplaceableGroup(733328855);
        x1.x0 x0VarRememberBoxMeasurePolicy = g0.d0.rememberBoxMeasurePolicy(e1.d.f53469a.getTopStart(), true, wVar, 48);
        wVar.startReplaceableGroup(-1323940314);
        s2.e eVar = (s2.e) wVar.consume(a3.getLocalDensity());
        s2.x xVar = (s2.x) wVar.consume(a3.getLocalLayoutDirection());
        g5 g5Var = (g5) wVar.consume(a3.getLocalViewConfiguration());
        z1.f fVar = z1.g.Z8;
        kv.a constructor = fVar.getConstructor();
        kv.q qVarMaterializerOf = x1.g0.materializerOf(vVarThen);
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
        wVar.startReplaceableGroup(-1300719946);
        this.f75250r.invoke(wVar, Integer.valueOf((this.f75251s >> 6) & 14));
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
        wVar.endNode();
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
    }
}
