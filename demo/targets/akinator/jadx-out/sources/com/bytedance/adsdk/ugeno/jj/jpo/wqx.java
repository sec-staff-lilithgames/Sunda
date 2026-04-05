package com.bytedance.adsdk.ugeno.jj.jpo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends jpo {
    public wqx(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.jj.jpo.jpo
    public Drawable jd(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }
}
