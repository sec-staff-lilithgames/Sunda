package com.bytedance.sdk.openadsdk.cm.jd;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx implements jd {
    jd jpo;

    @Override // com.bytedance.sdk.openadsdk.cm.jd.jd
    public void jpo(JSONObject jSONObject, long j10) throws JSONException {
        jd jdVar = this.jpo;
        if (jdVar != null) {
            jdVar.jpo(jSONObject, j10);
        }
        if (j10 <= 0) {
            j10 = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j10);
    }
}
