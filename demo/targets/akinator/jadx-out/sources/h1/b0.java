package h1;

import p0.k1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public static final b0 f58536e = new b0(3);

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(-326009031);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        if (objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = new s(w0.f58619h, null, 2, null);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        s sVar = (s) objRememberedValue;
        k1.SideEffect(new a0(sVar), wVar, 0);
        e1.v vVarFocusTarget = x.focusTarget(composed, sVar);
        wVar.endReplaceableGroup();
        return vVarFocusTarget;
    }
}
