package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.widget.ImageView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class oya extends jj {
    public oya(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        super(context, dynamicRootView, xykVar);
        ImageView imageView = new ImageView(context);
        this.prr = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        if (com.bytedance.sdk.component.adexpress.cm.jd()) {
            this.xyk = Math.max(dynamicRootView.getLogoUnionHeight(), this.xyk);
        }
        addView(this.prr, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ef
    public boolean zz() {
        super.zz();
        if (com.bytedance.sdk.component.adexpress.cm.jd()) {
            ((ImageView) this.prr).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        DynamicRootView dynamicRootView = this.oya;
        if (dynamicRootView == null || dynamicRootView.getRenderRequest() == null || TextUtils.isEmpty(this.oya.getRenderRequest().hx())) {
            setVisibility(8);
        } else {
            String strHx = this.oya.getRenderRequest().hx();
            if (strHx.equals("logo")) {
                ((ImageView) this.prr).setImageResource(com.bytedance.sdk.component.utils.dt.cm(getContext(), "tt_ad_logo"));
            } else {
                com.bytedance.sdk.component.my.yd ydVarMy = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().my().jpo(strHx).jpo(this.f18242qk).jd(this.xyk).cm(this.f18242qk).my(this.xyk);
                String strOya = this.oya.getRenderRequest().oya();
                if (!TextUtils.isEmpty(strOya)) {
                    ydVarMy.jd(strOya);
                }
                ydVarMy.jpo((ImageView) this.prr);
            }
        }
        ((ImageView) this.prr).setColorFilter(this.f51if.qk(), PorterDuff.Mode.SRC_IN);
        return true;
    }
}
