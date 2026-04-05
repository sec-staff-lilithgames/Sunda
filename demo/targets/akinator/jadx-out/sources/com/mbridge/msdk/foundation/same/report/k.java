package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.l0;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class k {
    public static void a(com.mbridge.msdk.foundation.same.net.wrapper.e eVar, Context context) {
    }

    public static JSONObject a(Context context, com.mbridge.msdk.setting.g gVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            String strP = l0.p();
            if (!TextUtils.isEmpty(strP)) {
                jSONObject.put("manufacturer", strP);
            }
            int iM = l0.m();
            if (iM != -1) {
                jSONObject.put("sdkint", iM);
            }
            String strX = l0.x(context);
            if (!TextUtils.isEmpty(strX)) {
                jSONObject.put("is24H", strX);
            }
            String strX2 = l0.x();
            if (!TextUtils.isEmpty(strX2)) {
                jSONObject.put("totalram", strX2);
            }
            String strY = l0.y(context);
            if (!TextUtils.isEmpty(strY)) {
                jSONObject.put("totalmemory", strY);
            }
            jSONObject.put("adid_limit", com.mbridge.msdk.foundation.tools.f.a() + "");
            jSONObject.put("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? "1" : "0");
        }
        if (gVar.s0() == 1 && !TextUtils.isEmpty(com.mbridge.msdk.foundation.tools.f.e()) && com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            jSONObject.put("az_aid_info", com.mbridge.msdk.foundation.tools.f.e());
        }
        return jSONObject;
    }
}
