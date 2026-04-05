package com.bytedance.adsdk.ugeno.cm.cm;

import android.content.Context;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk extends wqx {
    public qk(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.cm.cm.wqx
    public boolean jpo(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int iJpo = com.bytedance.adsdk.ugeno.qk.wqx.jpo(String.valueOf(objArr[0]), 0);
            Map<String, String> map = this.my;
            if (map == null || map.isEmpty() || iJpo == com.bytedance.adsdk.ugeno.qk.wqx.jpo(this.my.get("type"), 0)) {
                this.jpo.jpo(this.f17681jd, this.f17682jj, this.wqx.jd());
            }
        }
        return false;
    }
}
