package um;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f88648b;

    public y(a0 a0Var) {
        this.f88648b = a0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        a0 a0Var = this.f88648b;
        boolean zIsShown = a0Var.f88537a.isShown();
        if (a0Var.f88539c == zIsShown) {
            return;
        }
        a0Var.f88539c = zIsShown;
        if (!zIsShown) {
            a0Var.stop();
        } else if (a0Var.isTicking()) {
            a0Var.start();
        }
    }
}
