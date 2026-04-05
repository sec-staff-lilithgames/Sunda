package x3;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o1 {
    public static int a(View view) {
        return view.getScrollIndicators();
    }

    public static void b(View view, int i10) {
        view.setScrollIndicators(i10);
    }

    public static void c(View view, int i10, int i11) {
        view.setScrollIndicators(i10, i11);
    }

    public static e3 getRootWindowInsets(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        e3 windowInsetsCompat = e3.toWindowInsetsCompat(rootWindowInsets);
        windowInsetsCompat.f91569a.r(windowInsetsCompat);
        windowInsetsCompat.f91569a.d(view.getRootView());
        return windowInsetsCompat;
    }
}
