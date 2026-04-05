package com.ironsource;

import com.ironsource.InterfaceC3159c8;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.d8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3177d8 extends InterfaceC3159c8.a<ISDemandOnlyRewardedVideoListener> implements ISDemandOnlyRewardedVideoListener {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.d8$a */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f36263a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f36264b;

        public a(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f36263a = str;
            this.f36264b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3177d8.this.a(this.f36263a, "onRewardedVideoAdLoadSuccess()");
            this.f36264b.onRewardedVideoAdLoadSuccess(this.f36263a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.d8$b */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f36266a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f36267b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f36268c;

        public b(String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f36266a = str;
            this.f36267b = ironSourceError;
            this.f36268c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3177d8.this.a(this.f36266a, "onRewardedVideoAdLoadFailed() error = " + this.f36267b.getErrorMessage());
            this.f36268c.onRewardedVideoAdLoadFailed(this.f36266a, this.f36267b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.d8$c */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f36270a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f36271b;

        public c(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f36270a = str;
            this.f36271b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3177d8.this.a(this.f36270a, "onRewardedVideoAdOpened()");
            this.f36271b.onRewardedVideoAdOpened(this.f36270a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.d8$d */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f36273a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f36274b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f36275c;

        public d(String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f36273a = str;
            this.f36274b = ironSourceError;
            this.f36275c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3177d8.this.a(this.f36273a, "onRewardedVideoAdShowFailed() error = " + this.f36274b.getErrorMessage());
            this.f36275c.onRewardedVideoAdShowFailed(this.f36273a, this.f36274b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.d8$e */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f36277a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f36278b;

        public e(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f36277a = str;
            this.f36278b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3177d8.this.a(this.f36277a, "onRewardedVideoAdClicked()");
            this.f36278b.onRewardedVideoAdClicked(this.f36277a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.d8$f */
    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f36280a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f36281b;

        public f(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f36280a = str;
            this.f36281b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3177d8.this.a(this.f36280a, "onRewardedVideoAdRewarded()");
            this.f36281b.onRewardedVideoAdRewarded(this.f36280a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.d8$g */
    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f36283a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f36284b;

        public g(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f36283a = str;
            this.f36284b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3177d8.this.a(this.f36283a, "onRewardedVideoAdClosed()");
            this.f36284b.onRewardedVideoAdClosed(this.f36283a);
        }
    }

    public C3177d8(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        b(iSDemandOnlyRewardedVideoListener);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new e(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new g(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new b(str, ironSourceError, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new a(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new c(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new f(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new d(str, ironSourceError, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    public C3177d8() {
    }
}
