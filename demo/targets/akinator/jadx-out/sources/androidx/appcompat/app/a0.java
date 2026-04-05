package androidx.appcompat.app;

import android.view.ViewGroup;
import x3.m2;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f4718b;

    public a0(t0 t0Var) {
        this.f4718b = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ViewGroup viewGroup;
        t0 t0Var = this.f4718b;
        t0Var.f4871y.showAtLocation(t0Var.f4870x, 55, 0, 0);
        m2 m2Var = t0Var.A;
        if (m2Var != null) {
            m2Var.cancel();
        }
        if (!t0Var.C || (viewGroup = t0Var.D) == null || !viewGroup.isLaidOut()) {
            t0Var.f4870x.setAlpha(1.0f);
            t0Var.f4870x.setVisibility(0);
        } else {
            t0Var.f4870x.setAlpha(0.0f);
            m2 m2VarAlpha = z1.animate(t0Var.f4870x).alpha(1.0f);
            t0Var.A = m2VarAlpha;
            m2VarAlpha.setListener(new z(this));
        }
    }
}
