package yf;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class f implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HideViewOnScrollBehavior f94389b;

    public f(HideViewOnScrollBehavior hideViewOnScrollBehavior) {
        this.f94389b = hideViewOnScrollBehavior;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        HideViewOnScrollBehavior hideViewOnScrollBehavior = this.f94389b;
        a aVar = hideViewOnScrollBehavior.f28927e;
        if (aVar == null || (accessibilityManager = hideViewOnScrollBehavior.f28926c) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(aVar);
        hideViewOnScrollBehavior.f28927e = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
