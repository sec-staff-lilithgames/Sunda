package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.f3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3208f3 implements T<BannerAdView> {

    /* renamed from: a, reason: collision with root package name */
    private final Tf f36679a;

    /* renamed from: b, reason: collision with root package name */
    private final BannerAdLoaderListener f36680b;

    public C3208f3(Tf threadManager, BannerAdLoaderListener publisherListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(threadManager, "threadManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(publisherListener, "publisherListener");
        this.f36679a = threadManager;
        this.f36680b = publisherListener;
    }

    @Override // com.ironsource.T
    public void a(BannerAdView adObject) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adObject, "adObject");
        this.f36679a.a(new gi(15, adObject, this));
    }

    @Override // com.ironsource.T
    public void b(IronSourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f36679a.a(new gi(16, error, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BannerAdView adObject, C3208f3 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adObject, "$adObject");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.f36680b.onBannerAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error, C3208f3 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "$error");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoadFailed error: " + error);
        this$0.f36680b.onBannerAdLoadFailed(error);
    }
}
