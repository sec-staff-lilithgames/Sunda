package pr;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class p {
    public static boolean belongTo(ViewGroup viewGroup, View view) {
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup2 = (ViewGroup) parent;
        return viewGroup2.equals(viewGroup) || belongTo(viewGroup, viewGroup2);
    }

    public static <T extends View> T findViewByClassName(ViewGroup viewGroup, Class<T> cls) {
        T t10;
        try {
            if (viewGroup.getClass() == cls) {
                return viewGroup;
            }
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if ((childAt instanceof ViewGroup) && (t10 = (T) findViewByClassName((ViewGroup) childAt, cls)) != null) {
                    return t10;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void removeViewFromParent(View view) {
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    public static void safeAddSingleView(ViewGroup viewGroup, View view) {
        safeAddSingleView(viewGroup, view, null);
    }

    public static void safeAddView(ViewGroup viewGroup, View view) {
        safeAddView(viewGroup, view, null);
    }

    public static void safeAddSingleView(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams) {
        try {
            viewGroup.removeAllViews();
        } catch (Exception e10) {
            nm.a.w(e10);
        }
        safeAddView(viewGroup, view, layoutParams);
    }

    public static void safeAddView(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams) {
        try {
            removeViewFromParent(view);
            if (layoutParams != null) {
                viewGroup.addView(view, layoutParams);
            } else {
                viewGroup.addView(view);
            }
        } catch (Exception e10) {
            nm.a.w(e10);
        }
    }
}
