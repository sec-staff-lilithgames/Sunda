package d0;

import p0.o5;
import p0.v5;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.a f51625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.a f51626f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kv.a f51627g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f51628h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f0.q f51629i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s2 f51630j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f51631k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e2.m f51632l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f51633m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(boolean z10, String str, e2.m mVar, kv.a aVar, kv.a aVar2, kv.a aVar3, String str2, s2 s2Var, f0.q qVar) {
        super(3);
        this.f51625e = aVar;
        this.f51626f = aVar2;
        this.f51627g = aVar3;
        this.f51628h = z10;
        this.f51629i = qVar;
        this.f51630j = s2Var;
        this.f51631k = str;
        this.f51632l = mVar;
        this.f51633m = str2;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(1841718000);
        v5 v5VarRememberUpdatedState = z4.rememberUpdatedState(this.f51625e, wVar, 0);
        kv.a aVar = this.f51626f;
        v5 v5VarRememberUpdatedState2 = z4.rememberUpdatedState(aVar, wVar, 0);
        kv.a aVar2 = this.f51627g;
        v5 v5VarRememberUpdatedState3 = z4.rememberUpdatedState(aVar2, wVar, 0);
        boolean z10 = aVar != null;
        boolean z11 = aVar2 != null;
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        p0.v vVar = p0.v.f80515a;
        if (objRememberedValue == vVar.getEmpty()) {
            objRememberedValue = o5.mutableStateOf$default(null, null, 2, null);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        p0.j2 j2Var = (p0.j2) objRememberedValue;
        wVar.startReplaceableGroup(1321106866);
        boolean z12 = this.f51628h;
        f0.q qVar = this.f51629i;
        if (z12) {
            p0.k1.DisposableEffect(Boolean.valueOf(z10), new m0(j2Var, qVar), wVar, 0);
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
        v5 v5VarRememberUpdatedState4 = z4.rememberUpdatedState(new o0(j2Var2, aVarIsComposeRootInScrollableContainer), wVar, 0);
        Object[] objArr = {qVar, Boolean.valueOf(z10), Boolean.valueOf(z11), Boolean.valueOf(z12)};
        t0 t0Var = new t0(z11, this.f51628h, z10, v5VarRememberUpdatedState3, v5VarRememberUpdatedState2, this.f51629i, j2Var, v5VarRememberUpdatedState4, v5VarRememberUpdatedState, null);
        e1.t tVar = e1.t.f53496b;
        e1.v vVarPointerInput = u1.i1.pointerInput((e1.v) tVar, objArr, (kv.p) t0Var);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = wVar.rememberedValue();
        if (objRememberedValue3 == vVar.getEmpty()) {
            objRememberedValue3 = new n0(j2Var2);
            wVar.updateRememberedValue(objRememberedValue3);
        }
        wVar.endReplaceableGroup();
        e1.v vVarM3713genericClickableWithoutGestureBILeDI = k0.m3713genericClickableWithoutGestureBILeDI(tVar.then((e1.v) objRememberedValue3), vVarPointerInput, this.f51629i, this.f51630j, this.f51628h, this.f51631k, this.f51632l, this.f51633m, this.f51626f, this.f51625e);
        wVar.endReplaceableGroup();
        return vVarM3713genericClickableWithoutGestureBILeDI;
    }
}
