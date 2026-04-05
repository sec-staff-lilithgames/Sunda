package f;

import android.view.View;
import android.view.Window;
import com.unity3d.ads.beta.xyn.RnJusJ;
import x3.d4;
import x3.r2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class r extends q {
    @Override // f.p, f.t, f.u
    public void setUp(k0 statusBarStyle, k0 navigationBarStyle, Window window, View view, boolean z10, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(window, RnJusJ.pRjqaWOTx);
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        r2.setDecorFitsSystemWindows(window, false);
        window.setStatusBarColor(statusBarStyle.getScrimWithEnforcedContrast$activity_release(z10));
        window.setNavigationBarColor(navigationBarStyle.getScrimWithEnforcedContrast$activity_release(z11));
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(navigationBarStyle.getNightMode$activity_release() == 0);
        d4 d4Var = new d4(window, view);
        d4Var.setAppearanceLightStatusBars(!z10);
        d4Var.setAppearanceLightNavigationBars(true ^ z11);
    }
}
