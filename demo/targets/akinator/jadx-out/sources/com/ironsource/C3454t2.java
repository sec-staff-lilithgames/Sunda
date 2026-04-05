package com.ironsource;

import com.ironsource.InterfaceC3159c8;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.t2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3454t2 extends InterfaceC3159c8.a<ISDemandOnlyBannerListener> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.t2$a */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38889a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f38890b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f38891c;

        public a(String str, IronSourceError ironSourceError, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f38889a = str;
            this.f38890b = ironSourceError;
            this.f38891c = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3454t2.this.a(this.f38889a, "onBannerAdLoadFailed() error = " + this.f38890b.getErrorMessage());
            this.f38891c.onBannerAdLoadFailed(this.f38889a, this.f38890b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.t2$b */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38893a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f38894b;

        public b(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f38893a = str;
            this.f38894b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3454t2.this.a(this.f38893a, "onBannerAdLoaded()");
            this.f38894b.onBannerAdLoaded(this.f38893a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.t2$c */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38896a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f38897b;

        public c(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f38896a = str;
            this.f38897b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3454t2.this.a(this.f38896a, "onBannerAdShown()");
            this.f38897b.onBannerAdShown(this.f38896a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.t2$d */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38899a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f38900b;

        public d(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f38899a = str;
            this.f38900b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3454t2.this.a(this.f38899a, "onBannerAdClicked()");
            this.f38900b.onBannerAdClicked(this.f38899a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.t2$e */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38902a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f38903b;

        public e(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f38902a = str;
            this.f38903b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3454t2.this.a(this.f38902a, "onBannerAdLeftApplication()");
            this.f38903b.onBannerAdLeftApplication(this.f38902a);
        }
    }

    public void a(String str, IronSourceError ironSourceError) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new a(str, ironSourceError, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }

    public void b(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new e(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }

    public void c(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new b(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }

    public void d(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new c(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }

    public void a(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new d(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }
}
