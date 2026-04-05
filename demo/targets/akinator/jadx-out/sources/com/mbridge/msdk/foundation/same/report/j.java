package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.amazon.device.ads.DtbDeviceData;
import com.ironsource.C3191e4;
import com.ironsource.G5;
import com.ironsource.Q6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.DomainCampaignEx;
import com.mbridge.msdk.foundation.tools.j0;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.n0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.x0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import java.io.File;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class j extends b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f40941b = "j";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            String[] list;
            try {
                String strB = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_CRASH_INFO);
                if (TextUtils.isEmpty(strB)) {
                    return;
                }
                File file = new File(strB);
                if (file.exists() && file.isDirectory() && (list = file.list()) != null) {
                    for (String str : list) {
                        File file2 = new File(strB + "/" + str);
                        if (file2.exists()) {
                            String strE = n0.e(file2);
                            if (!TextUtils.isEmpty(strE)) {
                                String[] strArrSplit = strE.split("====");
                                if (strArrSplit.length > 0) {
                                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(new JSONObject(strArrSplit[0]));
                                }
                            }
                            com.mbridge.msdk.foundation.same.d.a(file2);
                        }
                    }
                }
            } catch (Throwable th2) {
                p0.b(j.f40941b, th2.getMessage());
            }
        }
    }

    public static boolean a() {
        try {
            return System.currentTimeMillis() - 86400000 > ((Long) x0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "privateAuthorityTimesTamp", 0L)).longValue();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    public static void b(Context context, CampaignEx campaignEx, String str, String str2) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str2);
            jSONObject.put(C3191e4.h.W, "2000054");
            jSONObject.put("network_type", l0.s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
            jSONObject.put("reason", "");
            jSONObject.put("result", 2);
            if (campaignEx.getAdType() == 287) {
                jSONObject.put(DTBMetricsConfiguration.CREATIVE_TEMPLATES_KEY_NAME, campaignEx.getendcard_url());
                jSONObject.put("ad_type", 3);
            } else if (campaignEx.getAdType() == 94) {
                jSONObject.put(DTBMetricsConfiguration.CREATIVE_TEMPLATES_KEY_NAME, campaignEx.getendcard_url());
                jSONObject.put("ad_type", 1);
            } else if (campaignEx.getAdType() == 296) {
                jSONObject.put("ad_type", 5);
                jSONObject.put(DTBMetricsConfiguration.CREATIVE_TEMPLATES_KEY_NAME, campaignEx.getCreativeId());
            } else if (campaignEx.getAdType() == 297) {
                jSONObject.put("ad_type", 6);
                jSONObject.put(DTBMetricsConfiguration.CREATIVE_TEMPLATES_KEY_NAME, campaignEx.getCreativeId());
            } else if (campaignEx.getAdType() == 298) {
                jSONObject.put("ad_type", 7);
                jSONObject.put(DTBMetricsConfiguration.CREATIVE_TEMPLATES_KEY_NAME, campaignEx.getCreativeId());
            } else {
                jSONObject.put(DTBMetricsConfiguration.CREATIVE_TEMPLATES_KEY_NAME, campaignEx.getendcard_url());
                jSONObject.put("ad_type", 1);
            }
            jSONObject.put("devid", com.mbridge.msdk.foundation.tools.f.d());
            if (campaignEx.isBidCampaign()) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, "1");
            }
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            p0.b(f40941b, th2.getMessage());
        }
    }

    public static void c() {
        try {
            x0.b(com.mbridge.msdk.foundation.controller.c.m().d(), "privateAuthorityTimesTamp", Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th2) {
            p0.b(f40941b, th2.getMessage());
        }
    }

    public static JSONObject a(Campaign campaign, int i10, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", "adtrack");
            jSONObject.put("action", str);
            jSONObject.put("label", i10);
            if (campaign != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", campaign.getId());
                jSONObject2.put("title", campaign.getAppName());
                jSONObject.put("value", jSONObject2);
                return jSONObject;
            }
            jSONObject.put("value", "");
            return jSONObject;
        } catch (Exception e10) {
            p0.b(f40941b, e10.getMessage());
            return jSONObject;
        }
    }

    public static com.mbridge.msdk.foundation.same.net.wrapper.e a(Context context) {
        String str = "1";
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
        try {
            eVar.a(Q6.H, "1");
            eVar.a("package_name", URLEncoder.encode(l0.t(context)));
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                eVar.a("os_version", Build.VERSION.RELEASE);
                eVar.a("brand", URLEncoder.encode(l0.s()));
                eVar.a("model", URLEncoder.encode(l0.n()));
                if (com.mbridge.msdk.util.b.a()) {
                    eVar.a(Q6.U0, "");
                } else {
                    eVar.a(Q6.U0, com.mbridge.msdk.foundation.tools.f.d());
                }
                eVar.a("mnc", l0.r(context));
                eVar.a("mcc", l0.q(context));
                int iS = l0.s(context);
                eVar.a("network_type", iS + "");
                eVar.a("network_str", l0.a(context, iS));
                eVar.a(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, URLEncoder.encode(l0.p(context)));
                eVar.a("timezone", URLEncoder.encode(l0.w()));
                eVar.a(Q6.f35252d0, URLEncoder.encode(l0.i()));
                eVar.a("adid_limit", com.mbridge.msdk.foundation.tools.f.a() + "");
                if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.j()) {
                    str = "0";
                }
                eVar.a("adid_limit_dev", str);
            }
            eVar.a("sdk_version", MBConfiguration.SDK_VERSION);
            eVar.a("app_version_name", URLEncoder.encode(l0.B(context)));
            eVar.a("orientation", URLEncoder.encode(l0.F(context) + ""));
            eVar.a("screen_size", l0.n(context) + "x" + l0.m(context));
            if (com.mbridge.msdk.util.b.a()) {
                com.mbridge.msdk.foundation.same.net.wrapper.f.f(eVar);
            }
            k.a(eVar, context);
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.m().b());
            if (gVarD == null) {
                gVarD = com.mbridge.msdk.setting.h.b().a();
            }
            if (gVarD != null) {
                JSONObject jSONObjectA = a(context, gVarD);
                if (!TextUtils.isEmpty(jSONObjectA.toString())) {
                    String strB = j0.b(jSONObjectA.toString());
                    if (!TextUtils.isEmpty(strB)) {
                        eVar.a("dvi", strB);
                        return eVar;
                    }
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return eVar;
    }

    public static void b() {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a());
        } catch (Throwable th2) {
            p0.b(f40941b, th2.getMessage());
        }
    }

    public static void b(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3191e4.h.W, "2000090");
            jSONObject.put("reason", TextUtils.isEmpty(str) ? "" : str);
            jSONObject.put("result", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e10) {
            p0.b(f40941b, e10.getMessage());
        }
    }

    public static JSONObject a(Context context, com.mbridge.msdk.setting.g gVar) throws Exception {
        return k.a(context, gVar);
    }

    public static JSONObject a(String str, Map<String, Object> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3191e4.h.W, str);
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            return jSONObject;
        } catch (Throwable th2) {
            p0.b(f40941b, th2.getMessage());
            return null;
        }
    }

    public static void a(Context context, String str, String str2, int i10, String str3) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3191e4.h.W, "2000076");
                jSONObject.put("network_type", l0.s(context));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                jSONObject.put("reason", str3);
                jSONObject.put("result", i10);
                jSONObject.put("url", str);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Throwable th2) {
                p0.b(f40941b, th2.getMessage());
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, int i10, String str3, int i11) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3191e4.h.W, "2000073");
            jSONObject.put("network_type", l0.s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
            jSONObject.put("reason", str3);
            jSONObject.put("result", i10);
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            if (i11 != -1) {
                jSONObject.put("d_t", i11);
            }
            jSONObject.put("url", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            p0.b(f40941b, th2.getMessage());
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, int i10, int i11, int i12) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3191e4.h.W, "2000075");
            jSONObject.put("network_type", l0.s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
            jSONObject.put("type", i10);
            jSONObject.put("adtp", campaignEx.getAdType());
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put("status", i11);
            if (i12 != -1) {
                jSONObject.put("d_t", i12);
            }
            jSONObject.put("url", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            p0.b(f40941b, th2.getMessage());
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, int i10, int i11) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3191e4.h.W, "2000074");
            jSONObject.put("network_type", l0.s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
            jSONObject.put("type", i10);
            jSONObject.put("adtp", campaignEx.getAdType());
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            if (i11 != -1) {
                jSONObject.put("d_t", i11);
            }
            jSONObject.put("url", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            p0.b(f40941b, th2.getMessage());
        }
    }

    public static void a(Context context, String str, String str2, boolean z10, CampaignEx campaignEx) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3191e4.h.W, "2000047");
                if (!TextUtils.isEmpty(str2)) {
                    String str3 = com.mbridge.msdk.foundation.controller.a.f40369r.get(str2);
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONObject.put("u_stid", str3);
                }
                if (campaignEx != null) {
                    jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
                    jSONObject.put("adtp", campaignEx.getAdType());
                    jSONObject.put("rid", campaignEx.getRequestId());
                    jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                }
                jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_STARTTIME, System.currentTimeMillis());
                jSONObject.put("network_type", l0.s(context));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                jSONObject.put(CampaignEx.JSON_KEY_HB, z10 ? 1 : 0);
                jSONObject.put("reason", str);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Throwable th2) {
                p0.b(f40941b, th2.getMessage());
            }
        }
    }

    public static void a(Context context, List<CampaignEx> list, String str, boolean z10) {
        if (context == null || list == null) {
            return;
        }
        try {
            if (list.isEmpty() || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3191e4.h.W, "2000048");
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_STARTTIME, System.currentTimeMillis());
            jSONObject.put("network_type", l0.s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put(CampaignEx.JSON_KEY_HB, z10 ? 1 : 0);
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null) {
                jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
                jSONObject.put("rid", campaignEx.getRequestId());
                jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < list.size(); i10++) {
                CampaignEx campaignEx2 = list.get(i10);
                if (i10 < list.size() - 1) {
                    sb2.append(campaignEx2.getRtinsType());
                    sb2.append(",");
                } else {
                    sb2.append(campaignEx2.getRtinsType());
                }
            }
            jSONObject.put(CampaignEx.JSON_KEY_RETARGET_TYPE, sb2.toString());
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            p0.b(f40941b, th2.getMessage());
        }
    }

    public static void a(Context context, String str, String str2, boolean z10, String str3, String str4, String str5, String str6) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3191e4.h.W, "2000104");
                if (!TextUtils.isEmpty(str2)) {
                    String str7 = com.mbridge.msdk.foundation.controller.a.f40369r.get(str2);
                    if (str7 == null) {
                        str7 = "";
                    }
                    jSONObject.put("u_stid", str7);
                }
                jSONObject.put("network_type", l0.s(context));
                jSONObject.put("rid", str3);
                jSONObject.put("rid_n", str4);
                jSONObject.put(BidResponsedEx.KEY_CID, str5);
                jSONObject.put("template_id", str6);
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                jSONObject.put(CampaignEx.JSON_KEY_HB, z10 ? 1 : 0);
                jSONObject.put("reason", str);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Throwable th2) {
                p0.b(f40941b, th2.getMessage());
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2) {
        if (context != null) {
            try {
                if ((!TextUtils.isEmpty(str)) && (!TextUtils.isEmpty(str2))) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C3191e4.h.W, "2000054");
                    jSONObject.put("network_type", l0.s(context));
                    jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                    jSONObject.put("reason", str2);
                    jSONObject.put("result", 1);
                    jSONObject.put("devid", com.mbridge.msdk.foundation.tools.f.d());
                    if (campaignEx != null) {
                        jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
                        if (campaignEx.getAdType() == 287) {
                            jSONObject.put(DTBMetricsConfiguration.CREATIVE_TEMPLATES_KEY_NAME, campaignEx.getendcard_url());
                            jSONObject.put("ad_type", 3);
                        } else if (campaignEx.getAdType() == 94) {
                            jSONObject.put(DTBMetricsConfiguration.CREATIVE_TEMPLATES_KEY_NAME, campaignEx.getendcard_url());
                            jSONObject.put("ad_type", 1);
                        } else if (campaignEx.getAdType() == 296) {
                            jSONObject.put("ad_type", 5);
                            jSONObject.put(DTBMetricsConfiguration.CREATIVE_TEMPLATES_KEY_NAME, campaignEx.getCreativeId());
                        } else if (campaignEx.getAdType() == 297) {
                            jSONObject.put("ad_type", 6);
                            jSONObject.put(CampaignEx.JSON_KEY_AD_HTML, campaignEx.getCreativeId());
                            jSONObject.put(CampaignEx.JSON_KEY_AD_ZIP, campaignEx.getAdZip());
                        } else if (campaignEx.getAdType() == 298) {
                            jSONObject.put("ad_type", 7);
                            jSONObject.put(CampaignEx.JSON_KEY_AD_HTML, campaignEx.getCreativeId());
                            jSONObject.put(CampaignEx.JSON_KEY_AD_ZIP, campaignEx.getAdZip());
                        } else {
                            jSONObject.put(DTBMetricsConfiguration.CREATIVE_TEMPLATES_KEY_NAME, campaignEx.getendcard_url());
                            jSONObject.put("ad_type", 1);
                        }
                        jSONObject.put("devid", com.mbridge.msdk.foundation.tools.f.d());
                        if (campaignEx.isBidCampaign()) {
                            jSONObject.put(CampaignEx.JSON_KEY_HB, "1");
                        }
                        jSONObject.put("rid", campaignEx.getRequestId());
                        jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                        jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
                }
            } catch (Throwable th2) {
                p0.b(f40941b, th2.getMessage());
            }
        }
    }

    public static void a(CampaignEx campaignEx, String str, int i10, int i11, String str2, int i12, int i13, int i14, String str3) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar;
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a(C3191e4.h.W, URLEncoder.encode("2000094", G5.N));
            if (campaignEx != null) {
                eVar.a("rid", URLEncoder.encode(campaignEx.getRequestId(), G5.N));
                eVar.a("rid_n", URLEncoder.encode(campaignEx.getRequestIdNotice(), G5.N));
                eVar.a(BidResponsedEx.KEY_CID, URLEncoder.encode(campaignEx.getId(), G5.N));
                cVar = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid());
            } else {
                cVar = null;
            }
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, URLEncoder.encode(str, G5.N));
            if (i10 == 0) {
                if (TextUtils.isEmpty(str3)) {
                    str3 = "0";
                }
                eVar.a("video_prg", str3 + "");
            } else {
                eVar.a("video_prg", i10 + "");
            }
            eVar.a("phase", i11 + "");
            eVar.a("feedback_content", URLEncoder.encode(str2, G5.N));
            eVar.a("feedback_close", i12 + "");
            eVar.a("type", i14 + "");
            eVar.a("ad_type", i13 + "");
            eVar.a("network_type", URLEncoder.encode(String.valueOf(l0.s(com.mbridge.msdk.foundation.controller.c.m().d())), G5.N));
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            cVar.n(str);
            cVar.a(i13);
            cVar.a("2000094", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000094", cVar);
        } catch (Exception e10) {
            p0.b(f40941b, e10.getMessage());
        }
    }

    public static void a(String str) {
        try {
            if (com.mbridge.msdk.foundation.controller.c.m().d() == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3191e4.h.W, "2000088");
            jSONObject.put("state", str);
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.m().b());
            if (gVarD == null || b.a(gVarD, jSONObject.toString())) {
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            }
        } catch (Throwable th2) {
            p0.b(f40941b, th2.getMessage());
        }
    }

    public static void a(Context context, CampaignEx campaignEx, int i10, String str, String str2) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3191e4.h.W, "2000114");
            jSONObject.put("network_type", l0.s(context));
            jSONObject.put(DomainCampaignEx.KEY_GH_ID, TextUtils.isEmpty(campaignEx.getGhId()) ? "" : campaignEx.getGhId());
            jSONObject.put(DomainCampaignEx.KEY_GH_PATH, TextUtils.isEmpty(campaignEx.getGhPath()) ? "" : campaignEx.getGhPath());
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put("result", i10);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            jSONObject.put("reason", str);
            jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            p0.b(f40941b, th2.getMessage());
        }
    }

    public static void a(int i10, String str, String str2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3191e4.h.W, "2000080");
            jSONObject.put("ad_type", i10);
            jSONObject.put("url", str);
            jSONObject.put("reason", str2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e10) {
            p0.b(f40941b, e10.getMessage());
        }
    }

    public static void a(CampaignEx campaignEx, String str, int i10, int i11, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3191e4.h.W, "2000121");
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("type", i10);
            jSONObject.put("result", i11);
            jSONObject.put("reason", str2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e10) {
            p0.b(f40941b, e10.getMessage());
        }
    }

    public static void a(String str, int i10, int i11, String str2, int i12, String str3) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a(C3191e4.h.W, URLEncoder.encode("m_water_mark_result", G5.N));
            eVar.a("water_mark_result", i11 + "");
            eVar.a("water_mark_error_msg", URLEncoder.encode(str2, G5.N));
            eVar.a("render_result", i12 + "");
            eVar.a("water_mark_str", URLEncoder.encode(str3, G5.N));
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar.a(i10);
            cVar.n(str);
            cVar.a("m_water_mark_result", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_water_mark_result", cVar);
        } catch (Throwable th2) {
            p0.b(f40941b, th2.getMessage());
        }
    }

    public static void a(boolean z10, long j10, String str) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            String str2 = PcrIk.xdvuGGoyDBZz;
            eVar.a("status", z10 ? "1" : str2);
            eVar.a("is_allow_crash", com.mbridge.msdk.foundation.controller.c.m().e().b() ? "1" : str2);
            if (com.mbridge.msdk.foundation.controller.c.m().e().a()) {
                str2 = "1";
            }
            eVar.a("is_allow_anr", str2);
            eVar.a("executionTime", String.valueOf(j10));
            if (!TextUtils.isEmpty(str)) {
                eVar.a("reason", str);
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar.a("m_init_sdk", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_init_sdk", cVar);
        } catch (Throwable th2) {
            p0.b(f40941b, th2.getMessage());
        }
    }
}
