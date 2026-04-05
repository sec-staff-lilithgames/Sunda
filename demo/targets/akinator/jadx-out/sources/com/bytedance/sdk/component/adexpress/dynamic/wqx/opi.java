package com.bytedance.sdk.component.adexpress.dynamic.wqx;

import android.content.Context;
import android.widget.FrameLayout;
import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class opi implements qk<com.bytedance.sdk.component.adexpress.jj.ju> {
    private final com.bytedance.sdk.component.adexpress.jj.ju jpo;

    public opi(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my myVar, com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar) {
        com.bytedance.sdk.component.adexpress.jj.ju juVar = new com.bytedance.sdk.component.adexpress.jj.ju(context);
        this.jpo = juVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(context, qkVar.fy() > 0 ? qkVar.fy() : com.bytedance.sdk.component.adexpress.cm.jd() ? 0 : AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL);
        juVar.setLayoutParams(layoutParams);
        juVar.setClipChildren(false);
        juVar.setText(qkVar.dn());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    /* renamed from: cm, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.jj.ju wqx() {
        return this.jpo;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    public void jd() {
        com.bytedance.sdk.component.adexpress.jj.ju juVar = this.jpo;
        if (juVar != null) {
            juVar.jd();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    public void jpo() {
        com.bytedance.sdk.component.adexpress.jj.ju juVar = this.jpo;
        if (juVar != null) {
            juVar.jpo();
        }
    }
}
