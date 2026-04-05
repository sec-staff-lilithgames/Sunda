package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class h {
    public static final int a(int i10, Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return (int) (i10 * context.getResources().getDisplayMetrics().density);
    }
}
