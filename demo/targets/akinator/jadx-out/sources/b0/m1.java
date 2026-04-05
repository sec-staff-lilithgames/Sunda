package b0;

import c0.h3;
import c0.z1;
import p0.o5;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m1 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0.z1 f8432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v5 f8433f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v5 f8434g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f8435h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(c0.z1 z1Var, v5 v5Var, v5 v5Var2, String str) {
        super(3);
        this.f8432e = z1Var;
        this.f8433f = v5Var;
        this.f8434g = v5Var2;
        this.f8435h = str;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        e1.v vVarThen;
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(158379472);
        wVar.startReplaceableGroup(1157296644);
        c0.z1 z1Var = this.f8432e;
        boolean zChanged = wVar.changed(z1Var);
        Object objRememberedValue = wVar.rememberedValue();
        p0.v vVar = p0.v.f80515a;
        if (zChanged || objRememberedValue == vVar.getEmpty()) {
            objRememberedValue = o5.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        p0.j2 j2Var = (p0.j2) objRememberedValue;
        Object currentState = z1Var.getCurrentState();
        Object targetState = z1Var.getTargetState();
        v5 v5Var = this.f8434g;
        v5 v5Var2 = this.f8433f;
        if (currentState == targetState && !z1Var.isSeeking()) {
            j2Var.setValue(Boolean.FALSE);
        } else if (v5Var2.getValue() != null || v5Var.getValue() != null) {
            j2Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) j2Var.getValue()).booleanValue()) {
            c0.n2 vectorConverter = h3.getVectorConverter(s2.q.f85352b);
            wVar.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = wVar.rememberedValue();
            if (objRememberedValue2 == vVar.getEmpty()) {
                objRememberedValue2 = this.f8435h + " slide";
                wVar.updateRememberedValue(objRememberedValue2);
            }
            wVar.endReplaceableGroup();
            z1.a aVarCreateDeferredAnimation = c0.g2.createDeferredAnimation(this.f8432e, vectorConverter, (String) objRememberedValue2, wVar, 448, 0);
            wVar.startReplaceableGroup(1157296644);
            boolean zChanged2 = wVar.changed(z1Var);
            Object objRememberedValue3 = wVar.rememberedValue();
            if (zChanged2 || objRememberedValue3 == vVar.getEmpty()) {
                objRememberedValue3 = new q2(aVarCreateDeferredAnimation, v5Var2, v5Var);
                wVar.updateRememberedValue(objRememberedValue3);
            }
            wVar.endReplaceableGroup();
            vVarThen = composed.then((q2) objRememberedValue3);
        } else {
            vVarThen = composed;
        }
        wVar.endReplaceableGroup();
        return vVarThen;
    }
}
