package com.bytedance.sdk.openadsdk.jpo.jd.jpo;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.zz.jr;
import com.bytedance.sdk.openadsdk.core.zz.nmd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends wqx {
    public jd(Context context, dt dtVar, AdSlot adSlot) {
        super(context, dtVar, adSlot);
    }

    public com.bytedance.sdk.openadsdk.multipro.jd.jpo jd() {
        nmd nmdVar = this.f21231yd;
        if (nmdVar != null) {
            return ((jr) nmdVar).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.jpo.jd.jpo.wqx
    public void jpo() {
        jr jrVar = new jr(((wqx) this).xyk, this.f21235jd, ((wqx) this).zz, this.f21230ju, false);
        this.f21231yd = jrVar;
        this.jpo.jpo(jrVar.getVideoController());
        wqx();
    }
}
