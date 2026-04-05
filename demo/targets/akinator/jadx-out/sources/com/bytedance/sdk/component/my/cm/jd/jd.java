package com.bytedance.sdk.component.my.cm.jd;

import android.text.TextUtils;
import com.bytedance.sdk.component.my.jr;
import com.bytedance.sdk.component.utils.hna;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements jj {
    @Override // com.bytedance.sdk.component.my.cm.jd.jj
    public boolean jpo(com.bytedance.sdk.component.my.cm.wqx.wqx wqxVar, jr jrVar, com.bytedance.sdk.component.my.cm.wqx.jpo jpoVar) {
        if (TextUtils.isEmpty(wqxVar.yd())) {
            String strJpo = jpo(wqxVar);
            wqxVar.jd(strJpo);
            wqxVar.jpo(strJpo);
        }
        wqxVar.jpo();
        return true;
    }

    @Override // com.bytedance.sdk.component.my.cm.jd.jj
    public String jpo() {
        return "generate_key";
    }

    private String jpo(com.bytedance.sdk.component.my.cm.wqx.wqx wqxVar) {
        return hna.jpo(wqxVar.jpo());
    }
}
