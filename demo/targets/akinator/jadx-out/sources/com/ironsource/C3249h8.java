package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.h8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3249h8 extends C3489v3 {

    /* renamed from: d, reason: collision with root package name */
    private static final C3249h8 f36839d = new C3249h8();

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC3252hb f36840b = null;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3252hb f36841c = null;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.h8$a */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f36842a;

        public a(AdInfo adInfo) {
            this.f36842a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3249h8 c3249h8 = C3249h8.this;
            InterfaceC3252hb interfaceC3252hb = c3249h8.f36840b;
            if (interfaceC3252hb != null) {
                interfaceC3252hb.e(c3249h8.a(this.f36842a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C3249h8.this.a(this.f36842a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.h8$b */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f36844a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f36845b;

        public b(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f36844a = ironSourceError;
            this.f36845b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3249h8 c3249h8 = C3249h8.this;
            InterfaceC3252hb interfaceC3252hb = c3249h8.f36841c;
            if (interfaceC3252hb != null) {
                interfaceC3252hb.a(this.f36844a, c3249h8.a(this.f36845b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C3249h8.this.a(this.f36845b) + ", error = " + this.f36844a.getErrorMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.h8$c */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f36847a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f36848b;

        public c(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f36847a = ironSourceError;
            this.f36848b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3249h8 c3249h8 = C3249h8.this;
            InterfaceC3252hb interfaceC3252hb = c3249h8.f36840b;
            if (interfaceC3252hb != null) {
                interfaceC3252hb.a(this.f36847a, c3249h8.a(this.f36848b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C3249h8.this.a(this.f36848b) + ", error = " + this.f36847a.getErrorMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.h8$d */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f36850a;

        public d(AdInfo adInfo) {
            this.f36850a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3249h8 c3249h8 = C3249h8.this;
            InterfaceC3252hb interfaceC3252hb = c3249h8.f36841c;
            if (interfaceC3252hb != null) {
                interfaceC3252hb.d(c3249h8.a(this.f36850a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C3249h8.this.a(this.f36850a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.h8$e */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f36852a;

        public e(AdInfo adInfo) {
            this.f36852a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3249h8 c3249h8 = C3249h8.this;
            InterfaceC3252hb interfaceC3252hb = c3249h8.f36840b;
            if (interfaceC3252hb != null) {
                interfaceC3252hb.d(c3249h8.a(this.f36852a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C3249h8.this.a(this.f36852a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.h8$f */
    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f36854a;

        public f(AdInfo adInfo) {
            this.f36854a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3249h8 c3249h8 = C3249h8.this;
            InterfaceC3252hb interfaceC3252hb = c3249h8.f36841c;
            if (interfaceC3252hb != null) {
                interfaceC3252hb.a(c3249h8.a(this.f36854a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C3249h8.this.a(this.f36854a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.h8$g */
    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f36856a;

        public g(AdInfo adInfo) {
            this.f36856a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3249h8 c3249h8 = C3249h8.this;
            InterfaceC3252hb interfaceC3252hb = c3249h8.f36840b;
            if (interfaceC3252hb != null) {
                interfaceC3252hb.a(c3249h8.a(this.f36856a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C3249h8.this.a(this.f36856a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.h8$h */
    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f36858a;

        public h(IronSourceError ironSourceError) {
            this.f36858a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC3252hb interfaceC3252hb = C3249h8.this.f36841c;
            if (interfaceC3252hb != null) {
                interfaceC3252hb.b(this.f36858a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f36858a.getErrorMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.h8$i */
    public class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f36860a;

        public i(IronSourceError ironSourceError) {
            this.f36860a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC3252hb interfaceC3252hb = C3249h8.this.f36840b;
            if (interfaceC3252hb != null) {
                interfaceC3252hb.b(this.f36860a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f36860a.getErrorMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.h8$j */
    public class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f36862a;

        public j(AdInfo adInfo) {
            this.f36862a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3249h8 c3249h8 = C3249h8.this;
            InterfaceC3252hb interfaceC3252hb = c3249h8.f36841c;
            if (interfaceC3252hb != null) {
                interfaceC3252hb.c(c3249h8.a(this.f36862a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C3249h8.this.a(this.f36862a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.h8$k */
    public class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f36864a;

        public k(AdInfo adInfo) {
            this.f36864a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3249h8 c3249h8 = C3249h8.this;
            InterfaceC3252hb interfaceC3252hb = c3249h8.f36840b;
            if (interfaceC3252hb != null) {
                interfaceC3252hb.c(c3249h8.a(this.f36864a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C3249h8.this.a(this.f36864a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.h8$l */
    public class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f36866a;

        public l(AdInfo adInfo) {
            this.f36866a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3249h8 c3249h8 = C3249h8.this;
            InterfaceC3252hb interfaceC3252hb = c3249h8.f36841c;
            if (interfaceC3252hb != null) {
                interfaceC3252hb.b(c3249h8.a(this.f36866a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C3249h8.this.a(this.f36866a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.h8$m */
    public class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f36868a;

        public m(AdInfo adInfo) {
            this.f36868a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3249h8 c3249h8 = C3249h8.this;
            InterfaceC3252hb interfaceC3252hb = c3249h8.f36840b;
            if (interfaceC3252hb != null) {
                interfaceC3252hb.b(c3249h8.a(this.f36868a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C3249h8.this.a(this.f36868a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.h8$n */
    public class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f36870a;

        public n(AdInfo adInfo) {
            this.f36870a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3249h8 c3249h8 = C3249h8.this;
            InterfaceC3252hb interfaceC3252hb = c3249h8.f36841c;
            if (interfaceC3252hb != null) {
                interfaceC3252hb.e(c3249h8.a(this.f36870a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C3249h8.this.a(this.f36870a));
            }
        }
    }

    private C3249h8() {
    }

    public static synchronized C3249h8 a() {
        return f36839d;
    }

    public void d(AdInfo adInfo) {
        if (this.f36841c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.f36840b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.f36841c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(adInfo));
        } else if (this.f36840b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.f36841c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.f36840b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    public synchronized void a(InterfaceC3252hb interfaceC3252hb) {
        this.f36840b = interfaceC3252hb;
    }

    public synchronized void b(InterfaceC3252hb interfaceC3252hb) {
        this.f36841c = interfaceC3252hb;
    }

    public void c(AdInfo adInfo) {
        if (this.f36841c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f36840b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.f36841c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(ironSourceError));
        } else if (this.f36840b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(ironSourceError));
        }
    }

    public void b(AdInfo adInfo) {
        if (this.f36841c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.f36840b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f36841c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(ironSourceError, adInfo));
        } else if (this.f36840b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(ironSourceError, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
