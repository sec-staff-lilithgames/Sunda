package p;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f79988b;

    public f0(h0 h0Var) {
        this.f79988b = h0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        h0 h0Var = this.f79988b;
        if (!h0Var.isShowing() || h0Var.f80024k.isModal()) {
            return;
        }
        View view = h0Var.f80029p;
        if (view == null || !view.isShown()) {
            h0Var.dismiss();
        } else {
            h0Var.f80024k.show();
        }
    }
}
