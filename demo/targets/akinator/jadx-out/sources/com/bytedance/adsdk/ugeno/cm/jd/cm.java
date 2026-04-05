package com.bytedance.adsdk.ugeno.cm.jd;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.cm.jj;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends jpo {
    public cm(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, String str, jj.jpo jpoVar) {
        super(wqxVar, str, jpoVar);
    }

    @Override // com.bytedance.adsdk.ugeno.cm.jd.jpo
    public void jpo() {
        com.bytedance.adsdk.ugeno.jd.wqx wqxVar;
        com.bytedance.adsdk.ugeno.jd.wqx wqxVarJd;
        com.bytedance.adsdk.ugeno.jpo.jpo jpoVarYd;
        Map<String, String> map = this.f17693jj;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.f17693jj.get("name");
        if (TextUtils.isEmpty(str) || (wqxVarJd = (wqxVar = this.wqx).jd(wqxVar)) == null || (jpoVarYd = wqxVarJd.jj(str).yd(str)) == null) {
            return;
        }
        jpoVarYd.jd();
        jpoVarYd.jpo(new com.bytedance.adsdk.ugeno.jpo.jd() { // from class: com.bytedance.adsdk.ugeno.cm.jd.cm.1
            @Override // com.bytedance.adsdk.ugeno.jpo.jd
            public void jd() {
                cm.this.wqx();
            }

            @Override // com.bytedance.adsdk.ugeno.jpo.jd
            public void jpo() {
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.cm.jd.jpo
    public void jd() {
    }
}
