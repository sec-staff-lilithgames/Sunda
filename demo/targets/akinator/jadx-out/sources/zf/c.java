package zf;

import android.animation.AnimatorSet;
import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar;
import qg.r0;
import qg.s0;
import x3.e3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class c implements r0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f97936b;

    public c(BottomAppBar bottomAppBar) {
        this.f97936b = bottomAppBar;
    }

    @Override // qg.r0
    public e3 onApplyWindowInsets(View view, e3 e3Var, s0 s0Var) {
        boolean z10;
        BottomAppBar bottomAppBar = this.f97936b;
        if (bottomAppBar.f28961l0) {
            bottomAppBar.f28968s0 = e3Var.getSystemWindowInsetBottom();
        }
        boolean z11 = false;
        if (bottomAppBar.f28962m0) {
            z10 = bottomAppBar.f28970u0 != e3Var.getSystemWindowInsetLeft();
            bottomAppBar.f28970u0 = e3Var.getSystemWindowInsetLeft();
        } else {
            z10 = false;
        }
        if (bottomAppBar.f28963n0) {
            boolean z12 = bottomAppBar.f28969t0 != e3Var.getSystemWindowInsetRight();
            bottomAppBar.f28969t0 = e3Var.getSystemWindowInsetRight();
            z11 = z12;
        }
        if (!z10 && !z11) {
            return e3Var;
        }
        AnimatorSet animatorSet = bottomAppBar.f28952c0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = bottomAppBar.f28951b0;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        bottomAppBar.E();
        bottomAppBar.D();
        return e3Var;
    }
}
