package com.bytedance.sdk.component.my.my;

import android.text.TextUtils;
import com.bytedance.sdk.component.my.Cif;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends jpo {
    @Override // com.bytedance.sdk.component.my.my.zz
    public void jpo(com.bytedance.sdk.component.my.wqx.wqx wqxVar) {
        if (TextUtils.isEmpty(wqxVar.yd())) {
            Cif cifJj = wqxVar.opi().jj();
            wqxVar.jd(cifJj.jpo(wqxVar));
            wqxVar.jpo(cifJj.jd(wqxVar));
        }
        wqxVar.jpo(new qk());
    }

    @Override // com.bytedance.sdk.component.my.my.zz
    public String jpo() {
        return "generate_key";
    }
}
