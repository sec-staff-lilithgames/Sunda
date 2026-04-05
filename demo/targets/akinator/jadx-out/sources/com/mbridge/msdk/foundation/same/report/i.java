package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class i {
    public static void a(Context context, int i10, int i11, String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3191e4.h.W, "2000058");
            jSONObject.put("appid", com.mbridge.msdk.foundation.controller.c.m().b());
            jSONObject.put("dl_type", String.valueOf(i10));
            jSONObject.put("dl_link_type", String.valueOf(i11));
            jSONObject.put("rid", str);
            jSONObject.put("rid_n", str2);
            jSONObject.put(BidResponsedEx.KEY_CID, str3);
            jSONObject.put("tgt_v", l0.w(context));
            jSONObject.put("app_v_n", l0.B(context));
            jSONObject.put("app_v_c", l0.A(context));
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("ReportControllerDiff", e10.getMessage());
            }
        }
    }
}
