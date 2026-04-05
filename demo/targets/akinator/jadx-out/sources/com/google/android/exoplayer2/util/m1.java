package com.google.android.exoplayer2.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class m1 {
    public static Drawable getDrawable(Context context, Resources resources, int i10) {
        return resources.getDrawable(i10, context.getTheme());
    }
}
