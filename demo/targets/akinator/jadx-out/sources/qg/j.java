package qg;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import x3.r2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class j {
    public static void applyEdgeToEdge(Window window, boolean z10) {
        applyEdgeToEdge(window, z10, null, null);
    }

    public static void setLightNavigationBar(Window window, boolean z10) {
        r2.getInsetsController(window, window.getDecorView()).setAppearanceLightNavigationBars(z10);
    }

    public static void setLightStatusBar(Window window, boolean z10) {
        r2.getInsetsController(window, window.getDecorView()).setAppearanceLightStatusBars(z10);
    }

    public static void applyEdgeToEdge(Window window, boolean z10, Integer num, Integer num2) {
        boolean z11 = true;
        boolean z12 = num == null || num.intValue() == 0;
        boolean z13 = num2 == null || num2.intValue() == 0;
        if (z12 || z13) {
            int color = jg.b.getColor(window.getContext(), R.attr.colorBackground, -16777216);
            if (z12) {
                num = Integer.valueOf(color);
            }
            if (z13) {
                num2 = Integer.valueOf(color);
            }
        }
        r2.setDecorFitsSystemWindows(window, !z10);
        int color2 = z10 ? 0 : jg.b.getColor(window.getContext(), R.attr.statusBarColor, -16777216);
        Context context = window.getContext();
        int color3 = (!z10 || Build.VERSION.SDK_INT >= 27) ? z10 ? 0 : jg.b.getColor(context, R.attr.navigationBarColor, -16777216) : o3.b.setAlphaComponent(jg.b.getColor(context, R.attr.navigationBarColor, -16777216), 128);
        window.setStatusBarColor(color2);
        window.setNavigationBarColor(color3);
        setLightStatusBar(window, jg.b.isColorLight(color2) || (color2 == 0 && jg.b.isColorLight(num.intValue())));
        boolean zIsColorLight = jg.b.isColorLight(num2.intValue());
        if (!jg.b.isColorLight(color3) && (color3 != 0 || !zIsColorLight)) {
            z11 = false;
        }
        setLightNavigationBar(window, z11);
    }
}
