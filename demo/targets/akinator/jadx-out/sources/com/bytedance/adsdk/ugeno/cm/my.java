package com.bytedance.adsdk.ugeno.cm;

import com.bytedance.adsdk.ugeno.cm.jj;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my implements wqx {
    @Override // com.bytedance.adsdk.ugeno.cm.wqx
    public List<jd> jpo() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new jd("update") { // from class: com.bytedance.adsdk.ugeno.cm.my.1
            @Override // com.bytedance.adsdk.ugeno.cm.jd
            public com.bytedance.adsdk.ugeno.cm.jd.jpo jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, String str, jj.jpo jpoVar) {
                return new com.bytedance.adsdk.ugeno.cm.jd.my(wqxVar, str, jpoVar);
            }
        });
        arrayList.add(new jd("emit") { // from class: com.bytedance.adsdk.ugeno.cm.my.2
            @Override // com.bytedance.adsdk.ugeno.cm.jd
            public com.bytedance.adsdk.ugeno.cm.jd.jpo jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, String str, jj.jpo jpoVar) {
                return new com.bytedance.adsdk.ugeno.cm.jd.jd(wqxVar, str, jpoVar);
            }
        });
        arrayList.add(new jd("startAnimate") { // from class: com.bytedance.adsdk.ugeno.cm.my.3
            @Override // com.bytedance.adsdk.ugeno.cm.jd
            public com.bytedance.adsdk.ugeno.cm.jd.jpo jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, String str, jj.jpo jpoVar) {
                return new com.bytedance.adsdk.ugeno.cm.jd.cm(wqxVar, str, jpoVar);
            }
        });
        return arrayList;
    }
}
