package androidx.appcompat.app;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.applovin.shadow.okio.Segment;
import com.digidust.elokence.akinator.freemium.R;
import java.lang.reflect.InvocationTargetException;
import q.f4;
import x3.e3;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x implements x3.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f4886b;

    public x(t0 t0Var) {
        this.f4886b = t0Var;
    }

    @Override // x3.q0
    public e3 onApplyWindowInsets(View view, e3 e3Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z10;
        boolean z11;
        int systemWindowInsetTop = e3Var.getSystemWindowInsetTop();
        t0 t0Var = this.f4886b;
        Context context = t0Var.f4859m;
        int systemWindowInsetTop2 = e3Var.getSystemWindowInsetTop();
        ActionBarContextView actionBarContextView = t0Var.f4870x;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) t0Var.f4870x.getLayoutParams();
            if (t0Var.f4870x.isShown()) {
                if (t0Var.f4853f0 == null) {
                    t0Var.f4853f0 = new Rect();
                    t0Var.f4854g0 = new Rect();
                }
                Rect rect = t0Var.f4853f0;
                Rect rect2 = t0Var.f4854g0;
                rect.set(e3Var.getSystemWindowInsetLeft(), e3Var.getSystemWindowInsetTop(), e3Var.getSystemWindowInsetRight(), e3Var.getSystemWindowInsetBottom());
                f4.computeFitSystemWindows(t0Var.D, rect, rect2);
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                e3 rootWindowInsets = z1.getRootWindowInsets(t0Var.D);
                int systemWindowInsetLeft = rootWindowInsets == null ? 0 : rootWindowInsets.getSystemWindowInsetLeft();
                int systemWindowInsetRight = rootWindowInsets == null ? 0 : rootWindowInsets.getSystemWindowInsetRight();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || t0Var.F != null) {
                    View view2 = t0Var.F;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != systemWindowInsetLeft || marginLayoutParams2.rightMargin != systemWindowInsetRight) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = systemWindowInsetLeft;
                            marginLayoutParams2.rightMargin = systemWindowInsetRight;
                            t0Var.F.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    t0Var.F = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = systemWindowInsetLeft;
                    layoutParams.rightMargin = systemWindowInsetRight;
                    t0Var.D.addView(t0Var.F, -1, layoutParams);
                }
                View view4 = t0Var.F;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = t0Var.F;
                    view5.setBackgroundColor((z1.getWindowSystemUiVisibility(view5) & Segment.SIZE) != 0 ? m3.a.getColor(context, R.color.abc_decor_view_status_guard_light) : m3.a.getColor(context, R.color.abc_decor_view_status_guard));
                }
                if (!t0Var.K && z) {
                    systemWindowInsetTop2 = 0;
                }
                z10 = z;
                z = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z = false;
            }
            if (z) {
                t0Var.f4870x.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = t0Var.F;
        if (view6 != null) {
            view6.setVisibility(z10 ? 0 : 8);
        }
        return z1.onApplyWindowInsets(view, systemWindowInsetTop != systemWindowInsetTop2 ? e3Var.replaceSystemWindowInsets(e3Var.getSystemWindowInsetLeft(), systemWindowInsetTop2, e3Var.getSystemWindowInsetRight(), e3Var.getSystemWindowInsetBottom()) : e3Var);
    }
}
