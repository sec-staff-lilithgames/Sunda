package ir;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.e0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class o {
    public static final void applyFullscreenActivity(Activity activity, boolean z10) {
        e0.checkNotNullParameter(activity, "<this>");
        activity.requestWindowFeature(1);
        Window window = activity.getWindow();
        if (window != null) {
            window.addFlags(128);
            applySystemUiVisibility(window, z10);
        }
        hideKeyboard(activity);
    }

    public static /* synthetic */ void applyFullscreenActivity$default(Activity activity, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        applyFullscreenActivity(activity, z10);
    }

    public static final void applySystemUiVisibility(Window window, boolean z10) {
        int i10;
        e0.checkNotNullParameter(window, "<this>");
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsController windowInsetsController = window.getDecorView().getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.setSystemBarsBehavior(2);
                if (z10) {
                    windowInsetsController.hide(WindowInsets.Type.statusBars());
                    return;
                }
                return;
            }
            return;
        }
        if (z10) {
            window.setFlags(1024, 1024);
            i10 = 4;
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            window.getDecorView().setSystemUiVisibility(i10);
        }
    }

    public static /* synthetic */ void applySystemUiVisibility$default(Window window, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        applySystemUiVisibility(window, z10);
    }

    public static final void finishActivityWithoutAnimation(Activity activity) {
        e0.checkNotNullParameter(activity, "<this>");
        activity.finish();
        setNoActivityTransition(activity);
    }

    public static final void finishActivityWithoutAnimationSafely(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            finishActivityWithoutAnimation(activity);
        } catch (Throwable unused) {
        }
    }

    public static final Boolean hideKeyboard(Activity activity) {
        e0.checkNotNullParameter(activity, "<this>");
        InputMethodManager inputMethodManager = s.getInputMethodManager(activity);
        if (inputMethodManager == null) {
            return null;
        }
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        return Boolean.valueOf(inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0));
    }

    public static final x0 setActivityBackgroundColor(Activity activity, int i10) {
        e0.checkNotNullParameter(activity, "<this>");
        return n.setWindowBackgroundColor(activity.getWindow(), i10);
    }

    public static final void setNoActivityTransition(Activity activity) {
        e0.checkNotNullParameter(activity, "<this>");
        if (Build.VERSION.SDK_INT >= 34) {
            try {
                activity.overrideActivityTransition(0, 0, 0, 0);
                activity.overrideActivityTransition(1, 0, 0, 0);
                return;
            } catch (Throwable unused) {
            }
        }
        try {
            activity.overridePendingTransition(0, 0);
        } catch (Throwable unused2) {
        }
    }

    public static final x0 setWindowBackgroundColor(Window window, int i10) {
        if (window == null) {
            return null;
        }
        window.setBackgroundDrawable(new ColorDrawable(i10));
        return x0.f87415a;
    }
}
