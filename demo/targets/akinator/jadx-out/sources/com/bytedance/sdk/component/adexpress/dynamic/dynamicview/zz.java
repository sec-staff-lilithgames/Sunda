package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz extends jj {
    public zz(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        super(context, dynamicRootView, xykVar);
        if (com.bytedance.sdk.component.adexpress.cm.jd()) {
            this.prr = new ImageView(context);
        } else {
            this.prr = new com.bytedance.sdk.component.adexpress.jj.zz(context);
        }
        this.prr.setTag(3);
        addView(this.prr, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ef
    public boolean zz() {
        super.zz();
        if (com.bytedance.sdk.component.adexpress.cm.jd()) {
            Drawable drawableJpo = com.bytedance.sdk.component.adexpress.cm.wqx.jpo(getContext(), this.f51if);
            if (drawableJpo != null) {
                this.prr.setBackground(drawableJpo);
            }
            int iCm = com.bytedance.sdk.component.utils.dt.cm(getContext(), "tt_close_btn");
            if (iCm > 0) {
                ((ImageView) this.prr).setImageResource(iCm);
            }
            ((ImageView) this.prr).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        int iJpo = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.f51if.sq());
        View view = this.prr;
        if (view instanceof com.bytedance.sdk.component.adexpress.jj.zz) {
            ((com.bytedance.sdk.component.adexpress.jj.zz) view).setRadius((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.f51if.prr()));
            ((com.bytedance.sdk.component.adexpress.jj.zz) this.prr).setStrokeWidth(iJpo);
            ((com.bytedance.sdk.component.adexpress.jj.zz) this.prr).setStrokeColor(this.f51if.hna());
            ((com.bytedance.sdk.component.adexpress.jj.zz) this.prr).setBgColor(this.f51if.pdm());
            ((com.bytedance.sdk.component.adexpress.jj.zz) this.prr).setDislikeColor(this.f51if.qk());
            ((com.bytedance.sdk.component.adexpress.jj.zz) this.prr).setDislikeWidth((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, 1.0f));
        }
        return true;
    }
}
