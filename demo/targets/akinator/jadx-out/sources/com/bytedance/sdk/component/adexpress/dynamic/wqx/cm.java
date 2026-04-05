package com.bytedance.sdk.component.adexpress.dynamic.wqx;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.jj.tu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends sq<com.bytedance.sdk.component.adexpress.jj.qk> {
    public cm(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my myVar, com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar) {
        super(context, myVar, qkVar);
        jpo(qkVar);
    }

    private void jpo(com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar) {
        this.jpo = new com.bytedance.sdk.component.adexpress.jj.qk(this.f18348jd);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18348jd, qkVar.fy());
        this.jpo.setLayoutParams(layoutParams);
        this.jpo.setSlideText(this.f18347cm.dn());
        tu tuVar = this.jpo;
        if (tuVar instanceof com.bytedance.sdk.component.adexpress.jj.qk) {
            ((com.bytedance.sdk.component.adexpress.jj.qk) tuVar).setButtonText(this.f18347cm.yd());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.sq, com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    public void jd() {
        this.jpo.jd();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.sq, com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    public void jpo() {
        this.jpo.jpo();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.sq
    public void cm() {
    }
}
