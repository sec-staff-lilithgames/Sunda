package o0;

import c0.i0;
import c0.m2;
import d0.s2;
import j1.m0;
import p0.v5;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final m2 f77385a = new m2(15, 0, i0.getLinearEasing(), 2, null);

    public static final c0.n access$incomingStateLayerAnimationSpecFor(f0.n nVar) {
        boolean z10 = nVar instanceof f0.i;
        m2 m2Var = f77385a;
        return z10 ? m2Var : nVar instanceof f0.d ? new m2(45, 0, i0.getLinearEasing(), 2, null) : nVar instanceof f0.b ? new m2(45, 0, i0.getLinearEasing(), 2, null) : m2Var;
    }

    public static final c0.n access$outgoingStateLayerAnimationSpecFor(f0.n nVar) {
        boolean z10 = nVar instanceof f0.i;
        m2 m2Var = f77385a;
        return (z10 || (nVar instanceof f0.d) || !(nVar instanceof f0.b)) ? m2Var : new m2(150, 0, i0.getLinearEasing(), 2, null);
    }

    /* renamed from: rememberRipple-9IZ8Weo, reason: not valid java name */
    public static final s2 m5763rememberRipple9IZ8Weo(boolean z10, float f10, long j10, p0.w wVar, int i10, int i11) {
        wVar.startReplaceableGroup(1635163520);
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            f10 = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            j10 = m0.f68918b.m4835getUnspecified0d7_KjU();
        }
        v5 v5VarRememberUpdatedState = z4.rememberUpdatedState(m0.m4848boximpl(j10), wVar, (i10 >> 6) & 14);
        Boolean boolValueOf = Boolean.valueOf(z10);
        s2.i iVarM6815boximpl = s2.i.m6815boximpl(f10);
        wVar.startReplaceableGroup(-3686552);
        boolean zChanged = wVar.changed(boolValueOf) | wVar.changed(iVarM6815boximpl);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = new f(z10, f10, v5VarRememberUpdatedState, null);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        f fVar = (f) objRememberedValue;
        wVar.endReplaceableGroup();
        return fVar;
    }
}
