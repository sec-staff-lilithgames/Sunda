package com.mbridge.msdk.mbbanner.controll;

import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.d1;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.mbbanner.common.manager.c;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: x, reason: collision with root package name */
    private static String f41549x = "BannerController";

    /* renamed from: a, reason: collision with root package name */
    private String f41550a;

    /* renamed from: b, reason: collision with root package name */
    private String f41551b;

    /* renamed from: c, reason: collision with root package name */
    private String f41552c;

    /* renamed from: d, reason: collision with root package name */
    private MBridgeIds f41553d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f41554e;

    /* renamed from: f, reason: collision with root package name */
    private int f41555f;

    /* renamed from: g, reason: collision with root package name */
    private MBBannerView f41556g;

    /* renamed from: h, reason: collision with root package name */
    private int f41557h;

    /* renamed from: i, reason: collision with root package name */
    private int f41558i;

    /* renamed from: j, reason: collision with root package name */
    private int f41559j;

    /* renamed from: l, reason: collision with root package name */
    private BannerAdListener f41561l;

    /* renamed from: m, reason: collision with root package name */
    private CampaignUnit f41562m;

    /* renamed from: n, reason: collision with root package name */
    private c f41563n;

    /* renamed from: o, reason: collision with root package name */
    private l f41564o;

    /* renamed from: p, reason: collision with root package name */
    private j f41565p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f41566q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f41567r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f41568s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f41569t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f41570u;

    /* renamed from: k, reason: collision with root package name */
    private int f41560k = -1;

    /* renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.c f41571v = new C0288a();

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.b f41572w = new b();

    public a(MBBannerView mBBannerView, BannerSize bannerSize, String str, String str2) {
        this.f41556g = mBBannerView;
        if (bannerSize != null) {
            this.f41557h = bannerSize.getHeight();
            this.f41558i = bannerSize.getWidth();
        }
        this.f41550a = str2;
        str = TextUtils.isEmpty(str) ? "" : str;
        this.f41551b = str;
        this.f41553d = new MBridgeIds(str, this.f41550a);
        f();
    }

    private int a(int i10) {
        if (i10 > 0) {
            if (i10 < 10) {
                return 10;
            }
            if (i10 > 180) {
                return 180;
            }
        }
        return i10;
    }

    private void l() {
        l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.m().b(), this.f41550a);
        this.f41564o = lVarE;
        if (lVarE == null) {
            this.f41564o = l.i(this.f41550a);
        }
        if (this.f41560k == -1) {
            this.f41559j = a(this.f41564o.D());
        }
        if (this.f41555f == 0) {
            boolean z10 = this.f41564o.g() == 1;
            this.f41554e = z10;
            c cVar = this.f41563n;
            if (cVar != null) {
                cVar.c(z10);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements com.mbridge.msdk.mbbanner.common.listener.b {
        public b() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void a(String str, CampaignUnit campaignUnit, boolean z10) {
            a.this.f41562m = campaignUnit;
            a.this.a(1, (com.mbridge.msdk.foundation.error.b) null);
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void b(com.mbridge.msdk.foundation.error.b bVar) {
            a.this.a(bVar.f(), bVar);
            a.this.c();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void a(com.mbridge.msdk.foundation.error.b bVar) {
            a.this.a(2, bVar);
            a.this.a(bVar.f(), bVar);
            a.this.c();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void a(String str, int i10, boolean z10) {
            if (a.this.f41556g != null) {
                a.this.f41569t = true;
                a.this.j();
            }
        }
    }

    private boolean a(View view) {
        return true;
    }

    private void f() {
        b(com.mbridge.msdk.foundation.controller.c.m().b(), com.mbridge.msdk.foundation.controller.c.m().c());
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f41568s || !this.f41569t) {
            return;
        }
        if (!a(this.f41556g)) {
            a(new com.mbridge.msdk.foundation.error.b(880044));
        } else if (this.f41562m != null) {
            if (this.f41563n == null) {
                this.f41563n = new c(this.f41556g, this.f41571v, this.f41551b, this.f41550a, this.f41554e, this.f41564o);
            }
            this.f41563n.a(this.f41552c);
            this.f41563n.b(this.f41566q);
            this.f41563n.d(this.f41567r);
            this.f41563n.a(this.f41554e, this.f41555f);
            this.f41563n.b(this.f41562m);
        } else {
            a(new com.mbridge.msdk.foundation.error.b(880043));
        }
        this.f41569t = false;
    }

    private void k() {
        MBBannerView mBBannerView = this.f41556g;
        if (mBBannerView != null) {
            if (!this.f41566q || !this.f41567r || this.f41570u || d1.a(mBBannerView, 1)) {
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(2, this.f41551b, this.f41550a, null, null);
            } else {
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(3, this.f41551b, this.f41550a, new com.mbridge.msdk.mbbanner.common.data.a(this.f41558i + "x" + this.f41557h, this.f41559j * 1000), this.f41572w);
            }
            if (this.f41566q) {
                return;
            }
            com.mbridge.msdk.mbbanner.common.manager.a.b().a(4, this.f41551b, this.f41550a, null, null);
            com.mbridge.msdk.mbbanner.common.manager.a.b().b(this.f41550a);
        }
    }

    public void c() {
        if (this.f41568s) {
            return;
        }
        k();
        l();
        com.mbridge.msdk.mbbanner.common.data.a aVar = new com.mbridge.msdk.mbbanner.common.data.a(this.f41558i + "x" + this.f41557h, this.f41559j * 1000);
        aVar.c(this.f41551b);
        aVar.a(true);
        aVar.b(com.mbridge.msdk.mbbanner.common.report.a.b(""));
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(this.f41551b, this.f41550a, aVar, this.f41572w);
    }

    public String d() {
        CampaignUnit campaignUnit = this.f41562m;
        return campaignUnit != null ? com.mbridge.msdk.foundation.same.c.b(campaignUnit.getAds()) : "";
    }

    public String e() {
        CampaignUnit campaignUnit = this.f41562m;
        return (campaignUnit == null || campaignUnit.getRequestId() == null) ? "" : this.f41562m.getRequestId();
    }

    public void g() {
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(4, this.f41551b, this.f41550a, new com.mbridge.msdk.mbbanner.common.data.a(this.f41558i + "x" + this.f41557h, this.f41559j * 1000), this.f41572w);
    }

    public void h() {
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(3, this.f41551b, this.f41550a, new com.mbridge.msdk.mbbanner.common.data.a(this.f41558i + "x" + this.f41557h, this.f41559j * 1000), this.f41572w);
    }

    public void i() {
        this.f41568s = true;
        if (this.f41561l != null) {
            this.f41561l = null;
        }
        if (this.f41572w != null) {
            this.f41572w = null;
        }
        if (this.f41571v != null) {
            this.f41571v = null;
        }
        if (this.f41556g != null) {
            this.f41556g = null;
        }
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(4, this.f41551b, this.f41550a, null, null);
        com.mbridge.msdk.mbbanner.common.manager.a.b().b(this.f41550a);
        com.mbridge.msdk.mbbanner.common.manager.a.b().c();
        c cVar = this.f41563n;
        if (cVar != null) {
            cVar.h();
        }
    }

    public void b(int i10) {
        int iA = a(i10);
        this.f41560k = iA;
        this.f41559j = iA;
    }

    private void b(String str, String str2) {
        if (this.f41565p == null) {
            this.f41565p = new j();
        }
        this.f41565p.a(com.mbridge.msdk.foundation.controller.c.m().d(), str, str2, this.f41550a);
    }

    public void b(boolean z10) {
        this.f41566q = z10;
        b();
        j();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.mbbanner.controll.a$a, reason: collision with other inner class name */
    public class C0288a implements com.mbridge.msdk.mbbanner.common.listener.c {
        public C0288a() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a(List<CampaignEx> list) {
            p0.b(a.f41549x, "onShowSuccessed:");
            if (a.this.f41561l != null) {
                a.this.f41561l.onLoadSuccessed(a.this.f41553d);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(a.this.f41550a, list.get(0).getLocalRequestId());
                cVarA.b(list);
                cVarA.g(1);
                cVarA.d(TextUtils.isEmpty(list.get(0).getBannerUrl()) ? 2 : 1);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000048", cVarA, (e) null);
            } catch (Exception e10) {
                p0.b(a.f41549x, e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void b() {
            if (a.this.f41561l != null) {
                a.this.f41561l.onCloseBanner(a.this.f41553d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void c() {
            if (a.this.f41561l != null) {
                a.this.f41561l.onClick(a.this.f41553d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void d() {
            if (a.this.f41561l != null) {
                a.this.f41561l.closeFullScreen(a.this.f41553d);
                a.this.f41570u = false;
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(3, a.this.f41551b, a.this.f41550a, new com.mbridge.msdk.mbbanner.common.data.a(a.this.f41558i + "x" + a.this.f41557h, a.this.f41559j * 1000), a.this.f41572w);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void onLeaveApp() {
            if (a.this.f41561l != null) {
                a.this.f41561l.onLeaveApp(a.this.f41553d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a(CampaignEx campaignEx) {
            a.this.c();
            if (a.this.f41561l != null) {
                a.this.f41561l.onLogImpression(a.this.f41553d);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(a.this.f41550a, campaignEx.getLocalRequestId());
                cVarA.a(campaignEx);
                cVarA.h(campaignEx.isBidCampaign() ? "1" : "0");
                int i10 = 1;
                cVarA.g(a.this.f41563n != null ? a.this.f41563n.c() : 1);
                if (a.this.f41559j != 0) {
                    i10 = 2;
                }
                cVarA.b(i10);
                cVarA.c(a.this.f41559j);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000128", cVarA, (e) null);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000130", cVarA, (e) null);
            } catch (Exception e10) {
                p0.b(a.f41549x, e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a(com.mbridge.msdk.foundation.error.b bVar) {
            a.this.a(bVar);
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a() {
            if (a.this.f41561l != null) {
                a.this.f41561l.showFullScreen(a.this.f41553d);
                a.this.f41570u = true;
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(2, a.this.f41551b, a.this.f41550a, null, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.error.b bVar) {
        CampaignUnit campaignUnit;
        String strG = "";
        if (bVar != null) {
            try {
                strG = bVar.g();
                if (TextUtils.isEmpty(str)) {
                    str = bVar.f();
                }
            } catch (Throwable th2) {
                p0.b(f41549x, th2.getMessage());
            }
        }
        if (TextUtils.isEmpty(str) && (campaignUnit = this.f41562m) != null) {
            str = campaignUnit.getLocalRequestId();
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f41550a, str);
        CampaignUnit campaignUnit2 = this.f41562m;
        cVarA.b(campaignUnit2 != null ? campaignUnit2.getAds() : null);
        cVarA.a(bVar);
        CampaignUnit campaignUnit3 = this.f41562m;
        if (campaignUnit3 != null && !campaignUnit3.getAds().isEmpty()) {
            cVarA.d(TextUtils.isEmpty(this.f41562m.getAds().get(0).getBannerUrl()) ? 1 : 2);
        }
        cVarA.b(true);
        com.mbridge.msdk.mbbanner.common.report.a.a("2000047", cVarA, (e) null);
        BannerAdListener bannerAdListener = this.f41561l;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.f41553d, strG);
        }
    }

    public void b() {
        k();
        c cVar = this.f41563n;
        if (cVar != null) {
            cVar.b(this.f41566q);
            this.f41563n.d(this.f41567r);
        }
    }

    public void c(boolean z10) {
        this.f41567r = z10;
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, com.mbridge.msdk.foundation.error.b bVar) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f41550a, bVar == null ? this.f41562m.getLocalRequestId() : bVar.f());
            e eVar = new e();
            eVar.a("result", Integer.valueOf(i10));
            CampaignUnit campaignUnit = this.f41562m;
            if (campaignUnit != null && !campaignUnit.getAds().isEmpty()) {
                CampaignEx campaignEx = this.f41562m.getAds().get(0);
                if (campaignEx != null) {
                    cVarA.d(TextUtils.isEmpty(campaignEx.getBannerUrl()) ? 2 : 1);
                }
                cVarA.b(this.f41562m.getAds());
            }
            if (bVar != null) {
                cVarA.a(bVar);
            }
            com.mbridge.msdk.mbbanner.common.report.a.a("2000126", cVarA, eVar);
        } catch (Exception e10) {
            p0.b(f41549x, e10.getMessage());
        }
    }

    public void a(BannerSize bannerSize) {
        if (bannerSize != null) {
            this.f41557h = bannerSize.getHeight();
            this.f41558i = bannerSize.getWidth();
        }
    }

    public void a(boolean z10) {
        this.f41554e = z10;
        this.f41555f = z10 ? 1 : 2;
    }

    public void a(String str, String str2) {
        boolean zB;
        if (this.f41557h >= 1 && this.f41558i >= 1) {
            try {
                zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.m().d());
            } catch (Exception e10) {
                p0.b(f41549x, e10.getMessage());
                zB = false;
            }
            if (!zB) {
                a(str2, new com.mbridge.msdk.foundation.error.b(880029));
                return;
            }
            this.f41552c = str2;
            com.mbridge.msdk.mbbanner.common.data.a aVar = new com.mbridge.msdk.mbbanner.common.data.a(this.f41558i + "x" + this.f41557h, this.f41559j * 1000);
            aVar.a(str);
            aVar.c(this.f41551b);
            aVar.b(str2);
            com.mbridge.msdk.mbbanner.common.manager.a.b().b(this.f41551b, this.f41550a, aVar, this.f41572w);
            com.mbridge.msdk.mbbanner.common.manager.a.b().a(1, this.f41551b, this.f41550a, aVar, this.f41572w);
            return;
        }
        a(str2, new com.mbridge.msdk.foundation.error.b(880037));
    }

    public void a(BannerAdListener bannerAdListener) {
        this.f41561l = bannerAdListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        a(this.f41552c, bVar);
        if (bVar.b() != 880044) {
            c();
        }
    }

    public void a(int i10, int i11, int i12, int i13) {
        c cVar = this.f41563n;
        if (cVar != null) {
            cVar.a(i10, i11, i12, i13);
        }
    }
}
