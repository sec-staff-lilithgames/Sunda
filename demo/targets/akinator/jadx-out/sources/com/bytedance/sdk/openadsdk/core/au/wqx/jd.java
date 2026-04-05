package com.bytedance.sdk.openadsdk.core.au.wqx;

import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.moloco.sdk.BKC.KerkSviMAy;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jd {
    public static void jpo(dt dtVar) {
        if (rv.jd(dtVar)) {
            com.bytedance.sdk.openadsdk.cm.wqx.jd(dtVar, "playable_preload", KerkSviMAy.xfe, (JSONObject) null);
        }
    }

    public static void jpo(dt dtVar, long j10, long j11) throws JSONException {
        if (dtVar != null) {
            if (rv.wqx(dtVar) || rv.jd(dtVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("loadzip_success_time", j10);
                    jSONObject.put("unzip_success_time", j11);
                } catch (JSONException e10) {
                    nmd.jpo("PlayableEvent", "onSuccess json error", e10);
                }
                com.bytedance.sdk.openadsdk.cm.wqx.jd(dtVar, "playable_preload", "preload_success", jSONObject);
            }
        }
    }

    public static void jpo(dt dtVar, int i10, String str) {
        if (dtVar != null) {
            if (rv.wqx(dtVar) || rv.jd(dtVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("error_reason", str);
                } catch (JSONException e10) {
                    nmd.jpo("PlayableEvent", "onFail json error", e10);
                }
                com.bytedance.sdk.openadsdk.cm.wqx.jd(dtVar, "playable_preload", "preload_fail", jSONObject);
            }
        }
    }
}
