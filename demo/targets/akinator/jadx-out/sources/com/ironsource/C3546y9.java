package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.y9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3546y9 implements T<InterstitialAd> {

    /* renamed from: a, reason: collision with root package name */
    private final Tf f39267a;

    /* renamed from: b, reason: collision with root package name */
    private final InterstitialAdLoaderListener f39268b;

    public C3546y9(Tf threadManager, InterstitialAdLoaderListener publisherListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(threadManager, "threadManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(publisherListener, "publisherListener");
        this.f39267a = threadManager;
        this.f39268b = publisherListener;
    }

    @Override // com.ironsource.T
    public void a(InterstitialAd adObject) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adObject, "adObject");
        this.f39267a.a(new gi(29, adObject, this));
    }

    @Override // com.ironsource.T
    public void b(IronSourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f39267a.a(new ni(0, error, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterstitialAd adObject, C3546y9 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adObject, "$adObject");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.f39268b.onInterstitialAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error, C3546y9 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "$error");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoadFailed error: " + error);
        this$0.f39268b.onInterstitialAdLoadFailed(error);
    }
}
