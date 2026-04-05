package com.bytedance.adsdk.ugeno.cm.wqx;

import android.content.res.Resources;
import com.bytedance.adsdk.ugeno.cm.jj;
import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends com.bytedance.adsdk.ugeno.cm.jd.jpo {
    public jd(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, String str, jj.jpo jpoVar) {
        super(wqxVar, str, jpoVar);
    }

    @Override // com.bytedance.adsdk.ugeno.cm.jd.jpo
    public void jpo() throws Resources.NotFoundException {
        if (this.wqx == null) {
            return;
        }
        int iJpo = com.bytedance.adsdk.ugeno.qk.wqx.jpo(this.f17693jj.get(C3191e4.h.L), 0);
        com.bytedance.adsdk.ugeno.jd.wqx wqxVar = this.wqx;
        com.bytedance.adsdk.ugeno.jd.wqx wqxVarJd = wqxVar.jd(wqxVar);
        if (wqxVarJd == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.jd.wqx wqxVarMy = wqxVarJd.my("SwiperView");
        if (wqxVarMy instanceof com.bytedance.adsdk.ugeno.jd) {
            ((com.bytedance.adsdk.ugeno.jd) wqxVarMy).jpo(iJpo);
        }
    }
}
