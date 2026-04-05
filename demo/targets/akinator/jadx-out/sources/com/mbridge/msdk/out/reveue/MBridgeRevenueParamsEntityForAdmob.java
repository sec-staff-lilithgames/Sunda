package com.mbridge.msdk.out.reveue;

import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class MBridgeRevenueParamsEntityForAdmob extends MBridgeRevenueParamsEntity {
    public MBridgeRevenueParamsEntityForAdmob(String str, String str2) throws JSONException {
        super(str, str2);
        setMediationName("Admob");
    }

    @Override // com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity
    public void setAdType(String str) throws JSONException {
        super.setAdType(str);
    }

    public void setAdmobRevenueInfo(int i10, long j10, String str) throws JSONException {
        setRevenue(j10 + "");
        setPrecision(i10 + "");
        setCurrency(str);
    }

    @Override // com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity
    public void setDspInfo(String str, String str2) throws JSONException {
        super.setDspInfo(str, str2);
    }

    public void setAdmobResponseInfo(String str) throws JSONException {
        try {
            if (!TextUtils.isEmpty(str)) {
                setSourceData(str, str);
                JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("Loaded Adapter Response");
                if (jSONObjectOptJSONObject != null) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(QpyI.CMCPovErITXsq);
                    if (jSONObjectOptJSONObject2 != null) {
                        JSONObject jSONObject = new JSONObject();
                        Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            jSONObject.put(next, jSONObjectOptJSONObject2.get(next) + "");
                        }
                        setNetworkInfo(jSONObject);
                    }
                    setNetworkName(jSONObjectOptJSONObject.optString("Ad Source Name"));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
