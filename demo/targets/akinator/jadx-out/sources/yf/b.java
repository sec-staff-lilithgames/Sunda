package yf;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HideBottomViewOnScrollBehavior f94386b;

    public b(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.f94386b = hideBottomViewOnScrollBehavior;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = this.f94386b;
        a aVar = hideBottomViewOnScrollBehavior.f28920j;
        if (aVar == null || (accessibilityManager = hideBottomViewOnScrollBehavior.f28919i) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(aVar);
        hideBottomViewOnScrollBehavior.f28920j = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
