package com.bytedance.sdk.openadsdk.core.xyk;

import com.bytedance.sdk.component.qk.jd.cm;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.rq;
import com.bytedance.sdk.openadsdk.utils.tic;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {
    private static JSONObject jd(String str, long j10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "over_freq");
            jSONObject.put("rit", str);
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("timestamp", j10);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static void jpo(String str, long j10) {
        JSONObject jSONObjectJd = jd(str, j10);
        cm cmVarJd = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().jd();
        cmVarJd.jd(tic.cm("/api/ad/union/sdk/stats/"));
        cmVarJd.cm(jSONObjectJd.toString());
        cmVarJd.jpo(6);
        cmVarJd.jpo("uploadFrequentEvent");
        cmVarJd.jpo(new com.bytedance.sdk.component.qk.jpo.jpo() { // from class: com.bytedance.sdk.openadsdk.core.xyk.wqx.1
            @Override // com.bytedance.sdk.component.qk.jpo.jpo
            public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, com.bytedance.sdk.component.qk.jd jdVar) {
            }

            @Override // com.bytedance.sdk.component.qk.jpo.jpo
            public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, IOException iOException) {
                iOException.getMessage();
                if (wqxVar != null) {
                    rq.jpo(wqxVar.cm());
                }
            }
        });
    }
}
