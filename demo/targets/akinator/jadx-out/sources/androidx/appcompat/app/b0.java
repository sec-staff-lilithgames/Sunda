package androidx.appcompat.app;

import android.view.View;
import x3.o2;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f4720a;

    public b0(t0 t0Var) {
        this.f4720a = t0Var;
    }

    @Override // x3.o2, x3.n2
    public void onAnimationEnd(View view) {
        t0 t0Var = this.f4720a;
        t0Var.f4870x.setAlpha(1.0f);
        t0Var.A.setListener(null);
        t0Var.A = null;
    }

    @Override // x3.o2, x3.n2
    public void onAnimationStart(View view) {
        t0 t0Var = this.f4720a;
        t0Var.f4870x.setVisibility(0);
        if (t0Var.f4870x.getParent() instanceof View) {
            z1.requestApplyInsets((View) t0Var.f4870x.getParent());
        }
    }
}
