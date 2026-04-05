package d0;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p0.o5;
import p0.v5;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j3 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.l f51422e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.l f51423f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f51424g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kv.l f51425h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y3 f51426i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k3 f51427j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(kv.l lVar, kv.l lVar2, float f10, kv.l lVar3, y3 y3Var, k3 k3Var) {
        super(3);
        this.f51422e = lVar;
        this.f51423f = lVar2;
        this.f51424g = f10;
        this.f51425h = lVar3;
        this.f51426i = y3Var;
        this.f51427j = k3Var;
    }

    /* renamed from: access$invoke$lambda-3, reason: not valid java name */
    public static final kv.l m3698access$invoke$lambda3(v5 v5Var) {
        return (kv.l) v5Var.getValue();
    }

    /* renamed from: access$invoke$lambda-4, reason: not valid java name */
    public static final kv.l m3699access$invoke$lambda4(v5 v5Var) {
        return (kv.l) v5Var.getValue();
    }

    /* renamed from: access$invoke$lambda-6, reason: not valid java name */
    public static final kv.l m3701access$invoke$lambda6(v5 v5Var) {
        return (kv.l) v5Var.getValue();
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(-454877003);
        View view = (View) wVar.consume(AndroidCompositionLocals_androidKt.getLocalView());
        s2.e eVar = (s2.e) wVar.consume(a2.a3.getLocalDensity());
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        p0.v vVar = p0.v.f80515a;
        if (objRememberedValue == vVar.getEmpty()) {
            objRememberedValue = o5.mutableStateOf$default(i1.h.m4174boximpl(i1.h.f59344b.m4172getUnspecifiedF1C5BW0()), null, 2, null);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        p0.j2 j2Var = (p0.j2) objRememberedValue;
        v5 v5VarRememberUpdatedState = z4.rememberUpdatedState(this.f51422e, wVar, 0);
        v5 v5VarRememberUpdatedState2 = z4.rememberUpdatedState(this.f51423f, wVar, 0);
        float f10 = this.f51424g;
        v5 v5VarRememberUpdatedState3 = z4.rememberUpdatedState(Float.valueOf(f10), wVar, 0);
        v5 v5VarRememberUpdatedState4 = z4.rememberUpdatedState(this.f51425h, wVar, 0);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = wVar.rememberedValue();
        if (objRememberedValue2 == vVar.getEmpty()) {
            objRememberedValue2 = z4.derivedStateOf(new i3(eVar, v5VarRememberUpdatedState, j2Var));
            wVar.updateRememberedValue(objRememberedValue2);
        }
        wVar.endReplaceableGroup();
        v5 v5Var = (v5) objRememberedValue2;
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = wVar.rememberedValue();
        if (objRememberedValue3 == vVar.getEmpty()) {
            objRememberedValue3 = z4.derivedStateOf(new h3(v5Var));
            wVar.updateRememberedValue(objRememberedValue3);
        }
        wVar.endReplaceableGroup();
        v5 v5Var2 = (v5) objRememberedValue3;
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue4 = wVar.rememberedValue();
        if (objRememberedValue4 == vVar.getEmpty()) {
            objRememberedValue4 = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
            wVar.updateRememberedValue(objRememberedValue4);
        }
        wVar.endReplaceableGroup();
        MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) objRememberedValue4;
        if (this.f51426i.getCanUpdateZoom()) {
            f10 = 0.0f;
        }
        Float fValueOf = Float.valueOf(f10);
        k3 textDefault = k3.f51464g.getTextDefault();
        k3 k3Var = this.f51427j;
        p0.k1.LaunchedEffect(new Object[]{view, eVar, fValueOf, k3Var, Boolean.valueOf(kotlin.jvm.internal.e0.areEqual(k3Var, textDefault))}, (kv.p) new c3(this.f51426i, this.f51427j, view, eVar, this.f51424g, mutableSharedFlow, v5VarRememberUpdatedState4, v5Var2, v5Var, v5VarRememberUpdatedState2, j2Var, v5VarRememberUpdatedState3, null), wVar, 8);
        e1.v vVarSemantics$default = e2.v.semantics$default(g1.j.drawBehind(x1.k1.onGloballyPositioned(composed, new d3(j2Var)), new e3(mutableSharedFlow)), false, new g3(v5Var), 1, null);
        wVar.endReplaceableGroup();
        return vVarSemantics$default;
    }
}
