package com.bytedance.sdk.openadsdk.component.jpo;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.wqx.wqx;
import com.bytedance.sdk.openadsdk.hmu.jd.my;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends com.bytedance.sdk.openadsdk.core.wqx.jpo {
    private final com.bytedance.sdk.openadsdk.component.xyk.jpo jpo;

    public jpo(Context context, dt dtVar, String str, int i10, com.bytedance.sdk.openadsdk.component.xyk.jpo jpoVar) {
        super(context, dtVar, str, i10);
        this.jpo = jpoVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.wqx.jpo, com.bytedance.sdk.openadsdk.core.wqx.jd, com.bytedance.sdk.openadsdk.core.wqx.wqx
    public void jpo(View view, float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray, boolean z10) {
        if (view.getTag() == "open_ad_click_button_tag") {
            jpo("click_bar");
        } else {
            jpo("click_material");
        }
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.jpo.wqx()));
        jpo(map);
        super.jpo(view, f10, f11, f12, f13, sparseArray, z10);
        my.jpo(((com.bytedance.sdk.openadsdk.core.wqx.jd) this).f20986jj, 9);
    }
}
