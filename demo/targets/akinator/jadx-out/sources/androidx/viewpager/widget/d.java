package androidx.viewpager.widget;

import android.graphics.Rect;
import android.view.View;
import x3.e3;
import x3.q0;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements q0 {

    /* renamed from: b, reason: collision with root package name */
    public final Rect f7352b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPager f7353c;

    public d(ViewPager viewPager) {
        this.f7353c = viewPager;
    }

    @Override // x3.q0
    public e3 onApplyWindowInsets(View view, e3 e3Var) {
        e3 e3VarOnApplyWindowInsets = z1.onApplyWindowInsets(view, e3Var);
        if (e3VarOnApplyWindowInsets.isConsumed()) {
            return e3VarOnApplyWindowInsets;
        }
        int systemWindowInsetLeft = e3VarOnApplyWindowInsets.getSystemWindowInsetLeft();
        Rect rect = this.f7352b;
        rect.left = systemWindowInsetLeft;
        rect.top = e3VarOnApplyWindowInsets.getSystemWindowInsetTop();
        rect.right = e3VarOnApplyWindowInsets.getSystemWindowInsetRight();
        rect.bottom = e3VarOnApplyWindowInsets.getSystemWindowInsetBottom();
        ViewPager viewPager = this.f7353c;
        int childCount = viewPager.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            e3 e3VarDispatchApplyWindowInsets = z1.dispatchApplyWindowInsets(viewPager.getChildAt(i10), e3VarOnApplyWindowInsets);
            rect.left = Math.min(e3VarDispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
            rect.top = Math.min(e3VarDispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
            rect.right = Math.min(e3VarDispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
            rect.bottom = Math.min(e3VarDispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
        }
        return e3VarOnApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
    }
}
