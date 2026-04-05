package z0;

import p0.i3;
import p0.k3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f97236a = new Object();

    public static final int bitsForSlot(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    public static final b composableLambda(p0.w wVar, int i10, boolean z10, Object obj) {
        t tVar;
        wVar.startMovableGroup(Integer.rotateLeft(i10, 1), f97236a);
        Object objRememberedValue = wVar.rememberedValue();
        if (objRememberedValue == p0.v.f80515a.getEmpty()) {
            tVar = new t(i10, z10, obj);
            wVar.updateRememberedValue(tVar);
        } else {
            kotlin.jvm.internal.e0.checkNotNull(objRememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            tVar = (t) objRememberedValue;
            tVar.update(obj);
        }
        wVar.endMovableGroup();
        return tVar;
    }

    public static final b composableLambdaInstance(int i10, boolean z10, Object obj) {
        return new t(i10, z10, obj);
    }

    public static final int differentBits(int i10) {
        return bitsForSlot(2, i10);
    }

    public static final b rememberComposableLambda(int i10, boolean z10, Object obj, p0.w wVar, int i11) {
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(-1573003438, i11, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:1371)");
        }
        Object objRememberedValue = wVar.rememberedValue();
        if (objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = new t(i10, z10, obj);
            wVar.updateRememberedValue(objRememberedValue);
        }
        t tVar = (t) objRememberedValue;
        tVar.update(obj);
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        return tVar;
    }

    public static final boolean replacableWith(i3 i3Var, i3 i3Var2) {
        if (i3Var == null) {
            return true;
        }
        if (!(i3Var instanceof k3) || !(i3Var2 instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) i3Var;
        return !k3Var.getValid() || kotlin.jvm.internal.e0.areEqual(i3Var, i3Var2) || kotlin.jvm.internal.e0.areEqual(k3Var.getAnchor(), ((k3) i3Var2).getAnchor());
    }

    public static final int sameBits(int i10) {
        return bitsForSlot(1, i10);
    }
}
