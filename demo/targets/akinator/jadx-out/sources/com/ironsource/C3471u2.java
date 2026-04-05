package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.u2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3471u2 extends C3489v3 {

    /* renamed from: d, reason: collision with root package name */
    private static final C3471u2 f38974d = new C3471u2();

    /* renamed from: b, reason: collision with root package name */
    private Fa f38975b = null;

    /* renamed from: c, reason: collision with root package name */
    private Fa f38976c = null;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.u2$a */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f38977a;

        public a(AdInfo adInfo) {
            this.f38977a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3471u2 c3471u2 = C3471u2.this;
            Fa fa2 = c3471u2.f38975b;
            if (fa2 != null) {
                fa2.g(c3471u2.a(this.f38977a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C3471u2.this.a(this.f38977a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.u2$b */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f38979a;

        public b(AdInfo adInfo) {
            this.f38979a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3471u2 c3471u2 = C3471u2.this;
            Fa fa2 = c3471u2.f38976c;
            if (fa2 != null) {
                fa2.d(c3471u2.a(this.f38979a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C3471u2.this.a(this.f38979a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.u2$c */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f38981a;

        public c(AdInfo adInfo) {
            this.f38981a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3471u2 c3471u2 = C3471u2.this;
            Fa fa2 = c3471u2.f38975b;
            if (fa2 != null) {
                fa2.d(c3471u2.a(this.f38981a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C3471u2.this.a(this.f38981a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.u2$d */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f38983a;

        public d(AdInfo adInfo) {
            this.f38983a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3471u2 c3471u2 = C3471u2.this;
            Fa fa2 = c3471u2.f38976c;
            if (fa2 != null) {
                fa2.e(c3471u2.a(this.f38983a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C3471u2.this.a(this.f38983a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.u2$e */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f38985a;

        public e(AdInfo adInfo) {
            this.f38985a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3471u2 c3471u2 = C3471u2.this;
            Fa fa2 = c3471u2.f38975b;
            if (fa2 != null) {
                fa2.e(c3471u2.a(this.f38985a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C3471u2.this.a(this.f38985a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.u2$f */
    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f38987a;

        public f(IronSourceError ironSourceError) {
            this.f38987a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            Fa fa2 = C3471u2.this.f38976c;
            if (fa2 != null) {
                fa2.b(this.f38987a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f38987a.getErrorMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.u2$g */
    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f38989a;

        public g(IronSourceError ironSourceError) {
            this.f38989a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            Fa fa2 = C3471u2.this.f38975b;
            if (fa2 != null) {
                fa2.b(this.f38989a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f38989a.getErrorMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.u2$h */
    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f38991a;

        public h(AdInfo adInfo) {
            this.f38991a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3471u2 c3471u2 = C3471u2.this;
            Fa fa2 = c3471u2.f38976c;
            if (fa2 != null) {
                fa2.h(c3471u2.a(this.f38991a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C3471u2.this.a(this.f38991a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.u2$i */
    public class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f38993a;

        public i(AdInfo adInfo) {
            this.f38993a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3471u2 c3471u2 = C3471u2.this;
            Fa fa2 = c3471u2.f38975b;
            if (fa2 != null) {
                fa2.h(c3471u2.a(this.f38993a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C3471u2.this.a(this.f38993a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.u2$j */
    public class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f38995a;

        public j(AdInfo adInfo) {
            this.f38995a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3471u2 c3471u2 = C3471u2.this;
            Fa fa2 = c3471u2.f38976c;
            if (fa2 != null) {
                fa2.f(c3471u2.a(this.f38995a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C3471u2.this.a(this.f38995a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.u2$k */
    public class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f38997a;

        public k(AdInfo adInfo) {
            this.f38997a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3471u2 c3471u2 = C3471u2.this;
            Fa fa2 = c3471u2.f38975b;
            if (fa2 != null) {
                fa2.f(c3471u2.a(this.f38997a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C3471u2.this.a(this.f38997a));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.u2$l */
    public class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f38999a;

        public l(AdInfo adInfo) {
            this.f38999a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3471u2 c3471u2 = C3471u2.this;
            Fa fa2 = c3471u2.f38976c;
            if (fa2 != null) {
                fa2.g(c3471u2.a(this.f38999a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C3471u2.this.a(this.f38999a));
            }
        }
    }

    private C3471u2() {
    }

    public static C3471u2 a() {
        return f38974d;
    }

    public void d(AdInfo adInfo) {
        if (this.f38976c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.f38975b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.f38976c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.f38975b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.f38976c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
        } else if (this.f38975b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
        }
    }

    public void a(Fa fa2) {
        this.f38975b = fa2;
    }

    public void b(Fa fa2) {
        this.f38976c = fa2;
    }

    public void c(AdInfo adInfo) {
        if (this.f38976c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f38975b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.f38976c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(ironSourceError));
        } else if (this.f38975b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(ironSourceError));
        }
    }

    public Fa b() {
        return this.f38975b;
    }

    public void b(AdInfo adInfo) {
        if (this.f38976c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(adInfo));
        } else if (this.f38975b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(adInfo));
        }
    }
}
