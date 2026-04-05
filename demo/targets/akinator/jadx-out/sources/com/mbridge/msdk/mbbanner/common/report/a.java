package com.mbridge.msdk.mbbanner.common.report;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.setting.l;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {
    public static void a(CampaignEx campaignEx, String str, String str2) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                new h(c.m().d()).a(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str, str2, campaignEx.isBidCampaign());
            } catch (Exception e10) {
                p0.b("BannerReport", e10.getMessage());
            }
        }
    }

    public static String b(String str) throws NoSuchAlgorithmException {
        String md5 = SameMD5.getMD5(u0.d());
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split("_");
                if (strArrSplit.length < 3) {
                    return "";
                }
                String str2 = strArrSplit[2];
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
            }
            return md5;
        } catch (Exception e10) {
            p0.b("BannerReport", e10.getMessage());
            return "";
        }
    }

    public static void a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                String strB = com.mbridge.msdk.mbsignalcommon.mraid.c.b(campaignEx.getId());
                if (TextUtils.isEmpty(strB)) {
                    return;
                }
                new h(c.m().d()).b(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str, strB, campaignEx.isBidCampaign());
                com.mbridge.msdk.mbsignalcommon.mraid.c.a(campaignEx.getId());
            } catch (Throwable th2) {
                p0.b("BannerReport", th2.getMessage());
            }
        }
    }

    public static void a(String str, CampaignEx campaignEx, String str2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (campaignEx.isBidCampaign()) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, 1);
            }
            jSONObject.put(C3191e4.h.W, "2000070");
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put(CampaignEx.JSON_KEY_CLICK_URL, str2);
            jSONObject.put("network_type", String.valueOf(l0.s(c.m().d())));
            d.b().a(jSONObject);
        } catch (Exception e10) {
            p0.b("BannerReport", e10.getMessage());
        }
    }

    public static void a(String str, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3191e4.h.W, "2000067");
                jSONObject.put("rid", campaignEx.getRequestId());
                jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                jSONObject.put(CampaignEx.JSON_KEY_HB, campaignEx.isBidCampaign() ? 1 : 0);
                HashMap<String, String> map = com.mbridge.msdk.foundation.controller.a.f40369r;
                if (map != null) {
                    String str2 = map.get(str);
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("u_stid", str2);
                    }
                }
                d.b().a(jSONObject);
            } catch (Throwable th2) {
                p0.b("BannerReport", th2.getMessage());
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().d() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().d(), false, false);
    }

    public static void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            d.b().a(str, cVar, campaignEx, context, aVar);
        } catch (Exception e10) {
            p0.b("BannerReport", e10.getMessage());
        }
    }

    public static com.mbridge.msdk.foundation.same.report.metrics.c a(String str, String str2) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        try {
            LinkedHashMap<String, com.mbridge.msdk.foundation.same.report.metrics.c> linkedHashMapC = d.b().c();
            if (linkedHashMapC != null && !linkedHashMapC.isEmpty()) {
                Iterator<Map.Entry<String, com.mbridge.msdk.foundation.same.report.metrics.c>> it = linkedHashMapC.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, com.mbridge.msdk.foundation.same.report.metrics.c> next = it.next();
                    if (next != null && next.getValue().z()) {
                        it.remove();
                    }
                }
            }
            cVar = d.b().b(str2);
            if (cVar == null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
                try {
                    d.b().c().put(str2, cVar2);
                    cVar2.d(true);
                    cVar = cVar2;
                } catch (Exception e10) {
                    e = e10;
                    cVar = cVar2;
                    p0.b("BannerReport", e.getMessage());
                    return cVar;
                }
            }
            cVar.a(296);
            cVar.i(str2);
            cVar.n(str);
            return cVar;
        } catch (Exception e11) {
            e = e11;
        }
    }

    public static void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, e eVar) {
        try {
            a(cVar, eVar);
            if (eVar != null) {
                cVar.a(str, eVar);
            }
            d.b().b(str, cVar, null);
        } catch (Exception e10) {
            p0.b("BannerReport", e10.getMessage());
        }
    }

    private static void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, e eVar) {
        List<CampaignEx> listJ;
        try {
            String strW = cVar.w();
            if (TextUtils.isEmpty(strW) && (listJ = cVar.j()) != null && !listJ.isEmpty() && listJ.get(0) != null) {
                strW = listJ.get(0).getCampaignUnitId();
                cVar.a(listJ.get(0).getAdType());
                cVar.n(strW);
            }
            l lVarD = com.mbridge.msdk.setting.h.b().d(c.m().b(), strW);
            if (lVarD != null) {
                if (eVar == null) {
                    eVar = new e();
                }
                eVar.a("us_rid", lVarD.I());
                HashMap<String, String> map = com.mbridge.msdk.foundation.controller.a.f40369r;
                if (map != null) {
                    String str = map.get(strW);
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    eVar.a("u_stid", str);
                    return;
                }
                eVar.a("u_stid", lVarD.a());
            }
        } catch (Exception e10) {
            p0.b("BannerReport", e10.getMessage());
        }
    }

    public static void a(String str) {
        LinkedHashMap<String, com.mbridge.msdk.foundation.same.report.metrics.c> linkedHashMapC;
        try {
            if (TextUtils.isEmpty(str) || (linkedHashMapC = d.b().c()) == null || linkedHashMapC.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<String, com.mbridge.msdk.foundation.same.report.metrics.c>> it = linkedHashMapC.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, com.mbridge.msdk.foundation.same.report.metrics.c> next = it.next();
                if (next != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.c value = next.getValue();
                    if (value.z()) {
                        it.remove();
                    }
                    if (value.w().equals(str)) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th2) {
            p0.b("BannerReport", th2.getMessage());
        }
    }
}
