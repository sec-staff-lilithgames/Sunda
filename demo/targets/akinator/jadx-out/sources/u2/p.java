package u2;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class p {
    public static final void access$layoutAccordingTo(View view, z1.b0 b0Var) {
        long jPositionInRoot = x1.e0.positionInRoot(b0Var.getCoordinates());
        int iRoundToInt = mv.d.roundToInt(i1.h.m4185getXimpl(jPositionInRoot));
        int iRoundToInt2 = mv.d.roundToInt(i1.h.m4186getYimpl(jPositionInRoot));
        view.layout(iRoundToInt, iRoundToInt2, view.getMeasuredWidth() + iRoundToInt, view.getMeasuredHeight() + iRoundToInt2);
    }

    public static final float access$toComposeOffset(int i10) {
        return i10 * (-1);
    }

    public static final float access$toComposeVelocity(float f10) {
        return f10 * (-1.0f);
    }

    public static final int access$toNestedScrollSource(int i10) {
        return i10 == 0 ? t1.o.f86279b.m7020getDragWNlRxjI() : t1.o.f86279b.m7021getFlingWNlRxjI();
    }
}
