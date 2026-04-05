package com.ironsource;

import com.ironsource.InterfaceC3159c8;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.a8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3123a8 extends InterfaceC3159c8.a<ISDemandOnlyInterstitialListener> implements ISDemandOnlyInterstitialListener {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.a8$a */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35943a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f35944b;

        public a(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f35943a = str;
            this.f35944b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3123a8.this.a(this.f35943a, "onInterstitialAdReady()");
            this.f35944b.onInterstitialAdReady(this.f35943a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.a8$b */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35946a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f35947b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f35948c;

        public b(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f35946a = str;
            this.f35947b = ironSourceError;
            this.f35948c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3123a8.this.a(this.f35946a, "onInterstitialAdLoadFailed() error = " + this.f35947b.getErrorMessage());
            this.f35948c.onInterstitialAdLoadFailed(this.f35946a, this.f35947b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.a8$c */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35950a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f35951b;

        public c(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f35950a = str;
            this.f35951b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3123a8.this.a(this.f35950a, "onInterstitialAdOpened()");
            this.f35951b.onInterstitialAdOpened(this.f35950a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.a8$d */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35953a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f35954b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f35955c;

        public d(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f35953a = str;
            this.f35954b = ironSourceError;
            this.f35955c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3123a8.this.a(this.f35953a, "onInterstitialAdShowFailed() error = " + this.f35954b.getErrorMessage());
            this.f35955c.onInterstitialAdShowFailed(this.f35953a, this.f35954b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.a8$e */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35957a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f35958b;

        public e(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f35957a = str;
            this.f35958b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3123a8.this.a(this.f35957a, "onInterstitialAdClicked()");
            this.f35958b.onInterstitialAdClicked(this.f35957a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.a8$f */
    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35960a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f35961b;

        public f(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f35960a = str;
            this.f35961b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3123a8.this.a(this.f35960a, "onInterstitialAdClosed()");
            this.f35961b.onInterstitialAdClosed(this.f35960a);
        }
    }

    public C3123a8(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        b(iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new e(str, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new f(str, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new b(str, ironSourceError, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new c(str, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new a(str, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new d(str, ironSourceError, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    public C3123a8() {
    }
}
