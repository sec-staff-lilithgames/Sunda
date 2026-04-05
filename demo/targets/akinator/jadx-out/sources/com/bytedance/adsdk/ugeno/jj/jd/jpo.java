package com.bytedance.adsdk.ugeno.jj.jd;

import android.view.View;
import com.bytedance.adsdk.ugeno.xyk.wqx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements wqx.my {
    @Override // com.bytedance.adsdk.ugeno.xyk.wqx.my
    public void jpo(View view, float f10) {
        view.setPivotX(f10 < 0.0f ? view.getWidth() : 0.0f);
        view.setPivotY(view.getHeight() * 0.5f);
        view.setRotationY(f10 * 90.0f);
    }
}
