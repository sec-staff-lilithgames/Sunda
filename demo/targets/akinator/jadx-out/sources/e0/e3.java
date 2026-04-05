package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public static final e3 f53035a = new e3();

    public final d2 flingBehavior(p0.w wVar, int i10) {
        wVar.startReplaceableGroup(1107739818);
        c0.c0 c0VarRememberSplineBasedDecay = b0.t2.rememberSplineBasedDecay(wVar, 0);
        wVar.startReplaceableGroup(1157296644);
        boolean zChanged = wVar.changed(c0VarRememberSplineBasedDecay);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = new k(c0VarRememberSplineBasedDecay);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        k kVar = (k) objRememberedValue;
        wVar.endReplaceableGroup();
        return kVar;
    }

    public final d0.u3 overscrollEffect(p0.w wVar, int i10) {
        wVar.startReplaceableGroup(1809802212);
        d0.u3 u3VarRememberOverscrollEffect = d0.h.rememberOverscrollEffect(wVar, 0);
        wVar.endReplaceableGroup();
        return u3VarRememberOverscrollEffect;
    }
}
