package com.bytedance.sdk.component.adexpress.dynamic.wqx;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx implements qk {
    com.bytedance.sdk.component.adexpress.jj.my jpo;

    public wqx(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my myVar, com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar) {
        this.jpo = new com.bytedance.sdk.component.adexpress.jj.my(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(myVar.getDynamicHeight(), myVar.getDynamicHeight());
        layoutParams.gravity = 17;
        this.jpo.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    /* renamed from: cm, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.jj.my wqx() {
        return this.jpo;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    public void jd() {
        this.jpo.jd();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    public void jpo() {
        this.jpo.jpo();
    }
}
