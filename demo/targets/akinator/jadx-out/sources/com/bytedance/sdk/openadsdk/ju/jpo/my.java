package com.bytedance.sdk.openadsdk.ju.jpo;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends com.bytedance.sdk.component.jpo.cm<JSONObject, JSONObject> {
    private JSONObject jpo;

    public my(JSONObject jSONObject) {
        this.jpo = jSONObject;
    }

    public static void jpo(com.bytedance.sdk.component.jpo.prr prrVar, JSONObject jSONObject) {
        prrVar.jpo("getData", new my(jSONObject));
    }

    @Override // com.bytedance.sdk.component.jpo.cm
    public JSONObject jpo(String str, JSONObject jSONObject, com.bytedance.sdk.component.jpo.my myVar) throws Exception {
        return com.bytedance.sdk.openadsdk.core.zz.jpo.jd.jpo(this.jpo, jSONObject);
    }
}
