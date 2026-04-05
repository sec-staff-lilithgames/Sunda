package com.bytedance.sdk.component.adexpress.dynamic.wqx;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.jj.jr;
import com.bytedance.sdk.component.adexpress.jj.nmd;
import com.bytedance.sdk.component.adexpress.jj.tu;
import com.inmobi.commons.core.configs.AdConfig;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends sq<com.bytedance.sdk.component.adexpress.jj.jj> {
    public jj(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my myVar, com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context, myVar, qkVar);
        this.f18348jd = context;
        this.f18347cm = qkVar;
        this.wqx = myVar;
        jpo(i10, i11, i12, jSONObject, qkVar);
    }

    private void jpo(int i10, int i11, int i12, JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar) {
        this.jpo = new com.bytedance.sdk.component.adexpress.jj.jj(this.f18348jd, i10, i11, i12, jSONObject);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18348jd, 300.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18348jd, qkVar.fy() > 0 ? qkVar.fy() : com.bytedance.sdk.component.adexpress.cm.jd() ? 0 : AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL);
        this.jpo.setLayoutParams(layoutParams);
        this.jpo.setClipChildren(false);
        this.jpo.setSlideText(this.f18347cm.dn());
        tu tuVar = this.jpo;
        if (tuVar instanceof com.bytedance.sdk.component.adexpress.jj.jj) {
            ((com.bytedance.sdk.component.adexpress.jj.jj) tuVar).setShakeText(this.f18347cm.jkt());
            final nmd shakeView = ((com.bytedance.sdk.component.adexpress.jj.jj) this.jpo).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new jr.jpo() { // from class: com.bytedance.sdk.component.adexpress.dynamic.wqx.jj.1
                });
                shakeView.setOnClickListener((View.OnClickListener) this.wqx.getDynamicClickListener());
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.sq
    public void cm() {
    }
}
