package com.bytedance.adsdk.ugeno.cm.wqx;

import android.content.res.Resources;
import com.bytedance.adsdk.ugeno.cm.jj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends com.bytedance.adsdk.ugeno.cm.jd.jpo {
    public wqx(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, String str, jj.jpo jpoVar) {
        super(wqxVar, str, jpoVar);
    }

    @Override // com.bytedance.adsdk.ugeno.cm.jd.jpo
    public void jpo() throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.jd.wqx wqxVarJd;
        com.bytedance.adsdk.ugeno.jd.wqx wqxVar = this.wqx;
        if (wqxVar == null || (wqxVarJd = wqxVar.jd(wqxVar)) == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.jd.wqx wqxVarMy = wqxVarJd.my("SwiperView");
        if (wqxVarMy instanceof com.bytedance.adsdk.ugeno.jd) {
            ((com.bytedance.adsdk.ugeno.jd) wqxVarMy).cm();
        }
    }
}
