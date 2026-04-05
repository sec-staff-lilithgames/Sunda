package b0;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t2 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f8512a = ViewConfiguration.getScrollFriction();

    public static final float getPlatformFlingScrollFriction() {
        return f8512a;
    }

    public static final <T> c0.c0 rememberSplineBasedDecay(p0.w wVar, int i10) {
        s2.e eVar = (s2.e) a.b.d(wVar, 904445851);
        Float fValueOf = Float.valueOf(eVar.getDensity());
        wVar.startReplaceableGroup(1157296644);
        boolean zChanged = wVar.changed(fValueOf);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = c0.e0.generateDecayAnimationSpec(new s2(eVar));
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        c0.c0 c0Var = (c0.c0) objRememberedValue;
        wVar.endReplaceableGroup();
        return c0Var;
    }

    @tu.f
    public static final /* synthetic */ c0.c0 splineBasedDecay(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        return r2.splineBasedDecay(density);
    }
}
