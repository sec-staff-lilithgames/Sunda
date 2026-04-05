package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.util.TypedValue;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f48022a = new b();

    public final float a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public final int b(float f10, Context context) {
        e0.checkNotNullParameter(context, "context");
        return (int) (a(f10, context) + 0.5f);
    }

    public final float c(float f10, Context context) {
        e0.checkNotNullParameter(context, "context");
        return a(context) * f10;
    }

    public final int d(float f10, Context context) {
        e0.checkNotNullParameter(context, "context");
        return (int) (c(f10, context) + 0.5f);
    }

    public final float e(float f10, Context context) {
        e0.checkNotNullParameter(context, "context");
        return f10 / a(context);
    }

    public final int f(float f10, Context context) {
        e0.checkNotNullParameter(context, "context");
        return (int) (e(f10, context) + 0.5f);
    }

    public final float a(float f10, Context context) {
        e0.checkNotNullParameter(context, "context");
        return TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
    }

    public final int b(Context context) {
        e0.checkNotNullParameter(context, "context");
        return f(context.getResources().getDisplayMetrics().heightPixels, context);
    }

    public final int c(Context context) {
        e0.checkNotNullParameter(context, "context");
        return f(context.getResources().getDisplayMetrics().widthPixels, context);
    }
}
