package com.mbridge.msdk.advanced.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.apm.insight.b.El.rJqlArycrfkilN;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: z, reason: collision with root package name */
    private static String f39460z = "NativeAdvancedLoadManager";

    /* renamed from: a, reason: collision with root package name */
    private String f39461a;

    /* renamed from: b, reason: collision with root package name */
    private String f39462b;

    /* renamed from: c, reason: collision with root package name */
    private long f39463c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.advanced.middle.b f39464d;

    /* renamed from: f, reason: collision with root package name */
    private MBNativeAdvancedView f39466f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.setting.l f39467g;

    /* renamed from: h, reason: collision with root package name */
    private List<CampaignEx> f39468h;

    /* renamed from: i, reason: collision with root package name */
    private CampaignEx f39469i;

    /* renamed from: j, reason: collision with root package name */
    private int f39470j;

    /* renamed from: k, reason: collision with root package name */
    private int f39471k;

    /* renamed from: l, reason: collision with root package name */
    private int f39472l;

    /* renamed from: m, reason: collision with root package name */
    private int f39473m;

    /* renamed from: n, reason: collision with root package name */
    private String f39474n;

    /* renamed from: o, reason: collision with root package name */
    private int f39475o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f39476p;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f39477q;

    /* renamed from: r, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f39478r;

    /* renamed from: s, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f39479s;

    /* renamed from: t, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f39480t;

    /* renamed from: u, reason: collision with root package name */
    private String f39481u;

    /* renamed from: v, reason: collision with root package name */
    private int f39482v;

    /* renamed from: w, reason: collision with root package name */
    private String f39483w = "";

    /* renamed from: x, reason: collision with root package name */
    private Handler f39484x = new e(Looper.getMainLooper());

    /* renamed from: y, reason: collision with root package name */
    private Runnable f39485y = new f();

    /* renamed from: e, reason: collision with root package name */
    private Context f39465e = com.mbridge.msdk.foundation.controller.c.m().d();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements H5DownLoadManager.ZipDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f39486a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f39487b;

        public a(CampaignEx campaignEx, int i10) {
            this.f39486a = campaignEx;
            this.f39487b = i10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            p0.a(b.f39460z, "zip 下载失败： " + str2 + " " + str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f39486a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 3);
            messageObtain.obj = bundle;
            b.this.f39484x.sendMessage(messageObtain);
            b.this.a(this.f39486a, str2, false, str);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            p0.a(b.f39460z, "zip 下载成功： " + str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = this.f39486a;
            messageObtain.arg1 = this.f39487b;
            b.this.f39484x.sendMessage(messageObtain);
            if (z10) {
                return;
            }
            b.this.a(this.f39486a, str, true, "");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedWebview f39493a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f39494b;

        public c(MBNativeAdvancedWebview mBNativeAdvancedWebview, String str) {
            this.f39493a = mBNativeAdvancedWebview;
            this.f39494b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f39493a.loadUrl(this.f39494b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            Object obj;
            super.handleMessage(message);
            int i10 = message.what;
            if (i10 == 1) {
                Object obj2 = message.obj;
                int i11 = message.arg1;
                if (obj2 == null || !(obj2 instanceof CampaignEx)) {
                    return;
                }
                CampaignEx campaignEx = (CampaignEx) obj2;
                b.this.a(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip()), campaignEx, i11);
                return;
            }
            if (i10 == 2) {
                Object obj3 = message.obj;
                try {
                    if (obj3 instanceof Bundle) {
                        int i12 = ((Bundle) obj3).getInt("type");
                        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i12 == 1 ? 880004 : i12 == 2 ? 880007 : i12 == 3 ? 880006 : 880024);
                        String string = ((Bundle) obj3).getString(NotificationCompat.CATEGORY_MESSAGE);
                        CampaignEx campaignEx2 = (CampaignEx) ((Bundle) obj3).getSerializable("campaignex");
                        bVar.c(string);
                        bVar.a(campaignEx2);
                        b bVar2 = b.this;
                        bVar2.a(bVar, bVar2.f39474n, b.this.f39475o, campaignEx2);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    com.mbridge.msdk.foundation.error.b bVar3 = new com.mbridge.msdk.foundation.error.b(880000);
                    bVar3.a((Throwable) e10);
                    b bVar4 = b.this;
                    bVar4.a(bVar3, bVar4.f39474n, b.this.f39475o, (CampaignEx) null);
                    return;
                }
            }
            if (i10 == 3) {
                Object obj4 = message.obj;
                if (obj4 == null || !(obj4 instanceof CampaignEx)) {
                    return;
                }
                b bVar5 = b.this;
                bVar5.i((CampaignEx) obj4, bVar5.f39475o);
                return;
            }
            if (i10 != 4) {
                if (i10 == 5 && (obj = message.obj) != null && (obj instanceof CampaignEx)) {
                    if (b.this.f39466f != null) {
                        b.this.f39466f.setVideoReady(true);
                    }
                    b bVar6 = b.this;
                    bVar6.i((CampaignEx) obj, bVar6.f39475o);
                    return;
                }
                return;
            }
            Object obj5 = message.obj;
            if (obj5 == null || !(obj5 instanceof CampaignEx)) {
                return;
            }
            if (b.this.f39466f != null) {
                b.this.f39466f.setEndCardReady(true);
            }
            b bVar7 = b.this;
            bVar7.i((CampaignEx) obj5, bVar7.f39475o);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880010);
            b bVar2 = b.this;
            bVar2.a(bVar, bVar2.f39474n, b.this.f39475o, (CampaignEx) null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g extends com.mbridge.msdk.advanced.request.b {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f39500e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f39501f;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Exception f39503a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f39504b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f39505c;

            public a(Exception exc, int i10, CampaignUnit campaignUnit) {
                this.f39503a = exc;
                this.f39504b = i10;
                this.f39505c = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
                bVar.a((Throwable) this.f39503a);
                g gVar = g.this;
                b bVar2 = b.this;
                String str = gVar.f39500e;
                int i10 = this.f39504b;
                CampaignUnit campaignUnit = this.f39505c;
                bVar2.a(bVar, str, i10, (campaignUnit == null || campaignUnit.getAds() == null || this.f39505c.getAds().size() == 0) ? null : this.f39505c.getAds().get(0));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.mbridge.msdk.advanced.manager.b$g$b, reason: collision with other inner class name */
        public class RunnableC0251b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f39507a;

            public RunnableC0251b(String str) {
                this.f39507a = str;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880002);
                bVar.c(this.f39507a);
                g gVar = g.this;
                b.this.a(bVar, gVar.f39500e, gVar.f39501f, (CampaignEx) null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i10, String str, int i11) {
            super(i10);
            this.f39500e = str;
            this.f39501f = i11;
        }

        @Override // com.mbridge.msdk.advanced.request.b
        public void a(CampaignUnit campaignUnit, int i10) throws Throwable {
            try {
                b bVar = b.this;
                bVar.a(campaignUnit, i10, bVar.f39461a, this.f39500e);
                b.this.f39483w = campaignUnit.getRequestId();
                b.this.f39468h = campaignUnit.getAds();
            } catch (Exception e10) {
                p0.b(b.f39460z, e10.getMessage());
                p0.c(b.f39460z, "onLoadCompaginSuccess 数据刚请求失败");
                if (b.this.f39484x != null) {
                    b.this.f39484x.post(new a(e10, i10, campaignUnit));
                }
                b.this.f();
            }
        }

        @Override // com.mbridge.msdk.advanced.request.b
        public void b(int i10, String str) {
            p0.b(b.f39460z, str);
            p0.c(b.f39460z, "onLoadCompaginFailed load failed errorCode:" + i10 + " msg:" + str);
            if (b.this.f39484x != null) {
                b.this.f39484x.post(new RunnableC0251b(str));
            }
            b.this.f();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h extends c.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f39509a;

        public h(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f39509a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.advanced.report.a.a(str, cVar, this.f39509a, b.this.f39465e, null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f39511a;

        public i(CampaignEx campaignEx) {
            this.f39511a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(b.this.f39465e)).a();
            x.a(b.this.f39465e, this.f39511a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class j implements com.mbridge.msdk.foundation.same.image.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f39513a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f39514b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                b.this.i(jVar.f39513a, jVar.f39514b);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.mbridge.msdk.advanced.manager.b$j$b, reason: collision with other inner class name */
        public class RunnableC0252b implements Runnable {
            public RunnableC0252b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                b.this.i(jVar.f39513a, jVar.f39514b);
            }
        }

        public j(CampaignEx campaignEx, int i10) {
            this.f39513a = campaignEx;
            this.f39514b = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            com.google.android.gms.internal.play_billing.a.D("gifurl 下载失败： ", str2, b.f39460z);
            if (b.this.f39484x != null) {
                b.this.f39484x.post(new RunnableC0252b());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            com.google.android.gms.internal.play_billing.a.D("giturl 下载成功： ", str, b.f39460z);
            if (b.this.f39484x != null) {
                b.this.f39484x.post(new a());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class k implements H5DownLoadManager.ZipDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f39518a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f39519b;

        public k(CampaignEx campaignEx, int i10) {
            this.f39518a = campaignEx;
            this.f39519b = i10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            com.google.android.gms.internal.play_billing.a.D("endcard 下载失败： ", str2, b.f39460z);
            if (b.this.f39466f != null) {
                b.this.f39466f.setEndCardReady(false);
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f39518a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 2);
            messageObtain.obj = bundle;
            b.this.f39484x.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            com.google.android.gms.internal.play_billing.a.D("endcard 下载成功： ", str, b.f39460z);
            if (b.this.f39484x != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                messageObtain.obj = this.f39518a;
                messageObtain.arg1 = this.f39519b;
                b.this.f39484x.sendMessage(messageObtain);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class l implements com.mbridge.msdk.foundation.same.image.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f39521a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f39522b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l lVar = l.this;
                b.this.i(lVar.f39521a, lVar.f39522b);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.mbridge.msdk.advanced.manager.b$l$b, reason: collision with other inner class name */
        public class RunnableC0253b implements Runnable {
            public RunnableC0253b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l lVar = l.this;
                b.this.i(lVar.f39521a, lVar.f39522b);
            }
        }

        public l(CampaignEx campaignEx, int i10) {
            this.f39521a = campaignEx;
            this.f39522b = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            com.google.android.gms.internal.play_billing.a.D("image 下载失败： ", str2, b.f39460z);
            if (b.this.f39484x != null) {
                b.this.f39484x.post(new RunnableC0253b());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            com.google.android.gms.internal.play_billing.a.D("image 下载成功： ", str, b.f39460z);
            if (b.this.f39484x != null) {
                b.this.f39484x.post(new a());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f39526a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f39527b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f39528c;

        public m(File file, CampaignEx campaignEx, int i10) {
            this.f39526a = file;
            this.f39527b = campaignEx;
            this.f39528c = i10;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            b.this.a("file:////" + this.f39526a.getAbsolutePath(), this.f39527b, this.f39528c);
        }
    }

    public b(String str, String str2, long j10) {
        this.f39462b = str;
        this.f39461a = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(CampaignEx campaignEx, int i10) {
        if (!com.mbridge.msdk.advanced.manager.d.a(this.f39466f, campaignEx, this.f39462b, this.f39461a) || this.f39477q) {
            return;
        }
        b();
        com.mbridge.msdk.advanced.manager.d.a(campaignEx, this.f39461a);
        this.f39477q = true;
        com.mbridge.msdk.advanced.middle.b bVar = this.f39464d;
        if (bVar != null) {
            bVar.a(campaignEx, i10);
        }
    }

    private void j(CampaignEx campaignEx, int i10) throws Throwable {
        this.f39469i = campaignEx;
        if (com.mbridge.msdk.advanced.manager.d.a(this.f39466f, campaignEx, this.f39462b, this.f39461a)) {
            i(campaignEx, i10);
        } else {
            e(campaignEx, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f39482v = 0;
    }

    private void g() {
        try {
            int i10 = this.f39482v + 1;
            this.f39482v = i10;
            com.mbridge.msdk.setting.l lVar = this.f39467g;
            if (lVar == null || i10 > lVar.y()) {
                p0.c(f39460z, "onload 重置offset为0");
                this.f39482v = 0;
            }
            p0.c(f39460z, "onload 算出 下次的offset是:" + this.f39482v);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(CampaignEx campaignEx, int i10) {
        if (this.f39466f.isH5Ready()) {
            i(campaignEx, i10);
            com.mbridge.msdk.advanced.report.a.a(1, "", this.f39461a, campaignEx);
        }
    }

    public String c() {
        return com.mbridge.msdk.foundation.same.c.b(this.f39468h);
    }

    public String d() {
        return this.f39483w;
    }

    public void e() {
        if (this.f39464d != null) {
            this.f39464d = null;
        }
        if (this.f39478r != null) {
            this.f39478r = null;
        }
        if (this.f39479s != null) {
            this.f39479s = null;
        }
    }

    private void c(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.m().d()).a(campaignEx.getImageUrl(), new l(campaignEx, i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce A[Catch: all -> 0x00b2, Exception -> 0x0129, TRY_ENTER, TryCatch #2 {Exception -> 0x0129, blocks: (B:44:0x00ce, B:46:0x00d2, B:48:0x00d8, B:50:0x00de, B:52:0x00e4, B:54:0x00f6, B:55:0x00ff, B:33:0x00ae), top: B:82:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8 A[Catch: all -> 0x00b2, Exception -> 0x0129, TryCatch #2 {Exception -> 0x0129, blocks: (B:44:0x00ce, B:46:0x00d2, B:48:0x00d8, B:50:0x00de, B:52:0x00e4, B:54:0x00f6, B:55:0x00ff, B:33:0x00ae), top: B:82:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ff A[Catch: all -> 0x00b2, Exception -> 0x0129, TRY_LEAVE, TryCatch #2 {Exception -> 0x0129, blocks: (B:44:0x00ce, B:46:0x00d2, B:48:0x00d8, B:50:0x00de, B:52:0x00e4, B:54:0x00f6, B:55:0x00ff, B:33:0x00ae), top: B:82:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0117 A[Catch: IOException -> 0x011b, TRY_ENTER, TRY_LEAVE, TryCatch #12 {IOException -> 0x011b, blocks: (B:70:0x0135, B:57:0x0117), top: B:81:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d(com.mbridge.msdk.foundation.entity.CampaignEx r11, int r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.advanced.manager.b.d(com.mbridge.msdk.foundation.entity.CampaignEx, int):void");
    }

    private void f(CampaignEx campaignEx, int i10) {
        this.f39478r = new d(campaignEx);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f39465e, this.f39461a, copyOnWriteArrayList, 298, this.f39478r);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().b(298, this.f39461a, campaignEx.isBidCampaign())) {
            p0.a(f39460z, " load Video");
            com.mbridge.msdk.videocommon.download.b.getInstance().load(this.f39461a);
        } else {
            p0.a(f39460z, " load Video isReady true");
            this.f39466f.setVideoReady(true);
            i(campaignEx, i10);
        }
    }

    public void b(String str, int i10) throws Throwable {
        String str2;
        CampaignEx campaignExA;
        List<Integer> listC;
        this.f39477q = false;
        this.f39474n = str;
        this.f39475o = i10;
        this.f39469i = null;
        if (this.f39466f == null) {
            a(new com.mbridge.msdk.foundation.error.b(880030), str, i10, (CampaignEx) null);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f39466f, this.f39462b, this.f39461a, str, this.f39470j, false, false);
            str2 = str;
        } else {
            str2 = str;
            campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f39466f, this.f39462b, this.f39461a, str2, this.f39470j, false, true);
        }
        long timestamp = campaignExA != null ? campaignExA.getTimestamp() : 0L;
        com.mbridge.msdk.setting.l lVar = this.f39467g;
        if (lVar != null && lVar.t() == 1 && this.f39466f != null && campaignExA != null) {
            j(campaignExA, i10);
            return;
        }
        this.f39476p = false;
        com.mbridge.msdk.setting.l lVar2 = this.f39467g;
        if (lVar2 != null && (listC = lVar2.c()) != null && listC.size() > 0) {
            this.f39463c = listC.get(0).intValue() * 1000;
        } else {
            this.f39463c = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        }
        p0.a(f39460z, "开始从V3请求新的 offer，超时 ：" + this.f39463c);
        if (this.f39467g == null || timestamp <= 0 || !TextUtils.isEmpty(str2)) {
            a(this.f39463c);
            a(this.f39465e, str2, i10);
        } else if (System.currentTimeMillis() - timestamp > this.f39467g.v() * 1000) {
            a(this.f39463c);
            a(this.f39465e, str2, i10);
        } else {
            j(campaignExA, i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements com.mbridge.msdk.videocommon.listener.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f39496a;

        public d(CampaignEx campaignEx) {
            this.f39496a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            p0.a(b.f39460z, "Video 下载成功： " + str);
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f39496a;
            messageObtain.what = 5;
            b.this.f39484x.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            p0.a(b.f39460z, "Video 下载失败： " + str);
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f39496a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 1);
            messageObtain.obj = bundle;
            messageObtain.what = 2;
            b.this.f39484x.sendMessage(messageObtain);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.advanced.manager.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0250b extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f39489a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f39490b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f39491c;

        public C0250b(CampaignEx campaignEx, int i10, long j10) {
            this.f39489a = campaignEx;
            this.f39490b = i10;
            this.f39491c = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) throws Throwable {
            super.a(webView, i10);
            p0.b("NativeAdvancedLoadManager", rJqlArycrfkilN.OPqWjv + i10);
            if (i10 != 1) {
                b.this.a(this.f39489a, "readyState 2", this.f39490b);
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f39489a, b.this.f39461a, "readyState 2", this.f39491c, 3);
                return;
            }
            b.this.f39466f.setH5Ready(true);
            com.mbridge.msdk.advanced.common.c.a(b.this.f39462b + b.this.f39461a + this.f39489a.getRequestId(), true);
            b.this.h(this.f39489a, this.f39490b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f39489a, b.this.f39461a, "", this.f39491c, 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10, String str, String str2) throws Throwable {
            super.a(webView, i10, str, str2);
            p0.b("NativeAdvancedLoadManager", "onReceivedError： " + i10 + "  " + str + "  " + str2);
            b.this.a(this.f39489a, str, this.f39490b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f39489a, b.this.f39461a, o2.k(i10, "error code:", str), this.f39491c, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) throws Throwable {
            super.a(webView, sslErrorHandler, sslError);
            p0.b("NativeAdvancedLoadManager", "onReceivedSslError: " + sslError.getPrimaryError());
            b.this.a(this.f39489a, "onReceivedSslError:" + sslError.getUrl(), this.f39490b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f39489a, b.this.f39461a, "error url:" + sslError.getUrl(), this.f39491c, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, String str) {
            super.a(webView, str);
            p0.b("NativeAdvancedLoadManager", "onPageFinished");
            if (!this.f39489a.isHasMBTplMark()) {
                b.this.f39466f.setH5Ready(true);
                p0.b("NativeAdvancedLoadManager", "=======onPageFinished OK");
                com.mbridge.msdk.advanced.common.c.a(b.this.f39462b + b.this.f39461a + this.f39489a.getRequestId(), true);
                b.this.h(this.f39489a, this.f39490b);
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f39489a, b.this.f39461a, "", this.f39491c, 1);
            }
            com.mbridge.msdk.advanced.signal.a.a(webView);
        }
    }

    private void e(CampaignEx campaignEx, int i10) throws Throwable {
        MBNativeAdvancedView mBNativeAdvancedView = this.f39466f;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.clearResState();
        }
        if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            p0.a(f39460z, "开始下载zip： " + campaignEx.getAdZip());
            g(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getAdHtml())) {
            p0.a(f39460z, "开始下载HTML： " + campaignEx.getAdHtml());
            d(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            p0.a(f39460z, "开始下载Video： " + campaignEx.getVideoUrlEncode());
            f(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
            p0.a(f39460z, "开始下载image： " + campaignEx.getImageUrl());
            c(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
            p0.a(f39460z, "开始下载EndCard： " + campaignEx.getendcard_url());
            a(campaignEx, i10);
        }
        if (TextUtils.isEmpty(campaignEx.getGifUrl())) {
            return;
        }
        p0.a(f39460z, "开始下载gitUrl： " + campaignEx.getGifUrl());
        b(campaignEx, i10);
    }

    private void g(CampaignEx campaignEx, int i10) {
        String adZip;
        this.f39479s = new a(campaignEx, i10);
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(campaignEx);
        if (campaignEx != null) {
            i = campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0;
            adZip = campaignEx.getAdZip();
        } else {
            adZip = "";
        }
        cVar.f(i);
        cVar.e(2);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, adZip, this.f39479s);
    }

    public void a(com.mbridge.msdk.setting.l lVar) {
        this.f39467g = lVar;
    }

    public void a(MBNativeAdvancedView mBNativeAdvancedView) {
        this.f39466f = mBNativeAdvancedView;
    }

    public void a(int i10) {
        this.f39470j = i10;
    }

    public void a(int i10, int i11) {
        this.f39473m = i10;
        this.f39472l = i11;
    }

    private void a(long j10) {
        this.f39484x.postDelayed(this.f39485y, j10);
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
                if (z0.a(this.f39461a)) {
                    a(new com.mbridge.msdk.foundation.error.b(880032), str, i10, (CampaignEx) null);
                    return;
                }
                try {
                    com.mbridge.msdk.advanced.manager.d.b(this.f39461a);
                } catch (Throwable th2) {
                    p0.b(f39460z, th2.getMessage());
                }
                p0.c(f39460z, "load 开始准备请求参数");
                MBridgeIds mBridgeIds = new MBridgeIds(this.f39462b, this.f39461a);
                com.mbridge.msdk.advanced.request.f fVar = new com.mbridge.msdk.advanced.request.f();
                fVar.d(i10);
                fVar.c(this.f39482v);
                fVar.a(this.f39481u);
                fVar.b(this.f39473m);
                fVar.a(this.f39472l);
                com.mbridge.msdk.foundation.same.net.wrapper.e eVarB = com.mbridge.msdk.advanced.request.e.b(context, mBridgeIds, fVar);
                if (eVarB == null) {
                    p0.c(f39460z, "load 请求参数为空 load失败");
                    a(new com.mbridge.msdk.foundation.error.b(880001), str, i10, (CampaignEx) null);
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    eVarB.a("token", str);
                }
                String strD = u0.d(this.f39461a);
                if (!TextUtils.isEmpty(strD)) {
                    eVarB.a("j", strD);
                }
                str2 = str;
                try {
                    new com.mbridge.msdk.advanced.request.c(context).choiceV3OrV5BySetting(1, eVarB, a(str, i10), str2, com.mbridge.msdk.foundation.same.c.a(this.f39463c, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                } catch (Exception e10) {
                    e = e10;
                    exc = e;
                    p0.b(f39460z, exc.getMessage());
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

    private void b() {
        this.f39484x.removeCallbacks(this.f39485y);
    }

    private void b(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.m().d()).a(campaignEx.getGifUrl(), new j(campaignEx, i10));
    }

    private com.mbridge.msdk.advanced.request.b a(String str, int i10) {
        g gVar = new g(i10, str, i10);
        gVar.a(str);
        gVar.setUnitId(this.f39461a);
        gVar.setPlacementId(this.f39462b);
        gVar.setAdType(298);
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignUnit campaignUnit, int i10, String str, String str2) throws Throwable {
        String str3;
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 298);
        if (!TextUtils.isEmpty(str2)) {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        }
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            str3 = str2;
        } else {
            str3 = str2;
            campaignUnit.setLocalRequestId(com.mbridge.msdk.foundation.same.report.metrics.d.b().a(i10 == 1, str3, eVar, campaignUnit.getAds().get(0), str).o());
        }
        List<CampaignEx> listA = a(campaignUnit);
        if (listA != null && listA.size() > 0) {
            g();
            p0.c(f39460z, "onload load成功 size:" + listA.size());
            CampaignEx campaignEx = listA.get(0);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
                campaignEx.setHasMBTplMark(false);
                campaignEx.setIsMraid(true);
            } else {
                campaignEx.setHasMBTplMark(true);
                campaignEx.setIsMraid(false);
            }
            j(campaignEx, i10);
            return;
        }
        p0.c(f39460z, "onload load失败 返回的compaign没有可以用的");
        a(new com.mbridge.msdk.foundation.error.b(880033), str3, i10, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
    }

    private List<CampaignEx> a(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = campaignUnit.getAds().get(0);
        campaignEx.setLocalRequestId(campaignUnit.getLocalRequestId());
        campaignEx.setCampaignUnitId(this.f39461a);
        a(campaignEx);
        this.f39481u = campaignUnit.getSessionId();
        if (campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getAdZip()) || !TextUtils.isEmpty(campaignEx.getAdHtml()))) {
            if (u0.c(campaignEx)) {
                campaignEx.setRtinsType(u0.c(this.f39465e, campaignEx.getPackageName()) ? 1 : 2);
            }
            if (com.mbridge.msdk.foundation.same.c.b(this.f39465e, campaignEx)) {
                arrayList.add(campaignEx);
            } else {
                u0.a(this.f39461a, campaignEx, com.mbridge.msdk.foundation.same.a.f40727x);
            }
            a(campaignEx, (com.mbridge.msdk.foundation.same.report.metrics.c) null, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
        return arrayList;
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.f39465e, cVar, new h(campaignEx, aVar));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(CampaignEx campaignEx) {
        new Thread(new i(campaignEx)).start();
    }

    public void a(com.mbridge.msdk.advanced.middle.b bVar) {
        this.f39464d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, String str, int i10, CampaignEx campaignEx) throws Throwable {
        if (this.f39476p) {
            this.f39476p = false;
            a(bVar, i10, str);
        } else {
            if (bVar != null) {
                bVar.a(campaignEx);
            }
            a(bVar, i10, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, String str) throws Throwable {
        CampaignEx campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f39466f, this.f39462b, this.f39461a, str, this.f39470j, true, true);
        if (campaignExA != null) {
            p0.b(f39460z, "load failed cache ");
            j(campaignExA, i10);
        } else {
            a(bVar, i10, campaignExA);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, CampaignEx campaignEx) {
        if (this.f39477q) {
            return;
        }
        b();
        if (bVar != null) {
            p0.b(f39460z, "real failed: " + bVar.g());
        }
        this.f39477q = true;
        com.mbridge.msdk.advanced.middle.b bVar2 = this.f39464d;
        if (bVar2 != null) {
            bVar2.a(bVar, i10);
        }
    }

    private void a(CampaignEx campaignEx, int i10) {
        String str;
        this.f39480t = new k(campaignEx, i10);
        if (campaignEx != null) {
            i = campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0;
            str = campaignEx.getendcard_url();
        } else {
            str = "";
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(campaignEx);
        cVar.f(i);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, str, this.f39480t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, CampaignEx campaignEx, int i10) throws Throwable {
        MBNativeAdvancedView mBNativeAdvancedView = this.f39466f;
        if (mBNativeAdvancedView == null || mBNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        com.mbridge.msdk.advanced.report.a.b(this.f39461a, campaignEx);
        com.mbridge.msdk.advanced.signal.b bVar = new com.mbridge.msdk.advanced.signal.b(this.f39466f.getContext(), this.f39462b, this.f39461a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        bVar.a(arrayList);
        bVar.a(this.f39470j);
        bVar.b(this.f39471k);
        this.f39466f.setAdvancedNativeSignalCommunicationImpl(bVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        MBNativeAdvancedWebview advancedNativeWebview = this.f39466f.getAdvancedNativeWebview();
        if (advancedNativeWebview == null) {
            a(campaignEx, "webview is null", i10);
            return;
        }
        if (advancedNativeWebview.isDestoryed()) {
            a(campaignEx, "webview is destroyed", i10);
            return;
        }
        advancedNativeWebview.setWebViewListener(new C0250b(campaignEx, i10, jCurrentTimeMillis));
        if (!advancedNativeWebview.isDestoryed()) {
            com.google.android.gms.internal.play_billing.a.v("=======开始渲染: ", str, f39460z);
            Handler handler = this.f39484x;
            if (handler != null) {
                handler.post(new c(advancedNativeWebview, str));
                return;
            }
            return;
        }
        a(new com.mbridge.msdk.foundation.error.b(880031), this.f39474n, i10, campaignEx);
        com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), campaignEx, this.f39461a, "webview had destory", jCurrentTimeMillis, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, String str, int i10) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880009);
        bVar.c(str);
        a(bVar, this.f39474n, i10, campaignEx);
        com.mbridge.msdk.advanced.report.a.a(2, str, this.f39461a, campaignEx);
    }

    public String a(String str) {
        int iJ;
        if (this.f39469i != null) {
            try {
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f39461a, this.f39469i.getId() + this.f39469i.getVideoUrlEncode() + this.f39469i.getBidToken());
                if (aVarA != null && (iJ = aVarA.j()) == 5) {
                    String strK = aVarA.k();
                    if (new File(strK).exists()) {
                        p0.b(f39460z, "本地已下载完 拿本地播放地址：" + strK + " state：" + iJ);
                        return strK;
                    }
                }
            } catch (Exception e10) {
                p0.b(f39460z, e10.getMessage());
            }
            return str;
        }
        return "";
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
                p0.b(f39460z, e10.getMessage());
            }
        }
    }
}
