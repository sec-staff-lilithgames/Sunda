package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.tools.j0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {
    public static JSONObject a() throws JSONException {
        JSONObject jSONObject;
        Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
        try {
            jSONObject = j.a(contextD).c();
        } catch (Exception e10) {
            p0.b("CommonDeviceInfo", "getCommonProperty error", e10);
            jSONObject = null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                com.mbridge.msdk.foundation.same.a.V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f40710g)) {
                com.mbridge.msdk.foundation.same.a.f40710g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f40710g)) {
                jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, com.mbridge.msdk.foundation.same.a.f40710g);
            }
            jSONObject.put("open", com.mbridge.msdk.foundation.same.a.S);
            String strA = Aa.a();
            if (strA == null) {
                strA = "";
            }
            jSONObject.put("channel", strA);
            jSONObject.put("band_width", com.mbridge.msdk.foundation.same.net.a.b().a());
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                jSONObject.put("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.m().b());
            if (gVarD == null) {
                gVarD = com.mbridge.msdk.setting.h.b().a();
            }
            JSONObject jSONObjectA = a(gVarD);
            if (jSONObjectA != null) {
                String string = jSONObjectA.toString();
                if (!TextUtils.isEmpty(string)) {
                    String strB = j0.b(string);
                    if (!TextUtils.isEmpty(strB)) {
                        jSONObject.put("dvi", strB);
                    }
                }
            }
            jSONObject.put("app_id", com.mbridge.msdk.foundation.controller.c.m().b());
            jSONObject.put("m_sdk", "msdk");
            jSONObject.put("lqswt", String.valueOf(1));
            jSONObject.put("network_available", String.valueOf(u0.m(contextD)));
            String strK = "UNKNOWN";
            if (gVarD != null) {
                strK = gVarD.k();
                jSONObject.put("a_stid", gVarD.a());
            }
            jSONObject.put("country_code", strK);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONObject a(com.mbridge.msdk.setting.g gVar) {
        try {
            return j.a(com.mbridge.msdk.foundation.controller.c.m().d(), gVar);
        } catch (Exception unused) {
            return null;
        }
    }
}
