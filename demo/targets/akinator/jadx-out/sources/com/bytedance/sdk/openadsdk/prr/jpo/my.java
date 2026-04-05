package com.bytedance.sdk.openadsdk.prr.jpo;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my {
    public static void jpo(final String str, final String str2, final int i10, final String str3) {
        com.bytedance.sdk.openadsdk.prr.wqx.jpo(str, false, 10, new com.bytedance.sdk.openadsdk.prr.jd() { // from class: com.bytedance.sdk.openadsdk.prr.jpo.my.1
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public wqx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str2);
                jSONObject.put("error_code", i10);
                jSONObject.put("error_msg", str3);
                return cm.jd().jpo(str).jd(jSONObject.toString());
            }
        });
    }
}
