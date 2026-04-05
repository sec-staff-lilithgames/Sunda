package yf;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f94384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout.a f94385c;

    public /* synthetic */ a(CoordinatorLayout.a aVar, View view, int i10) {
        this.f94383a = i10;
        this.f94385c = aVar;
        this.f94384b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        switch (this.f94383a) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f94385c;
                if (!z10) {
                    hideBottomViewOnScrollBehavior.getClass();
                    break;
                } else if (hideBottomViewOnScrollBehavior.isScrolledDown()) {
                    hideBottomViewOnScrollBehavior.slideUp(this.f94384b);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f94385c;
                if (hideViewOnScrollBehavior.f28928f && z10 && hideViewOnScrollBehavior.isScrolledOut()) {
                    hideViewOnScrollBehavior.slideIn(this.f94384b);
                    break;
                }
                break;
        }
    }
}
