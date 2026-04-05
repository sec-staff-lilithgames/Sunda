package com.bytedance.adsdk.ugeno.jj.jd;

import android.view.View;
import com.bytedance.adsdk.ugeno.xyk.wqx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx implements wqx.my {
    final float jpo = 0.8f;

    /* renamed from: jd, reason: collision with root package name */
    final float f17847jd = 0.5f;

    @Override // com.bytedance.adsdk.ugeno.xyk.wqx.my
    public void jpo(View view, float f10) {
        float f11 = ((f10 < 0.0f ? 0.19999999f : -0.19999999f) * f10) + 1.0f;
        float f12 = (f10 * (f10 < 0.0f ? 0.5f : -0.5f)) + 1.0f;
        if (f10 < 0.0f) {
            view.setPivotX(view.getWidth());
            view.setPivotY(view.getHeight() / 2);
        } else {
            view.setPivotX(0.0f);
            view.setPivotY(view.getHeight() / 2);
        }
        view.setScaleX(f11);
        view.setScaleY(f11);
        view.setAlpha(Math.abs(f12));
    }
}
