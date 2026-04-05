package com.bytedance.sdk.openadsdk.core.zz;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.dt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju {
    public static void jpo(String str, int i10, String str2, String str3, String str4, com.bytedance.sdk.openadsdk.core.model.dt dtVar) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.openadsdk.core.xyk.jpo(i10);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_source", str);
            dt.jpo jpoVarVzb = dtVar.vzb();
            if (jpoVarVzb != null) {
                jSONObject.put("tpl_id", jpoVarVzb.cm());
                if ("Web".equals(str)) {
                    if (jpoVarVzb.m469if()) {
                        jSONObject.put("engine_version", "v3");
                    } else {
                        jSONObject.put("engine_version", "v1");
                    }
                }
            } else if (dtVar.jrx() != null) {
                jSONObject.put("tpl_id", dtVar.jrx().jpo());
                if ("Web".equals(str)) {
                    jSONObject.put("engine_version", "v3");
                }
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.prr.wqx.jpo().jpo(com.bytedance.sdk.openadsdk.prr.jpo.cm.jd().jpo(jpo(str3)).wqx(str4).my(dtVar != null ? dtVar.hbg() : "").jd(i10).jd(jSONObject.toString()).jj(str2));
    }

    private static int jpo(String str) {
        str.getClass();
        switch (str) {
            case "banner_ad":
                return 1;
            case "rewarded_video":
                return 7;
            case "open_ad":
                return 3;
            case "fullscreen_interstitial_ad":
                return 8;
            case "interaction":
                return 2;
            default:
                return 5;
        }
    }
}
