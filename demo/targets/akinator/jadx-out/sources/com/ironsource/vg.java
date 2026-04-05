package com.ironsource;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class vg {
    public static final boolean a(View view, Rect rect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(rect, "rect");
        return view.isShown() && view.hasWindowFocus() && view.getGlobalVisibleRect(rect);
    }
}
