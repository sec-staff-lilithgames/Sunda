package com.mbridge.msdk.out.reveue;

import a.b;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class MBridgeRevenueParamsEntityForIronSource extends MBridgeRevenueParamsEntity {
    public MBridgeRevenueParamsEntityForIronSource(String str, String str2) throws JSONException {
        super(str, str2);
        setMediationName("IronSource");
    }

    @Override // com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity
    public void setDspInfo(String str, String str2) throws JSONException {
        super.setDspInfo(str, str2);
    }

    public void setIronSourceImpressionDataString(String str, String str2) throws JSONException {
        if (!TextUtils.isEmpty(str)) {
            setMediationUnitId(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String strL = b.l("{", str2, "}");
        try {
            setSourceData(strL, strL);
            JSONObject jSONObject = new JSONObject(strL);
            setNetworkName(jSONObject.optString("adNetwork", ""));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceName", jSONObject.optString("instanceName", ""));
            jSONObject2.put("instanceId", jSONObject.optString("instanceId", ""));
            setNetworkInfo(jSONObject2);
            setAdType(jSONObject.optString("adUnit", ""));
            setRevenue(jSONObject.optString("revenue", ""));
            setPrecision(jSONObject.optString("precision", ""));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
