package x3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n1 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static e3 b(View view, e3 e3Var, Rect rect) {
        WindowInsets windowInsets = e3Var.toWindowInsets();
        if (windowInsets != null) {
            return e3.toWindowInsetsCompat(view.computeSystemWindowInsets(windowInsets, rect), view);
        }
        rect.setEmpty();
        return e3Var;
    }

    public static boolean c(View view, float f10, float f11, boolean z10) {
        return view.dispatchNestedFling(f10, f11, z10);
    }

    public static boolean d(View view, float f10, float f11) {
        return view.dispatchNestedPreFling(f10, f11);
    }

    public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
    }

    public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static e3 getRootWindowInsets(View view) {
        return d3.getRootWindowInsets(view);
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static String j(View view) {
        return view.getTransitionName();
    }

    public static float k(View view) {
        return view.getTranslationZ();
    }

    public static float l(View view) {
        return view.getZ();
    }

    public static boolean m(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean n(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean o(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void p(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void q(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void r(View view, float f10) {
        view.setElevation(f10);
    }

    public static void s(View view, boolean z10) {
        view.setNestedScrollingEnabled(z10);
    }

    public static void t(View view, q0 q0Var) {
        m1 m1Var = q0Var != null ? new m1(view, q0Var) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, m1Var);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (m1Var != null) {
            view.setOnApplyWindowInsetsListener(m1Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void u(View view, String str) {
        view.setTransitionName(str);
    }

    public static void v(View view, float f10) {
        view.setTranslationZ(f10);
    }

    public static void w(View view, float f10) {
        view.setZ(f10);
    }

    public static boolean x(View view, int i10) {
        return view.startNestedScroll(i10);
    }

    public static void y(View view) {
        view.stopNestedScroll();
    }
}
