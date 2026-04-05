package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.device.ads.DTBAdLoader;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public int f41077a;

    /* renamed from: b, reason: collision with root package name */
    public int f41078b;

    /* renamed from: c, reason: collision with root package name */
    public String f41079c;

    /* renamed from: d, reason: collision with root package name */
    public String f41080d;

    /* renamed from: e, reason: collision with root package name */
    public String f41081e;

    /* renamed from: f, reason: collision with root package name */
    public String f41082f;

    /* renamed from: g, reason: collision with root package name */
    public String f41083g;

    /* renamed from: h, reason: collision with root package name */
    public String f41084h;

    /* renamed from: j, reason: collision with root package name */
    public String f41086j;

    /* renamed from: k, reason: collision with root package name */
    public String f41087k;

    /* renamed from: m, reason: collision with root package name */
    public int f41089m;

    /* renamed from: n, reason: collision with root package name */
    public String f41090n;

    /* renamed from: o, reason: collision with root package name */
    public String f41091o;

    /* renamed from: p, reason: collision with root package name */
    public String f41092p;

    /* renamed from: r, reason: collision with root package name */
    public String f41094r;

    /* renamed from: s, reason: collision with root package name */
    public String f41095s;

    /* renamed from: t, reason: collision with root package name */
    public String f41096t;

    /* renamed from: v, reason: collision with root package name */
    public String f41098v;

    /* renamed from: q, reason: collision with root package name */
    public String f41093q = "android";

    /* renamed from: i, reason: collision with root package name */
    public String f41085i = l0.t();

    /* renamed from: u, reason: collision with root package name */
    public String f41097u = l0.q();

    /* renamed from: l, reason: collision with root package name */
    public String f41088l = f.d();

    public d(Context context) {
        int iS = l0.s(context);
        this.f41090n = String.valueOf(iS);
        this.f41091o = l0.a(context, iS);
        this.f41086j = l0.l(context);
        this.f41081e = com.mbridge.msdk.foundation.controller.c.m().c();
        this.f41080d = com.mbridge.msdk.foundation.controller.c.m().b();
        this.f41096t = String.valueOf(u0.g(context));
        this.f41095s = String.valueOf(u0.f(context));
        this.f41094r = String.valueOf(u0.d(context));
        this.f41098v = com.mbridge.msdk.foundation.controller.c.m().j().toString();
        this.f41083g = l0.s();
        this.f41089m = u0.a();
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f41092p = "landscape";
        } else {
            this.f41092p = "portrait";
        }
        this.f41082f = com.mbridge.msdk.foundation.same.a.V;
        this.f41084h = com.mbridge.msdk.foundation.same.a.f40710g;
        this.f41087k = l0.u();
        this.f41079c = f.e();
        this.f41077a = f.a();
        this.f41078b = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put(C3191e4.h.G, this.f41085i);
                jSONObject.put("system_version", this.f41097u);
                jSONObject.put("network_type", this.f41090n);
                jSONObject.put("network_type_str", this.f41091o);
                jSONObject.put("device_ua", this.f41086j);
                jSONObject.put("has_wx", l0.D(com.mbridge.msdk.foundation.controller.c.m().d()));
                jSONObject.put("integrated_wx", l0.D());
                jSONObject.put("opensdk_ver", l0.B() + "");
                jSONObject.put("wx_api_ver", l0.e(com.mbridge.msdk.foundation.controller.c.m().i()) + "");
                jSONObject.put("brand", this.f41083g);
                jSONObject.put("mnc", l0.r(com.mbridge.msdk.foundation.controller.c.m().d()));
                jSONObject.put("mcc", l0.q(com.mbridge.msdk.foundation.controller.c.m().d()));
                jSONObject.put("adid_limit", this.f41077a);
                jSONObject.put("adid_limit_dev", this.f41078b);
            }
            jSONObject.put("plantform", this.f41093q);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f41088l);
                jSONObject.put(KGUkpTlXZlJLy.jipu, this.f41079c);
            }
            jSONObject.put(DTBAdLoader.APS_VIDEO_APP_KEY, this.f41081e);
            jSONObject.put("appId", this.f41080d);
            jSONObject.put("screen_width", this.f41096t);
            jSONObject.put("screen_height", this.f41095s);
            jSONObject.put("orientation", this.f41092p);
            jSONObject.put("scale", this.f41094r);
            jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, this.f41082f);
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, this.f41084h);
            jSONObject.put("web_env", this.f41098v);
            jSONObject.put(InneractiveMediationDefs.GENDER_FEMALE, this.f41087k);
            jSONObject.put("misk_spt", this.f41089m);
            if (l0.y() != 0) {
                jSONObject.put("tun", l0.y());
            }
            jSONObject.put(com.mbridge.msdk.foundation.same.net.wrapper.e.f40874f, com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c() + "");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adid_limit", this.f41077a);
                jSONObject2.put("adid_limit_dev", this.f41078b);
                jSONObject.put("dvi", j0.b(jSONObject2.toString()));
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                jSONObject.put("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }
}
