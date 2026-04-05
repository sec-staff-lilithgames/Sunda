package d0;

import p0.o5;
import p0.v5;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.a f51411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f51412f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f0.q f51413g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s2 f51414h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f51415i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e2.m f51416j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(boolean z10, String str, e2.m mVar, kv.a aVar, s2 s2Var, f0.q qVar) {
        super(3);
        this.f51411e = aVar;
        this.f51412f = z10;
        this.f51413g = qVar;
        this.f51414h = s2Var;
        this.f51415i = str;
        this.f51416j = mVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(92076020);
        v5 v5VarRememberUpdatedState = z4.rememberUpdatedState(this.f51411e, wVar, 0);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        p0.v vVar = p0.v.f80515a;
        if (objRememberedValue == vVar.getEmpty()) {
            objRememberedValue = o5.mutableStateOf$default(null, null, 2, null);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        p0.j2 j2Var = (p0.j2) objRememberedValue;
        wVar.startReplaceableGroup(1841981204);
        f0.q qVar = this.f51413g;
        boolean z10 = this.f51412f;
        if (z10) {
            k0.PressedInteractionSourceDisposableEffect(qVar, j2Var, wVar, 48);
        }
        wVar.endReplaceableGroup();
        kv.a aVarIsComposeRootInScrollableContainer = c1.isComposeRootInScrollableContainer(wVar, 0);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = wVar.rememberedValue();
        if (objRememberedValue2 == vVar.getEmpty()) {
            objRememberedValue2 = o5.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            wVar.updateRememberedValue(objRememberedValue2);
        }
        wVar.endReplaceableGroup();
        p0.j2 j2Var2 = (p0.j2) objRememberedValue2;
        v5 v5VarRememberUpdatedState2 = z4.rememberUpdatedState(new f0(j2Var2, aVarIsComposeRootInScrollableContainer), wVar, 0);
        Boolean boolValueOf = Boolean.valueOf(z10);
        i0 i0Var = new i0(this.f51412f, this.f51413g, j2Var, v5VarRememberUpdatedState2, v5VarRememberUpdatedState, null);
        e1.t tVar = e1.t.f53496b;
        e1.v vVarPointerInput = u1.i1.pointerInput(tVar, qVar, boolValueOf, i0Var);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = wVar.rememberedValue();
        if (objRememberedValue3 == vVar.getEmpty()) {
            objRememberedValue3 = new e0(j2Var2);
            wVar.updateRememberedValue(objRememberedValue3);
        }
        wVar.endReplaceableGroup();
        e1.v vVarM3713genericClickableWithoutGestureBILeDI = k0.m3713genericClickableWithoutGestureBILeDI(tVar.then((e1.v) objRememberedValue3), vVarPointerInput, this.f51413g, this.f51414h, this.f51412f, this.f51415i, this.f51416j, null, null, this.f51411e);
        wVar.endReplaceableGroup();
        return vVarM3713genericClickableWithoutGestureBILeDI;
    }
}
