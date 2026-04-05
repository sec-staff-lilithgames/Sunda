package com.bytedance.sdk.openadsdk.core.ju.jd;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends com.bytedance.adsdk.ugeno.jd.wqx<FrameLayout> {
    public my(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public void jd() throws JSONException {
        super.jd();
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    /* renamed from: wqx, reason: merged with bridge method [inline-methods] */
    public FrameLayout jpo() {
        FrameLayout frameLayout = new FrameLayout(this.f17811jd);
        com.bytedance.sdk.openadsdk.core.model.jd jdVar = new com.bytedance.sdk.openadsdk.core.model.jd();
        jdVar.jpo(true);
        PAGLogoView pAGLogoView = new PAGLogoView(this.f17811jd);
        pAGLogoView.initData(jdVar);
        frameLayout.addView(pAGLogoView);
        return frameLayout;
    }
}
