package com.ironsource;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.e5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3192e5 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3192e5 f36568a = new C3192e5();

    private C3192e5() {
    }

    private final int a(Context context, int i10) {
        return mv.d.roundToInt(i10 / context.getResources().getDisplayMetrics().density);
    }

    public final int b(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return a(context, context.getResources().getDisplayMetrics().widthPixels);
    }

    public final int a(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return a(context, context.getResources().getDisplayMetrics().heightPixels);
    }
}
