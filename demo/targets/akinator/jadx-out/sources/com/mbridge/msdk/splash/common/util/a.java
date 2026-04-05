package com.mbridge.msdk.splash.common.util;

import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f42794a = "a";

    public static CampaignEx a(String str, CampaignEx campaignEx) throws JSONException, NumberFormatException {
        String strValueOf;
        String strValueOf2;
        if (TextUtils.isEmpty(str)) {
            return campaignEx;
        }
        if (TextUtils.isEmpty(str) && campaignEx == null) {
            return null;
        }
        if (str.contains("notice")) {
            try {
                JSONObject jSONObjectCampaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
                JSONObject jSONObject = new JSONObject(str);
                try {
                    if (!jSONObject.has(CampaignEx.JSON_KEY_DEEP_LINK_URL)) {
                        jSONObjectCampaignToJsonObject.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, "");
                    }
                } catch (Exception e10) {
                    p0.b(f42794a, e10.getMessage());
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectCampaignToJsonObject.put(next, jSONObject.getString(next));
                }
                CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject);
                String strOptString = jSONObjectCampaignToJsonObject.optString("unitId");
                if (!TextUtils.isEmpty(strOptString)) {
                    campaignWithBackData.setCampaignUnitId(strOptString);
                }
                return campaignWithBackData;
            } catch (JSONException e11) {
                p0.b(f42794a, e11.getMessage());
                return campaignEx;
            }
        }
        try {
            JSONObject jSONObjectCampaignToJsonObject2 = CampaignEx.campaignToJsonObject(campaignEx);
            CampaignEx campaignWithBackData2 = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject2);
            if (campaignWithBackData2 == null) {
                campaignWithBackData2 = campaignEx;
            }
            if (!TextUtils.isEmpty(str)) {
                String strOptString2 = jSONObjectCampaignToJsonObject2.optString("unitId");
                if (!TextUtils.isEmpty(strOptString2)) {
                    campaignWithBackData2.setCampaignUnitId(strOptString2);
                }
                JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(com.mbridge.msdk.foundation.same.a.f40713j);
                if (jSONObjectOptJSONObject != null) {
                    String string = jSONObjectOptJSONObject.getString(com.mbridge.msdk.foundation.same.a.f40711h);
                    String string2 = jSONObjectOptJSONObject.getString(com.mbridge.msdk.foundation.same.a.f40712i);
                    if (TextUtils.isEmpty(string)) {
                        string = "-999";
                    }
                    int i10 = Integer.parseInt(string);
                    if (TextUtils.isEmpty(string2)) {
                        string2 = "-999";
                    }
                    int i11 = Integer.parseInt(string2);
                    strValueOf = i10 != -999 ? String.valueOf(u0.a(c.m().d(), i10)) : "-999";
                    strValueOf2 = i11 != -999 ? String.valueOf(u0.a(c.m().d(), i11)) : "-999";
                } else {
                    strValueOf = "-999";
                    strValueOf2 = strValueOf;
                }
                campaignWithBackData2.setClickURL(com.mbridge.msdk.click.c.a(campaignWithBackData2.getClickURL(), strValueOf, strValueOf2));
                String noticeUrl = campaignWithBackData2.getNoticeUrl();
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                    StringBuilder sb2 = new StringBuilder();
                    while (itKeys2.hasNext()) {
                        sb2.append(C3191e4.i.f36527c);
                        String next2 = itKeys2.next();
                        String strOptString3 = jSONObjectOptJSONObject.optString(next2);
                        if (com.mbridge.msdk.foundation.same.a.f40711h.equals(next2) || com.mbridge.msdk.foundation.same.a.f40712i.equals(next2)) {
                            if (TextUtils.isEmpty(strOptString3)) {
                                strOptString3 = "-999";
                            }
                            int i12 = Integer.parseInt(strOptString3);
                            strOptString3 = i12 != -999 ? String.valueOf(u0.a(c.m().d(), i12)) : "-999";
                        }
                        sb2.append(next2);
                        sb2.append(C3191e4.i.f36525b);
                        sb2.append(strOptString3);
                    }
                    campaignWithBackData2.setNoticeUrl(noticeUrl + ((Object) sb2));
                }
            }
            return campaignWithBackData2;
        } catch (Throwable unused) {
            return campaignEx;
        }
    }

    public static String a(int i10, float f10, float f11) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (i10 == 4) {
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f40711h, -999);
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f40712i, -999);
            } else {
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f40711h, u0.b(c.m().d(), f10));
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f40712i, u0.b(c.m().d(), f11));
            }
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f40716m, i10);
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f40714k, c.m().d().getResources().getConfiguration().orientation);
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f40715l, u0.d(c.m().d()));
            jSONObject.put(com.mbridge.msdk.foundation.same.a.f40713j, jSONObject2);
        } catch (Exception e10) {
            p0.b(f42794a, e10.getMessage());
        }
        return jSONObject.toString();
    }
}
