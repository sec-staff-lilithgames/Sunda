package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import be.nVUQ.UupKET;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.ironsource.C3191e4;
import com.ironsource.Q6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class o {
    public static void a(List<com.mbridge.msdk.foundation.entity.n> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (com.mbridge.msdk.foundation.entity.n nVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (nVar.w() != null) {
                    jSONObject.put("resource_type", nVar.w());
                }
                if (nVar.e() != null) {
                    jSONObject.put(DTBMetricsConfiguration.CREATIVE_TEMPLATES_KEY_NAME, nVar.e());
                }
                jSONObject.put(C3191e4.h.W, nVar.n());
                jSONObject.put("result", nVar.x());
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, nVar.g());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, nVar.D());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_LENGTHL, nVar.C());
                jSONObject.put("reason", nVar.t());
                jSONObject.put(BidResponsedEx.KEY_CID, nVar.d());
                jSONObject.put("video_url", nVar.E());
                jSONObject.put("rid", nVar.u());
                jSONObject.put("rid_n", nVar.v());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, nVar.B());
                jSONObject.put("offer_url", nVar.s());
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", nVar.q());
                    jSONObject.put("network_str", nVar.r());
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Throwable th2) {
                p0.b("VideoDataReport", th2.getMessage());
            }
        }
    }

    public static void b(List<com.mbridge.msdk.foundation.entity.n> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (com.mbridge.msdk.foundation.entity.n nVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3191e4.h.W, nVar.n());
                jSONObject.put("result", nVar.x());
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, nVar.g());
                jSONObject.put(CampaignEx.ENDCARD_URL, nVar.i());
                jSONObject.put(BidResponsedEx.KEY_CID, nVar.d());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, nVar.B());
                jSONObject.put("reason", nVar.t());
                jSONObject.put("ad_type", nVar.a());
                jSONObject.put("rid", nVar.u());
                jSONObject.put("rid_n", nVar.v());
                jSONObject.put("type", nVar.h());
                jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, nVar.b());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Throwable th2) {
                p0.b("VideoDataReport", th2.getMessage());
            }
        }
    }

    public static void c(List<com.mbridge.msdk.foundation.entity.n> list) {
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                Iterator<com.mbridge.msdk.foundation.entity.n> it = list.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            } catch (Throwable th2) {
                p0.b("VideoDataReport", th2.getMessage());
            }
        }
    }

    public static void d(List<com.mbridge.msdk.foundation.entity.n> list) {
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                for (com.mbridge.msdk.foundation.entity.n nVar : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C3191e4.h.W, nVar.n());
                    jSONObject.put(BidResponsedEx.KEY_CID, nVar.d());
                    jSONObject.put(CampaignEx.JSON_KEY_IMAGE_URL, nVar.l());
                    jSONObject.put("reason", nVar.t());
                    jSONObject.put("rid", nVar.u());
                    jSONObject.put("rid_n", nVar.v());
                    jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, nVar.B());
                    if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                        jSONObject.put("network_type", nVar.q());
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
                }
            } catch (Throwable th2) {
                p0.b("VideoDataReport", th2.getMessage());
            }
        }
    }

    public static void e(List<com.mbridge.msdk.foundation.entity.n> list) {
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                for (com.mbridge.msdk.foundation.entity.n nVar : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C3191e4.h.W, nVar.n());
                    jSONObject.put("reason", nVar.t());
                    jSONObject.put(BidResponsedEx.KEY_CID, nVar.d());
                    jSONObject.put("video_url", nVar.E());
                    jSONObject.put("rid", nVar.u());
                    jSONObject.put("rid_n", nVar.v());
                    jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, nVar.B());
                    jSONObject.put("offer_url", nVar.s());
                    if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                        jSONObject.put("network_type", nVar.q());
                        jSONObject.put("network_str", nVar.r());
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
                }
            } catch (Throwable th2) {
                p0.b("VideoDataReport", th2.getMessage());
            }
        }
    }

    public static void f(com.mbridge.msdk.foundation.entity.n nVar) {
        if (nVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3191e4.h.W, nVar.n());
                jSONObject.put("result", nVar.x());
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, nVar.g());
                jSONObject.put(BidResponsedEx.KEY_CID, nVar.d());
                jSONObject.put(UupKET.RlrILVduYSfN, nVar.B());
                jSONObject.put("reason", nVar.t());
                jSONObject.put("ad_type", nVar.a());
                jSONObject.put("rid", nVar.u());
                jSONObject.put("rid_n", nVar.v());
                jSONObject.put("network_type", nVar.q());
                jSONObject.put("mraid_type", nVar.p());
                jSONObject.put("devid", nVar.f());
                jSONObject.put("type", nVar.h());
                if (nVar.w() != null) {
                    jSONObject.put("resource_type", nVar.w());
                }
                if (!TextUtils.isEmpty(nVar.i())) {
                    jSONObject.put(CampaignEx.ENDCARD_URL, nVar.i());
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Throwable th2) {
                p0.b("VideoDataReport", th2.getMessage());
            }
        }
    }

    public static void g(com.mbridge.msdk.foundation.entity.n nVar) {
        if (nVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3191e4.h.W, nVar.n());
                jSONObject.put("result", nVar.x());
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, nVar.g());
                jSONObject.put(BidResponsedEx.KEY_CID, nVar.d());
                jSONObject.put("reason", nVar.t());
                jSONObject.put("ad_type", nVar.a());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, nVar.B());
                jSONObject.put("devid", nVar.f());
                jSONObject.put("mraid_type", nVar.p());
                jSONObject.put("network_type", nVar.q());
                jSONObject.put("rid_n", nVar.v());
                jSONObject.put("rid", nVar.u());
                if (!TextUtils.isEmpty(nVar.i())) {
                    jSONObject.put(CampaignEx.ENDCARD_URL, nVar.i());
                }
                if (!TextUtils.isEmpty(nVar.h())) {
                    jSONObject.put("type", nVar.h());
                }
                if (nVar.w() != null) {
                    jSONObject.put("resource_type", nVar.w());
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Throwable th2) {
                p0.b("VideoDataReport", th2.getMessage());
            }
        }
    }

    public static void h(com.mbridge.msdk.foundation.entity.n nVar) {
        if (nVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3191e4.h.W, nVar.n());
                jSONObject.put(BidResponsedEx.KEY_CID, nVar.d());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, nVar.B());
                jSONObject.put("network_type", nVar.q());
                jSONObject.put("mraid_type", nVar.p());
                jSONObject.put("rid_n", nVar.v());
                jSONObject.put("rid", nVar.u());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Throwable th2) {
                p0.b("VideoDataReport", th2.getMessage());
            }
        }
    }

    public static void i(com.mbridge.msdk.foundation.entity.n nVar) throws JSONException {
        if (nVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3191e4.h.W, nVar.n());
                jSONObject.put("error", u0.a(nVar.j()));
                jSONObject.put("template_url", u0.a(nVar.z()));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, u0.a(nVar.B()));
                jSONObject.put(BidResponsedEx.KEY_CID, u0.a(nVar.d()));
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_str", nVar.r());
                    jSONObject.put("network_type", nVar.q());
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Exception e10) {
                p0.b("VideoDataReport", e10.getMessage());
            }
        }
    }

    public static void c(com.mbridge.msdk.foundation.entity.n nVar) {
        if (nVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3191e4.h.W, nVar.n());
                jSONObject.put(BidResponsedEx.KEY_CID, nVar.d());
                jSONObject.put("rid", nVar.u());
                jSONObject.put("rid_n", nVar.v());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, nVar.B());
                jSONObject.put("network_type", nVar.q());
                jSONObject.put("mraid_type", nVar.p());
                jSONObject.put(Q6.H, "1");
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Throwable th2) {
                p0.b("VideoDataReport", th2.getMessage());
            }
        }
    }

    public static void d(com.mbridge.msdk.foundation.entity.n nVar) {
        if (nVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3191e4.h.W, nVar.n());
                jSONObject.put(BidResponsedEx.KEY_CID, nVar.d());
                jSONObject.put("rid", nVar.u());
                jSONObject.put("rid_n", nVar.v());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, nVar.B());
                jSONObject.put("reason", nVar.t());
                jSONObject.put("case", nVar.c());
                jSONObject.put("network_type", nVar.q());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Throwable th2) {
                p0.b("VideoDataReport", th2.getMessage());
            }
        }
    }

    public static void e(com.mbridge.msdk.foundation.entity.n nVar) {
        if (nVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3191e4.h.W, nVar.n());
                jSONObject.put(BidResponsedEx.KEY_CID, nVar.d());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, nVar.B());
                jSONObject.put("network_type", nVar.q());
                jSONObject.put("rid", nVar.u());
                jSONObject.put("rid_n", nVar.v());
                jSONObject.put("reason", nVar.t());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Throwable th2) {
                p0.b("VideoDataReport", th2.getMessage());
            }
        }
    }

    public static String b(com.mbridge.msdk.foundation.entity.n nVar) throws JSONException {
        if (nVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3191e4.h.W, nVar.n());
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, u0.a(nVar.k()));
                jSONObject.put("template", u0.a(nVar.A()));
                jSONObject.put(TtmlNode.TAG_LAYOUT, u0.a(nVar.o()));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, u0.a(nVar.B()));
                jSONObject.put(BidResponsedEx.KEY_CID, u0.a(nVar.d()));
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_str", nVar.r());
                    jSONObject.put("network_type", nVar.q());
                }
                return jSONObject.toString();
            } catch (Exception e10) {
                p0.b("VideoDataReport", e10.getMessage());
                return "";
            }
        }
        return "";
    }

    public static String f(List<com.mbridge.msdk.foundation.entity.n> list) {
        if (list == null) {
            return null;
        }
        try {
            if (list.isEmpty()) {
                return null;
            }
            for (com.mbridge.msdk.foundation.entity.n nVar : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3191e4.h.W, nVar.n());
                jSONObject.put(BidResponsedEx.KEY_CID, nVar.d());
                jSONObject.put("template_url", nVar.z());
                jSONObject.put("reason", nVar.t());
                jSONObject.put("rid", nVar.u());
                jSONObject.put("rid_n", nVar.v());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, nVar.B());
                jSONObject.put("result", nVar.x());
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", nVar.q());
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            }
            return null;
        } catch (Throwable th2) {
            p0.b("VideoDataReport", th2.getMessage());
            return null;
        }
    }

    public static void a(com.mbridge.msdk.foundation.entity.n nVar) throws JSONException {
        if (nVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3191e4.h.W, nVar.n());
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, u0.a(nVar.k()));
                jSONObject.put("template", u0.a(nVar.A()));
                jSONObject.put(TtmlNode.TAG_LAYOUT, u0.a(nVar.o()));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, u0.a(nVar.B()));
                jSONObject.put(BidResponsedEx.KEY_CID, u0.a(nVar.d()));
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_str", nVar.r());
                    jSONObject.put("network_type", nVar.q());
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Exception e10) {
                p0.b("VideoDataReport", e10.getMessage());
            }
        }
    }
}
