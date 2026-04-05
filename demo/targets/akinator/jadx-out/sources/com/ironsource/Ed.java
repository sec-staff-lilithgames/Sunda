package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Ed extends C3489v3 {

    /* renamed from: d, reason: collision with root package name */
    private static final Ed f34278d = new Ed();

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC3446sb f34279b = null;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3446sb f34280c = null;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f34281a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f34282b;

        public a(boolean z10, AdInfo adInfo) {
            this.f34281a = z10;
            this.f34282b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ed ed2 = Ed.this;
            InterfaceC3446sb interfaceC3446sb = ed2.f34279b;
            if (interfaceC3446sb != null) {
                if (!this.f34281a) {
                    ((InterfaceC3463tb) interfaceC3446sb).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC3463tb) interfaceC3446sb).d(ed2.a(this.f34282b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + Ed.this.a(this.f34282b));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3325ld f34284a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f34285b;

        public b(C3325ld c3325ld, AdInfo adInfo) {
            this.f34284a = c3325ld;
            this.f34285b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ed ed2 = Ed.this;
            InterfaceC3446sb interfaceC3446sb = ed2.f34280c;
            if (interfaceC3446sb != null) {
                interfaceC3446sb.b(this.f34284a, ed2.a(this.f34285b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f34284a + ", adInfo = " + Ed.this.a(this.f34285b));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3325ld f34287a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f34288b;

        public c(C3325ld c3325ld, AdInfo adInfo) {
            this.f34287a = c3325ld;
            this.f34288b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ed ed2 = Ed.this;
            InterfaceC3446sb interfaceC3446sb = ed2.f34279b;
            if (interfaceC3446sb != null) {
                interfaceC3446sb.b(this.f34287a, ed2.a(this.f34288b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f34287a + ", adInfo = " + Ed.this.a(this.f34288b));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f34290a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f34291b;

        public d(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f34290a = ironSourceError;
            this.f34291b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ed ed2 = Ed.this;
            InterfaceC3446sb interfaceC3446sb = ed2.f34280c;
            if (interfaceC3446sb != null) {
                interfaceC3446sb.a(this.f34290a, ed2.a(this.f34291b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + Ed.this.a(this.f34291b) + ", error = " + this.f34290a.getErrorMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f34293a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f34294b;

        public e(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f34293a = ironSourceError;
            this.f34294b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ed ed2 = Ed.this;
            InterfaceC3446sb interfaceC3446sb = ed2.f34279b;
            if (interfaceC3446sb != null) {
                interfaceC3446sb.a(this.f34293a, ed2.a(this.f34294b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + Ed.this.a(this.f34294b) + ", error = " + this.f34293a.getErrorMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3325ld f34296a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f34297b;

        public f(C3325ld c3325ld, AdInfo adInfo) {
            this.f34296a = c3325ld;
            this.f34297b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ed ed2 = Ed.this;
            InterfaceC3446sb interfaceC3446sb = ed2.f34280c;
            if (interfaceC3446sb != null) {
                interfaceC3446sb.a(this.f34296a, ed2.a(this.f34297b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f34296a + ", adInfo = " + Ed.this.a(this.f34297b));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3325ld f34299a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f34300b;

        public g(C3325ld c3325ld, AdInfo adInfo) {
            this.f34299a = c3325ld;
            this.f34300b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ed ed2 = Ed.this;
            InterfaceC3446sb interfaceC3446sb = ed2.f34279b;
            if (interfaceC3446sb != null) {
                interfaceC3446sb.a(this.f34299a, ed2.a(this.f34300b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f34299a + ", adInfo = " + Ed.this.a(this.f34300b));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f34302a;

        public h(AdInfo adInfo) {
            this.f34302a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ed ed2 = Ed.this;
            InterfaceC3446sb interfaceC3446sb = ed2.f34280c;
            if (interfaceC3446sb != null) {
                ((InterfaceC3480ub) interfaceC3446sb).a(ed2.a(this.f34302a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + Ed.this.a(this.f34302a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f34304a;

        public i(AdInfo adInfo) {
            this.f34304a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ed ed2 = Ed.this;
            InterfaceC3446sb interfaceC3446sb = ed2.f34279b;
            if (interfaceC3446sb != null) {
                ((InterfaceC3480ub) interfaceC3446sb).a(ed2.a(this.f34304a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + Ed.this.a(this.f34304a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f34306a;

        public j(IronSourceError ironSourceError) {
            this.f34306a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC3446sb interfaceC3446sb = Ed.this.f34280c;
            if (interfaceC3446sb != null) {
                ((InterfaceC3480ub) interfaceC3446sb).b(this.f34306a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f34306a.getErrorMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f34308a;

        public k(IronSourceError ironSourceError) {
            this.f34308a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC3446sb interfaceC3446sb = Ed.this.f34279b;
            if (interfaceC3446sb != null) {
                ((InterfaceC3480ub) interfaceC3446sb).b(this.f34308a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f34308a.getErrorMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f34310a;

        public l(AdInfo adInfo) {
            this.f34310a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ed ed2 = Ed.this;
            InterfaceC3446sb interfaceC3446sb = ed2.f34280c;
            if (interfaceC3446sb != null) {
                interfaceC3446sb.c(ed2.a(this.f34310a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + Ed.this.a(this.f34310a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f34312a;

        public m(AdInfo adInfo) {
            this.f34312a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ed ed2 = Ed.this;
            InterfaceC3446sb interfaceC3446sb = ed2.f34279b;
            if (interfaceC3446sb != null) {
                interfaceC3446sb.c(ed2.a(this.f34312a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + Ed.this.a(this.f34312a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f34314a;

        public n(AdInfo adInfo) {
            this.f34314a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ed ed2 = Ed.this;
            InterfaceC3446sb interfaceC3446sb = ed2.f34280c;
            if (interfaceC3446sb != null) {
                interfaceC3446sb.b(ed2.a(this.f34314a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + Ed.this.a(this.f34314a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f34316a;

        public o(AdInfo adInfo) {
            this.f34316a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ed ed2 = Ed.this;
            InterfaceC3446sb interfaceC3446sb = ed2.f34279b;
            if (interfaceC3446sb != null) {
                interfaceC3446sb.b(ed2.a(this.f34316a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + Ed.this.a(this.f34316a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f34318a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f34319b;

        public p(boolean z10, AdInfo adInfo) {
            this.f34318a = z10;
            this.f34319b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ed ed2 = Ed.this;
            InterfaceC3446sb interfaceC3446sb = ed2.f34280c;
            if (interfaceC3446sb != null) {
                if (!this.f34318a) {
                    ((InterfaceC3463tb) interfaceC3446sb).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC3463tb) interfaceC3446sb).d(ed2.a(this.f34319b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + Ed.this.a(this.f34319b));
            }
        }
    }

    private Ed() {
    }

    public static Ed a() {
        return f34278d;
    }

    public void b() {
    }

    public void c() {
    }

    public void d(AdInfo adInfo) {
        if (this.f34280c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
            return;
        }
        InterfaceC3446sb interfaceC3446sb = this.f34279b;
        if (interfaceC3446sb == null || !(interfaceC3446sb instanceof InterfaceC3480ub)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
    }

    public void a(InterfaceC3446sb interfaceC3446sb) {
        this.f34279b = interfaceC3446sb;
    }

    public void a(IronSourceError ironSourceError) {
        if (this.f34280c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(ironSourceError));
            return;
        }
        InterfaceC3446sb interfaceC3446sb = this.f34279b;
        if (interfaceC3446sb == null || !(interfaceC3446sb instanceof InterfaceC3480ub)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(ironSourceError));
    }

    public void b(InterfaceC3446sb interfaceC3446sb) {
        this.f34280c = interfaceC3446sb;
    }

    public void c(AdInfo adInfo) {
        if (this.f34280c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f34279b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void b(AdInfo adInfo) {
        if (this.f34280c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.f34279b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o(adInfo));
        }
    }

    public void a(boolean z10, AdInfo adInfo) {
        if (this.f34280c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(z10, adInfo));
            return;
        }
        InterfaceC3446sb interfaceC3446sb = this.f34279b;
        if (interfaceC3446sb == null || !(interfaceC3446sb instanceof InterfaceC3463tb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(z10, adInfo));
    }

    public void b(C3325ld c3325ld, AdInfo adInfo) {
        if (this.f34280c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(c3325ld, adInfo));
        } else if (this.f34279b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(c3325ld, adInfo));
        }
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f34280c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(ironSourceError, adInfo));
        } else if (this.f34279b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(ironSourceError, adInfo));
        }
    }

    public void a(C3325ld c3325ld, AdInfo adInfo) {
        if (this.f34280c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(c3325ld, adInfo));
        } else if (this.f34279b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(c3325ld, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
