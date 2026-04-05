package com.bytedance.sdk.openadsdk.component.xyk;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.cm.my.jd.prr;
import com.bytedance.sdk.openadsdk.cm.qk;
import com.bytedance.sdk.openadsdk.core.model.dt;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends com.bytedance.sdk.openadsdk.core.au.cm.jpo {
    public jd(Context context, ViewGroup viewGroup, dt dtVar) {
        super(context, viewGroup, dtVar, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jpo
    public void hna() throws JSONException {
        prr.jpo jpoVar = new prr.jpo();
        jpoVar.jd(jj());
        jpoVar.cm(zz());
        jpoVar.wqx(qk());
        jpoVar.cm(xyk());
        com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.my(this.f20217qk, jpoVar);
    }

    public void jpo(prr.jpo jpoVar) {
        com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jpo(this.f20217qk, jpoVar, (qk) null);
    }
}
