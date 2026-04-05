package com.mbridge.msdk.mbbanner.common.util;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.buffer.b;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class BannerUtils {
    private static final String TAG = "BannerUtils";

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f41531a = 0;

    private static synchronized List<com.mbridge.msdk.foundation.same.metadata.a> fillIdInList(List<com.mbridge.msdk.foundation.same.metadata.a> list, List<CampaignEx> list2) {
        if (list2 != null) {
            try {
                if (list2.size() > 0) {
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    for (CampaignEx campaignEx : list2) {
                        if (campaignEx != null) {
                            com.mbridge.msdk.foundation.same.metadata.a aVar = new com.mbridge.msdk.foundation.same.metadata.a(campaignEx.getId(), campaignEx.getCreativeId());
                            if (list.size() >= 20) {
                                list.remove(0);
                            }
                            list.add(aVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    public static String getCloseIds(String str) throws JSONException {
        List<com.mbridge.msdk.foundation.same.metadata.a> list;
        try {
            Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> map = b.f40736b;
            if (map == null || !z0.b(str) || !map.containsKey(str) || (list = map.get(str)) == null || list.size() <= 0) {
                return "";
            }
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < list.size(); i10++) {
                JSONObject jSONObject = new JSONObject();
                com.mbridge.msdk.foundation.same.metadata.a aVar = list.get(i10);
                jSONObject.put(BidResponsedEx.KEY_CID, aVar.a());
                jSONObject.put("crid", aVar.b());
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static void inserCloseId(String str, List<CampaignEx> list) {
        Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> map = b.f40736b;
        if (map == null || list == null || list.size() <= 0) {
            return;
        }
        if (z0.b(str)) {
            if (map.containsKey(str)) {
                map.put(str, fillIdInList(map.get(str), list));
            } else {
                map.put(str, fillIdInList(new ArrayList(), list));
            }
        }
        b.f40736b = map;
    }

    public static CampaignEx managerCampaignEX(String str, CampaignEx campaignEx) throws JSONException {
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
                Iterator<String> itKeys = jSONObject.keys();
                try {
                    if (!jSONObject.has(CampaignEx.JSON_KEY_DEEP_LINK_URL)) {
                        jSONObjectCampaignToJsonObject.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, "");
                    }
                } catch (Exception unused) {
                }
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
            } catch (JSONException e10) {
                e10.printStackTrace();
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
                    strValueOf = String.valueOf(u0.a(c.m().d(), Integer.valueOf(jSONObjectOptJSONObject.getString(com.mbridge.msdk.foundation.same.a.f40711h)).intValue()));
                    strValueOf2 = String.valueOf(u0.a(c.m().d(), Integer.valueOf(jSONObjectOptJSONObject.getString(com.mbridge.msdk.foundation.same.a.f40712i)).intValue()));
                } else {
                    strValueOf = "-999";
                    strValueOf2 = "-999";
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
                            strOptString3 = String.valueOf(u0.a(c.m().d(), Integer.valueOf(strOptString3).intValue()));
                        }
                        sb2.append(next2);
                        sb2.append(C3191e4.i.f36525b);
                        sb2.append(strOptString3);
                    }
                    campaignWithBackData2.setNoticeUrl(noticeUrl + ((Object) sb2));
                }
            }
            return campaignWithBackData2;
        } catch (Throwable unused2) {
            return campaignEx;
        }
    }

    public static void uisList(Context context, List<CampaignEx> list) {
        if (context == null || list == null || list.size() == 0) {
            return;
        }
        j jVarA = j.a(g.a(context));
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx = list.get(i10);
            if (jVarA != null && !jVarA.a(campaignEx.getId())) {
                com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                gVar.a(campaignEx.getId());
                gVar.b(campaignEx.getFca());
                gVar.c(campaignEx.getFcb());
                gVar.a(0);
                gVar.d(0);
                gVar.a(System.currentTimeMillis());
                jVarA.b(gVar);
            }
        }
    }
}
