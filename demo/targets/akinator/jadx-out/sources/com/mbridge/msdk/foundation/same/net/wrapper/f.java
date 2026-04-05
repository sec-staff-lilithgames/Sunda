package com.mbridge.msdk.foundation.same.net.wrapper;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.device.ads.DtbDeviceData;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.Q6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.s0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class f {
    public static void a(e eVar, Context context) {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            eVar.a("withGP", l0.C() + "");
            eVar.a("has_wx", l0.D(context) + "");
            eVar.a("integrated_wx", l0.D() + "");
            eVar.a("opensdk_ver", l0.B() + "");
            eVar.a("wx_api_ver", l0.e(com.mbridge.msdk.foundation.controller.c.m().i()) + "");
            eVar.a("mnc", l0.r(com.mbridge.msdk.foundation.controller.c.m().d()));
            eVar.a("mcc", l0.q(com.mbridge.msdk.foundation.controller.c.m().d()));
            String strJ = l0.j();
            if (!TextUtils.isEmpty(strJ)) {
                eVar.a("hardware", strJ);
            }
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().d() == 1) {
                eVar.a("dnt", "1");
            }
            eVar.a(e.f40874f, com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c() + "");
            eVar.a("adid_limit", com.mbridge.msdk.foundation.tools.f.a() + "");
            eVar.a("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? "1" : "0");
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
            eVar.a(e.f40872d, s0.c() + "");
            eVar.a(e.f40873e, s0.a() + "");
            eVar.a(e.f40878j, l0.u());
        }
        eVar.a("pkg_source", l0.a(l0.t(context), context));
        if (com.mbridge.msdk.foundation.controller.c.m().j() != null) {
            eVar.a("web_env", com.mbridge.msdk.foundation.controller.c.m().j().toString());
        }
        eVar.a("http_req", "2");
        g.a(eVar, context);
        g(eVar);
    }

    public static void b(e eVar) {
        eVar.a("api_version", com.mbridge.msdk.foundation.same.a.f40707d);
    }

    public static void c(e eVar) {
        String str = com.mbridge.msdk.util.c.f44149b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        eVar.a("cronet_env", str);
    }

    public static void d(e eVar) {
        eVar.a("dyview_type", com.mbridge.msdk.foundation.same.a.f40726w);
    }

    public static void e(e eVar) {
        com.mbridge.msdk.setting.g gVarF = com.google.android.gms.internal.play_billing.a.f(com.mbridge.msdk.setting.h.b());
        if (gVarF == null) {
            gVarF = com.mbridge.msdk.setting.h.b().a();
        }
        if (gVarF.D() == 1) {
            eVar.a(InMobiSdk.IM_GDPR_CONSENT_IAB, com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().e() + "");
        } else if (gVarF.E0()) {
            eVar.a(InMobiSdk.IM_GDPR_CONSENT_IAB, com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().e() + "");
        }
        String strF = com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().f();
        if (TextUtils.isEmpty(strF)) {
            return;
        }
        eVar.a("tc_string", strF);
    }

    public static void f(e eVar) {
        try {
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                com.mbridge.msdk.foundation.same.a.V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                eVar.a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f40710g)) {
                com.mbridge.msdk.foundation.same.a.f40710g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f40710g)) {
                return;
            }
            eVar.a(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, com.mbridge.msdk.foundation.same.a.f40710g);
        } catch (Exception e10) {
            p0.b("CommonRequestParamsForAdd", e10.getMessage());
        }
    }

    public static void g(e eVar) {
        a(eVar, true);
        i(eVar);
        f(eVar);
        e(eVar);
        a(eVar);
        c(eVar);
        g.a(eVar);
    }

    public static void h(e eVar) {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            eVar.a("withGP", l0.C() + "");
            eVar.a("has_wx", l0.D(com.mbridge.msdk.foundation.controller.c.m().d()) + "");
            eVar.a("integrated_wx", l0.D() + "");
            eVar.a("opensdk_ver", l0.B() + "");
            eVar.a("wx_api_ver", l0.e(com.mbridge.msdk.foundation.controller.c.m().i()) + "");
            eVar.a("mnc", l0.r(com.mbridge.msdk.foundation.controller.c.m().d()));
            eVar.a("mcc", l0.q(com.mbridge.msdk.foundation.controller.c.m().d()));
            String strJ = l0.j();
            if (!TextUtils.isEmpty(strJ)) {
                eVar.a("hardware", strJ);
            }
            eVar.a("adid_limit", com.mbridge.msdk.foundation.tools.f.a() + "");
            eVar.a("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? "1" : "0");
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
            eVar.a(e.f40878j, l0.u());
        }
        g.b(eVar);
        a(eVar, false);
        i(eVar);
        f(eVar);
        a(eVar);
        c(eVar);
    }

    public static void i(e eVar) {
        int iA = l0.A();
        if (iA != -1) {
            eVar.a("unknown_source", iA + "");
        }
    }

    public static void j(e eVar) {
        if (l0.y() == 0) {
            return;
        }
        eVar.a("tun", l0.y() + "");
    }

    public static void k(e eVar) {
        if (eVar != null) {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                eVar.a("model");
                eVar.a("brand");
                eVar.a("screen_size");
                eVar.a("sub_ip");
                eVar.a("network_type");
                eVar.a("useragent");
                eVar.a(Q6.f35252d0);
                eVar.a(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY);
                eVar.a("network_str");
                eVar.a("os_version");
                eVar.a("country_code");
                eVar.a("cronet_env");
                eVar.a("adid_limit");
                eVar.a("adid_limit_dev");
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
                eVar.a(e.f40872d);
                eVar.a(e.f40873e);
                eVar.a("power_rate");
                eVar.a("charging");
                eVar.a("timezone");
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                eVar.a(Q6.U0);
                eVar.a("gaid2");
                eVar.a("az_aid_info");
            }
            g.c(eVar);
        }
    }

    public static void a(e eVar, boolean z10) {
        com.mbridge.msdk.setting.g gVarF = com.google.android.gms.internal.play_billing.a.f(com.mbridge.msdk.setting.h.b());
        Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
        if (gVarF != null) {
            if (!TextUtils.isEmpty(gVarF.a()) && z10) {
                eVar.a("a_stid", gVarF.a());
            }
            try {
                g.a(eVar, contextD, z10, gVarF);
            } catch (Exception e10) {
                p0.b("CommonRequestParamsForAdd", e10.getMessage());
            }
        }
    }

    public static void a(e eVar) {
        String strB = com.mbridge.msdk.foundation.tools.f.b();
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        eVar.a("az_aid_info", strB);
    }
}
