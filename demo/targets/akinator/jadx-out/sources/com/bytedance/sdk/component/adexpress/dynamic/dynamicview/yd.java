package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd extends jj {
    public yd(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        super(context, dynamicRootView, xykVar);
        if (com.bytedance.sdk.component.adexpress.cm.jd()) {
            ImageView imageView = new ImageView(context);
            this.prr = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.f18242qk = this.xyk;
        } else {
            this.prr = new TextView(context);
        }
        this.prr.setTag(3);
        addView(this.prr, getWidgetLayoutParams());
        if (dynamicRootView.getRenderRequest() != null) {
            if (dynamicRootView.getRenderRequest().xyk() && dynamicRootView.getRenderRequest().se()) {
                return;
            }
            this.prr.setVisibility(8);
            setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ef
    public boolean zz() {
        super.zz();
        if (com.bytedance.sdk.component.adexpress.cm.jd()) {
            Drawable drawableJpo = com.bytedance.sdk.component.adexpress.cm.wqx.jpo(getContext(), this.f51if);
            if (drawableJpo != null) {
                ((ImageView) this.prr).setBackground(drawableJpo);
            }
            ((ImageView) this.prr).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int iCm = com.bytedance.sdk.component.utils.dt.cm(getContext(), "tt_reward_full_feedback");
            if (iCm > 0) {
                ((ImageView) this.prr).setImageResource(iCm);
            }
        }
        return true;
    }
}
