package x3;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class u1 {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static int b(View view) {
        return view.getImportantForContentCapture();
    }

    public static CharSequence c(View view) {
        return view.getStateDescription();
    }

    public static boolean d(View view) {
        return view.isImportantForContentCapture();
    }

    public static void e(View view, int i10) {
        view.setImportantForContentCapture(i10);
    }

    public static void f(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    public static d4 getWindowInsetsController(View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return d4.toWindowInsetsControllerCompat(windowInsetsController);
        }
        return null;
    }
}
