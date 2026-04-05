package v2;

import android.graphics.Rect;
import android.view.View;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 extends d0 {
    @Override // v2.d0, v2.b0
    public void setGestureExclusionRects(View composeView, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composeView, "composeView");
        composeView.setSystemGestureExclusionRects(p0.mutableListOf(new Rect(0, 0, i10, i11)));
    }
}
