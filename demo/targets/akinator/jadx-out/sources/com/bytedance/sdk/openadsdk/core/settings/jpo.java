package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.openadsdk.core.settings.Cif;
import com.bytedance.sdk.openadsdk.core.settings.my;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends Cif {
    public jpo() {
        super("tt_set_apm.prop", new Cif.jpo() { // from class: com.bytedance.sdk.openadsdk.core.settings.jpo.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.Cif.jpo
            public void jd() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.Cif.jpo
            public void jpo() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.my
    public void jpo(JSONObject jSONObject) {
        my.jpo jpoVarJpo = jpo();
        if (jSONObject.has("apm_url")) {
            jpoVarJpo.jpo("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("perf_con_apm")) {
                    jpoVarJpo.jpo("perf_con_apm", jSONObjectOptJSONObject.optInt("perf_con_apm"));
                }
            } catch (Exception unused) {
            }
        }
        jpoVarJpo.jpo();
        cm();
    }
}
