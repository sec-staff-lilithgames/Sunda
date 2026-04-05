package com.bytedance.adsdk.ugeno.jj.jd;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.xyk.wqx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm implements wqx.my {
    private String jpo;

    public void jpo(String str) {
        this.jpo = str;
    }

    @Override // com.bytedance.adsdk.ugeno.xyk.wqx.my
    public void jpo(View view, float f10) {
        if (f10 < -1.0f || f10 > 1.0f) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(1.0f);
            view.setTranslationX(view.getWidth() * (-f10));
            view.setTranslationY(view.getHeight() * f10);
        }
        if (TextUtils.equals(this.jpo, "cube")) {
            float height = f10 < 0.0f ? view.getHeight() : 0.0f;
            view.setPivotX(view.getWidth() * 0.5f);
            view.setPivotY(height);
            view.setRotationX(f10 * (-90.0f));
        }
    }
}
