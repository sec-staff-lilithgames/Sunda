package dh;

import android.view.View;
import android.view.accessibility.AccessibilityManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class o implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f52249b;

    public o(q qVar) {
        this.f52249b = qVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        q qVar = this.f52249b;
        AccessibilityManager accessibilityManager = qVar.f52273v;
        if (qVar.f52274w == null || accessibilityManager == null || !qVar.isAttachedToWindow()) {
            return;
        }
        accessibilityManager.addTouchExplorationStateChangeListener(qVar.f52274w);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        q qVar = this.f52249b;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = qVar.f52274w;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = qVar.f52273v) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }
}
