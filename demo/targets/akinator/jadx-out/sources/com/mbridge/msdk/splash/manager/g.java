package com.mbridge.msdk.splash.manager;

import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.MBSplashWebview;
import java.util.ArrayList;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f42901a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f42902b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final g f42909a = new g(null);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface c {
        void a();

        void a(int i10);

        void onError(String str);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private String f42910a;

        /* renamed from: b, reason: collision with root package name */
        private String f42911b;

        /* renamed from: c, reason: collision with root package name */
        private CampaignEx f42912c;

        /* renamed from: d, reason: collision with root package name */
        private String f42913d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f42914e;

        /* renamed from: f, reason: collision with root package name */
        private int f42915f;

        public void a(String str) {
            this.f42913d = str;
        }

        public void b(String str) {
            this.f42910a = str;
        }

        public String c() {
            return this.f42913d;
        }

        public String d() {
            return this.f42910a;
        }

        public String e() {
            return this.f42911b;
        }

        public boolean f() {
            return this.f42914e;
        }

        public CampaignEx a() {
            return this.f42912c;
        }

        public int b() {
            return this.f42915f;
        }

        public void c(String str) {
            this.f42911b = str;
        }

        public void a(CampaignEx campaignEx) {
            this.f42912c = campaignEx;
        }

        public void a(boolean z10) {
            this.f42914e = z10;
        }

        public void a(int i10) {
            this.f42915f = i10;
        }
    }

    public /* synthetic */ g(a aVar) {
        this();
    }

    private g() {
        this.f42901a = false;
        this.f42902b = false;
    }

    public static g a() {
        return b.f42909a;
    }

    public void b() {
        this.f42901a = false;
        this.f42902b = false;
    }

    public void a(MBSplashView mBSplashView, d dVar, c cVar) {
        String requestId;
        if (mBSplashView == null || dVar == null) {
            return;
        }
        String strE = dVar.e();
        String strD = dVar.d();
        CampaignEx campaignExA = dVar.a();
        String strC = dVar.c();
        boolean zF = dVar.f();
        int iB = dVar.b();
        MBSplashWebview splashWebview = mBSplashView.getSplashWebview();
        if (splashWebview == null) {
            return;
        }
        com.mbridge.msdk.splash.signal.b bVar = new com.mbridge.msdk.splash.signal.b(mBSplashView.getContext(), strD, strE);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignExA);
        bVar.a(arrayList);
        bVar.a(zF ? 1 : 0);
        bVar.b(iB);
        mBSplashView.setSplashSignalCommunicationImpl(bVar);
        if (TextUtils.isEmpty(campaignExA.getRequestId())) {
            requestId = campaignExA.getRequestIdNotice();
        } else {
            requestId = campaignExA.getRequestId();
        }
        String requestId2 = splashWebview.getRequestId();
        p0.b("WebViewRenderManager", "CampaignEx RequestId = " + requestId + " WebView RequestId = " + requestId2);
        if (!TextUtils.isEmpty(requestId2) && requestId2.equals(requestId) && (this.f42901a || this.f42902b)) {
            mBSplashView.setH5Ready(true);
            if (cVar != null) {
                cVar.a(1);
                return;
            }
            return;
        }
        b();
        splashWebview.setRequestId(requestId);
        com.mbridge.msdk.splash.report.a.b(strE, campaignExA);
        long jCurrentTimeMillis = System.currentTimeMillis();
        splashWebview.setWebViewListener(new a(cVar, mBSplashView, campaignExA, strE, jCurrentTimeMillis));
        if (!splashWebview.isDestoryed()) {
            splashWebview.loadUrl(strC);
        } else {
            mBSplashView.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), campaignExA, strE, "webview had destory", jCurrentTimeMillis, 3);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f42903a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MBSplashView f42904b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f42905c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f42906d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f42907e;

        public a(c cVar, MBSplashView mBSplashView, CampaignEx campaignEx, String str, long j10) {
            this.f42903a = cVar;
            this.f42904b = mBSplashView;
            this.f42905c = campaignEx;
            this.f42906d = str;
            this.f42907e = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            super.a(webView, i10);
            c cVar = this.f42903a;
            if (cVar != null) {
                cVar.a(i10);
            }
            if (i10 == 1) {
                g.this.f42901a = true;
                this.f42904b.setH5Ready(true);
                com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f42905c, this.f42906d, "", this.f42907e, 1);
                com.mbridge.msdk.splash.report.a.a(1, "", this.f42906d, this.f42905c);
                return;
            }
            g.this.f42901a = false;
            this.f42904b.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(2, "readyState 2", this.f42906d, this.f42905c);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f42905c, this.f42906d, "readyState 2", this.f42907e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10, String str, String str2) {
            super.a(webView, i10, str, str2);
            c cVar = this.f42903a;
            if (cVar != null) {
                cVar.onError(str);
            }
            g.this.b();
            this.f42904b.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(2, "error code:" + i10 + str, this.f42906d, this.f42905c);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f42905c, this.f42906d, o2.k(i10, "error code:", str), this.f42907e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.a(webView, sslErrorHandler, sslError);
            c cVar = this.f42903a;
            if (cVar != null) {
                cVar.onError(sslError.toString());
            }
            g.this.b();
            this.f42904b.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(2, "error url:" + sslError.getUrl(), this.f42906d, this.f42905c);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f42905c, this.f42906d, "error url:" + sslError.getUrl(), this.f42907e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, String str) {
            super.a(webView, str);
            c cVar = this.f42903a;
            if (cVar != null) {
                cVar.a();
            }
            g.this.f42902b = true;
            if (!this.f42905c.isHasMBTplMark()) {
                this.f42904b.setH5Ready(true);
                com.mbridge.msdk.splash.report.a.a(1, "", this.f42906d, this.f42905c);
                com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f42905c, this.f42906d, "", this.f42907e, 1);
            }
            com.mbridge.msdk.splash.signal.c.a(webView);
        }
    }
}
