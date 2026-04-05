package com.mbridge.msdk.advanced.common;

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
/* loaded from: classes4.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public String f39419e;

    /* renamed from: f, reason: collision with root package name */
    public String f39420f;

    /* renamed from: g, reason: collision with root package name */
    public String f39421g;

    /* renamed from: h, reason: collision with root package name */
    public String f39422h;

    /* renamed from: i, reason: collision with root package name */
    public String f39423i;

    /* renamed from: j, reason: collision with root package name */
    public String f39424j;

    /* renamed from: k, reason: collision with root package name */
    public String f39425k;

    /* renamed from: l, reason: collision with root package name */
    public String f39426l;

    /* renamed from: m, reason: collision with root package name */
    public String f39427m;

    /* renamed from: n, reason: collision with root package name */
    public String f39428n;

    /* renamed from: o, reason: collision with root package name */
    public String f39429o;

    /* renamed from: p, reason: collision with root package name */
    public int f39430p;

    /* renamed from: q, reason: collision with root package name */
    public int f39431q;

    /* renamed from: c, reason: collision with root package name */
    public String f39417c = "android";

    /* renamed from: a, reason: collision with root package name */
    public String f39415a = l0.t();

    /* renamed from: b, reason: collision with root package name */
    public String f39416b = l0.q();

    /* renamed from: d, reason: collision with root package name */
    public String f39418d = f.d();

    public a(Context context) {
        int iS = l0.s(context);
        this.f39419e = String.valueOf(iS);
        this.f39420f = l0.a(context, iS);
        this.f39421g = l0.l(context);
        this.f39422h = com.mbridge.msdk.foundation.controller.c.m().c();
        this.f39423i = com.mbridge.msdk.foundation.controller.c.m().b();
        this.f39424j = String.valueOf(u0.g(context));
        this.f39425k = String.valueOf(u0.f(context));
        this.f39427m = String.valueOf(u0.d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f39426l = "landscape";
        } else {
            this.f39426l = "portrait";
        }
        this.f39428n = l0.u();
        this.f39429o = f.e();
        this.f39430p = f.a();
        this.f39431q = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put(C3191e4.h.G, this.f39415a);
                jSONObject.put("system_version", this.f39416b);
                jSONObject.put("network_type", this.f39419e);
                jSONObject.put("network_type_str", this.f39420f);
                jSONObject.put("device_ua", this.f39421g);
                jSONObject.put("has_wx", l0.D(com.mbridge.msdk.foundation.controller.c.m().d()));
                jSONObject.put("integrated_wx", l0.D());
                jSONObject.put("opensdk_ver", l0.B() + "");
                jSONObject.put("wx_api_ver", l0.e(com.mbridge.msdk.foundation.controller.c.m().i()) + "");
                jSONObject.put("mnc", l0.r(com.mbridge.msdk.foundation.controller.c.m().d()));
                jSONObject.put("mcc", l0.q(com.mbridge.msdk.foundation.controller.c.m().d()));
                jSONObject.put("adid_limit", this.f39430p);
                jSONObject.put("adid_limit_dev", this.f39431q);
            }
            jSONObject.put("plantform", this.f39417c);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f39418d);
                jSONObject.put("az_aid_info", this.f39429o);
            }
            jSONObject.put(DTBAdLoader.APS_VIDEO_APP_KEY, this.f39422h);
            jSONObject.put("appId", this.f39423i);
            jSONObject.put("screen_width", this.f39424j);
            jSONObject.put("screen_height", this.f39425k);
            jSONObject.put("orientation", this.f39426l);
            jSONObject.put("scale", this.f39427m);
            if (l0.y() != 0) {
                jSONObject.put("tun", l0.y());
            }
            jSONObject.put(InneractiveMediationDefs.GENDER_FEMALE, this.f39428n);
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
