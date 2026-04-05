package com.bytedance.sdk.component.my.my;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends jpo {
    @Override // com.bytedance.sdk.component.my.my.zz
    public void jpo(com.bytedance.sdk.component.my.wqx.wqx wqxVar) {
        com.bytedance.sdk.component.my.jd jdVarJr = wqxVar.jr();
        if (jdVarJr != null) {
            if (jdVarJr.my()) {
                wqxVar.jpo(new yd());
                return;
            } else if (jdVarJr.qk()) {
                wqxVar.jpo(new jj());
                return;
            }
        }
        wqxVar.jpo(new ju());
    }

    @Override // com.bytedance.sdk.component.my.my.zz
    public String jpo() {
        return "cache_policy";
    }
}
