package com.mbridge.msdk.click.utils;

import android.content.Context;
import android.webkit.URLUtil;
import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.n0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f39818a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static int f39819b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static int f39820c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static int f39821d = 1500;

    public static boolean a(CampaignEx campaignEx, String str, int i10) {
        if (campaignEx != null && campaignEx.getTpOffer() == 1) {
            z = campaignEx.getFac() != 0;
            b(campaignEx, str, i10);
        }
        return z;
    }

    private static void b(CampaignEx campaignEx, String str, int i10) {
        try {
            Context contextD = c.m().d();
            if (contextD == null || campaignEx == null) {
                return;
            }
            if (URLUtil.isFileUrl(str)) {
                File file = new File(str.replace("file:////", "").replace("file:///", "").replace(AdPayload.FILE_SCHEME, ""));
                if (file.exists()) {
                    str = n0.e(file);
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3191e4.h.W, "2000109");
            jSONObject.put("type", i10);
            jSONObject.put("html", str);
            jSONObject.put("network_type", l0.s(contextD));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, campaignEx.getCampaignUnitId());
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
            if (campaignEx.isBidCampaign()) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, 1);
            }
            jSONObject.put("op", i10 == 3 ? 2 : 1);
            jSONObject.put(CampaignEx.JSON_KEY_FAC, campaignEx.getFac());
            d.b().a(jSONObject);
        } catch (Throwable th2) {
            p0.b("DspFilterUtils", th2.getMessage());
        }
    }
}
