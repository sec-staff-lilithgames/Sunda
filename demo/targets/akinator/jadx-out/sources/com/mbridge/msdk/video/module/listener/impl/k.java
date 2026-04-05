package com.mbridge.msdk.video.module.listener.impl;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3434s;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.r0;
import com.mbridge.msdk.foundation.tools.z0;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class k extends f {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f44847a;

    /* renamed from: b, reason: collision with root package name */
    protected CampaignEx f44848b;

    /* renamed from: c, reason: collision with root package name */
    protected List<CampaignEx> f44849c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f44850d;

    /* renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.download.a f44851e;

    /* renamed from: f, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.entity.c f44852f;

    /* renamed from: g, reason: collision with root package name */
    protected String f44853g;

    /* renamed from: h, reason: collision with root package name */
    protected String f44854h;

    /* renamed from: i, reason: collision with root package name */
    protected com.mbridge.msdk.video.module.listener.a f44855i;

    /* renamed from: j, reason: collision with root package name */
    protected int f44856j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f44857k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f44858l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f44859m = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                k kVar = k.this;
                if (!kVar.f44847a || kVar.f44848b == null || !z0.b(kVar.f44853g) || com.mbridge.msdk.foundation.controller.c.m().d() == null) {
                    return;
                }
                com.mbridge.msdk.foundation.db.i iVarA = com.mbridge.msdk.foundation.db.i.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
                com.mbridge.msdk.foundation.entity.f fVar = new com.mbridge.msdk.foundation.entity.f();
                fVar.a(System.currentTimeMillis());
                fVar.b(k.this.f44853g);
                fVar.a(k.this.f44848b.getId());
                iVarA.a(fVar);
            } catch (Throwable th2) {
                p0.b("NotifyListener", th2.getMessage(), th2);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                k kVar = k.this;
                if (kVar.f44847a && kVar.f44848b != null && z0.b(kVar.f44853g)) {
                    com.mbridge.msdk.videocommon.cache.a aVarA = com.mbridge.msdk.videocommon.cache.a.a();
                    k kVar2 = k.this;
                    aVarA.a(kVar2.f44848b, kVar2.f44853g);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
            try {
                com.mbridge.msdk.videocommon.cache.a aVarA2 = com.mbridge.msdk.videocommon.cache.a.a();
                k kVar3 = k.this;
                aVarA2.b(kVar3.f44854h, kVar3.f44848b.getAdType());
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    e11.printStackTrace();
                }
            } catch (Throwable th2) {
                p0.a("NotifyListener", th2.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d())).b(k.this.f44848b.getId());
            } catch (Throwable th2) {
                p0.b("NotifyListener", th2.getMessage(), th2);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.videocommon.download.a aVar;
            try {
                if (r0.a().a("c_r_v_f_w_s_e", false)) {
                    return;
                }
                k kVar = k.this;
                if (!kVar.f44847a || (aVar = kVar.f44851e) == null) {
                    return;
                }
                if (aVar.c() != null && !TextUtils.isEmpty(k.this.f44851e.c().getVideoUrlEncode())) {
                    com.mbridge.msdk.foundation.db.m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d())).a(k.this.f44851e.c().getVideoUrlEncode());
                }
                if (TextUtils.isEmpty(k.this.f44851e.k())) {
                    return;
                }
                File file = new File(k.this.f44851e.k());
                if (file.exists() && file.isFile() && file.delete()) {
                    p0.a("NotifyListener", "DEL File :" + file.getAbsolutePath());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public k(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.entity.c cVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        this.f44850d = false;
        this.f44855i = new f();
        this.f44856j = 1;
        if (!z10 && campaignEx != null && z0.b(str2) && aVar != null && aVar2 != null) {
            this.f44848b = campaignEx;
            this.f44854h = str;
            this.f44853g = str2;
            this.f44851e = aVar;
            this.f44852f = cVar;
            this.f44855i = aVar2;
            this.f44847a = true;
            this.f44856j = i10;
            this.f44850d = false;
            return;
        }
        if (!z10 || campaignEx == null || !z0.b(str2) || aVar2 == null) {
            return;
        }
        this.f44848b = campaignEx;
        this.f44854h = str;
        this.f44853g = str2;
        this.f44851e = aVar;
        this.f44852f = cVar;
        this.f44855i = aVar2;
        this.f44847a = true;
        this.f44856j = i10;
        this.f44850d = true;
    }

    private void d() {
        if (!this.f44847a || com.mbridge.msdk.foundation.same.buffer.b.f40745k == null || TextUtils.isEmpty(this.f44848b.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f44853g, this.f44848b, C3434s.f38309j);
    }

    private void f() {
        if (this.f44848b != null) {
            try {
                HashMap map = new HashMap();
                List<com.mbridge.msdk.foundation.entity.d> listA = com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().d()).a(this.f44848b.getCampaignUnitId(), this.f44848b.getRequestId());
                if (listA == null || listA.size() <= 0 || listA.get(0) == null) {
                    return;
                }
                if (listA.get(0).c() == 1) {
                    map.put("encrypt_p=", "encrypt_p=" + listA.get(0).b());
                    map.put("irlfa=", "irlfa=1");
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        CampaignEx campaignEx = this.f44848b;
                        campaignEx.setImpressionURL(campaignEx.getImpressionURL().replaceAll(str, str2));
                        CampaignEx campaignEx2 = this.f44848b;
                        campaignEx2.setOnlyImpressionURL(campaignEx2.getOnlyImpressionURL().replaceAll(str, str2));
                    }
                }
                p0.a("BidReplaceCampignDao", "removeReplace count " + com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().d()).a(this.f44848b.getRequestId()));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void m() {
        new Thread(new c()).start();
    }

    public void a(CampaignEx campaignEx) {
        this.f44848b = campaignEx;
    }

    public void b(int i10) {
        if (this.f44848b != null) {
            if (i10 == 1 || i10 == 2) {
                com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f44848b, i10, this.f44856j);
            }
        }
    }

    public void c() {
        a aVar = new a();
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
        } else {
            aVar.run();
        }
    }

    public void e() {
        d dVar = new d();
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(dVar);
        } else {
            dVar.run();
        }
    }

    public void g() {
        if (!this.f44847a || this.f44848b == null) {
            return;
        }
        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000061", this.f44848b.getId(), this.f44848b.getRequestId(), this.f44848b.getRequestIdNotice(), this.f44853g, l0.s(com.mbridge.msdk.foundation.controller.c.m().d()));
        nVar.b(this.f44848b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
        com.mbridge.msdk.foundation.same.report.g.b(nVar, com.mbridge.msdk.foundation.controller.c.m().d(), this.f44853g);
    }

    public void h() {
        String str;
        try {
            if (!this.f44847a || this.f44857k || TextUtils.isEmpty(this.f44848b.getImpressionURL())) {
                return;
            }
            this.f44857k = true;
            if (this.f44848b.isBidCampaign()) {
                f();
            }
            String impressionURL = this.f44848b.getImpressionURL();
            if (this.f44848b.getSpareOfferFlag() == 1) {
                str = impressionURL + "&to=1&cbt=" + this.f44848b.getCbt() + "&tmorl=" + this.f44856j;
            } else {
                str = impressionURL + "&to=0&cbt=" + this.f44848b.getCbt() + "&tmorl=" + this.f44856j;
            }
            com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f44848b, this.f44853g, str, false, true, com.mbridge.msdk.click.retry.a.f39792m);
            com.mbridge.msdk.video.module.report.b.d(com.mbridge.msdk.foundation.controller.c.m().d(), this.f44848b);
            m();
            d();
        } catch (Throwable th2) {
            p0.b("NotifyListener", th2.getMessage(), th2);
        }
    }

    public void i() {
        CampaignEx campaignEx;
        Map<String, Long> map;
        String str;
        try {
            CampaignEx campaignEx2 = this.f44848b;
            if (campaignEx2 != null && campaignEx2.isDynamicView() && this.f44850d && !this.f44848b.isCampaignIsFiltered()) {
                this.f44858l = true;
                return;
            }
            if (!this.f44847a || (campaignEx = this.f44848b) == null || TextUtils.isEmpty(campaignEx.getOnlyImpressionURL()) || (map = com.mbridge.msdk.foundation.same.buffer.b.f40746l) == null || map.containsKey(this.f44848b.getOnlyImpressionURL()) || this.f44858l) {
                return;
            }
            com.mbridge.msdk.foundation.same.buffer.b.f40746l.put(this.f44848b.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
            String onlyImpressionURL = this.f44848b.getOnlyImpressionURL();
            if (this.f44848b.getSpareOfferFlag() == 1) {
                str = onlyImpressionURL + "&to=1&cbt=" + this.f44848b.getCbt() + "&tmorl=" + this.f44856j;
            } else {
                str = onlyImpressionURL + "&to=0&cbt=" + this.f44848b.getCbt() + "&tmorl=" + this.f44856j;
            }
            String str2 = str;
            if (!this.f44850d || this.f44848b.isCampaignIsFiltered()) {
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f44848b, this.f44853g, str2, false, true, com.mbridge.msdk.click.retry.a.f39793n);
                b();
            }
            this.f44858l = true;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void j() {
        CampaignEx campaignEx;
        List<String> pv_urls;
        try {
            if (!this.f44847a || this.f44859m || (campaignEx = this.f44848b) == null) {
                return;
            }
            this.f44859m = true;
            if ((campaignEx.isDynamicView() && this.f44850d && !this.f44848b.isCampaignIsFiltered()) || (pv_urls = this.f44848b.getPv_urls()) == null || pv_urls.size() <= 0) {
                return;
            }
            Iterator<String> it = pv_urls.iterator();
            while (it.hasNext()) {
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f44848b, this.f44853g, it.next(), false, true);
            }
        } catch (Throwable th2) {
            p0.b("NotifyListener", th2.getMessage());
        }
    }

    public void k() {
        CampaignEx campaignEx = this.f44848b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getCampaignUnitId()) || this.f44848b.getNativeVideoTracking() == null || this.f44848b.getNativeVideoTracking().i() == null) {
            return;
        }
        Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
        CampaignEx campaignEx2 = this.f44848b;
        com.mbridge.msdk.click.a.a(contextD, campaignEx2, campaignEx2.getCampaignUnitId(), this.f44848b.getNativeVideoTracking().i(), false, false);
    }

    public void l() {
        com.mbridge.msdk.videocommon.download.a aVar = this.f44851e;
        if (aVar != null) {
            aVar.d(true);
        }
    }

    public void a(List<CampaignEx> list) {
        this.f44849c = list;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        this.f44855i.a(i10, obj);
    }

    public void b() {
        try {
            b bVar = new b();
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(bVar);
            } else {
                bVar.run();
            }
        } catch (Throwable th2) {
            p0.b("NotifyListener", th2.getMessage(), th2);
        }
    }

    public void a(int i10, String str) {
        if (this.f44848b != null) {
            com.mbridge.msdk.foundation.same.report.g.c(new com.mbridge.msdk.foundation.entity.n("2000062", this.f44848b.getId(), this.f44848b.getRequestId(), this.f44848b.getRequestIdNotice(), this.f44853g, l0.s(com.mbridge.msdk.foundation.controller.c.m().d()), i10, str), com.mbridge.msdk.foundation.controller.c.m().d(), this.f44853g);
        }
    }

    public void b(String str) {
        try {
            if (this.f44848b != null) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("url", this.f44848b.getVideoUrlEncode());
                eVar.a("reason", str);
                String noticeUrl = this.f44848b.getNoticeUrl();
                String clickURL = this.f44848b.getClickURL();
                if (TextUtils.isEmpty(noticeUrl)) {
                    if (!TextUtils.isEmpty(clickURL)) {
                        eVar.a("offer_url", clickURL);
                    }
                } else {
                    eVar.a("offer_url", noticeUrl);
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000021", this.f44848b, eVar);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(int i10) {
        CampaignEx campaignEx = this.f44848b;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (TextUtils.isEmpty(noticeUrl)) {
                return;
            }
            if (i10 == 1 || i10 == 2) {
                if (!noticeUrl.contains("endscreen_type")) {
                    StringBuilder sb2 = new StringBuilder(noticeUrl);
                    if (noticeUrl.contains("?")) {
                        sb2.append("&endscreen_type=");
                        sb2.append(i10);
                    } else {
                        sb2.append("?endscreen_type=");
                        sb2.append(i10);
                    }
                    noticeUrl = sb2.toString();
                } else if (i10 == 2) {
                    if (noticeUrl.contains("endscreen_type=1")) {
                        noticeUrl = noticeUrl.replace("endscreen_type=1", "endscreen_type=2");
                    }
                } else if (noticeUrl.contains("endscreen_type=2")) {
                    noticeUrl = noticeUrl.replace("endscreen_type=2", "endscreen_type=1");
                }
                this.f44848b.setNoticeUrl(noticeUrl);
            }
        }
    }

    public void a() {
        com.mbridge.msdk.videocommon.download.b.getInstance().a(false);
    }

    public void a(String str) {
        List<CampaignEx> list;
        if (this.f44848b == null || (list = this.f44849c) == null || list.size() == 0 || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("camp_position")) {
                this.f44848b = this.f44849c.get(jSONObject.getInt("camp_position"));
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("NotifyListener", e10.getMessage());
            }
        }
    }
}
