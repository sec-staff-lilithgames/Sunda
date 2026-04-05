package com.mbridge.msdk.advanced.manager;

import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static String f39532a = "ResManager";

    /* renamed from: b, reason: collision with root package name */
    private static int f39533b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static e f39534c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.m().d()));

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedWebview f39540a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f39541b;

        public b(MBNativeAdvancedWebview mBNativeAdvancedWebview, String str) {
            this.f39540a = mBNativeAdvancedWebview;
            this.f39541b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f39540a.loadUrl(this.f39541b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.mbridge.msdk.foundation.entity.CampaignEx a(com.mbridge.msdk.advanced.view.MBNativeAdvancedView r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.advanced.manager.d.a(com.mbridge.msdk.advanced.view.MBNativeAdvancedView, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean):com.mbridge.msdk.foundation.entity.CampaignEx");
    }

    public static void b(String str) {
        if (f39534c == null) {
            f39534c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
        }
        f39534c.a(str, 0, f39533b);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f39535a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f39536b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f39537c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedView f39538d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f39539e;

        public a(String str, String str2, CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView, long j10) {
            this.f39535a = str;
            this.f39536b = str2;
            this.f39537c = campaignEx;
            this.f39538d = mBNativeAdvancedView;
            this.f39539e = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            super.a(webView, i10);
            if (i10 != 1) {
                this.f39538d.setH5Ready(false);
                p0.a("WindVaneWebView", "======渲染失败");
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f39537c, this.f39536b, "readyState 2", this.f39539e, 3);
                return;
            }
            com.mbridge.msdk.advanced.common.c.a(this.f39535a + this.f39536b + this.f39537c.getRequestId(), true);
            this.f39538d.setH5Ready(true);
            p0.a("WindVaneWebView", "======渲染成功：ready");
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f39537c, this.f39536b, "", this.f39539e, 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10, String str, String str2) {
            super.a(webView, i10, str, str2);
            this.f39538d.setH5Ready(false);
            p0.a("WindVaneWebView", "======渲染失败");
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f39537c, this.f39536b, o2.k(i10, "error code:", str), this.f39539e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.a(webView, sslErrorHandler, sslError);
            this.f39538d.setH5Ready(false);
            p0.a("WindVaneWebView", "======渲染失败");
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f39537c, this.f39536b, "error url:" + sslError.getUrl(), this.f39539e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, String str) {
            super.a(webView, str);
            if (!this.f39537c.isHasMBTplMark()) {
                com.mbridge.msdk.advanced.common.c.a(this.f39535a + this.f39536b + this.f39537c.getRequestId(), true);
                this.f39538d.setH5Ready(true);
                p0.a("WindVaneWebView", "======渲染成功：finish");
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f39537c, this.f39536b, "", this.f39539e, 1);
            }
            com.mbridge.msdk.advanced.signal.a.a(webView);
        }
    }

    private static List<CampaignEx> a(String str, String str2) {
        if (f39534c == null) {
            f39534c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
        }
        return f39534c.b(str, 0, 0, f39533b);
    }

    private static CampaignEx a(CampaignEx campaignEx) {
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
            campaignEx.setHasMBTplMark(false);
            campaignEx.setIsMraid(true);
            return campaignEx;
        }
        campaignEx.setHasMBTplMark(true);
        campaignEx.setIsMraid(false);
        return campaignEx;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.mbridge.msdk.advanced.view.MBNativeAdvancedView r9, com.mbridge.msdk.foundation.entity.CampaignEx r10, java.lang.String r11, java.lang.String r12, int r13, boolean r14) {
        /*
            r6 = 0
            if (r10 == 0) goto Leb
            r9.clearResState()
            java.lang.String r1 = r10.getVideoUrlEncode()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r7 = 1
            if (r1 != 0) goto L26
            com.mbridge.msdk.videocommon.download.b r1 = com.mbridge.msdk.videocommon.download.b.getInstance()
            boolean r2 = r10.isBidCampaign()
            r3 = 298(0x12a, float:4.18E-43)
            boolean r1 = r1.b(r3, r12, r2)
            if (r1 == 0) goto L24
            r9.setVideoReady(r7)
        L24:
            r8 = r1
            goto L2a
        L26:
            r9.setVideoReady(r7)
            r8 = r7
        L2a:
            java.lang.String r1 = r10.getendcard_url()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L4f
            boolean r1 = r9.isEndCardReady()
            if (r1 != 0) goto L4f
            com.mbridge.msdk.foundation.download.download.H5DownLoadManager r1 = com.mbridge.msdk.foundation.download.download.H5DownLoadManager.getInstance()
            java.lang.String r2 = r10.getendcard_url()
            java.lang.String r1 = r1.getH5ResAddress(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L4f
            r9.setEndCardReady(r7)
        L4f:
            java.lang.String r1 = r10.getAdZip()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L95
            boolean r1 = r9.isH5Ready()
            if (r1 != 0) goto L95
            com.mbridge.msdk.foundation.download.download.H5DownLoadManager r1 = com.mbridge.msdk.foundation.download.download.H5DownLoadManager.getInstance()
            java.lang.String r2 = r10.getAdZip()
            java.lang.String r1 = r1.getH5ResAddress(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L94
            java.lang.StringBuilder r2 = a.b.t(r11, r12)
            java.lang.String r3 = r10.getRequestId()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r2 = com.mbridge.msdk.advanced.common.c.a(r2)
            if (r2 == 0) goto L8a
            r9.setH5Ready(r7)
            goto L95
        L8a:
            r0 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            a(r0, r1, r2, r3, r4, r5)
            if (r14 != 0) goto L95
        L94:
            r8 = r6
        L95:
            java.lang.String r1 = r10.getAdZip()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto Lea
            java.lang.String r1 = r10.getAdHtml()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lea
            boolean r1 = r9.isH5Ready()
            if (r1 != 0) goto Lea
            java.lang.String r1 = r10.getAdHtml()
            java.lang.String r1 = a(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto Le9
            java.lang.StringBuilder r2 = a.b.t(r11, r12)
            java.lang.String r3 = r10.getRequestId()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r2 = com.mbridge.msdk.advanced.common.c.a(r2)
            if (r2 == 0) goto Ldf
            r9.setH5Ready(r7)
            boolean r1 = r10.isMraid()
            if (r1 == 0) goto Lde
            r9.setVideoReady(r7)
        Lde:
            return r7
        Ldf:
            r0 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            a(r0, r1, r2, r3, r4, r5)
            if (r14 != 0) goto Lea
        Le9:
            return r6
        Lea:
            return r8
        Leb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.advanced.manager.d.a(com.mbridge.msdk.advanced.view.MBNativeAdvancedView, com.mbridge.msdk.foundation.entity.CampaignEx, java.lang.String, java.lang.String, int, boolean):boolean");
    }

    private static void a(MBNativeAdvancedView mBNativeAdvancedView, String str, CampaignEx campaignEx, String str2, String str3, int i10) {
        if (mBNativeAdvancedView == null || mBNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        com.mbridge.msdk.advanced.report.a.b(str3, campaignEx);
        com.mbridge.msdk.advanced.signal.b bVar = new com.mbridge.msdk.advanced.signal.b(mBNativeAdvancedView.getContext(), str2, str3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        bVar.a(arrayList);
        bVar.a(i10);
        mBNativeAdvancedView.setAdvancedNativeSignalCommunicationImpl(bVar);
        MBNativeAdvancedWebview advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview();
        long jCurrentTimeMillis = System.currentTimeMillis();
        advancedNativeWebview.setWebViewListener(new a(str2, str3, campaignEx, mBNativeAdvancedView, jCurrentTimeMillis));
        if (!advancedNativeWebview.isDestoryed()) {
            p0.a(f39532a, "======开始渲染：" + str);
            new Handler(Looper.getMainLooper()).post(new b(advancedNativeWebview, str));
            return;
        }
        mBNativeAdvancedView.setH5Ready(false);
        com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), campaignEx, str3, "webview had destory", jCurrentTimeMillis, 3);
    }

    private static String a(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            return "file:///" + file.getAbsolutePath();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Exception e10) {
                e10.getMessage();
                return "";
            }
        }
    }

    public static boolean a(MBNativeAdvancedView mBNativeAdvancedView, CampaignEx campaignEx, String str, String str2) {
        boolean zA;
        boolean z10 = false;
        if (mBNativeAdvancedView == null) {
            p0.b(f39532a, "mbAdvancedNativeView  is null");
            return false;
        }
        if (TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            zA = true;
        } else {
            zA = mBNativeAdvancedView.isVideoReady();
            p0.b(f39532a, "======isReady isVideoReady:" + zA);
        }
        if (zA && !TextUtils.isEmpty(campaignEx.getAdZip())) {
            StringBuilder sbT = a.b.t(str, str2);
            sbT.append(campaignEx.getRequestId());
            zA = com.mbridge.msdk.advanced.common.c.a(sbT.toString());
            p0.b(f39532a, "======isReady getAdZip:" + zA);
        }
        if (zA && TextUtils.isEmpty(campaignEx.getAdZip()) && !TextUtils.isEmpty(campaignEx.getAdHtml())) {
            StringBuilder sbT2 = a.b.t(str, str2);
            sbT2.append(campaignEx.getRequestId());
            zA = com.mbridge.msdk.advanced.common.c.a(sbT2.toString());
            p0.b(f39532a, "======isReady getAdHtml:" + zA);
        }
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && TextUtils.isEmpty(campaignEx.getAdHtml())) {
            p0.b(f39532a, "======isReady getAdHtml  getAdZip all are empty");
        } else {
            z10 = zA;
        }
        if (!z10 || TextUtils.isEmpty(campaignEx.getendcard_url())) {
            return z10;
        }
        boolean zIsEndCardReady = mBNativeAdvancedView.isEndCardReady();
        p0.b(f39532a, "======isReady isEndCardReady:" + zIsEndCardReady);
        return zIsEndCardReady;
    }

    public static void a(CampaignEx campaignEx, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        if (f39534c == null) {
            f39534c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
        }
        f39534c.a(arrayList, str);
    }

    public static void a(long j10, String str) {
        if (f39534c == null) {
            f39534c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
        }
        f39534c.a(j10, str);
    }
}
