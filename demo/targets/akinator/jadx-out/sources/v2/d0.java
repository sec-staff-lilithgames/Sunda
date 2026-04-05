package v2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class d0 implements b0 {
    @Override // v2.b0
    public void getWindowVisibleDisplayFrame(View composeView, Rect outRect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composeView, "composeView");
        kotlin.jvm.internal.e0.checkNotNullParameter(outRect, "outRect");
        composeView.getWindowVisibleDisplayFrame(outRect);
    }

    @Override // v2.b0
    public void setGestureExclusionRects(View composeView, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composeView, "composeView");
    }

    @Override // v2.b0
    public void updateViewLayout(WindowManager windowManager, View popupView, ViewGroup.LayoutParams params) {
        kotlin.jvm.internal.e0.checkNotNullParameter(windowManager, "windowManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(popupView, "popupView");
        kotlin.jvm.internal.e0.checkNotNullParameter(params, "params");
        windowManager.updateViewLayout(popupView, params);
    }
}
