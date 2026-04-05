package com.bytedance.sdk.component.adexpress.dynamic.my;

import com.amazon.device.ads.DTBMetricsConfiguration;
import com.bytedance.sdk.component.adexpress.jd.au;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk implements xyk {
    private com.bytedance.sdk.component.adexpress.dynamic.jj.jd jpo;

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(au auVar) {
        try {
            JSONObject jSONObjectWqx = auVar.wqx();
            JSONObject jSONObject = new JSONObject(jSONObjectWqx.optString("template_Plugin"));
            JSONObject jSONObjectOptJSONObject = jSONObjectWqx.optJSONObject(DTBMetricsConfiguration.CREATIVE_TEMPLATES_KEY_NAME);
            com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVarJpo = new jj(jSONObject, jSONObjectOptJSONObject, jSONObjectWqx.optJSONObject("AdSize"), new JSONObject(jSONObjectWqx.optString("diff_template_Plugin"))).jpo(auVar.jd(), auVar.yd(), jSONObjectOptJSONObject.optDouble("score_exact_i18n"), jSONObjectOptJSONObject.optString("comment_num_i18n"), auVar);
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObjectOptJSONObject.optString("dynamic_creative"));
                xykVarJpo.jpo(jSONObject2.optString("color"));
                xykVarJpo.jpo(jSONObject2.optJSONArray("material_center"));
            } catch (Throwable unused) {
            }
            this.jpo.jpo(xykVarJpo);
        } catch (Exception unused2) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.my.xyk
    public void jpo(com.bytedance.sdk.component.adexpress.dynamic.jj.jd jdVar) {
        this.jpo = jdVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.my.xyk
    public void jpo(final au auVar) {
        if (auVar.m408if() == 1) {
            jd(auVar);
        } else {
            com.bytedance.sdk.component.adexpress.cm.cm.jpo(new com.bytedance.sdk.component.xyk.xyk("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.my.qk.1
                @Override // java.lang.Runnable
                public void run() {
                    qk.this.jd(auVar);
                }
            }, 5);
        }
    }
}
