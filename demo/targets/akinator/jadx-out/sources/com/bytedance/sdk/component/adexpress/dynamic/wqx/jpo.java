package com.bytedance.sdk.component.adexpress.dynamic.wqx;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements qk {
    private com.bytedance.sdk.component.adexpress.jj.jd jpo;

    public jpo(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my myVar, com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar) {
        double dCql = qkVar.cql();
        dCql = dCql == 0.0d ? 1.0d : dCql;
        double dOta = qkVar.ota();
        int dynamicWidth = (int) (myVar.getDynamicWidth() * 0.32d * dCql);
        int dynamicWidth2 = (int) (myVar.getDynamicWidth() * 0.32d * (dOta != 0.0d ? dOta : 1.0d));
        this.jpo = new com.bytedance.sdk.component.adexpress.jj.jd(context, dynamicWidth, dynamicWidth2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicWidth, dynamicWidth2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(context, qkVar.et() - 7);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(context, qkVar.ii() - 3);
        this.jpo.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    public void jd() {
        this.jpo.jd();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    public void jpo() {
        this.jpo.jpo();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    public ViewGroup wqx() {
        return this.jpo;
    }
}
