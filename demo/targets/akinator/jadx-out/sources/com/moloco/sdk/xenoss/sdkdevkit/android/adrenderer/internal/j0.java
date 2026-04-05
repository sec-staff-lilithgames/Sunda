package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Intent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class j0 {
    public static final void a(Intent intent, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intent, "<this>");
        intent.putExtra("CLOSE_DELAY_SECONDS", i10);
    }

    public static final void b(Intent intent, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intent, "<this>");
        intent.putExtra("DEC_DELAY_SECONDS", i10);
    }

    public static final void c(Intent intent, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intent, "<this>");
        intent.putExtra("START_MUTED", z10);
    }

    public static final int d(Intent intent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intent, "<this>");
        return intent.getIntExtra("DEC_DELAY_SECONDS", 0);
    }

    public static final Boolean e(Intent intent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intent, "<this>");
        if (intent.hasExtra("SKIP_ENABLED")) {
            return Boolean.valueOf(intent.getBooleanExtra("SKIP_ENABLED", false));
        }
        return null;
    }

    public static final int f(Intent intent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intent, "<this>");
        return intent.getIntExtra("SKIP_DELAY_SECONDS", 0);
    }

    public static final boolean g(Intent intent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra("START_MUTED", true);
    }

    public static final void a(Intent intent, Boolean bool) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intent, "<this>");
        if (bool != null) {
            intent.putExtra("SKIP_ENABLED", bool.booleanValue());
        }
    }

    public static final boolean b(Intent intent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra("AUTO_STORE_ON_SKIP", false);
    }

    public static final int c(Intent intent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intent, "<this>");
        return intent.getIntExtra("CLOSE_DELAY_SECONDS", 0);
    }

    public static final boolean a(Intent intent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra("AUTO_STORE_ON_COMPLETE", false);
    }

    public static final void b(Intent intent, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intent, "<this>");
        intent.putExtra("AUTO_STORE_ON_SKIP", z10);
    }

    public static final void c(Intent intent, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intent, "<this>");
        intent.putExtra("SKIP_DELAY_SECONDS", i10);
    }

    public static final void a(Intent intent, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intent, "<this>");
        intent.putExtra("AUTO_STORE_ON_COMPLETE", z10);
    }
}
