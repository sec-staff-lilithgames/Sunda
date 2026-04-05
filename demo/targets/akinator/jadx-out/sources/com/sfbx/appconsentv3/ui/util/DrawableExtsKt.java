package com.sfbx.appconsentv3.ui.util;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DrawableExtsKt {
    public static final Drawable applyTint(Drawable drawable, int i10) {
        e0.checkNotNullParameter(drawable, "<this>");
        Drawable applyTint = drawable.mutate();
        p3.a.setTint(applyTint, i10);
        e0.checkNotNullExpressionValue(applyTint, "applyTint");
        return applyTint;
    }
}
