package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class w implements v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f50238a;

    public w(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f50238a = context;
    }

    public final DisplayMetrics a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    public final DisplayMetrics b(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Context context = this.f50238a;
        displayMetrics.density = context.getResources().getDisplayMetrics().density;
        displayMetrics.densityDpi = context.getResources().getDisplayMetrics().densityDpi;
        displayMetrics.widthPixels = windowManager.getCurrentWindowMetrics().getBounds().width();
        displayMetrics.heightPixels = windowManager.getCurrentWindowMetrics().getBounds().height();
        return displayMetrics;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v
    public com.moloco.sdk.common_adapter_internal.d invoke() {
        WindowManager windowManager = (WindowManager) m3.a.getSystemService(this.f50238a, WindowManager.class);
        if (windowManager == null) {
            return new com.moloco.sdk.common_adapter_internal.d(0, 0, 0.0f, 0.0f, 0, 0.0f);
        }
        DisplayMetrics displayMetricsB = Build.VERSION.SDK_INT >= 30 ? b(windowManager) : a(windowManager);
        int i10 = displayMetricsB.widthPixels;
        return new com.moloco.sdk.common_adapter_internal.d(i10, displayMetricsB.heightPixels, o0.b(i10, displayMetricsB.density), o0.b(displayMetricsB.heightPixels, displayMetricsB.density), displayMetricsB.densityDpi, displayMetricsB.density);
    }
}
