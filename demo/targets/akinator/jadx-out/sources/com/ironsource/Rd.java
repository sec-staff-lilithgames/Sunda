package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Rd implements T<RewardedAd> {

    /* renamed from: a, reason: collision with root package name */
    private final Tf f35417a;

    /* renamed from: b, reason: collision with root package name */
    private final RewardedAdLoaderListener f35418b;

    public Rd(Tf threadManager, RewardedAdLoaderListener publisherListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(threadManager, "threadManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(publisherListener, "publisherListener");
        this.f35417a = threadManager;
        this.f35418b = publisherListener;
    }

    @Override // com.ironsource.T
    public void a(RewardedAd adObject) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adObject, "adObject");
        this.f35417a.a(new gi(11, adObject, this));
    }

    @Override // com.ironsource.T
    public void b(IronSourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoadFailed error: " + error);
        this.f35417a.a(new gi(10, this, error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(RewardedAd adObject, Rd this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adObject, "$adObject");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.f35418b.onRewardedAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Rd this$0, IronSourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "$error");
        this$0.f35418b.onRewardedAdLoadFailed(error);
    }
}
