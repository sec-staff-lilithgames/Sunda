package o9;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g6 implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(windowInsets, "windowInsets");
        if (Build.VERSION.SDK_INT < 30) {
            return windowInsets;
        }
        Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(insets, "getInsets(...)");
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        WindowInsets CONSUMED = WindowInsets.CONSUMED;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(CONSUMED, "CONSUMED");
        return CONSUMED;
    }
}
