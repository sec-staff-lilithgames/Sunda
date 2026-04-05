package com.mbridge.msdk.setting;

import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class g extends b {
    public static g C(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return b.b(new JSONObject(str));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("Setting", "parseSetting", e10);
            }
            return null;
        }
    }

    public String L0() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cc", k());
            jSONObject.put("cfc", m());
            jSONObject.put("cfb", B0());
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, Z());
            jSONObject.put("awct", i());
            jSONObject.put("rurl", I0());
            jSONObject.put("ujds", J0());
            jSONObject.put(CampaignEx.JSON_KEY_PLCTB, a0());
            jSONObject.put("tcto", o0());
            jSONObject.put("mv_wildcard", P());
            jSONObject.put("is_startup_crashsystem", E());
            jSONObject.put("sfct", l0());
            jSONObject.put("pcrn", W());
            jSONObject.put("adct", e());
            jSONObject.put("atrqt", h());
            jSONObject.put("omsdkjs_url", U());
            jSONObject.put("mcs", N());
            jSONObject.put("GDPR_area", E0());
            jSONObject.put("alrbs", f());
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CONNECTIONTYPE, t());
            jSONObject.put("isDefault", D());
            jSONObject.put("st_net", n0());
            jSONObject.put("vtag", v0());
            return jSONObject.toString();
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            p0.b("Setting", "toJSON", th2);
            return null;
        }
    }
}
