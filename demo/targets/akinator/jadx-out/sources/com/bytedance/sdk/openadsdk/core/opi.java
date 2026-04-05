package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.cm.jd;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class opi {
    public static void jpo(Context context, boolean z10, JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.dt dtVar, String str, int i10, WebView webView, com.bytedance.sdk.openadsdk.core.widget.my myVar) {
        int iOptInt = jSONObject.optInt("landingStyle");
        String strOptString = jSONObject.optString("url");
        String strOptString2 = jSONObject.optString("fallback_url");
        String strOptString3 = jSONObject.optString("title", "");
        boolean z11 = false;
        boolean z12 = jSONObject.optInt("only_loading", 0) == 1;
        try {
            jSONObject.put("is_activity", z10);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, str, 1, jSONObject);
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        if (iOptInt == 0) {
            if (webView != null) {
                webView.loadUrl(strOptString);
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, str, 2, (JSONObject) null);
            } else {
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, str, -1, (JSONObject) null);
            }
        } else if (iOptInt == 1 || iOptInt == 8) {
            com.bytedance.sdk.openadsdk.prr.jpo.jd jdVar = new com.bytedance.sdk.openadsdk.prr.jpo.jd();
            jdVar.jpo(jd.jpo.f19527jd);
            jdVar.jpo(dtVar);
            jdVar.jd(str);
            jdVar.jpo(-1);
            jdVar.jpo(false);
            jdVar.jd(dtVar.pzk());
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(jdVar);
            com.bytedance.sdk.openadsdk.utils.tu.jpo(context, strOptString, dtVar, jd.jpo.f19527jd);
        } else {
            if (iOptInt != 2) {
                if (iOptInt == 3) {
                    jr jrVar = new jr(dtVar);
                    jrVar.jpo(strOptString3);
                    jrVar.jpo(z12);
                    duq.jpo(context, strOptString, dtVar, i10, str, false, jrVar);
                }
                if (myVar == null && z11) {
                    myVar.jpo();
                    return;
                }
            }
            if (!com.bytedance.sdk.openadsdk.utils.tu.jd(context, strOptString, dtVar, str)) {
                com.bytedance.sdk.openadsdk.prr.jpo.jd jdVar2 = new com.bytedance.sdk.openadsdk.prr.jpo.jd();
                jdVar2.jpo(jd.jpo.f19527jd);
                jdVar2.jpo(dtVar);
                jdVar2.jd(str);
                jdVar2.jpo(-1);
                jdVar2.jpo(false);
                jdVar2.jd(dtVar.pzk());
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(jdVar2);
                HashMap map = new HashMap();
                map.put("deeplink_url", strOptString);
                map.put("fallback_url", strOptString2);
                map.put("jsb_deeplink", 1);
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, str, "open_fallback_url", map);
                com.bytedance.sdk.openadsdk.utils.tu.jpo(context, strOptString2, dtVar, jd.jpo.f19527jd);
            }
        }
        z11 = true;
        if (myVar == null) {
        }
    }
}
