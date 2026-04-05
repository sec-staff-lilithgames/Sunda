package wf;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import x3.e3;
import x3.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b implements q0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f90550b;

    public b(AppBarLayout appBarLayout) {
        this.f90550b = appBarLayout;
    }

    @Override // x3.q0
    public e3 onApplyWindowInsets(View view, e3 e3Var) {
        AppBarLayout appBarLayout = this.f90550b;
        e3 e3Var2 = appBarLayout.getFitsSystemWindows() ? e3Var : null;
        if (!w3.d.equals(appBarLayout.f28844i, e3Var2)) {
            appBarLayout.f28844i = e3Var2;
            appBarLayout.setWillNotDraw(!(appBarLayout.f28861z != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return e3Var;
    }
}
