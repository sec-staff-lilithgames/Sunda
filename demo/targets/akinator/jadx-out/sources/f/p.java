package f;

import android.view.View;
import android.view.Window;
import x3.d4;
import x3.r2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class p extends t {
    @Override // f.t, f.u
    public void setUp(k0 statusBarStyle, k0 navigationBarStyle, Window window, View view, boolean z10, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(window, "window");
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        r2.setDecorFitsSystemWindows(window, false);
        window.setStatusBarColor(statusBarStyle.getScrim$activity_release(z10));
        window.setNavigationBarColor(navigationBarStyle.getScrim$activity_release(z11));
        d4 d4Var = new d4(window, view);
        d4Var.setAppearanceLightStatusBars(!z10);
        d4Var.setAppearanceLightNavigationBars(!z11);
    }
}
