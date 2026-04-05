package f;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import f.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final int f55240a = Color.argb(230, 255, 255, 255);

    /* renamed from: b, reason: collision with root package name */
    public static final int f55241b = Color.argb(128, 27, 27, 27);

    public static final void enable(ComponentActivity componentActivity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(componentActivity, KGUkpTlXZlJLy.xjRC);
        enable$default(componentActivity, null, null, 3, null);
    }

    public static /* synthetic */ void enable$default(ComponentActivity componentActivity, k0 k0Var, k0 k0Var2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            k0Var = k0.a.auto$default(k0.f55231e, 0, 0, null, 4, null);
        }
        if ((i10 & 2) != 0) {
            k0Var2 = k0.a.auto$default(k0.f55231e, f55240a, f55241b, null, 4, null);
        }
        enable(componentActivity, k0Var, k0Var2);
    }

    public static final int getDefaultDarkScrim() {
        return f55241b;
    }

    public static /* synthetic */ void getDefaultDarkScrim$annotations() {
    }

    public static final int getDefaultLightScrim() {
        return f55240a;
    }

    public static /* synthetic */ void getDefaultLightScrim$annotations() {
    }

    public static final void enable(ComponentActivity componentActivity, k0 statusBarStyle) {
        kotlin.jvm.internal.e0.checkNotNullParameter(componentActivity, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        enable$default(componentActivity, statusBarStyle, null, 2, null);
    }

    public static final void enable(ComponentActivity componentActivity, k0 statusBarStyle, k0 navigationBarStyle) {
        u oVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(componentActivity, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        kv.l detectDarkMode$activity_release = statusBarStyle.getDetectDarkMode$activity_release();
        Resources resources = decorView.getResources();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(resources, "getResources(...)");
        boolean zBooleanValue = ((Boolean) detectDarkMode$activity_release.invoke(resources)).booleanValue();
        kv.l detectDarkMode$activity_release2 = navigationBarStyle.getDetectDarkMode$activity_release();
        Resources resources2 = decorView.getResources();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(resources2, "getResources(...)");
        boolean zBooleanValue2 = ((Boolean) detectDarkMode$activity_release2.invoke(resources2)).booleanValue();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            oVar = new s();
        } else if (i10 >= 29) {
            oVar = new r();
        } else if (i10 >= 28) {
            oVar = new q();
        } else if (i10 >= 26) {
            oVar = new p();
        } else {
            oVar = new o();
        }
        u uVar = oVar;
        Window window = componentActivity.getWindow();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(window, "getWindow(...)");
        uVar.setUp(statusBarStyle, navigationBarStyle, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = componentActivity.getWindow();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(window2, "getWindow(...)");
        uVar.adjustLayoutInDisplayCutoutMode(window2);
    }
}
