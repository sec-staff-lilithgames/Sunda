package ir;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import ir.x;
import kotlin.jvm.internal.e0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class t {
    public static final void addSingleViewSafely(ViewGroup container, View view) {
        e0.checkNotNullParameter(container, "container");
        e0.checkNotNullParameter(view, "view");
        addSingleViewSafely(container, view, null);
    }

    public static /* synthetic */ void addSingleViewSafely$default(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            layoutParams = null;
        }
        addSingleViewSafely(viewGroup, view, layoutParams);
    }

    public static final void addViewSafely(ViewGroup container, View view) {
        e0.checkNotNullParameter(container, "container");
        e0.checkNotNullParameter(view, "view");
        addViewSafely(container, view, null);
    }

    public static /* synthetic */ void addViewSafely$default(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            layoutParams = null;
        }
        addViewSafely(viewGroup, view, layoutParams);
    }

    public static final boolean belongTo(View child, ViewGroup parent) {
        e0.checkNotNullParameter(child, "child");
        e0.checkNotNullParameter(parent, "parent");
        return x.belongTo(child, parent);
    }

    public static final ViewGroup.LayoutParams createMatchParentParams() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public static final void doOnLayout(View view, kv.l action) {
        e0.checkNotNullParameter(view, "view");
        e0.checkNotNullParameter(action, "action");
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new x.a(action));
        } else {
            action.invoke(view);
        }
    }

    public static final View findContentOrRootView(View view) {
        e0.checkNotNullParameter(view, "view");
        return x.findContentOrRootView(view);
    }

    public static final <T extends View> T findViewByClassName(ViewGroup parent, Class<T> viewClass) {
        e0.checkNotNullParameter(parent, "parent");
        e0.checkNotNullParameter(viewClass, "viewClass");
        return (T) x.findViewByClassName(parent, viewClass);
    }

    public static final int generateViewId() {
        return View.generateViewId();
    }

    public static final Rect getLocationInWindow(View view) {
        e0.checkNotNullParameter(view, "view");
        return x.getLocationInWindow(view);
    }

    public static final void hideViewSafely(View view) {
        x.hideViewSafely(view);
    }

    public static final boolean isViewTransparent(View view) {
        e0.checkNotNullParameter(view, "view");
        return x.isViewTransparent(view);
    }

    public static final boolean isViewVisible(View view) {
        e0.checkNotNullParameter(view, "view");
        return x.isViewVisible(view);
    }

    public static final x0 removeFromParent(View view) {
        e0.checkNotNullParameter(view, "view");
        return x.removeFromParent(view);
    }

    public static final void setBackgroundColorSafely(View view, Integer num) {
        x.setBackgroundColorSafely(view, num);
    }

    public static final void setInsetsChanger(View view) {
        e0.checkNotNullParameter(view, "view");
        setInsetsChanger(view, WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
    }

    public static /* synthetic */ void setInsetsChanger$default(View view, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout();
        }
        setInsetsChanger(view, i10);
    }

    public static final void showViewSafely(View view) {
        x.showViewSafely(view);
    }

    public static final String visibilityToString(int i10) {
        return i10 != 0 ? i10 != 4 ? i10 != 8 ? "unknown" : "GONE" : "INVISIBLE" : "VISIBLE";
    }

    public static final void addSingleViewSafely(ViewGroup container, View view, ViewGroup.LayoutParams layoutParams) {
        e0.checkNotNullParameter(container, "container");
        e0.checkNotNullParameter(view, "view");
        x.addSingleViewSafely(container, view, layoutParams);
    }

    public static final void addViewSafely(ViewGroup container, View view, ViewGroup.LayoutParams layoutParams) {
        e0.checkNotNullParameter(container, "container");
        e0.checkNotNullParameter(view, "view");
        x.addViewSafely(container, view, layoutParams);
    }

    public static final boolean isViewVisible(int i10) {
        return i10 == 0;
    }

    public static final void setInsetsChanger(View view, int i10) {
        e0.checkNotNullParameter(view, "view");
        x.setInsetsChanger(view, i10);
    }
}
