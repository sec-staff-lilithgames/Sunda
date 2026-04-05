package com.bytedance.sdk.component.adexpress.dynamic.wqx;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.jj.tu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends sq<com.bytedance.sdk.component.adexpress.jj.qk> {
    public my(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my myVar, com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar) {
        super(context, myVar, qkVar);
        jpo(qkVar);
    }

    private void jpo(com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar) {
        this.jpo = new com.bytedance.sdk.component.adexpress.jj.xyk(this.f18348jd);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 81;
        this.jpo.setLayoutParams(layoutParams);
        tu tuVar = this.jpo;
        if (tuVar instanceof com.bytedance.sdk.component.adexpress.jj.xyk) {
            ((com.bytedance.sdk.component.adexpress.jj.xyk) tuVar).setButtonText(this.f18347cm.dn());
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
