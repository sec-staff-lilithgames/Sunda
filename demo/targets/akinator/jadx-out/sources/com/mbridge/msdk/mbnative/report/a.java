package com.mbridge.msdk.mbnative.report;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.out.Campaign;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {
    public static void a(Context context, CampaignEx campaignEx, String str) {
        Context context2;
        CampaignEx campaignEx2;
        String str2;
        if (campaignEx != null) {
            try {
                if (campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().h() == null) {
                    return;
                }
                String[] strArrH = campaignEx.getNativeVideoTracking().h();
                int length = strArrH.length;
                int i10 = 0;
                while (i10 < length) {
                    String str3 = strArrH[i10];
                    if (TextUtils.isEmpty(str3)) {
                        context2 = context;
                        campaignEx2 = campaignEx;
                        str2 = str;
                    } else {
                        context2 = context;
                        campaignEx2 = campaignEx;
                        str2 = str;
                        com.mbridge.msdk.click.a.a(context2, campaignEx2, str2, str3, false, true);
                    }
                    i10++;
                    context = context2;
                    campaignEx = campaignEx2;
                    str = str2;
                }
            } catch (Exception e10) {
                p0.b("NativeReport", e10.getMessage());
            }
        }
    }

    public static void a(Context context, List<Campaign> list, String str) {
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
            CampaignEx campaignEx = (CampaignEx) list.get(0);
            jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
            jSONObject.put("network_type", l0.s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put(CampaignEx.JSON_KEY_HB, "1");
            if (u0.c(campaignEx)) {
                jSONObject.put(CampaignEx.JSON_KEY_RETARGET_TYPE, campaignEx.getRtinsType());
            }
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            d.b().a(jSONObject);
        } catch (Throwable th2) {
            p0.b("NativeReport", th2.getMessage());
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
                jSONObject.put("network_type", l0.s(context));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_STARTTIME, System.currentTimeMillis());
                if (campaignEx != null) {
                    jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
                    jSONObject.put("adtp", campaignEx.getAdType());
                    jSONObject.put("rid", campaignEx.getRequestId());
                    jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                }
                if (!TextUtils.isEmpty(str2)) {
                    String str3 = com.mbridge.msdk.foundation.controller.a.f40369r.get(str2);
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONObject.put("u_stid", str3);
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                    jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f40710g)) {
                    jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, com.mbridge.msdk.foundation.same.a.f40710g);
                }
                jSONObject.put(CampaignEx.JSON_KEY_HB, z10 ? 1 : 0);
                jSONObject.put("reason", str);
                d.b().a(jSONObject);
            } catch (Throwable th2) {
                p0.b("NativeReport", th2.getMessage());
            }
        }
    }

    public static void a(String str, c cVar, CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            d.b().a(str, cVar, campaignEx, context, aVar);
        } catch (Exception e10) {
            p0.b("NativeReport", e10.getMessage());
        }
    }
}
