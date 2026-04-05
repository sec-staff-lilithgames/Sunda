package b0;

import a2.a3;
import c0.h3;
import p0.a6;
import p0.q4;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0.z1 f8452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8453f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0.j0 f8454g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f8455h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kv.q f8456i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(c0.z1 z1Var, int i10, c0.j0 j0Var, Object obj, kv.q qVar) {
        super(2);
        this.f8452e = z1Var;
        this.f8453f = i10;
        this.f8454g = j0Var;
        this.f8455h = obj;
        this.f8456i = qVar;
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
        n0 n0Var = new n0(this.f8454g);
        wVar.startReplaceableGroup(-1338768149);
        c0.n2 vectorConverter = h3.getVectorConverter(kotlin.jvm.internal.w.f71862a);
        wVar.startReplaceableGroup(-142660079);
        c0.z1 z1Var = this.f8452e;
        Object currentState = z1Var.getCurrentState();
        wVar.startReplaceableGroup(-438678252);
        Object obj = this.f8455h;
        float f10 = kotlin.jvm.internal.e0.areEqual(currentState, obj) ? 1.0f : 0.0f;
        wVar.endReplaceableGroup();
        Float fValueOf = Float.valueOf(f10);
        Object targetState = z1Var.getTargetState();
        wVar.startReplaceableGroup(-438678252);
        float f11 = kotlin.jvm.internal.e0.areEqual(targetState, obj) ? 1.0f : 0.0f;
        wVar.endReplaceableGroup();
        Float fValueOf2 = Float.valueOf(f11);
        c0.j0 j0Var = (c0.j0) n0Var.invoke((Object) z1Var.getSegment(), (Object) wVar, (Object) 0);
        int i11 = this.f8453f;
        v5 v5VarCreateTransitionAnimation = c0.g2.createTransitionAnimation(z1Var, fValueOf, fValueOf2, j0Var, vectorConverter, "FloatAnimation", wVar, i11 & 14);
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
        wVar.startReplaceableGroup(1157296644);
        boolean zChanged = wVar.changed(v5VarCreateTransitionAnimation);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = new m0(v5VarCreateTransitionAnimation);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        e1.v vVarGraphicsLayer = j1.u0.graphicsLayer(e1.t.f53496b, (kv.l) objRememberedValue);
        wVar.startReplaceableGroup(-1990474327);
        x1.x0 x0VarRememberBoxMeasurePolicy = g0.d0.rememberBoxMeasurePolicy(e1.d.f53469a.getTopStart(), false, wVar, 0);
        wVar.startReplaceableGroup(1376089335);
        s2.e eVar = (s2.e) wVar.consume(a3.getLocalDensity());
        s2.x xVar = (s2.x) wVar.consume(a3.getLocalLayoutDirection());
        z1.f fVar = z1.g.Z8;
        kv.a constructor = fVar.getConstructor();
        kv.q qVarMaterializerOf = x1.g0.materializerOf(vVarGraphicsLayer);
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
        wVar.enableReusing();
        qVarMaterializerOf.invoke(q4.m5830boximpl(q4.m5831constructorimpl(wVar)), wVar, 0);
        wVar.startReplaceableGroup(2058660585);
        wVar.startReplaceableGroup(-1253629305);
        wVar.startReplaceableGroup(-222715758);
        this.f8456i.invoke(obj, wVar, Integer.valueOf((i11 >> 9) & 112));
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
        wVar.endNode();
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
    }
}
