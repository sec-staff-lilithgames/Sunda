package d0;

import kotlinx.coroutines.CoroutineScope;
import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y1 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0.q f51676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f51677f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(f0.q qVar, boolean z10) {
        super(3);
        this.f51676e = qVar;
        this.f51677f = z10;
    }

    /* renamed from: access$invoke$lambda-2, reason: not valid java name */
    public static final h0.a m3737access$invoke$lambda2(p0.j2 j2Var) {
        if (j2Var.getValue() == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        e1.v vVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(1871352361);
        wVar.startReplaceableGroup(773894976);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        p0.v vVar2 = p0.v.f80515a;
        if (objRememberedValue == vVar2.getEmpty()) {
            p0.s0 s0Var = new p0.s0(p0.k1.createCompositionCoroutineScope(zu.n.f98854b, wVar));
            wVar.updateRememberedValue(s0Var);
            objRememberedValue = s0Var;
        }
        wVar.endReplaceableGroup();
        CoroutineScope coroutineScope = ((p0.s0) objRememberedValue).getCoroutineScope();
        wVar.endReplaceableGroup();
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = wVar.rememberedValue();
        if (objRememberedValue2 == vVar2.getEmpty()) {
            objRememberedValue2 = o5.mutableStateOf$default(null, null, 2, null);
            wVar.updateRememberedValue(objRememberedValue2);
        }
        wVar.endReplaceableGroup();
        p0.j2 j2Var = (p0.j2) objRememberedValue2;
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = wVar.rememberedValue();
        if (objRememberedValue3 == vVar2.getEmpty()) {
            objRememberedValue3 = o5.mutableStateOf$default(null, null, 2, null);
            wVar.updateRememberedValue(objRememberedValue3);
        }
        wVar.endReplaceableGroup();
        p0.j2 j2Var2 = (p0.j2) objRememberedValue3;
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue4 = wVar.rememberedValue();
        if (objRememberedValue4 == vVar2.getEmpty()) {
            objRememberedValue4 = o5.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            wVar.updateRememberedValue(objRememberedValue4);
        }
        wVar.endReplaceableGroup();
        p0.j2 j2Var3 = (p0.j2) objRememberedValue4;
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue5 = wVar.rememberedValue();
        if (objRememberedValue5 == vVar2.getEmpty()) {
            objRememberedValue5 = new h1.o0();
            wVar.updateRememberedValue(objRememberedValue5);
        }
        wVar.endReplaceableGroup();
        h1.o0 o0Var = (h1.o0) objRememberedValue5;
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue6 = wVar.rememberedValue();
        if (objRememberedValue6 == vVar2.getEmpty()) {
            objRememberedValue6 = i0.i.BringIntoViewRequester();
            wVar.updateRememberedValue(objRememberedValue6);
        }
        wVar.endReplaceableGroup();
        i0.f fVar = (i0.f) objRememberedValue6;
        f0.q qVar = this.f51676e;
        p0.k1.DisposableEffect(qVar, new o1(j2Var, qVar), wVar, 0);
        boolean z10 = this.f51677f;
        p0.k1.DisposableEffect(Boolean.valueOf(z10), new q1(z10, coroutineScope, j2Var, qVar), wVar, 0);
        e1.v vVarFocusTarget = e1.t.f53496b;
        if (z10) {
            if (((Boolean) j2Var3.getValue()).booleanValue()) {
                wVar.startReplaceableGroup(-492369756);
                Object objRememberedValue7 = wVar.rememberedValue();
                if (objRememberedValue7 == vVar2.getEmpty()) {
                    objRememberedValue7 = new g2();
                    wVar.updateRememberedValue(objRememberedValue7);
                }
                wVar.endReplaceableGroup();
                vVar = (e1.v) objRememberedValue7;
            } else {
                vVar = vVarFocusTarget;
            }
            e1.v vVarSemantics$default = e2.v.semantics$default(vVarFocusTarget, false, new s1(o0Var, j2Var3), 1, null);
            t1 t1Var = new t1(j2Var2);
            vVarFocusTarget = h1.x.focusTarget(h1.b.onFocusChanged(h1.r0.focusRequester(i0.i.bringIntoViewRequester(a2.t3.inspectableWrapper(vVarSemantics$default, a2.t3.isDebugInspectorInfoEnabled() ? new b2(t1Var) : a2.t3.getNoInspectorInfo(), e1.t.f53496b.then(new v3(t1Var))), fVar), o0Var).then(vVar), new x1(coroutineScope, j2Var3, fVar, j2Var2, j2Var, this.f51676e)));
        }
        wVar.endReplaceableGroup();
        return vVarFocusTarget;
    }
}
