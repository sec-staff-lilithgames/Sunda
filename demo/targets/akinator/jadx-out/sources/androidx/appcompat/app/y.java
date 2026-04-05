package androidx.appcompat.app;

import x3.m2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y implements q.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f4899a;

    public y(t0 t0Var) {
        this.f4899a = t0Var;
    }

    @Override // q.g1
    public void onDetachedFromWindow() {
        t0 t0Var = this.f4899a;
        q.h1 h1Var = t0Var.f4866t;
        if (h1Var != null) {
            h1Var.dismissPopups();
        }
        if (t0Var.f4871y != null) {
            t0Var.f4860n.getDecorView().removeCallbacks(t0Var.f4872z);
            if (t0Var.f4871y.isShowing()) {
                try {
                    t0Var.f4871y.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            t0Var.f4871y = null;
        }
        m2 m2Var = t0Var.A;
        if (m2Var != null) {
            m2Var.cancel();
        }
        p.m mVar = t0Var.r(0).f4831h;
        if (mVar != null) {
            mVar.close();
        }
    }

    @Override // q.g1
    public void onAttachedFromWindow() {
    }
}
