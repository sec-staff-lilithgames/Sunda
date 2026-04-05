package com.mbridge.msdk.splash.common;

import android.content.Context;
import com.amazon.device.ads.DTBAdLoader;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.tools.f;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public String f42753e;

    /* renamed from: f, reason: collision with root package name */
    public String f42754f;

    /* renamed from: g, reason: collision with root package name */
    public String f42755g;

    /* renamed from: h, reason: collision with root package name */
    public String f42756h;

    /* renamed from: i, reason: collision with root package name */
    public String f42757i;

    /* renamed from: j, reason: collision with root package name */
    public String f42758j;

    /* renamed from: k, reason: collision with root package name */
    public String f42759k;

    /* renamed from: l, reason: collision with root package name */
    public String f42760l;

    /* renamed from: m, reason: collision with root package name */
    public String f42761m;

    /* renamed from: n, reason: collision with root package name */
    public String f42762n;

    /* renamed from: o, reason: collision with root package name */
    public String f42763o;

    /* renamed from: p, reason: collision with root package name */
    public int f42764p;

    /* renamed from: q, reason: collision with root package name */
    public int f42765q;

    /* renamed from: c, reason: collision with root package name */
    public String f42751c = "android";

    /* renamed from: a, reason: collision with root package name */
    public String f42749a = l0.t();

    /* renamed from: b, reason: collision with root package name */
    public String f42750b = l0.q();

    /* renamed from: d, reason: collision with root package name */
    public String f42752d = f.d();

    public a(Context context) {
        int iS = l0.s(context);
        this.f42753e = String.valueOf(iS);
        this.f42754f = l0.a(context, iS);
        this.f42755g = l0.l(context);
        this.f42756h = com.mbridge.msdk.foundation.controller.c.m().c();
        this.f42757i = com.mbridge.msdk.foundation.controller.c.m().b();
        this.f42758j = String.valueOf(u0.g(context));
        this.f42759k = String.valueOf(u0.f(context));
        this.f42761m = String.valueOf(u0.d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f42760l = "landscape";
        } else {
            this.f42760l = "portrait";
        }
        this.f42762n = l0.u();
        this.f42763o = f.e();
        this.f42764p = f.a();
        this.f42765q = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put(C3191e4.h.G, this.f42749a);
                jSONObject.put("system_version", this.f42750b);
                jSONObject.put("network_type", this.f42753e);
                jSONObject.put("network_type_str", this.f42754f);
                jSONObject.put("device_ua", this.f42755g);
                jSONObject.put("has_wx", l0.D(com.mbridge.msdk.foundation.controller.c.m().d()));
                jSONObject.put("integrated_wx", l0.D());
                jSONObject.put("mnc", l0.r(com.mbridge.msdk.foundation.controller.c.m().d()));
                jSONObject.put("mcc", l0.q(com.mbridge.msdk.foundation.controller.c.m().d()));
                jSONObject.put("adid_limit", this.f42764p);
                jSONObject.put("adid_limit_dev", this.f42765q);
            }
            jSONObject.put("plantform", this.f42751c);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f42752d);
                jSONObject.put("az_aid_info", this.f42763o);
            }
            jSONObject.put(DTBAdLoader.APS_VIDEO_APP_KEY, this.f42756h);
            jSONObject.put("appId", this.f42757i);
            jSONObject.put("screen_width", this.f42758j);
            jSONObject.put("screen_height", this.f42759k);
            jSONObject.put("orientation", this.f42760l);
            jSONObject.put("scale", this.f42761m);
            if (l0.y() != 0) {
                jSONObject.put("tun", l0.y());
            }
            jSONObject.put(InneractiveMediationDefs.GENDER_FEMALE, this.f42762n);
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
            return jSONObject;
        } catch (JSONException e10) {
            p0.b("BaseDeviceInfo", e10.getMessage());
            return jSONObject;
        }
    }
}
