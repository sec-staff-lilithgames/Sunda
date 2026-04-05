package com.mbridge.msdk.out.reveue;

import android.text.TextUtils;
import com.ironsource.Ac;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class MBridgeRevenueParamsEntityForTradPlus extends MBridgeRevenueParamsEntity {
    public MBridgeRevenueParamsEntityForTradPlus(String str, String str2) throws JSONException {
        super(str, str2);
        setMediationName("TradPlus");
    }

    @Override // com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity
    public void setDspInfo(String str, String str2) throws JSONException {
        super.setDspInfo(str, str2);
    }

    public void setTradPlusAdInfo(String str) throws JSONException {
        if (!TextUtils.isEmpty(str)) {
            try {
                String strReplace = str.replace("\"", "\\\"").replace("----------------------\n", "{\"").replaceAll("(?<!\"):(?!\")", "\":\"").replace("\n", "\",\"");
                JSONObject jSONObject = new JSONObject(strReplace.endsWith("\"") ? strReplace.concat("}").replace(",\"}", "}") : strReplace.concat("\"}"));
                setAdType(jSONObject.optInt("placementAdType") + "");
                setMediationUnitId(jSONObject.optString("tpAdUnitId"));
                setNetworkName(jSONObject.optString(Ac.f33837a));
                setBidType(Boolean.valueOf(jSONObject.optBoolean("isBiddingNetwork", false)));
                setRevenue(jSONObject.optString("ecpm", ""));
                setPrecision(jSONObject.optString("ecpmPrecision", ""));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("instanceName", jSONObject.optString(Ac.f33837a, ""));
                jSONObject2.put("instanceId", jSONObject.optString("adSourceId", ""));
                setNetworkInfo(jSONObject2);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        setSourceData(str, str);
    }
}
