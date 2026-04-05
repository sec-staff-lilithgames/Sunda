package com.fyber.inneractive.sdk.util;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Insets insets = windowInsets.getInsets(WindowInsets.Type.displayCutout());
        int iB = o.b();
        if (iB == 1) {
            view.setPadding(insets.left, 0, 0, 0);
            return windowInsets;
        }
        if (iB == 2) {
            view.setPadding(0, 0, 0, insets.bottom);
            return windowInsets;
        }
        if (iB != 3) {
            view.setPadding(0, insets.top, 0, 0);
            return windowInsets;
        }
        view.setPadding(0, 0, insets.right, 0);
        return windowInsets;
    }
}
