package com.bytedance.sdk.component.adexpress.dynamic.wqx;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.wqx.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif implements qk {
    private com.bytedance.sdk.component.adexpress.jj.oya jpo;

    public Cif(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my myVar, com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar) {
        this.jpo = new com.bytedance.sdk.component.adexpress.jj.oya(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(context, 180.0f));
        layoutParams.gravity = 17;
        this.jpo.setLayoutParams(layoutParams);
        this.jpo.setGuideText(qkVar.dn());
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
