package com.bytedance.adsdk.ugeno.jj.jd;

import android.view.View;
import com.bytedance.adsdk.ugeno.xyk.wqx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements wqx.my {
    @Override // com.bytedance.adsdk.ugeno.xyk.wqx.my
    public void jpo(View view, float f10) {
        int width = view.getWidth();
        if (f10 < -1.0f || f10 > 1.0f) {
            view.setAlpha(0.0f);
            return;
        }
        if (f10 < 0.0f) {
            view.setTranslationX((-width) * f10);
        } else {
            view.setTranslationX(width);
            view.setTranslationX((-width) * f10);
        }
        view.setAlpha(Math.max(0.0f, 1.0f - Math.abs(f10)));
    }
}
