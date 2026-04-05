package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.video.signal.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class a implements com.mbridge.msdk.video.signal.d {

    /* renamed from: j, reason: collision with root package name */
    protected String f45208j;

    /* renamed from: k, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.setting.c f45209k;

    /* renamed from: l, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f45210l;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f45199a = false;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f45200b = false;

    /* renamed from: c, reason: collision with root package name */
    protected int f45201c = 0;

    /* renamed from: d, reason: collision with root package name */
    protected int f45202d = 0;

    /* renamed from: e, reason: collision with root package name */
    protected int f45203e = 0;

    /* renamed from: f, reason: collision with root package name */
    protected int f45204f = 0;

    /* renamed from: g, reason: collision with root package name */
    protected int f45205g = 0;

    /* renamed from: h, reason: collision with root package name */
    protected int f45206h = 1;

    /* renamed from: i, reason: collision with root package name */
    protected int f45207i = -1;

    /* renamed from: m, reason: collision with root package name */
    public a.InterfaceC0353a f45211m = new C0354a();

    /* renamed from: n, reason: collision with root package name */
    protected int f45212n = 2;

    /* renamed from: o, reason: collision with root package name */
    protected int f45213o = 2;

    /* renamed from: p, reason: collision with root package name */
    private AdSession f45214p = null;

    /* renamed from: q, reason: collision with root package name */
    private MediaEvents f45215q = null;

    /* renamed from: r, reason: collision with root package name */
    private AdEvents f45216r = null;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.video.signal.impl.a$a, reason: collision with other inner class name */
    public static class C0354a implements a.InterfaceC0353a {
        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0353a
        public void a(boolean z10) {
            p0.a("DefaultJSCommon", "onStartInstall");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            p0.a("DefaultJSCommon", "onDismissLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            p0.a("DefaultJSCommon", "onDownloadFinish,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
            p0.a("DefaultJSCommon", "onDownloadProgress,progress:" + i10);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            p0.a("DefaultJSCommon", "onDownloadStart,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            p0.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0353a
        public void onInitSuccess() {
            p0.a("DefaultJSCommon", "onInitSuccess");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            p0.a("DefaultJSCommon", "onInterceptDefaultLoadingDialog");
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            p0.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            p0.a("DefaultJSCommon", "onShowLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            p0.a("DefaultJSCommon", "onStartRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0353a
        public void a(int i10, String str) {
            p0.a("DefaultJSCommon", "onH5Error,code:" + i10 + "，msg:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0353a
        public void a() {
            p0.a("DefaultJSCommon", "videoLocationReady");
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(boolean z10) {
        p0.a("DefaultJSCommon", "setIsShowingTransparent:" + z10);
        this.f45200b = z10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(int i10) {
        this.f45201c = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void c(int i10) {
        this.f45203e = i10;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i10, String str) {
        p0.a("DefaultJSCommon", "click:type" + i10 + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void d(int i10) {
        p0.a("DefaultJSCommon", "setAlertDialogRole " + i10);
        this.f45206h = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void e(int i10) {
        this.f45202d = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String f(int i10) {
        p0.a("DefaultJSCommon", "getSDKInfo");
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void g(int i10) {
        this.f45212n = i10;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i10, String str) {
        p0.a("DefaultJSCommon", "handlerH5Exception,code=" + i10 + ",msg:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int i() {
        return this.f45207i;
    }

    public AdEvents j() {
        return this.f45216r;
    }

    public AdSession k() {
        return this.f45214p;
    }

    public int l() {
        if (this.f45201c == 0 && this.f45200b) {
            this.f45201c = 1;
        }
        return this.f45201c;
    }

    public int m() {
        if (this.f45202d == 0 && this.f45200b) {
            this.f45202d = 1;
        }
        return this.f45202d;
    }

    public int n() {
        if (this.f45203e == 0 && this.f45200b) {
            this.f45203e = 1;
        }
        return this.f45203e;
    }

    public MediaEvents o() {
        return this.f45215q;
    }

    public boolean p() {
        return this.f45200b;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void release() {
        p0.a("DefaultJSCommon", "release");
        com.mbridge.msdk.click.a aVar = this.f45210l;
        if (aVar != null) {
            aVar.a(false);
            this.f45210l.a((NativeListener.NativeTrackingListener) null);
            this.f45210l.c();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setActivity(Activity activity) {
        p0.a("DefaultJSCommon", "setActivity ");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setAdEvents(AdEvents adEvents) {
        this.f45216r = adEvents;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setAdSession(AdSession adSession) {
        this.f45214p = adSession;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setRewardUnitSetting(com.mbridge.msdk.videocommon.setting.c cVar) {
        p0.a("DefaultJSCommon", "setSetting:" + cVar);
        this.f45209k = cVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setUnitId(String str) {
        com.google.android.gms.internal.play_billing.a.D("setUnitId:", str, "DefaultJSCommon");
        this.f45208j = str;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f45215q = mediaEvents;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setWebViewFront(int i10) {
        this.f45205g = i10;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements a.InterfaceC0353a {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.signal.d f45217a;

        /* renamed from: b, reason: collision with root package name */
        private a.InterfaceC0353a f45218b;

        public b(com.mbridge.msdk.video.signal.d dVar, a.InterfaceC0353a interfaceC0353a) {
            this.f45217a = dVar;
            this.f45218b = interfaceC0353a;
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0353a
        public void a(boolean z10) {
            a.InterfaceC0353a interfaceC0353a = this.f45218b;
            if (interfaceC0353a != null) {
                interfaceC0353a.a(z10);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            a.InterfaceC0353a interfaceC0353a = this.f45218b;
            if (interfaceC0353a != null) {
                interfaceC0353a.onDismissLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            a.InterfaceC0353a interfaceC0353a = this.f45218b;
            if (interfaceC0353a != null) {
                interfaceC0353a.onDownloadFinish(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
            a.InterfaceC0353a interfaceC0353a = this.f45218b;
            if (interfaceC0353a != null) {
                interfaceC0353a.onDownloadProgress(i10);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            a.InterfaceC0353a interfaceC0353a = this.f45218b;
            if (interfaceC0353a != null) {
                interfaceC0353a.onDownloadStart(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            a.InterfaceC0353a interfaceC0353a = this.f45218b;
            if (interfaceC0353a != null) {
                interfaceC0353a.onFinishRedirection(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f45217a;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0353a
        public void onInitSuccess() {
            a.InterfaceC0353a interfaceC0353a = this.f45218b;
            if (interfaceC0353a != null) {
                interfaceC0353a.onInitSuccess();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            a.InterfaceC0353a interfaceC0353a = this.f45218b;
            return interfaceC0353a != null && interfaceC0353a.onInterceptDefaultLoadingDialog();
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            a.InterfaceC0353a interfaceC0353a = this.f45218b;
            if (interfaceC0353a != null) {
                interfaceC0353a.onRedirectionFailed(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f45217a;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            a.InterfaceC0353a interfaceC0353a = this.f45218b;
            if (interfaceC0353a != null) {
                interfaceC0353a.onShowLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            a.InterfaceC0353a interfaceC0353a = this.f45218b;
            if (interfaceC0353a != null) {
                interfaceC0353a.onStartRedirection(campaign, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0353a
        public void a(int i10, String str) {
            a.InterfaceC0353a interfaceC0353a = this.f45218b;
            if (interfaceC0353a != null) {
                interfaceC0353a.a(i10, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0353a
        public void a() {
            a.InterfaceC0353a interfaceC0353a = this.f45218b;
            if (interfaceC0353a != null) {
                interfaceC0353a.a();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int b() {
        return this.f45205g;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String c() {
        p0.a("DefaultJSCommon", C3191e4.a.f36368f);
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String e() {
        p0.a("DefaultJSCommon", "getNotchArea");
        return null;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String g() {
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.a
    public boolean a() {
        return this.f45199a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(boolean z10) {
        this.f45199a = z10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int d() {
        p0.a("DefaultJSCommon", "getAlertDialogRole " + this.f45206h);
        return this.f45206h;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void f() {
        p0.a("DefaultJSCommon", "finish");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(a.InterfaceC0353a interfaceC0353a) {
        p0.a("DefaultJSCommon", "setTrackingListener:" + interfaceC0353a);
        this.f45211m = interfaceC0353a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i10, String str) {
        p0.a("DefaultJSCommon", "statistics,type:" + i10 + ",json:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i10) {
        this.f45207i = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(String str) {
        p0.a("DefaultJSCommon", "setNotchArea");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void h() {
    }
}
