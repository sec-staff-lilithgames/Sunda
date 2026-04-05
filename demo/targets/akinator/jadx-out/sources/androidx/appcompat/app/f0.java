package androidx.appcompat.app;

import android.view.View;
import android.widget.PopupWindow;
import x3.o2;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f0 extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f4728a;

    public f0(g0 g0Var) {
        this.f4728a = g0Var;
    }

    @Override // x3.o2, x3.n2
    public void onAnimationEnd(View view) {
        g0 g0Var = this.f4728a;
        g0Var.f4739b.f4870x.setVisibility(8);
        t0 t0Var = g0Var.f4739b;
        PopupWindow popupWindow = t0Var.f4871y;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (t0Var.f4870x.getParent() instanceof View) {
            z1.requestApplyInsets((View) g0Var.f4739b.f4870x.getParent());
        }
        g0Var.f4739b.f4870x.killMode();
        g0Var.f4739b.A.setListener(null);
        t0 t0Var2 = g0Var.f4739b;
        t0Var2.A = null;
        z1.requestApplyInsets(t0Var2.D);
    }
}
