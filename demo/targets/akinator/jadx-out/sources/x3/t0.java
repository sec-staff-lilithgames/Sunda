package x3;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final View f91676b;

    /* renamed from: c, reason: collision with root package name */
    public ViewTreeObserver f91677c;

    /* renamed from: e, reason: collision with root package name */
    public final Runnable f91678e;

    public t0(View view, Runnable runnable) {
        this.f91676b = view;
        this.f91677c = view.getViewTreeObserver();
        this.f91678e = runnable;
    }

    public static t0 add(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        t0 t0Var = new t0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(t0Var);
        view.addOnAttachStateChangeListener(t0Var);
        return t0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        removeListener();
        this.f91678e.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f91677c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        removeListener();
    }

    public void removeListener() {
        boolean zIsAlive = this.f91677c.isAlive();
        View view = this.f91676b;
        if (zIsAlive) {
            this.f91677c.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
