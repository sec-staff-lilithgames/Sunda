package com.mbridge.msdk.reward.report;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.d;
import com.mbridge.msdk.foundation.same.report.o;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {
    public static void a(Context context, String str) {
        if (context != null) {
            try {
                n nVarA = n.a(g.a(context));
                if (TextUtils.isEmpty(str) || nVarA == null || nVarA.a() <= 0) {
                    return;
                }
                List<com.mbridge.msdk.foundation.entity.n> listA = nVarA.a("m_download_end");
                List<com.mbridge.msdk.foundation.entity.n> listA2 = nVarA.a("2000021");
                List<com.mbridge.msdk.foundation.entity.n> listA3 = nVarA.a("2000039");
                List<com.mbridge.msdk.foundation.entity.n> listA4 = nVarA.a("m_download_end");
                List<com.mbridge.msdk.foundation.entity.n> listA5 = nVarA.a("m_download_end");
                List<com.mbridge.msdk.foundation.entity.n> listA6 = nVarA.a("2000044");
                o.e(listA2);
                o.a(listA);
                o.c(listA3);
                o.b(listA4);
                o.f(listA5);
                o.d(listA6);
            } catch (Exception e10) {
                p0.b("RewardReport", e10.getMessage());
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str) {
        int iA;
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3191e4.h.W, "2000048");
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_STARTTIME, System.currentTimeMillis());
            jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
            jSONObject.put("network_type", l0.s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            if (u0.c(campaignEx)) {
                jSONObject.put(CampaignEx.JSON_KEY_RETARGET_TYPE, campaignEx.getRtinsType());
            }
            jSONObject.put(CampaignEx.JSON_KEY_HB, campaignEx.isBidCampaign() ? 1 : 0);
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
            if (campaignEx.getRewardTemplateMode() != null && (iA = d.a(campaignEx, campaignEx.getRewardTemplateMode().e())) != -1) {
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, iA);
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            p0.b("RewardReport", th2.getMessage());
        }
    }
}
