package j0;

import d0.c1;
import d0.i2;
import d0.k0;
import d0.n1;
import d0.s2;
import d0.v2;
import e1.t;
import e1.v;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.q;
import p0.j2;
import p0.o5;
import p0.v5;
import p0.w;
import p0.z4;
import u1.i1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o extends f0 implements q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.a f68808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f68809f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f0.q f68810g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s2 f68811h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e2.m f68812i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f2.a f68813j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(f2.a aVar, boolean z10, e2.m mVar, f0.q qVar, s2 s2Var, kv.a aVar2) {
        super(3);
        this.f68808e = aVar2;
        this.f68809f = z10;
        this.f68810g = qVar;
        this.f68811h = s2Var;
        this.f68812i = mVar;
        this.f68813j = aVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((v) obj, (w) obj2, ((Number) obj3).intValue());
    }

    public final v invoke(v composed, w wVar, int i10) {
        e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(2121285826);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        p0.v vVar = p0.v.f80515a;
        if (objRememberedValue == vVar.getEmpty()) {
            objRememberedValue = o5.mutableStateOf$default(null, null, 2, null);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        j2 j2Var = (j2) objRememberedValue;
        e2.m mVar = this.f68812i;
        f2.a aVar = this.f68813j;
        boolean z10 = this.f68809f;
        kv.a aVar2 = this.f68808e;
        n nVar = new n(aVar, z10, mVar, aVar2);
        t tVar = t.f53496b;
        v vVarSemantics = e2.v.semantics(tVar, true, nVar);
        v5 v5VarRememberUpdatedState = z4.rememberUpdatedState(aVar2, wVar, 0);
        wVar.startReplaceableGroup(-2134919160);
        f0.q qVar = this.f68810g;
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
        j2 j2Var2 = (j2) objRememberedValue2;
        v5 v5VarRememberUpdatedState2 = z4.rememberUpdatedState(new i(j2Var2, aVarIsComposeRootInScrollableContainer), wVar, 0);
        v vVarPointerInput = i1.pointerInput(tVar, qVar, Boolean.valueOf(z10), new l(this.f68809f, this.f68810g, j2Var, v5VarRememberUpdatedState2, v5VarRememberUpdatedState, null));
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = wVar.rememberedValue();
        if (objRememberedValue3 == vVar.getEmpty()) {
            objRememberedValue3 = new h(j2Var2);
            wVar.updateRememberedValue(objRememberedValue3);
        }
        wVar.endReplaceableGroup();
        v vVarThen = n1.focusableInNonTouchMode(i2.hoverable(v2.indication(composed.then((v) objRememberedValue3).then(vVarSemantics), qVar, this.f68811h), qVar, z10), z10, qVar).then(vVarPointerInput);
        wVar.endReplaceableGroup();
        return vVarThen;
    }
}
