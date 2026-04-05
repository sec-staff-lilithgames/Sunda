package com.mbridge.msdk.foundation.same.net.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.m;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.r0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.tracker.network.toolbox.i;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.u;
import com.mbridge.msdk.tracker.x;
import cv.BLca.YsiBvdpw;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class d {
    public String A;
    private String B;
    public String C;
    public String D;
    private String E;
    public String F;
    private String G;
    public String H;
    private String I;
    public String J;
    public String K;
    private String L;
    public String M;
    private String N;
    public String O;
    private String P;
    public String Q;
    public String R;
    private String S;
    public String T;
    public String U;
    private String V;
    public String W;
    public String X;
    private String Y;
    public String Z;

    /* renamed from: a, reason: collision with root package name */
    private final String f40837a;

    /* renamed from: a0, reason: collision with root package name */
    private String f40838a0;

    /* renamed from: b, reason: collision with root package name */
    public String f40839b;

    /* renamed from: b0, reason: collision with root package name */
    public String f40840b0;

    /* renamed from: c, reason: collision with root package name */
    public String f40841c;

    /* renamed from: c0, reason: collision with root package name */
    private String f40842c0;

    /* renamed from: d, reason: collision with root package name */
    public String f40843d;

    /* renamed from: d0, reason: collision with root package name */
    public String f40844d0;

    /* renamed from: e, reason: collision with root package name */
    public String f40845e;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f40846e0;

    /* renamed from: f, reason: collision with root package name */
    public String f40847f;

    /* renamed from: f0, reason: collision with root package name */
    private int f40848f0;

    /* renamed from: g, reason: collision with root package name */
    public String f40849g;

    /* renamed from: h, reason: collision with root package name */
    public String f40850h;

    /* renamed from: i, reason: collision with root package name */
    public String f40851i;

    /* renamed from: j, reason: collision with root package name */
    public String f40852j;

    /* renamed from: k, reason: collision with root package name */
    public String f40853k;

    /* renamed from: l, reason: collision with root package name */
    public String f40854l;

    /* renamed from: m, reason: collision with root package name */
    public String f40855m;

    /* renamed from: n, reason: collision with root package name */
    public int f40856n;

    /* renamed from: o, reason: collision with root package name */
    public int f40857o;

    /* renamed from: p, reason: collision with root package name */
    public int f40858p;

    /* renamed from: q, reason: collision with root package name */
    public int f40859q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f40860r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f40861s;

    /* renamed from: t, reason: collision with root package name */
    public int f40862t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList<String> f40863u;

    /* renamed from: v, reason: collision with root package name */
    public int f40864v;

    /* renamed from: w, reason: collision with root package name */
    public int f40865w;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList<String> f40866x;

    /* renamed from: y, reason: collision with root package name */
    public String f40867y;

    /* renamed from: z, reason: collision with root package name */
    private String f40868z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final d f40869a = new d();
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(https|http)://[-A-Za-z0-9{}+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str.trim()).matches();
    }

    private void b() {
        this.M = this.f40847f + this.L;
    }

    private void c() {
        this.A = this.f40867y + this.f40868z;
        this.H = this.f40867y + this.G;
        i.b().f(this.f40867y);
    }

    public static d h() {
        return b.f40869a;
    }

    public void d(int i10) {
        this.f40848f0 = i10;
    }

    public void e() {
        this.Q = this.f40851i + this.P;
        this.C = this.f40851i + this.B;
        this.T = this.f40851i + this.S;
        this.J = this.f40851i + this.I;
        this.W = this.f40851i + this.V;
    }

    public void f() {
        this.R = this.f40855m + this.P;
        this.D = this.f40855m + this.B;
        this.U = this.f40855m + this.S;
        this.K = this.f40855m + this.I;
        this.X = this.f40855m + this.V;
    }

    public boolean g() {
        try {
            if (this.f40861s) {
                ArrayList<String> arrayList = this.f40866x;
                if (arrayList != null && this.f40865w <= arrayList.size() - 1) {
                    if (!a(this.f40866x.get(this.f40865w))) {
                        this.f40855m = this.f40866x.get(this.f40865w);
                        f();
                    }
                    return true;
                }
            } else {
                ArrayList<String> arrayList2 = this.f40863u;
                if (arrayList2 != null && this.f40864v <= arrayList2.size() - 1) {
                    this.f40851i = this.f40863u.get(this.f40864v);
                    e();
                    return true;
                }
            }
            if (this.f40860r) {
                this.f40864v = 0;
                this.f40865w = 0;
            }
            return false;
        } catch (Throwable th2) {
            p0.a("RequestUrlUtil", th2.getMessage());
            return false;
        }
    }

    public int i() {
        return this.f40848f0;
    }

    public void j() {
        HashMap<String, String> mapC;
        g gVarF = com.google.android.gms.internal.play_billing.a.f(h.b());
        if (gVarF != null) {
            com.mbridge.msdk.setting.a aVarJ = gVarF.j();
            if (aVarJ != null) {
                this.f40854l = aVarJ.f();
                this.f40858p = aVarJ.g();
                this.f40850h = aVarJ.e();
                a();
            }
            com.mbridge.msdk.setting.d dVarY = gVarF.y();
            if (dVarY != null) {
                this.f40853k = dVarY.d();
                this.f40857o = dVarY.e();
                this.f40847f = dVarY.c();
                b();
                a(gVarF);
            }
            this.f40861s = gVarF.n0() == 2;
            this.f40862t = gVarF.n0();
            a(!gVarF.b(2));
            if (gVarF.C() != null && gVarF.C().size() > 0 && (mapC = gVarF.C()) != null && mapC.size() > 0) {
                if (mapC.containsKey(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION) && !TextUtils.isEmpty(mapC.get(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION)) && a(mapC.get(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION))) {
                    this.f40845e = mapC.get(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION);
                    d();
                }
                if (mapC.containsKey(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(mapC.get(CampaignEx.JSON_KEY_HB)) && a(mapC.get(CampaignEx.JSON_KEY_HB))) {
                    this.f40867y = mapC.get(CampaignEx.JSON_KEY_HB);
                    c();
                }
                if (mapC.containsKey("lg") && !TextUtils.isEmpty(mapC.get("lg"))) {
                    String str = mapC.get("lg");
                    if (a(str)) {
                        this.f40843d = str;
                    } else {
                        this.f40852j = str;
                    }
                }
                if (mapC.containsKey("lgt") && !TextUtils.isEmpty(mapC.get("lgt"))) {
                    String str2 = mapC.get("lgt");
                    if (a(str2)) {
                        String strB = b(str2);
                        if (!TextUtils.isEmpty(strB)) {
                            this.f40852j = strB;
                        }
                    } else {
                        this.f40852j = str2;
                    }
                }
            }
            String strU = gVarF.u();
            if (!TextUtils.isEmpty(strU)) {
                this.f40851i = strU;
                e();
                this.f40863u.add(0, strU);
            }
            String strV = gVarF.v();
            if (TextUtils.isEmpty(strV)) {
                return;
            }
            this.f40855m = strV;
            f();
            this.f40866x.add(0, strV);
        }
    }

    private d() {
        this.f40837a = "RequestUrlUtil";
        this.f40839b = DomainNameUtils.getInstance().DEFAULT_HOST_APPLETS;
        this.f40841c = DomainNameUtils.getInstance().DEFAULT_CDN_SPARE_SETTING_URL;
        this.f40843d = DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS;
        this.f40845e = DomainNameUtils.getInstance().DEFAULT_HOST_API;
        this.f40847f = DomainNameUtils.getInstance().DEFAULT_HOST_MONITOR_DEFAULT;
        this.f40849g = DomainNameUtils.getInstance().DEFAULT_HOST_PRIVACY;
        this.f40850h = DomainNameUtils.getInstance().DEFAULT_HOST_REVENUE_DEFAULT;
        this.f40851i = DomainNameUtils.getInstance().DEFAULT_HOST_SETTING;
        this.f40852j = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_ANALYTICS;
        this.f40853k = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_MONITOR;
        this.f40854l = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_REVENUE;
        this.f40855m = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_SETTING;
        this.f40856n = 9377;
        this.f40857o = 9377;
        this.f40858p = 9988;
        this.f40859q = 9377;
        this.f40860r = false;
        this.f40861s = false;
        this.f40862t = 1;
        this.f40863u = DomainNameUtils.getInstance().SPARE_SETTING_HOST;
        this.f40864v = 0;
        this.f40865w = 0;
        this.f40866x = DomainNameUtils.getInstance().SPARE_TCP_SETTING_HOST;
        this.f40867y = DomainNameUtils.getInstance().DEFAULT_HB_HOST;
        this.f40868z = "/bid";
        this.A = this.f40867y + this.f40868z;
        this.B = "/sdk/customid";
        this.C = this.f40851i + this.B;
        this.D = this.f40855m + this.B;
        this.E = "/image";
        this.F = this.f40845e + this.E;
        this.G = "/load";
        this.H = this.f40867y + this.G;
        this.I = "/mapping";
        this.J = this.f40851i + this.I;
        this.K = this.f40855m + this.I;
        this.L = "";
        this.M = this.f40850h + this.L;
        this.N = YsiBvdpw.rWsCIbDTckyl;
        this.O = this.f40850h + this.N;
        this.P = "/setting";
        this.Q = this.f40851i + this.P;
        this.R = this.f40855m + this.P;
        this.S = "/rewardsetting";
        this.T = this.f40851i + this.S;
        this.U = this.f40855m + this.S;
        this.V = "/appwall/setting";
        this.W = this.f40851i + this.V;
        this.X = this.f40855m + this.V;
        this.Y = "/openapi/ad/v3";
        this.Z = this.f40845e + this.Y;
        this.f40838a0 = "/openapi/ad/v4";
        this.f40840b0 = this.f40845e + this.f40838a0;
        this.f40842c0 = "/openapi/ad/v5";
        this.f40844d0 = this.f40845e + this.f40842c0;
        this.f40846e0 = true;
        this.f40848f0 = 0;
    }

    private String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Uri.parse(str).getHost();
        } catch (Throwable th2) {
            p0.b("RequestUrlUtil", th2.getMessage());
            return "";
        }
    }

    private void d() {
        this.Z = this.f40845e + this.Y;
        this.f40840b0 = this.f40845e + this.f40838a0;
        this.f40844d0 = this.f40845e + this.f40842c0;
        this.F = this.f40845e + this.E;
    }

    public void c(int i10) {
        this.f40859q = i10;
    }

    public String a(String str, int i10) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split("_");
                if (strArrSplit.length > 1) {
                    return a(true, strArrSplit[1]);
                }
                return a(true, "");
            }
        } catch (Exception e10) {
            p0.b("RequestUrlUtil", e10.getMessage());
        }
        return i10 % 2 == 0 ? this.f40844d0 : this.Z;
    }

    public void b(int i10) {
        this.f40856n = i10;
    }

    public String a(boolean z10, String str) {
        if (z10) {
            if (this.H.contains("{}") && !TextUtils.isEmpty(str)) {
                return this.H.replace("{}", str + "-");
            }
            return this.H.replace("{}", "");
        }
        return this.A.replace("{}", "");
    }

    public void a(boolean z10) {
        this.f40846e0 = z10;
    }

    private void a() {
        this.O = this.f40850h + this.N;
    }

    private void a(g gVar) {
        com.mbridge.msdk.setting.d dVarY;
        if (gVar == null || (dVarY = gVar.y()) == null || dVarY.a() == 1) {
            return;
        }
        int iB = r0.a().b("monitor", "type", r0.a().b("t_r_t", 1));
        if (iB != 0 && iB != 1) {
            iB = 0;
        }
        u.a().a(com.mbridge.msdk.foundation.controller.c.m().d(), new x.b().a(new com.mbridge.msdk.foundation.same.report.d()).a(new n()).a(iB, a(iB)).a(r0.a().b(QCmNMSGd.QVDXI, 604800000)).b(r0.a().b("t_m_e_s", 50)).d(r0.a().b("t_m_r_c", 50)).c(r0.a().b("t_m_t", 15000)).e(r0.a().b("t_m_r_t_s", 1)).a(), dVarY.b() * 1000, com.mbridge.msdk.foundation.same.report.c.b());
    }

    private p a(int i10) {
        if (i10 == 1) {
            return new p(new m((byte) 2), h().f40853k, h().f40857o);
        }
        return new p(new com.mbridge.msdk.tracker.network.toolbox.h(), h().M, 0);
    }
}
