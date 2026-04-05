package com.mbridge.msdk.advanced.report;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.g;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a {
    public static void a(CampaignEx campaignEx, String str, String str2) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(str2) || !campaignEx.isMraid()) {
                    return;
                }
                new h(c.m().d()).a(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str, str2, campaignEx.isBidCampaign());
            } catch (Exception e10) {
                p0.b("NativeAdvancedReport", e10.getMessage());
            }
        }
    }

    public static void b(String str, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3191e4.h.W, "2000067");
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
                jSONObject.put("rid", campaignEx.getRequestId());
                jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, campaignEx.getCreativeId());
                jSONObject.put(CampaignEx.JSON_KEY_HB, campaignEx.isBidCampaign() ? 1 : 0);
                jSONObject.put("network_type", l0.s(c.m().d()));
                d.b().a(jSONObject);
            } catch (Throwable th2) {
                p0.b("NativeAdvancedReport", th2.getMessage());
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (campaignEx.isMraid()) {
                    n nVar = new n();
                    nVar.n(campaignEx.getRequestId());
                    nVar.o(campaignEx.getRequestIdNotice());
                    nVar.b(campaignEx.getId());
                    nVar.b(campaignEx.isMraid() ? n.N : n.O);
                    g.d(nVar, context.getApplicationContext(), str);
                }
            } catch (Exception e10) {
                p0.b("NativeAdvancedReport", e10.getMessage());
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, long j10, int i10) {
        if (campaignEx != null) {
            try {
                if (campaignEx.isMraid()) {
                    n nVar = new n();
                    nVar.n(campaignEx.getRequestId());
                    nVar.o(campaignEx.getRequestIdNotice());
                    nVar.b(campaignEx.getId());
                    nVar.d(i10);
                    nVar.e(String.valueOf(System.currentTimeMillis() - j10));
                    nVar.g("");
                    nVar.m(str2);
                    nVar.a("8");
                    nVar.b(n.N);
                    g.b(nVar, str, campaignEx);
                }
            } catch (Exception e10) {
                p0.b("NativeAdvancedReport", e10.getMessage());
            }
        }
    }

    public static void a(String str, CampaignEx campaignEx) {
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        n nVar = new n("2000061", campaignEx.getId(), campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), str, l0.s(c.m().d()));
        nVar.b(n.N);
        g.b(nVar, c.m().d(), str);
    }

    public static void a(String str, CampaignEx campaignEx, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (campaignEx.isBidCampaign()) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, 1);
            }
            jSONObject.put(C3191e4.h.W, "2000070");
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put(CampaignEx.JSON_KEY_CLICK_URL, str2);
            jSONObject.put("network_type", String.valueOf(l0.s(c.m().d())));
            d.b().a(jSONObject);
        } catch (Throwable th2) {
            p0.b("NativeAdvancedReport", th2.getMessage());
        }
    }

    public static void a(int i10, String str, String str2, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3191e4.h.W, "2000068");
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
                jSONObject.put("rid", campaignEx.getRequestId());
                jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, campaignEx.getCreativeId());
                jSONObject.put(CampaignEx.JSON_KEY_HB, campaignEx.isBidCampaign() ? 1 : 0);
                jSONObject.put("network_type", l0.s(c.m().d()));
                jSONObject.put("result", i10);
                jSONObject.put("reason", str);
                d.b().a(jSONObject);
            } catch (Throwable th2) {
                p0.b("NativeAdvancedReport", th2.getMessage());
            }
        }
    }

    public static void a(String str, int i10, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3191e4.h.W, "2000069");
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
                jSONObject.put("rid", campaignEx.getRequestId());
                jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, campaignEx.getCreativeId());
                jSONObject.put(CampaignEx.JSON_KEY_HB, campaignEx.isBidCampaign() ? 1 : 0);
                jSONObject.put("network_type", l0.s(c.m().d()));
                jSONObject.put("close_type", i10);
                d.b().a(jSONObject);
            } catch (Throwable th2) {
                p0.b("NativeAdvancedReport", th2.getMessage());
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
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }
}
