package v2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface b0 {
    void getWindowVisibleDisplayFrame(View view, Rect rect);

    void setGestureExclusionRects(View view, int i10, int i11);

    void updateViewLayout(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams);
}
