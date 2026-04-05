package com.mbridge.msdk.mbbanner.common.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: n, reason: collision with root package name */
    private static final String f41453n = "b";

    /* renamed from: a, reason: collision with root package name */
    private Context f41454a;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.data.b f41456c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.util.a f41457d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.b f41458e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.d f41459f;

    /* renamed from: b, reason: collision with root package name */
    private int f41455b = 0;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f41460g = false;

    /* renamed from: h, reason: collision with root package name */
    private Timer f41461h = new Timer();

    /* renamed from: i, reason: collision with root package name */
    private volatile List<String> f41462i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f41463j = false;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f41464k = false;

    /* renamed from: l, reason: collision with root package name */
    private volatile boolean f41465l = false;

    /* renamed from: m, reason: collision with root package name */
    private String f41466m = "";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41467a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f41468b;

        public a(String str, CampaignEx campaignEx) {
            this.f41467a = str;
            this.f41468b = campaignEx;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (b.this.f41460g) {
                return;
            }
            b.this.f41460g = true;
            b.this.a(this.f41467a, -1, "", false, this.f41468b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends c.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41472a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f41473b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f41474c;

        public c(String str, CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f41472a = str;
            this.f41473b = campaignEx;
            this.f41474c = context;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f41472a);
            cVar.a(str, eVar);
            com.mbridge.msdk.mbbanner.common.report.a.a(str, cVar, this.f41473b, this.f41474c, null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignUnit f41476a;

        public d(CampaignUnit campaignUnit) {
            this.f41476a = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            p0.c(b.f41453n, "在单独子线程保存数据库 开始");
            j.a(g.a(b.this.f41454a)).a();
            CampaignUnit campaignUnit = this.f41476a;
            if (campaignUnit != null && campaignUnit.getAds() != null && this.f41476a.getAds().size() > 0) {
                BannerUtils.uisList(b.this.f41454a, this.f41476a.getAds());
            }
            p0.c(b.f41453n, "在单独子线程保存数据库 完成");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e implements com.mbridge.msdk.foundation.same.image.c {

        /* renamed from: a, reason: collision with root package name */
        private b f41478a;

        /* renamed from: b, reason: collision with root package name */
        private String f41479b;

        /* renamed from: c, reason: collision with root package name */
        private CampaignEx f41480c;

        public e(b bVar, String str, CampaignEx campaignEx) {
            this.f41478a = bVar;
            this.f41479b = str;
            this.f41480c = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            String str3;
            if (MBridgeConstans.DEBUG) {
                p0.c(b.f41453n, "DownloadImageListener campaign image fail");
            }
            b bVar = this.f41478a;
            if (bVar != null) {
                str3 = str2;
                bVar.a(this.f41479b, 1, str3, false, this.f41480c);
            } else {
                str3 = str2;
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f41479b, this.f41480c.getCurrentLocalRid());
                cVarA.a(this.f41480c);
                cVarA.e(10);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                cVarA.e(10);
                eVar.a("resource_type", 10);
                eVar.a("result", 3);
                eVar.a("url", str3);
                com.mbridge.msdk.mbbanner.common.report.a.a("m_download_end", cVarA, eVar);
            } catch (Throwable th2) {
                p0.b(b.f41453n, th2.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            String str2;
            if (MBridgeConstans.DEBUG) {
                p0.c(b.f41453n, "DownloadImageListener campaign image success");
            }
            b bVar = this.f41478a;
            if (bVar != null) {
                str2 = str;
                bVar.a(this.f41479b, 1, str2, true, this.f41480c);
            } else {
                str2 = str;
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f41479b, this.f41480c.getCurrentLocalRid());
                cVarA.a(this.f41480c);
                cVarA.e(10);
                cVarA.e(10);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("resource_type", 10);
                eVar.a("result", 1);
                eVar.a("url", str2);
                com.mbridge.msdk.mbbanner.common.report.a.a("m_download_end", cVarA, eVar);
            } catch (Throwable th2) {
                p0.b(b.f41453n, th2.getMessage());
            }
        }
    }

    public b(Context context, com.mbridge.msdk.mbbanner.common.data.b bVar, com.mbridge.msdk.mbbanner.common.listener.b bVar2, com.mbridge.msdk.mbbanner.common.util.a aVar) {
        this.f41454a = context.getApplicationContext();
        this.f41456c = bVar;
        this.f41458e = bVar2;
        this.f41457d = aVar;
    }

    private void b(String str, List<CampaignEx> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (CampaignEx campaignEx : list) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                this.f41462i.add(campaignEx.getImageUrl());
                com.mbridge.msdk.foundation.same.image.b.a(this.f41454a).a(campaignEx.getImageUrl(), new e(this, str, campaignEx));
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(str, campaignEx.getCurrentLocalRid());
                cVarA.a(campaignEx);
                cVarA.e(10);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("resource_type", 10);
                com.mbridge.msdk.mbbanner.common.report.a.a("m_download_start", cVarA, eVar);
            }
        }
    }

    private void a(String str, int i10) {
        if (this.f41465l) {
            return;
        }
        if ((this.f41463j || this.f41464k) && this.f41462i.size() == 0) {
            p0.c(f41453n, "在子线程处理业务逻辑 完成");
            this.f41460g = true;
            this.f41465l = true;
            this.f41461h.cancel();
            this.f41457d.a(this.f41458e, str, i10);
            this.f41459f.a(str);
        }
    }

    private void a(String str, CampaignEx campaignEx) {
        String str2 = f41453n;
        p0.c(str2, "在子线程处理业务逻辑 完成");
        p0.c(str2, "downloadResource--> Fail");
        this.f41460g = true;
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880027);
        MBridgeIds mBridgeIds = new MBridgeIds();
        mBridgeIds.setUnitId(str);
        bVar.a(mBridgeIds);
        bVar.b(this.f41456c.a());
        bVar.a(campaignEx);
        this.f41457d.b(this.f41458e, bVar);
        this.f41459f.a(str);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.mbbanner.common.manager.b$b, reason: collision with other inner class name */
    public class C0283b extends com.mbridge.msdk.mbbanner.common.response.a {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.data.a f41470c;

        public C0283b(com.mbridge.msdk.mbbanner.common.data.a aVar) {
            this.f41470c = aVar;
        }

        @Override // com.mbridge.msdk.mbbanner.common.response.a
        public void a(CampaignUnit campaignUnit) throws Throwable {
            try {
                p0.c(b.f41453n, "requestCampaign--> Succeed");
                campaignUnit.setLocalRequestId(this.f41470c.b());
                b.this.f41457d.a(b.this.f41458e, campaignUnit, this.unitId);
                b.this.a(this.unitId, this.f41470c.b(), campaignUnit);
            } catch (Exception e10) {
                p0.c(b.f41453n, "requestCampaign--> Fail with exception = " + e10.getMessage());
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880000);
                bVar.a(new MBridgeIds(this.placementId, this.unitId));
                bVar.b(this.f41470c.b());
                bVar.a((campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().isEmpty()) ? null : campaignUnit.getAds().get(0));
                bVar.a((Throwable) e10);
                b.this.f41457d.a(b.this.f41458e, bVar);
                b.this.f41459f.a(this.unitId);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.response.a
        public void a(int i10, String str) {
            p0.c(b.f41453n, "requestCampaign--> Fail errorCode:" + i10 + " msg:" + str);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
            bVar.c(i10 + "#" + str);
            bVar.a(new MBridgeIds(this.placementId, this.unitId));
            bVar.b(this.f41470c.b());
            b.this.f41457d.a(b.this.f41458e, bVar);
            b.this.f41459f.a(this.unitId);
        }
    }

    private void b(String str, String str2, CampaignEx campaignEx) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        a(str, 3, str2, true, campaignEx);
    }

    private String b() {
        return this.f41456c.d();
    }

    private void b(String str) {
        this.f41456c.b(str);
    }

    public void a(String str, int i10, String str2, boolean z10, CampaignEx campaignEx) {
        if (!z10) {
            if (i10 == -1) {
                p0.b(f41453n, " unitId =" + str + " --> time out!");
            }
            this.f41461h.cancel();
            a(str, campaignEx);
            return;
        }
        if (i10 == 1) {
            p0.c(f41453n, "downloadResource--> Success Image");
            synchronized (this) {
                try {
                    this.f41462i.remove(str2);
                    if (this.f41462i.size() == 0) {
                        a(str, i10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        if (i10 == 2) {
            p0.c(f41453n, "downloadResource--> Success banner_html");
            this.f41464k = true;
            a(str, i10);
        } else if (i10 == 3) {
            p0.c(f41453n, "downloadResource--> Success banner_url");
            this.f41463j = true;
            a(str, i10);
        }
    }

    private void a(String str, int i10, CampaignEx campaignEx) {
        this.f41461h.schedule(new a(str, campaignEx), i10);
    }

    public void a(String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.d dVar) {
        boolean z10;
        try {
            p0.c(f41453n, "requestCampaign--> started");
            this.f41459f = dVar;
            C0283b c0283b = new C0283b(aVar);
            c0283b.setUnitId(str2);
            c0283b.setPlacementId(str);
            c0283b.setAdType(296);
            com.mbridge.msdk.mbbanner.common.request.a aVar2 = new com.mbridge.msdk.mbbanner.common.request.a(this.f41454a);
            this.f41455b = a(str2);
            com.mbridge.msdk.foundation.same.net.wrapper.e eVarA = com.mbridge.msdk.mbbanner.common.data.c.a(false, this.f41454a, str2, b(), this.f41455b, aVar);
            String strD = u0.d(str2);
            if (!TextUtils.isEmpty(strD)) {
                eVarA.a("j", strD);
            }
            String strA = aVar.a();
            if (TextUtils.isEmpty(strA)) {
                z10 = false;
            } else {
                c0283b.a(strA);
                z10 = true;
            }
            this.f41457d.a(z10);
            aVar2.choiceV3OrV5BySetting(1, eVarA, c0283b, strA, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
        } catch (Exception e10) {
            p0.b(f41453n, e10.getMessage());
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880002);
            bVar.a(new MBridgeIds(str, str2));
            this.f41457d.a(this.f41458e, bVar);
            this.f41459f.a(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, CampaignUnit campaignUnit) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar;
        CampaignEx campaignEx;
        if (campaignUnit == null) {
            com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880003);
            MBridgeIds mBridgeIds = new MBridgeIds();
            mBridgeIds.setUnitId(str);
            bVar2.a(mBridgeIds);
            bVar2.b(str2);
            this.f41457d.a(this.f41458e, bVar2);
            this.f41459f.a(str);
            return;
        }
        List<CampaignEx> listA = a(str, campaignUnit);
        a(campaignUnit);
        int i10 = 0;
        if (listA != null && listA.size() != 0) {
            p0.c(f41453n, "在子线程处理业务逻辑 开始");
            CampaignEx campaignEx2 = listA.get(0);
            a(str, DtbConstants.NETWORK_READ_TIMEOUT, campaignEx2);
            b(campaignUnit.getSessionId());
            a(str, listA);
            String strTrim = campaignEx2.getBannerUrl().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                b(str, strTrim, campaignEx2);
                if (listA.size() > 0) {
                    while (i10 < listA.size()) {
                        listA.get(i10).setBannerUrl(campaignEx2.getBannerUrl());
                        listA.get(i10).setHasMBTplMark(true);
                        i10++;
                    }
                }
            } else {
                String strTrim2 = campaignEx2.getBannerHtml().trim();
                if (!TextUtils.isEmpty(strTrim2)) {
                    String strA = a(str, strTrim2, campaignEx2);
                    if (listA.size() > 0) {
                        while (i10 < listA.size()) {
                            listA.get(i10).setBannerHtml(strA);
                            listA.get(i10).setHasMBTplMark(strTrim2.contains("<MBTPLMARK>"));
                            i10++;
                        }
                    }
                } else {
                    this.f41464k = true;
                    this.f41463j = true;
                }
            }
            b(str, listA);
            return;
        }
        p0.c(f41453n, "tryDownloadOnLoadSuccess 返回的campaign 没有符合下载规则的");
        if (this.f41466m.contains("INSTALLED")) {
            bVar = new com.mbridge.msdk.foundation.error.b(880021, "APP ALREADY INSTALLED");
        } else {
            bVar = new com.mbridge.msdk.foundation.error.b(880003);
        }
        MBridgeIds mBridgeIds2 = new MBridgeIds();
        mBridgeIds2.setUnitId(str);
        bVar.a(mBridgeIds2);
        bVar.b(str2);
        if (campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0 && (campaignEx = campaignUnit.getAds().get(0)) != null) {
            bVar.a(campaignEx);
        }
        this.f41457d.a(this.f41458e, bVar);
        this.f41459f.a(str);
    }

    private List<CampaignEx> a(String str, CampaignUnit campaignUnit) {
        String str2;
        ArrayList arrayList = new ArrayList();
        if (campaignUnit != null) {
            try {
                if (campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                    ArrayList<CampaignEx> ads = campaignUnit.getAds();
                    p0.c(f41453n, "getNeedShowList 总共返回的campaign有：" + ads.size());
                    x.a(ads);
                    int i10 = 0;
                    while (i10 < ads.size()) {
                        CampaignEx campaignEx = ads.get(i10);
                        if (campaignEx == null || campaignEx.getOfferType() == 99 || (TextUtils.isEmpty(campaignEx.getBannerUrl()) && TextUtils.isEmpty(campaignEx.getBannerHtml()) && TextUtils.isEmpty(campaignEx.getImageUrl()))) {
                            str2 = str;
                        } else {
                            if (u0.c(campaignEx)) {
                                campaignEx.setRtinsType(u0.c(this.f41454a, campaignEx.getPackageName()) ? 1 : 2);
                            }
                            if (com.mbridge.msdk.foundation.same.c.b(this.f41454a, campaignEx)) {
                                arrayList.add(campaignEx);
                            } else {
                                u0.a(str, campaignEx, com.mbridge.msdk.foundation.same.a.f40727x);
                                this.f41466m = "APP ALREADY INSTALLED";
                            }
                            str2 = str;
                            a(campaignEx, this.f41454a, (com.mbridge.msdk.foundation.same.report.metrics.c) null, str2, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
                        }
                        i10++;
                        str = str2;
                    }
                    p0.c(f41453n, "getNeedShowList 返回有以下带有视频素材的campaign：" + arrayList.size());
                    return arrayList;
                }
            } catch (Exception e10) {
                p0.b(f41453n, e10.getMessage());
            }
        }
        return arrayList;
    }

    private void a(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, context, cVar, new c(str, campaignEx, context, aVar));
        } catch (Exception e10) {
            p0.b(f41453n, e10.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(java.lang.String r14, java.lang.String r15, com.mbridge.msdk.foundation.entity.CampaignEx r16) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            java.lang.String r1 = ""
            if (r0 != 0) goto Lb5
            r2 = 0
            com.mbridge.msdk.foundation.same.directory.c r0 = com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            java.lang.String r0 = com.mbridge.msdk.foundation.same.directory.e.b(r0)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.b1.b(r15)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.SameMD5.getMD5(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            if (r4 == 0) goto L2c
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            goto L2c
        L26:
            r0 = move-exception
            r14 = r0
            goto La2
        L2a:
            r0 = move-exception
            goto L5c
        L2c:
            java.lang.String r4 = ".html"
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            android.net.Uri r0 = android.net.Uri.parse(r15)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            r0.getPath()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            byte[] r0 = r15.getBytes()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5a
            r3.write(r0)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5a
            r3.flush()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5a
            java.lang.String r1 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5a
            r3.close()     // Catch: java.lang.Exception -> L55
            goto L74
        L55:
            r0 = move-exception
            goto L6b
        L57:
            r0 = move-exception
            r14 = r0
            goto La3
        L5a:
            r0 = move-exception
            r2 = r3
        L5c:
            java.lang.String r3 = com.mbridge.msdk.mbbanner.common.manager.b.f41453n     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L26
            com.mbridge.msdk.foundation.tools.p0.b(r3, r0)     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L74
            r2.close()     // Catch: java.lang.Exception -> L55
            goto L74
        L6b:
            java.lang.String r2 = com.mbridge.msdk.mbbanner.common.manager.b.f41453n
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.p0.b(r2, r0)
        L74:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L97
            boolean r2 = r0.isFile()
            if (r2 == 0) goto L97
            boolean r0 = r0.canRead()
            if (r0 != 0) goto L8c
            goto L97
        L8c:
            r4 = 2
            r6 = 1
            r2 = r13
            r3 = r14
            r5 = r15
            r7 = r16
            r2.a(r3, r4, r5, r6, r7)
            goto La1
        L97:
            r9 = 2
            r11 = 0
            r7 = r13
            r8 = r14
            r10 = r15
            r12 = r16
            r7.a(r8, r9, r10, r11, r12)
        La1:
            return r1
        La2:
            r3 = r2
        La3:
            if (r3 == 0) goto Lb4
            r3.close()     // Catch: java.lang.Exception -> La9
            goto Lb4
        La9:
            r0 = move-exception
            r15 = r0
            java.lang.String r0 = com.mbridge.msdk.mbbanner.common.manager.b.f41453n
            java.lang.String r15 = r15.getMessage()
            com.mbridge.msdk.foundation.tools.p0.b(r0, r15)
        Lb4:
            throw r14
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.manager.b.a(java.lang.String, java.lang.String, com.mbridge.msdk.foundation.entity.CampaignEx):java.lang.String");
    }

    private void a(CampaignUnit campaignUnit) {
        new Thread(new d(campaignUnit)).start();
    }

    private int a(String str) {
        try {
            int iC = this.f41456c.c();
            if (iC > this.f41456c.b()) {
                return 0;
            }
            return iC;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private void a(String str, List<CampaignEx> list) {
        int size = this.f41455b;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    size += list.size();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        if (size > this.f41456c.b()) {
            p0.c(f41453n, "saveNextOffset 重置offset为0");
            size = 0;
        }
        p0.c(f41453n, "saveNextOffset 算出 下次的offset是:" + size);
        if (z0.b(str)) {
            this.f41456c.a(size);
        }
    }
}
