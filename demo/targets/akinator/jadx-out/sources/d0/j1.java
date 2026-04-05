package d0;

import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j1 implements s2 {

    /* renamed from: a, reason: collision with root package name */
    public static final j1 f51417a = new j1();

    @Override // d0.s2
    public t2 rememberUpdatedInstance(f0.o interactionSource, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(interactionSource, "interactionSource");
        wVar.startReplaceableGroup(1683566979);
        int i11 = i10 & 14;
        v5 v5VarCollectIsPressedAsState = f0.x.collectIsPressedAsState(interactionSource, wVar, i11);
        v5 v5VarCollectIsHoveredAsState = f0.m.collectIsHoveredAsState(interactionSource, wVar, i11);
        v5 v5VarCollectIsFocusedAsState = f0.h.collectIsFocusedAsState(interactionSource, wVar, i11);
        wVar.startReplaceableGroup(1157296644);
        boolean zChanged = wVar.changed(interactionSource);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = new i1(v5VarCollectIsPressedAsState, v5VarCollectIsHoveredAsState, v5VarCollectIsFocusedAsState);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        i1 i1Var = (i1) objRememberedValue;
        wVar.endReplaceableGroup();
        return i1Var;
    }
}
