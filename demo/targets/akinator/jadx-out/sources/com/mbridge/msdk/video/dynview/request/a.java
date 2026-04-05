package com.mbridge.msdk.video.dynview.request;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.out.Campaign;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f44452a = "com.mbridge.msdk.video.dynview.request.a";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.video.dynview.request.a$a, reason: collision with other inner class name */
    public class C0342a implements j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f44453a;

        public C0342a(ViewGroup viewGroup) {
            this.f44453a = viewGroup;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            t0.a(campaign, this.f44453a);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            t0.a(campaign, this.f44453a);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            t0.b(campaign, this.f44453a);
        }
    }

    public static void a(CampaignEx campaignEx, Context context, String str, String str2, String str3) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3191e4.h.W, "2000091");
                jSONObject.put("network_type", l0.s(context));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                    jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f40710g)) {
                    jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, com.mbridge.msdk.foundation.same.a.f40710g);
                }
                jSONObject.put(CampaignEx.JSON_KEY_HB, 0);
                jSONObject.put("rid_n", str3);
                jSONObject.put("reason", str);
                if (campaignEx != null && campaignEx.getRewardTemplateMode() != null) {
                    jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, u0.b(campaignEx.getRewardTemplateMode().e()));
                }
                d.b().a(jSONObject);
            } catch (Throwable th2) {
                p0.b(f44452a, th2.getMessage());
            }
        }
    }

    public static void a(CampaignUnit campaignUnit, int i10, int i11, String str) {
        int i12;
        String impressionURL;
        if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0 || campaignUnit.getAds().get(i10) == null) {
            return;
        }
        if (i11 == 0 && campaignUnit.getAds().get(i10).mMoreOfferImpShow) {
            return;
        }
        String strA = b1.a(campaignUnit.getAds().get(i10).getendcard_url(), "mof_testuid");
        if (TextUtils.isEmpty(strA)) {
            strA = b1.a(campaignUnit.getAds().get(i10).getendcard_url(), "mof_uid");
        }
        String str2 = TextUtils.isEmpty(strA) ? str : strA;
        if (i11 == 0) {
            i12 = com.mbridge.msdk.click.retry.a.f39792m;
            impressionURL = campaignUnit.getAds().get(i10).getImpressionURL();
        } else if (i11 != 1) {
            impressionURL = "";
            i12 = 0;
        } else {
            i12 = com.mbridge.msdk.click.retry.a.f39793n;
            impressionURL = campaignUnit.getAds().get(i10).getOnlyImpressionURL();
        }
        String str3 = impressionURL;
        int i13 = i12;
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        com.mbridge.msdk.click.a.a(c.m().d(), campaignUnit.getAds().get(i10), str2, str3, false, true, i13);
    }

    public static void a(Context context, CampaignEx campaignEx, String str, View view) {
        if (context == null || campaignEx == null) {
            return;
        }
        a(context, campaignEx);
        com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(context, str);
        if (view instanceof ViewGroup) {
            aVar.a(new C0342a((ViewGroup) view));
        }
        aVar.a(campaignEx);
    }

    private static void a(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().d() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().d(), false, false);
    }
}
