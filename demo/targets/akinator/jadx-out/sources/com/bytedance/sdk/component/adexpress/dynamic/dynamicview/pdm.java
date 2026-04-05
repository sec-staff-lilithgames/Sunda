package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class pdm extends jj implements com.bytedance.sdk.component.adexpress.dynamic.wqx {
    private boolean jpo;

    public pdm(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        super(context, dynamicRootView, xykVar);
        if (dynamicRootView.getRenderRequest() != null) {
            this.jpo = dynamicRootView.getRenderRequest().au();
        }
        this.f18242qk = this.xyk;
        ImageView imageView = new ImageView(context);
        this.prr = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        addView(this.prr, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().se()) {
            return;
        }
        this.prr.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx
    public void jpo(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        int i11 = 0;
        if (!z10 && !z11) {
            i11 = 8;
        }
        setVisibility(i11);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ef
    public boolean zz() {
        Drawable drawableWqx;
        super.zz();
        ((ImageView) this.prr).setScaleType(ImageView.ScaleType.CENTER_CROP);
        Drawable drawableJpo = com.bytedance.sdk.component.adexpress.cm.wqx.jpo(getContext(), this.f51if);
        if (drawableJpo != null) {
            ((ImageView) this.prr).setBackground(drawableJpo);
        }
        if (this.jpo) {
            drawableWqx = com.bytedance.sdk.component.utils.dt.wqx(getContext(), "tt_close_btn");
        } else {
            drawableWqx = com.bytedance.sdk.component.utils.dt.wqx(getContext(), "tt_skip_btn");
            if (drawableWqx != null) {
                drawableWqx.setAutoMirrored(true);
            }
        }
        if (drawableWqx != null) {
            ((ImageView) this.prr).setImageDrawable(drawableWqx);
        }
        setVisibility(8);
        return true;
    }
}
