package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.ironsource.G5;
import com.ironsource.Q6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.out.Campaign;
import com.vungle.ads.internal.ui.AdActivity;
import java.net.URLEncoder;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final String f40939b = "h";

    /* renamed from: a, reason: collision with root package name */
    private final Context f40940a;

    public h(Context context, int i10) {
        this.f40940a = context;
    }

    public void a(String str, com.mbridge.msdk.foundation.entity.e eVar, String str2) {
        JSONObject jSONObjectA = com.mbridge.msdk.foundation.entity.e.a(eVar);
        if (jSONObjectA != null) {
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObjectA);
        }
    }

    public void b(String str, String str2, String str3, String str4, String str5, boolean z10) throws JSONException {
        try {
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (z10) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, 1);
            }
            jSONObject.put(C3191e4.h.W, URLEncoder.encode("2000066", G5.N));
            jSONObject.put("rid", URLEncoder.encode(str, G5.N));
            jSONObject.put("rid_n", URLEncoder.encode(str2, G5.N));
            jSONObject.put(BidResponsedEx.KEY_CID, URLEncoder.encode(str3, G5.N));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, URLEncoder.encode(str4, G5.N));
            jSONObject.put("err_method", str5);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e10) {
            p0.b(f40939b, e10.getMessage());
        }
    }

    public h(Context context) {
        this.f40940a = context.getApplicationContext();
    }

    public void a(int i10, int i11, String str, String str2, String str3) {
        i.a(this.f40940a, i10, i11, str, str2, str3);
    }

    public void a(String str, String str2, String str3, String str4, String str5, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (z10) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, 1);
            }
            jSONObject.put(C3191e4.h.W, URLEncoder.encode("2000065", G5.N));
            jSONObject.put("rid", URLEncoder.encode(str, G5.N));
            jSONObject.put("rid_n", URLEncoder.encode(str2, G5.N));
            jSONObject.put(BidResponsedEx.KEY_CID, URLEncoder.encode(str3, G5.N));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, URLEncoder.encode(str4, G5.N));
            jSONObject.put(CampaignEx.JSON_KEY_CLICK_URL, URLEncoder.encode(str5, G5.N));
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e10) {
            p0.b(f40939b, e10.getMessage());
        }
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        try {
            int iS = l0.s(this.f40940a);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3191e4.h.W, URLEncoder.encode("2000071", G5.N));
            jSONObject.put("rid", URLEncoder.encode(str, G5.N));
            jSONObject.put("rid_n", URLEncoder.encode(str2, G5.N));
            jSONObject.put(BidResponsedEx.KEY_CID, URLEncoder.encode(str3, G5.N));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, URLEncoder.encode(str4, G5.N));
            jSONObject.put("reason", URLEncoder.encode(str5, G5.N));
            jSONObject.put("network_type", URLEncoder.encode(String.valueOf(iS), G5.N));
            jSONObject.put("result", URLEncoder.encode("0", G5.N));
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e10) {
            p0.b(f40939b, e10.getMessage());
        }
    }

    public void a() {
        try {
            if (j.a()) {
                String strB = com.mbridge.msdk.foundation.controller.c.m().b();
                com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(strB);
                if (gVarD == null) {
                    gVarD = com.mbridge.msdk.setting.h.b().a();
                }
                String strD = com.mbridge.msdk.foundation.tools.f.d();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3191e4.h.W, "2000053");
                jSONObject.put("Appid", strB);
                jSONObject.put("uptips2", gVarD.r0());
                jSONObject.put("info_status", com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().g());
                jSONObject.put("iseu", gVarD.F());
                if (!TextUtils.isEmpty(strD)) {
                    jSONObject.put(Q6.U0, strD);
                }
                jSONObject.put("GDPR_area", gVarD.E0());
                jSONObject.put("GDPR_consent", com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().e());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
                j.c();
            }
        } catch (Throwable th2) {
            p0.b(f40939b, th2.getMessage());
        }
    }

    public void a(int i10, String str) {
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a(j.a((Campaign) null, i10, AdActivity.REQUEST_KEY_EXTRA));
    }

    public void a(String str, String str2, String str3) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_type", "1");
            jSONObject.put(BidResponsedEx.KEY_CID, str);
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            jSONObject.put(C3191e4.h.W, "2000027");
            jSONObject.put("http_url", str3);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e10) {
            p0.b(f40939b, e10.getMessage());
        }
    }
}
