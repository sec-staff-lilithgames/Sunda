package x3;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class r2 {
    public static void enableEdgeToEdge(Window window) {
        Objects.requireNonNull(window);
        window.getDecorView();
        setDecorFitsSystemWindows(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = i10 >= 30 ? 3 : 1;
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes.layoutInDisplayCutoutMode != i11) {
                attributes.layoutInDisplayCutoutMode = i11;
                window.setAttributes(attributes);
            }
        }
        if (i10 >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
        }
    }

    public static d4 getInsetsController(Window window, View view) {
        return new d4(window, view);
    }

    public static <T extends View> T requireViewById(Window window, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) e4.q.x(window, i10);
        }
        T t10 = (T) window.findViewById(i10);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void setDecorFitsSystemWindows(Window window, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            c4.a.t(window, z10);
        } else {
            if (i10 >= 30) {
                c4.a.s(window, z10);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }
}
