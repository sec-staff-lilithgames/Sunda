package i3;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import x3.e3;
import x3.q0;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements q0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f59376b;

    public a(CoordinatorLayout coordinatorLayout) {
        this.f59376b = coordinatorLayout;
    }

    @Override // x3.q0
    public e3 onApplyWindowInsets(View view, e3 e3Var) {
        CoordinatorLayout.a behavior;
        CoordinatorLayout coordinatorLayout = this.f59376b;
        if (!w3.d.equals(coordinatorLayout.f5600q, e3Var)) {
            coordinatorLayout.f5600q = e3Var;
            boolean z10 = e3Var != null && e3Var.getSystemWindowInsetTop() > 0;
            coordinatorLayout.f5601r = z10;
            coordinatorLayout.setWillNotDraw(!z10 && coordinatorLayout.getBackground() == null);
            if (!e3Var.isConsumed()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = coordinatorLayout.getChildAt(i10);
                    if (z1.getFitsSystemWindows(childAt) && (behavior = ((CoordinatorLayout.b) childAt.getLayoutParams()).getBehavior()) != null) {
                        e3Var = behavior.onApplyWindowInsets(coordinatorLayout, childAt, e3Var);
                        if (e3Var.isConsumed()) {
                            break;
                        }
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return e3Var;
    }
}
