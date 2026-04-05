package com.bytedance.adsdk.ugeno.cm.jd;

import com.bytedance.adsdk.ugeno.cm.jj;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends jpo {
    private List<com.bytedance.adsdk.ugeno.cm.jpo.cm> zz;

    public jd(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, String str, jj.jpo jpoVar) {
        super(wqxVar, str, jpoVar);
        this.zz = new CopyOnWriteArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.cm.jd.jpo
    public void jpo() {
        com.bytedance.adsdk.ugeno.cm.jpo.wqx wqxVarJpo;
        Map<String, String> map = this.f17693jj;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.f17693jj.get("name");
        com.bytedance.adsdk.ugeno.cm.jpo.jpo jpoVarVrc = this.wqx.vrc();
        if (jpoVarVrc == null || (wqxVarJpo = jpoVarVrc.jpo(str)) == null) {
            return;
        }
        wqxVarJpo.jpo(str);
    }
}
