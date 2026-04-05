package com.mbridge.msdk.splash.manager;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationCompat;
import be.nVUQ.UupKET;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.foundation.tools.y;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.splash.common.c;
import com.mbridge.msdk.splash.manager.g;
import com.mbridge.msdk.splash.view.MBSplashView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class e {
    private static String A = "SplashLoadManager";

    /* renamed from: a, reason: collision with root package name */
    private String f42850a;

    /* renamed from: b, reason: collision with root package name */
    private String f42851b;

    /* renamed from: c, reason: collision with root package name */
    private long f42852c;

    /* renamed from: d, reason: collision with root package name */
    private long f42853d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.splash.middle.b f42854e;

    /* renamed from: g, reason: collision with root package name */
    private MBSplashView f42856g;

    /* renamed from: h, reason: collision with root package name */
    private l f42857h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f42858i;

    /* renamed from: j, reason: collision with root package name */
    private int f42859j;

    /* renamed from: k, reason: collision with root package name */
    private int f42860k;

    /* renamed from: l, reason: collision with root package name */
    private int f42861l;

    /* renamed from: m, reason: collision with root package name */
    private String f42862m;

    /* renamed from: n, reason: collision with root package name */
    private int f42863n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f42864o;

    /* renamed from: p, reason: collision with root package name */
    private volatile boolean f42865p;

    /* renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f42866q;

    /* renamed from: r, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f42867r;

    /* renamed from: s, reason: collision with root package name */
    private String f42868s;

    /* renamed from: t, reason: collision with root package name */
    private int f42869t;

    /* renamed from: v, reason: collision with root package name */
    private int f42871v;

    /* renamed from: w, reason: collision with root package name */
    private List<CampaignEx> f42872w;

    /* renamed from: u, reason: collision with root package name */
    private String f42870u = "";

    /* renamed from: x, reason: collision with root package name */
    private String f42873x = "";

    /* renamed from: y, reason: collision with root package name */
    private Handler f42874y = new c(Looper.getMainLooper());

    /* renamed from: z, reason: collision with root package name */
    private Runnable f42875z = new d();

    /* renamed from: f, reason: collision with root package name */
    private Context f42855f = com.mbridge.msdk.foundation.controller.c.m().d();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            super.handleMessage(message);
            int i10 = message.what;
            if (i10 == 1) {
                Object obj = message.obj;
                int i11 = message.arg1;
                if (obj instanceof CampaignEx) {
                    CampaignEx campaignEx = (CampaignEx) obj;
                    e.this.a(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip()), campaignEx, i11);
                    return;
                }
                return;
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                Object obj2 = message.obj;
                if (obj2 instanceof CampaignEx) {
                    e eVar = e.this;
                    eVar.h((CampaignEx) obj2, eVar.f42863n);
                    return;
                }
                return;
            }
            Object obj3 = message.obj;
            try {
                if (obj3 instanceof Bundle) {
                    int i12 = ((Bundle) obj3).getInt("type");
                    String string = ((Bundle) obj3).getString(NotificationCompat.CATEGORY_MESSAGE);
                    CampaignEx campaignEx2 = (CampaignEx) ((Bundle) obj3).getSerializable("campaignex");
                    com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i12 == 1 ? 880004 : i12 == 2 ? 880006 : 880027);
                    bVar.c(string);
                    e eVar2 = e.this;
                    eVar2.a(bVar, eVar2.f42862m, e.this.f42863n, campaignEx2);
                }
            } catch (Exception e10) {
                com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880024);
                bVar2.a((Throwable) e10);
                e eVar3 = e.this;
                eVar3.a(bVar2, eVar3.f42862m, e.this.f42863n, (CampaignEx) null);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880010);
            e eVar = e.this;
            eVar.a(bVar, eVar.f42862m, e.this.f42863n, (CampaignEx) null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.splash.manager.e$e, reason: collision with other inner class name */
    public class C0326e extends com.mbridge.msdk.splash.request.b {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f42883e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f42884f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0326e(int i10, String str, int i11) {
            super(i10);
            this.f42883e = str;
            this.f42884f = i11;
        }

        @Override // com.mbridge.msdk.splash.request.b
        public void a(CampaignUnit campaignUnit, int i10) throws Throwable {
            try {
                e eVar = e.this;
                eVar.a(campaignUnit, i10, eVar.f42850a, this.f42883e);
                e.this.f42870u = campaignUnit.getRequestId();
                e.this.f42872w = campaignUnit.getAds();
            } catch (Exception e10) {
                e10.printStackTrace();
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
                bVar.a((Throwable) e10);
                e.this.a(bVar, this.f42883e, i10, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
                e.this.f();
            }
        }

        @Override // com.mbridge.msdk.splash.request.b
        public void b(int i10, String str) throws Throwable {
            p0.b(e.A, str);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880002);
            bVar.c(str);
            e.this.a(bVar, this.f42883e, this.f42884f, (CampaignEx) null);
            e.this.f();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f extends c.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f42886a;

        public f(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f42886a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.splash.report.a.a(str, cVar, this.f42886a, e.this.f42855f, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f42888a;

        public g(CampaignEx campaignEx) {
            this.f42888a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(e.this.f42855f)).a();
            x.a(e.this.f42855f, this.f42888a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h implements com.mbridge.msdk.splash.view.nativeview.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f42890a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f42891b;

        public h(CampaignEx campaignEx, int i10) {
            this.f42890a = campaignEx;
            this.f42891b = i10;
        }

        @Override // com.mbridge.msdk.splash.view.nativeview.a
        public void a() {
            if (this.f42890a.isDynamicView() && e.this.f42856g != null) {
                e.this.f42856g.setImageReady(true);
                e.this.f(this.f42890a, this.f42891b);
            }
            e.this.h(this.f42890a, this.f42891b);
        }

        @Override // com.mbridge.msdk.splash.view.nativeview.a
        public void b() throws Throwable {
            if (!this.f42890a.isDynamicView() || e.this.f42856g == null) {
                return;
            }
            e.this.f42856g.setImageReady(false);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880027);
            e eVar = e.this;
            eVar.a(bVar, eVar.f42862m, this.f42891b, this.f42890a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class i implements y.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f42893a;

        public i(CampaignEx campaignEx) {
            this.f42893a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.tools.y.c
        public void a(String str, String str2, String str3, String str4, boolean z10) {
            if (z10) {
                return;
            }
            e.this.a(this.f42893a, str, true, "");
        }

        @Override // com.mbridge.msdk.foundation.tools.y.c
        public void a(String str, DownloadError downloadError) {
            String message = "";
            if (downloadError != null) {
                try {
                    if (downloadError.getException() != null) {
                        message = downloadError.getException().getMessage();
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            e.this.a(this.f42893a, str, false, message);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class j implements H5DownLoadManager.ZipDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f42895a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f42896b;

        public j(CampaignEx campaignEx, int i10) {
            this.f42895a = campaignEx;
            this.f42896b = i10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880006);
            e eVar = e.this;
            eVar.a(bVar, eVar.f42862m, this.f42896b, this.f42895a);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f42895a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 2);
            messageObtain.obj = bundle;
            e.this.f42874y.sendMessage(messageObtain);
            e.this.a(this.f42895a, str2, false, str);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = this.f42895a;
            messageObtain.arg1 = this.f42896b;
            e.this.f42874y.sendMessage(messageObtain);
            if (z10) {
                return;
            }
            CampaignEx campaignEx = this.f42895a;
            e.this.a(this.f42895a, campaignEx != null ? campaignEx.getAdZip() : "", true, "");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class k implements com.mbridge.msdk.splash.inter.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f42898a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f42899b;

        public k(CampaignEx campaignEx, int i10) {
            this.f42898a = campaignEx;
            this.f42899b = i10;
        }

        @Override // com.mbridge.msdk.splash.inter.a
        public void a(View view) {
            if (e.this.f42856g != null) {
                e.this.f42856g.setDynamicView(true);
                e.this.f42856g.setSplashNativeView(view);
                e.this.h(this.f42898a, this.f42899b);
            }
        }

        @Override // com.mbridge.msdk.splash.inter.a
        public void onError(String str) throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880034);
            bVar.c(str);
            e eVar = e.this;
            eVar.a(bVar, eVar.f42862m, this.f42899b, this.f42898a);
        }
    }

    public e(String str, String str2, long j10) {
        this.f42851b = str;
        this.f42850a = str2;
        this.f42853d = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(CampaignEx campaignEx, int i10) {
        if (!com.mbridge.msdk.splash.manager.d.a(this.f42856g, campaignEx) || this.f42865p) {
            return;
        }
        b();
        if (this.f42864o) {
            com.mbridge.msdk.splash.manager.d.a(campaignEx, this.f42850a);
        }
        this.f42865p = true;
        com.mbridge.msdk.splash.middle.b bVar = this.f42854e;
        if (bVar != null) {
            bVar.a(campaignEx, i10);
        }
    }

    private void i(CampaignEx campaignEx, int i10) throws Throwable {
        MBSplashView mBSplashView = this.f42856g;
        if (mBSplashView != null) {
            mBSplashView.setDynamicView(false);
        }
        if (campaignEx.isDynamicView()) {
            c(campaignEx, i10);
        } else {
            MBSplashView mBSplashView2 = this.f42856g;
            if (mBSplashView2 != null) {
                mBSplashView2.setSplashWebView();
            }
        }
        if (com.mbridge.msdk.splash.manager.d.a(this.f42856g, campaignEx)) {
            h(campaignEx, i10);
        } else {
            a(campaignEx, i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements g.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f42876a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f42877b;

        public a(CampaignEx campaignEx, int i10) {
            this.f42876a = campaignEx;
            this.f42877b = i10;
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void a() {
            if (this.f42876a.isHasMBTplMark()) {
                return;
            }
            e.this.g(this.f42876a, this.f42877b);
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void onError(String str) throws Throwable {
            e.this.a(str, this.f42877b, this.f42876a);
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void a(int i10) throws Throwable {
            if (i10 == 1) {
                e.this.g(this.f42876a, this.f42877b);
            } else {
                e.this.a("readyState 2", this.f42877b, this.f42876a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f42869t = 0;
    }

    private void g() {
        try {
            int i10 = this.f42869t + 1;
            this.f42869t = i10;
            l lVar = this.f42857h;
            if (lVar != null && i10 <= lVar.y()) {
                return;
            }
            this.f42869t = 0;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String d() {
        return this.f42870u;
    }

    public void e() {
        if (this.f42854e != null) {
            this.f42854e = null;
        }
        if (this.f42866q != null) {
            this.f42866q = null;
        }
        if (this.f42867r != null) {
            this.f42867r = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd A[Catch: Exception -> 0x0110, TRY_ENTER, TryCatch #0 {Exception -> 0x0110, blocks: (B:54:0x010c, B:55:0x010f, B:42:0x00cd, B:44:0x00d1, B:46:0x00d7, B:48:0x00dd, B:50:0x00e3, B:51:0x00fe, B:33:0x00b0), top: B:58:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7 A[Catch: Exception -> 0x0110, TryCatch #0 {Exception -> 0x0110, blocks: (B:54:0x010c, B:55:0x010f, B:42:0x00cd, B:44:0x00d1, B:46:0x00d7, B:48:0x00dd, B:50:0x00e3, B:51:0x00fe, B:33:0x00b0), top: B:58:0x000e }] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.File] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d(com.mbridge.msdk.foundation.entity.CampaignEx r12, int r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.splash.manager.e.d(com.mbridge.msdk.foundation.entity.CampaignEx, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(CampaignEx campaignEx, int i10) {
        if (campaignEx.isDynamicView()) {
            c.a aVar = new c.a();
            aVar.b(this.f42850a).a(this.f42851b).a(this.f42858i).a(campaignEx).c(this.f42859j).f(this.f42871v);
            try {
                if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
                    Uri uri = Uri.parse(campaignEx.getAdZip());
                    String queryParameter = uri.getQueryParameter("hdbtn");
                    String queryParameter2 = uri.getQueryParameter("alecfc");
                    String queryParameter3 = uri.getQueryParameter("hdinfo");
                    String queryParameter4 = uri.getQueryParameter("shake_show");
                    String queryParameter5 = uri.getQueryParameter("shake_strength");
                    String queryParameter6 = uri.getQueryParameter("shake_time");
                    String queryParameter7 = uri.getQueryParameter("n_logo");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        aVar.b(Integer.parseInt(queryParameter));
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        aVar.e(Integer.parseInt(queryParameter2));
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        aVar.a(Integer.parseInt(queryParameter3));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        aVar.g(Integer.parseInt(queryParameter4));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        aVar.h(Integer.parseInt(queryParameter5));
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        aVar.i(Integer.parseInt(queryParameter6));
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        aVar.d(Integer.parseInt(queryParameter7) == 0 ? 0 : 1);
                    }
                }
            } catch (Throwable th2) {
                p0.b(A, th2.getMessage());
            }
            com.mbridge.msdk.splash.manager.c.a().a(this.f42856g, aVar.a(), new k(campaignEx, i10));
        }
    }

    public void b(int i10) {
        this.f42871v = i10;
    }

    public String c() {
        return com.mbridge.msdk.foundation.same.c.b(this.f42872w);
    }

    private void b() {
        this.f42874y.removeCallbacks(this.f42875z);
    }

    private void c(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.splash.manager.d.a(this.f42856g, campaignEx, new h(campaignEx, i10));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements com.mbridge.msdk.videocommon.listener.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f42879a;

        public b(CampaignEx campaignEx) {
            this.f42879a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            e.this.f42856g.setVideoReady(true);
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f42879a;
            messageObtain.what = 3;
            e.this.f42874y.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) throws Throwable {
            e.this.f42856g.setVideoReady(false);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880004);
            bVar.c(str);
            e eVar = e.this;
            eVar.a(bVar, eVar.f42862m, e.this.f42863n, this.f42879a);
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f42879a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 1);
            messageObtain.obj = bundle;
            messageObtain.what = 2;
            e.this.f42874y.sendMessage(messageObtain);
        }
    }

    private void b(CampaignEx campaignEx, int i10) {
        this.f42866q = new b(campaignEx);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f42855f, this.f42850a, copyOnWriteArrayList, 297, this.f42866q);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().b(297, this.f42850a, campaignEx.isBidCampaign())) {
            com.mbridge.msdk.videocommon.download.b.getInstance().load(this.f42850a);
        } else {
            this.f42856g.setVideoReady(true);
            h(campaignEx, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(CampaignEx campaignEx, int i10) {
        if (this.f42856g.isH5Ready()) {
            return;
        }
        this.f42856g.setH5Ready(true);
        h(campaignEx, i10);
    }

    private void e(CampaignEx campaignEx, int i10) {
        if (campaignEx.isDynamicView()) {
            y.a(5, "", campaignEx.getAdZip(), new i(campaignEx), campaignEx);
            return;
        }
        this.f42867r = new j(campaignEx, i10);
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(297);
        cVar.e(2);
        cVar.a(campaignEx);
        cVar.f(campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, campaignEx.getAdZip(), this.f42867r);
    }

    public void a(l lVar) {
        this.f42857h = lVar;
    }

    public void a(MBSplashView mBSplashView) {
        this.f42856g = mBSplashView;
    }

    public void a(boolean z10) {
        this.f42858i = z10;
    }

    public void a(int i10) {
        this.f42859j = i10;
    }

    public void a(int i10, int i11) {
        this.f42861l = i10;
        this.f42860k = i11;
    }

    public void a(String str, int i10) {
        this.f42865p = false;
        this.f42862m = str;
        this.f42863n = i10;
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.f42856g, this.f42851b, this.f42850a, str, this.f42858i, this.f42859j, false, false);
        long timestamp = campaignExA != null ? campaignExA.getTimestamp() : 0L;
        if (this.f42857h.t() == 1 && i10 != 1 && campaignExA != null) {
            i(campaignExA, i10);
            return;
        }
        this.f42864o = true;
        if (i10 == 1) {
            List<Integer> listC = this.f42857h.c();
            if (listC != null && listC.size() > 0) {
                this.f42852c = listC.get(0).intValue() * 1000;
            } else {
                this.f42852c = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
            }
        } else {
            long j10 = this.f42853d;
            if (j10 <= 0) {
                this.f42852c = this.f42857h.E();
            } else {
                this.f42852c = j10;
            }
        }
        if (this.f42857h == null || timestamp <= 0 || !TextUtils.isEmpty(str)) {
            a(this.f42852c);
            a(this.f42855f, str, i10);
            return;
        }
        if (System.currentTimeMillis() - timestamp > this.f42857h.v() * 1000) {
            a(this.f42852c);
            a(this.f42855f, str, i10);
        } else {
            i(campaignExA, i10);
        }
    }

    private void a(long j10) {
        this.f42874y.postDelayed(this.f42875z, j10);
    }

    private void a(Context context, String str, int i10) throws Throwable {
        Exception exc;
        String str2;
        try {
            if (context == null) {
                a(new com.mbridge.msdk.foundation.error.b(880025), str, i10, (CampaignEx) null);
                return;
            }
            try {
                if (z0.a(this.f42850a)) {
                    a(new com.mbridge.msdk.foundation.error.b(880032), str, i10, (CampaignEx) null);
                    return;
                }
                MBridgeIds mBridgeIds = new MBridgeIds(this.f42851b, this.f42850a);
                com.mbridge.msdk.splash.request.f fVar = new com.mbridge.msdk.splash.request.f();
                fVar.d(i10);
                fVar.c(this.f42869t);
                fVar.a(this.f42868s);
                fVar.b(this.f42861l);
                fVar.a(this.f42860k);
                com.mbridge.msdk.foundation.same.net.wrapper.e eVarB = com.mbridge.msdk.splash.request.e.b(context, mBridgeIds, fVar);
                if (eVarB == null) {
                    a(new com.mbridge.msdk.foundation.error.b(880001), str, i10, (CampaignEx) null);
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    eVarB.a("token", str);
                }
                String strD = u0.d(this.f42850a);
                if (!TextUtils.isEmpty(strD)) {
                    eVarB.a("j", strD);
                }
                com.mbridge.msdk.splash.request.c cVar = new com.mbridge.msdk.splash.request.c(context);
                C0326e c0326e = new C0326e(i10, str, i10);
                c0326e.a(str);
                c0326e.setUnitId(this.f42850a);
                c0326e.setPlacementId(this.f42851b);
                c0326e.setAdType(297);
                str2 = str;
                try {
                    cVar.choiceV3OrV5BySetting(1, eVarB, c0326e, str2, com.mbridge.msdk.foundation.same.c.a(this.f42852c, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                } catch (Exception e10) {
                    e = e10;
                    exc = e;
                    p0.b(A, exc.getMessage());
                    com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880020);
                    bVar.a((Throwable) exc);
                    a(bVar, str2, i10, (CampaignEx) null);
                    f();
                }
            } catch (Exception e11) {
                e = e11;
                str2 = str;
            }
        } catch (Exception e12) {
            exc = e12;
            str2 = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignUnit campaignUnit, int i10, String str, String str2) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar;
        List<CampaignEx> listA = a(campaignUnit);
        if (listA != null && listA.size() > 0) {
            g();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("adtp", 297);
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            String str3 = UupKET.qDfkzzG;
            if (!zIsEmpty) {
                eVar.a(str3, 1);
            } else {
                eVar.a(str3, 0);
            }
            CampaignEx campaignEx = listA.get(0);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, str2, eVar, campaignEx, str);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
                campaignEx.setHasMBTplMark(false);
                campaignEx.setIsMraid(true);
            } else {
                campaignEx.setHasMBTplMark(true);
                campaignEx.setIsMraid(false);
            }
            i(campaignEx, i10);
            return;
        }
        if (this.f42873x.contains("INSTALLED")) {
            bVar = new com.mbridge.msdk.foundation.error.b(880021, "APP ALREADY INSTALLED");
        } else {
            bVar = new com.mbridge.msdk.foundation.error.b(880003);
        }
        a(bVar, str2, i10, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
    }

    private List<CampaignEx> a(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = campaignUnit.getAds().get(0);
        campaignEx.setCampaignUnitId(this.f42850a);
        a(campaignEx);
        this.f42868s = campaignUnit.getSessionId();
        if (campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getAdZip()) || !TextUtils.isEmpty(campaignEx.getAdHtml()))) {
            if (u0.c(campaignEx)) {
                campaignEx.setRtinsType(u0.c(this.f42855f, campaignEx.getPackageName()) ? 1 : 2);
            }
            if (com.mbridge.msdk.foundation.same.c.b(this.f42855f, campaignEx)) {
                arrayList.add(campaignEx);
            } else {
                u0.a(this.f42850a, campaignEx, com.mbridge.msdk.foundation.same.a.f40727x);
                this.f42873x = "APP ALREADY INSTALLED";
            }
            a(campaignEx, (com.mbridge.msdk.foundation.same.report.metrics.c) null, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
        return arrayList;
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.f42855f, cVar, new f(campaignEx, aVar));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(CampaignEx campaignEx) {
        new Thread(new g(campaignEx)).start();
    }

    public void a(com.mbridge.msdk.splash.middle.b bVar) {
        this.f42854e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, String str, int i10, CampaignEx campaignEx) throws Throwable {
        if (this.f42864o) {
            this.f42864o = false;
            a(bVar, i10, str, campaignEx);
        } else {
            a(bVar, i10, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, String str, CampaignEx campaignEx) throws Throwable {
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.f42856g, this.f42851b, this.f42850a, str, this.f42858i, this.f42859j, true, false);
        if (campaignExA != null) {
            i(campaignExA, i10);
        } else {
            a(bVar, i10, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, CampaignEx campaignEx) {
        if (this.f42865p) {
            return;
        }
        b();
        this.f42865p = true;
        if (bVar != null) {
            bVar.a(campaignEx);
        }
        com.mbridge.msdk.splash.middle.b bVar2 = this.f42854e;
        if (bVar2 != null) {
            bVar2.a(bVar, i10);
        }
    }

    private void a(CampaignEx campaignEx, int i10) throws Throwable {
        this.f42856g.clearResState();
        if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            e(campaignEx, i10);
        }
        if (campaignEx.isDynamicView()) {
            return;
        }
        if (!TextUtils.isEmpty(campaignEx.getAdHtml())) {
            d(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            b(campaignEx, i10);
        }
        if (TextUtils.isEmpty(campaignEx.getImageUrl())) {
            return;
        }
        c(campaignEx, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, CampaignEx campaignEx, int i10) {
        g.d dVar = new g.d();
        dVar.c(this.f42850a);
        dVar.b(this.f42851b);
        dVar.a(campaignEx);
        dVar.a(str);
        dVar.a(this.f42858i);
        dVar.a(this.f42859j);
        com.mbridge.msdk.splash.manager.g.a().a(this.f42856g, dVar, new a(campaignEx, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10, CampaignEx campaignEx) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880009);
        bVar.c(str);
        a(bVar, this.f42862m, i10, campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, String str, boolean z10, String str2) {
        try {
            n nVar = new n();
            nVar.e(2);
            nVar.j("m_download_end");
            if (campaignEx != null) {
                nVar.b(campaignEx.isMraid() ? n.N : n.O);
                nVar.o(campaignEx.getRequestIdNotice());
            }
            nVar.b("url", str);
            nVar.b("scenes", "1");
            if (z10) {
                nVar.d(1);
            } else {
                nVar.d(3);
                nVar.m(str2);
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, campaignEx);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b(A, e10.getMessage());
            }
        }
    }
}
