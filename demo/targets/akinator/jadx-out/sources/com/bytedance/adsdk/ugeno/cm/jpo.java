package com.bytedance.adsdk.ugeno.cm;

import android.content.Context;
import com.bytedance.adsdk.ugeno.cm.cm.Cif;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements xyk {
    @Override // com.bytedance.adsdk.ugeno.cm.xyk
    public List<qk> jpo() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qk("slide") { // from class: com.bytedance.adsdk.ugeno.cm.jpo.1
            @Override // com.bytedance.adsdk.ugeno.cm.qk
            public com.bytedance.adsdk.ugeno.cm.cm.wqx jpo(Context context) {
                return new com.bytedance.adsdk.ugeno.cm.cm.my(context);
            }
        });
        arrayList.add(new qk("tap") { // from class: com.bytedance.adsdk.ugeno.cm.jpo.2
            @Override // com.bytedance.adsdk.ugeno.cm.qk
            public com.bytedance.adsdk.ugeno.cm.cm.wqx jpo(Context context) {
                return new com.bytedance.adsdk.ugeno.cm.cm.zz(context);
            }
        });
        arrayList.add(new qk("timer") { // from class: com.bytedance.adsdk.ugeno.cm.jpo.3
            @Override // com.bytedance.adsdk.ugeno.cm.qk
            public com.bytedance.adsdk.ugeno.cm.cm.wqx jpo(Context context) {
                return new com.bytedance.adsdk.ugeno.cm.cm.yd(context);
            }
        });
        arrayList.add(new qk("touchStart") { // from class: com.bytedance.adsdk.ugeno.cm.jpo.4
            @Override // com.bytedance.adsdk.ugeno.cm.qk
            public com.bytedance.adsdk.ugeno.cm.cm.wqx jpo(Context context) {
                return new Cif(context);
            }
        });
        arrayList.add(new qk("touchEnd") { // from class: com.bytedance.adsdk.ugeno.cm.jpo.5
            @Override // com.bytedance.adsdk.ugeno.cm.qk
            public com.bytedance.adsdk.ugeno.cm.cm.wqx jpo(Context context) {
                return new com.bytedance.adsdk.ugeno.cm.cm.ju(context);
            }
        });
        arrayList.add(new qk("animateState") { // from class: com.bytedance.adsdk.ugeno.cm.jpo.6
            @Override // com.bytedance.adsdk.ugeno.cm.qk
            public com.bytedance.adsdk.ugeno.cm.cm.wqx jpo(Context context) {
                return new com.bytedance.adsdk.ugeno.cm.cm.jd(context);
            }
        });
        return arrayList;
    }
}
