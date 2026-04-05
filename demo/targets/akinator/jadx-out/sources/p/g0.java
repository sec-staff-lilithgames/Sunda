package p;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g0 implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f79990b;

    public g0(h0 h0Var) {
        this.f79990b = h0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        h0 h0Var = this.f79990b;
        ViewTreeObserver viewTreeObserver = h0Var.f80031r;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                h0Var.f80031r = view.getViewTreeObserver();
            }
            h0Var.f80031r.removeGlobalOnLayoutListener(h0Var.f80025l);
        }
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
