package com.bytedance.sdk.openadsdk.core.ju.jj;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.nmd;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk {
    public void jpo(String str, dt dtVar, String str2, Map<String, String> map) {
        if (map != null) {
            try {
                if (map.isEmpty()) {
                    return;
                }
                String str3 = map.get("label");
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                String strFxd = dtVar.fxd();
                if (!"sendLogExtra".equals(str) || TextUtils.isEmpty(strFxd)) {
                    jSONObject.put("log_extra", strFxd);
                } else {
                    JSONObject jSONObject2 = new JSONObject(strFxd);
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (!"label".equals(entry.getKey())) {
                            jSONObject2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject.put("log_extra", jSONObject2.toString());
                }
                JSONObject jSONObject3 = new JSONObject();
                if ("sendAdExtra".equals(str)) {
                    for (Map.Entry<String, String> entry2 : map.entrySet()) {
                        if (!"label".equals(entry2.getKey())) {
                            jSONObject3.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                }
                jSONObject.put("ad_extra_data", jSONObject3.toString());
                jSONObject.putOpt("ua_policy", Integer.valueOf(dtVar.np()));
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, "app_union", str2, str3, Long.parseLong(dtVar.fc()), 0L, jSONObject, nmd.qk(dtVar));
            } catch (Throwable unused) {
            }
        }
    }
}
