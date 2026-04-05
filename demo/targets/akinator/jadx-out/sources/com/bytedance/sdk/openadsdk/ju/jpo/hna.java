package com.bytedance.sdk.openadsdk.ju.jpo;

import com.bytedance.sdk.openadsdk.core.ef;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hna extends com.bytedance.sdk.component.jpo.cm<JSONObject, JSONObject> {
    private ef jpo;

    public hna(ef efVar) {
        this.jpo = efVar;
    }

    public static void jpo(com.bytedance.sdk.component.jpo.prr prrVar, ef efVar) {
        prrVar.jpo("sendLogV3", new hna(efVar));
    }

    @Override // com.bytedance.sdk.component.jpo.cm
    public JSONObject jpo(String str, JSONObject jSONObject, com.bytedance.sdk.component.jpo.my myVar) throws Exception {
        this.jpo.m458if(jSONObject);
        return null;
    }
}
