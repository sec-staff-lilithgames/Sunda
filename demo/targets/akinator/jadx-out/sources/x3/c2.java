package x3;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c2 {

    /* renamed from: a, reason: collision with root package name */
    public static final WindowInsets f91555a = e3.f91568b.toWindowInsets();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f91556b = false;

    public static WindowInsets a(View view, WindowInsets windowInsets) {
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        Object tag2 = view.getTag(R.id.tag_window_insets_animation_callback);
        final View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = tag instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag : tag2 instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag2 : null;
        WindowInsets windowInsets2 = f91555a;
        final WindowInsets[] windowInsetsArr = {windowInsets2};
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: x3.b2
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets3) {
                View.OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener;
                windowInsetsArr[0] = onApplyWindowInsetsListener2 != null ? onApplyWindowInsetsListener2.onApplyWindowInsets(view2, windowInsets3) : view2.onApplyWindowInsets(windowInsets3);
                return c2.f91555a;
            }
        });
        view.dispatchApplyWindowInsets(windowInsets);
        Object tag3 = view.getTag(R.id.tag_compat_insets_dispatch);
        if (tag3 instanceof View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) tag3;
        }
        view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        WindowInsets windowInsets3 = windowInsetsArr[0];
        if (windowInsets3 != null && !windowInsets3.isConsumed() && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                a(viewGroup.getChildAt(i10), windowInsetsArr[0]);
            }
        }
        WindowInsets windowInsets4 = windowInsetsArr[0];
        return windowInsets4 != null ? windowInsets4 : windowInsets2;
    }

    @Deprecated
    public static int getLayoutMode(ViewGroup viewGroup) {
        return viewGroup.getLayoutMode();
    }

    public static int getNestedScrollAxes(ViewGroup viewGroup) {
        return viewGroup.getNestedScrollAxes();
    }

    public static void installCompatInsetsDispatch(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return;
        }
        View.OnApplyWindowInsetsListener d3Var = new o9.d3(1);
        view.setTag(R.id.tag_compat_insets_dispatch, d3Var);
        view.setOnApplyWindowInsetsListener(d3Var);
        f91556b = true;
    }

    public static boolean isTransitionGroup(ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }

    @Deprecated
    public static boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    @Deprecated
    public static void setLayoutMode(ViewGroup viewGroup, int i10) {
        viewGroup.setLayoutMode(i10);
    }

    @Deprecated
    public static void setMotionEventSplittingEnabled(ViewGroup viewGroup, boolean z10) {
        viewGroup.setMotionEventSplittingEnabled(z10);
    }

    public static void setTransitionGroup(ViewGroup viewGroup, boolean z10) {
        viewGroup.setTransitionGroup(z10);
    }
}
