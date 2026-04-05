package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hna extends jj implements com.bytedance.sdk.component.adexpress.dynamic.jd {
    public hna(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        super(context, dynamicRootView, xykVar);
        ImageView imageView = new ImageView(context);
        this.prr = imageView;
        imageView.setTag(5);
        addView(this.prr, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().se()) {
            return;
        }
        this.prr.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my
    public boolean my() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.jd
    public void setSoundMute(boolean z10) {
        ((ImageView) this.prr).setImageResource(z10 ? com.bytedance.sdk.component.utils.dt.cm(getContext(), "tt_reward_full_mute") : com.bytedance.sdk.component.utils.dt.cm(getContext(), "tt_reward_full_unmute"));
        if (((ImageView) this.prr).getDrawable() != null) {
            ((ImageView) this.prr).getDrawable().setAutoMirrored(true);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ef
    public boolean zz() {
        super.zz();
        if (com.bytedance.sdk.component.adexpress.cm.jd()) {
            ((ImageView) this.prr).setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            ((ImageView) this.prr).setScaleType(ImageView.ScaleType.CENTER);
        }
        setSoundMute(this.oya.mIsMute);
        if (!com.bytedance.sdk.component.adexpress.cm.jd()) {
            ((ImageView) this.prr).setBackgroundDrawable(com.bytedance.sdk.component.adexpress.cm.xyk.jpo(0, Integer.valueOf(this.f51if.pdm()), new int[]{this.xyk / 2}, null, null, null));
            return true;
        }
        Drawable drawableJpo = com.bytedance.sdk.component.adexpress.cm.wqx.jpo(getContext(), this.f51if);
        if (drawableJpo == null) {
            return true;
        }
        ((ImageView) this.prr).setBackground(drawableJpo);
        return true;
    }
}
