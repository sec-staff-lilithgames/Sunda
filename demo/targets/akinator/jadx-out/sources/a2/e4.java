package a2;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e4 {
    /* renamed from: access$getScrollAxes-k-4lQ0M, reason: not valid java name */
    public static final int m28access$getScrollAxesk4lQ0M(long j10) {
        int i10 = Math.abs(i1.h.m4185getXimpl(j10)) >= 0.5f ? 1 : 0;
        return Math.abs(i1.h.m4186getYimpl(j10)) >= 0.5f ? i10 | 2 : i10;
    }

    /* renamed from: access$toViewType-GyEprt8, reason: not valid java name */
    public static final int m30access$toViewTypeGyEprt8(int i10) {
        return !t1.o.m7026equalsimpl0(i10, t1.o.f86279b.m7020getDragWNlRxjI()) ? 1 : 0;
    }

    public static final float access$toViewVelocity(float f10) {
        return f10 * (-1.0f);
    }

    public static final int composeToViewOffset(float f10) {
        return ((int) (f10 >= 0.0f ? Math.ceil(f10) : Math.floor(f10))) * (-1);
    }

    public static final t1.a rememberNestedScrollInteropConnection(p0.w wVar, int i10) {
        wVar.startReplaceableGroup(1471602047);
        View view = (View) wVar.consume(AndroidCompositionLocals_androidKt.getLocalView());
        wVar.startReplaceableGroup(1157296644);
        boolean zChanged = wVar.changed(view);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = new d4(view);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        d4 d4Var = (d4) objRememberedValue;
        wVar.endReplaceableGroup();
        return d4Var;
    }
}
