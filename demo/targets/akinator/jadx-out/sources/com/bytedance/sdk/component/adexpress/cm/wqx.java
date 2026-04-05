package com.bytedance.sdk.component.adexpress.cm;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {
    public static Drawable jpo(Context context, com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar) {
        if (context == null || qkVar == null) {
            return null;
        }
        return jpo(context, (int) qk.jpo(context, qkVar.sq()), qkVar.hna(), qkVar.pdm());
    }

    public static Drawable jpo(Context context, int i10, int i11, int i12) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        if (context != null) {
            gradientDrawable.setStroke(i10, i11);
        }
        gradientDrawable.setColor(i12);
        return gradientDrawable;
    }
}
