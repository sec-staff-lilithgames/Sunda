package com.moloco.sdk.internal.publisher;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class h {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements RewardedInterstitialAdShowListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f46268a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kv.a f46269b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RewardedInterstitialAdShowListener f46270c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f46271d;

        public a(kv.a aVar, RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener, boolean z10) {
            this.f46269b = aVar;
            this.f46270c = rewardedInterstitialAdShowListener;
            this.f46271d = z10;
        }

        public final void a(MolocoAd molocoAd) {
            if (this.f46268a) {
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, "RewardedInterstitialAdShowListenerImpl", "issuing of reward is already handled", false, 4, null);
                return;
            }
            this.f46268a = true;
            if (!kotlin.jvm.internal.e0.areEqual(this.f46269b.invoke(), Boolean.FALSE)) {
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, "RewardedInterstitialAdShowListenerImpl", "reward can't be issued: ad was forcibly closed or ad was missing", false, 4, null);
            } else {
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, "RewardedInterstitialAdShowListenerImpl", "issuing of reward...", false, 4, null);
                onUserRewarded(molocoAd);
            }
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdClicked(MolocoAd molocoAd) {
            kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
            this.f46270c.onAdClicked(molocoAd);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdHidden(MolocoAd molocoAd) {
            kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
            a(molocoAd);
            this.f46270c.onAdHidden(molocoAd);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowFailed(MolocoAdError molocoAdError) {
            kotlin.jvm.internal.e0.checkNotNullParameter(molocoAdError, "molocoAdError");
            this.f46270c.onAdShowFailed(molocoAdError);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowSuccess(MolocoAd molocoAd) {
            kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
            this.f46270c.onAdShowSuccess(molocoAd);
            if (this.f46271d) {
                onRewardedVideoStarted(molocoAd);
            }
        }

        @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
        public void onRewardedVideoCompleted(MolocoAd molocoAd) {
            kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
            a(molocoAd);
            this.f46270c.onRewardedVideoCompleted(molocoAd);
        }

        @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
        public void onRewardedVideoStarted(MolocoAd molocoAd) {
            kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
            this.f46270c.onRewardedVideoStarted(molocoAd);
        }

        @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
        public void onUserRewarded(MolocoAd molocoAd) {
            kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
            this.f46270c.onUserRewarded(molocoAd);
        }
    }

    public static final RewardedInterstitialAd a(Context context, com.moloco.sdk.internal.services.r appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k persistentHttpRequest, g0 adDataHolder, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark, j adCreateLoadTimeoutManager, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(adDataHolder, "adDataHolder");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.e0.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new g(new h0(context, appLifecycleTrackerService, customUserEventBuilderService, adUnitId, persistentHttpRequest, externalLinkHandler, new a1.o(8), adDataHolder, AdFormatType.REWARDED, watermark, adCreateLoadTimeoutManager, metricsRecorder), adUnitId);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n a(com.moloco.sdk.internal.ortb.model.p pVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n nVarB;
        return (pVar == null || (nVarB = com.moloco.sdk.internal.g.b(pVar)) == null) ? com.moloco.sdk.internal.g.b() : nVarB;
    }

    public static final RewardedInterstitialAdShowListener a(RewardedInterstitialAdShowListener listenerTracker, boolean z10, kv.a isAdForciblyClosed) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listenerTracker, "listenerTracker");
        kotlin.jvm.internal.e0.checkNotNullParameter(isAdForciblyClosed, "isAdForciblyClosed");
        return new a(isAdForciblyClosed, listenerTracker, z10);
    }

    public static final RewardedInterstitialAdShowListener a(RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener, kv.a provideSdkEvents) {
        kotlin.jvm.internal.e0.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        return new i(rewardedInterstitialAdShowListener, provideSdkEvents, com.moloco.sdk.internal.a0.b());
    }
}
