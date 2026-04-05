package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import x3.d4;
import x3.r2;
import x3.t3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class o {
    public static final void a(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "<this>");
        View decorView = activity.getWindow().getDecorView();
        if (Build.VERSION.SDK_INT >= 30) {
            b(activity);
        } else {
            kotlin.jvm.internal.e0.checkNotNull(decorView);
            a(decorView);
        }
    }

    public static final void b(Activity activity) {
        r2.setDecorFitsSystemWindows(activity.getWindow(), false);
        d4 d4Var = new d4(activity.getWindow(), activity.getWindow().getDecorView());
        d4Var.hide(t3.systemBars());
        d4Var.setSystemBarsBehavior(2);
    }

    public static final void a(View view) {
        view.setSystemUiVisibility(4102);
    }
}
