package p;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f79983b;

    public e(h hVar) {
        this.f79983b = hVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        h hVar = this.f79983b;
        ViewTreeObserver viewTreeObserver = hVar.A;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                hVar.A = view.getViewTreeObserver();
            }
            hVar.A.removeGlobalOnLayoutListener(hVar.f79999l);
        }
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
