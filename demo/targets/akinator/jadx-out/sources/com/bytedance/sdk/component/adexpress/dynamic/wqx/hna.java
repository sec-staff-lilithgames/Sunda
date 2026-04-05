package com.bytedance.sdk.component.adexpress.dynamic.wqx;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.jj.rq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hna implements qk {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.cm.qk f18301cm;

    /* renamed from: jd, reason: collision with root package name */
    private Context f18302jd;
    private rq jpo;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my wqx;

    public hna(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my myVar, com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar) {
        this.f18302jd = context;
        this.wqx = myVar;
        this.f18301cm = qkVar;
        cm();
    }

    private void cm() {
        this.jpo = new rq(this.f18302jd);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18302jd, 120.0f));
        layoutParams.gravity = 17;
        this.jpo.setLayoutParams(layoutParams);
        this.jpo.setClipChildren(false);
        this.jpo.setGuideText(this.f18301cm.dn());
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my myVar = this.wqx;
        if (myVar != null) {
            this.jpo.setOnClickListener((View.OnClickListener) myVar.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    public void jd() {
        rq rqVar = this.jpo;
        if (rqVar != null) {
            rqVar.jd();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    public void jpo() {
        rq rqVar = this.jpo;
        if (rqVar != null) {
            rqVar.jpo();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    public ViewGroup wqx() {
        return this.jpo;
    }
}
