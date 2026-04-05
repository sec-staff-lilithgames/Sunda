package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignaledAd;
import com.vungle.ads.internal.util.ThreadUtil;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class BaseFullscreenAd extends BaseAd implements FullscreenAd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFullscreenAd(Context context, String placementId, AdConfig adConfig) {
        super(context, placementId, adConfig);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(placementId, "placementId");
        e0.checkNotNullParameter(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.BaseAd, com.vungle.ads.Ad
    public void load(String str) throws Throwable {
        setSignaledAd$vungle_ads_release(getSignalManager$vungle_ads_release().getSignaledAd(getPlacementId()));
        super.load(str);
    }

    @Override // com.vungle.ads.BaseAd
    public void onAdLoaded$vungle_ads_release(AdPayload advertisement) {
        e0.checkNotNullParameter(advertisement, "advertisement");
        super.onAdLoaded$vungle_ads_release(advertisement);
        SignaledAd signaledAd$vungle_ads_release = getSignaledAd$vungle_ads_release();
        if (signaledAd$vungle_ads_release == null) {
            return;
        }
        signaledAd$vungle_ads_release.setAdAvailabilityCallbackTime(System.currentTimeMillis());
    }

    @Override // com.vungle.ads.FullscreenAd
    public void play(Context context) throws Throwable {
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        getResponseToShowMetric$vungle_ads_release().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, getResponseToShowMetric$vungle_ads_release(), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        getShowToFailMetric$vungle_ads_release().markStart();
        getShowToCloseMetric$vungle_ads_release().markStart();
        SignaledAd signaledAd$vungle_ads_release = getSignaledAd$vungle_ads_release();
        if (signaledAd$vungle_ads_release != null) {
            signaledAd$vungle_ads_release.setPlayAdTime(System.currentTimeMillis());
            signaledAd$vungle_ads_release.calculateTimeBetweenAdAvailabilityAndPlayAd();
            getSignalManager$vungle_ads_release().registerSignaledAd(context, signaledAd$vungle_ads_release);
        }
        getAdInternal$vungle_ads_release().play(context, new AdPlayCallback() { // from class: com.vungle.ads.BaseFullscreenAd.play.2
            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdClick(String str) throws Throwable {
                ThreadUtil.INSTANCE.runOnUiThread(new BaseFullscreenAd$play$2$onAdClick$1(BaseFullscreenAd.this));
                BaseFullscreenAd.this.getDisplayToClickMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, BaseFullscreenAd.this.getDisplayToClickMetric$vungle_ads_release(), BaseFullscreenAd.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(String str) throws Throwable {
                ThreadUtil.INSTANCE.runOnUiThread(new BaseFullscreenAd$play$2$onAdEnd$1(BaseFullscreenAd.this));
                BaseFullscreenAd.this.getShowToCloseMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, BaseFullscreenAd.this.getShowToCloseMetric$vungle_ads_release(), BaseFullscreenAd.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdImpression(String str) throws Throwable {
                ThreadUtil.INSTANCE.runOnUiThread(new BaseFullscreenAd$play$2$onAdImpression$1(BaseFullscreenAd.this));
                BaseFullscreenAd.this.getPresentToDisplayMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, BaseFullscreenAd.this.getPresentToDisplayMetric$vungle_ads_release(), BaseFullscreenAd.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                BaseFullscreenAd.this.getDisplayToClickMetric$vungle_ads_release().markStart();
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdLeftApplication(String str) throws Throwable {
                ThreadUtil.INSTANCE.runOnUiThread(new BaseFullscreenAd$play$2$onAdLeftApplication$1(BaseFullscreenAd.this));
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, BaseFullscreenAd.this.getLeaveApplicationMetric$vungle_ads_release(), BaseFullscreenAd.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdRewarded(String str) throws Throwable {
                ThreadUtil.INSTANCE.runOnUiThread(new BaseFullscreenAd$play$2$onAdRewarded$1(BaseFullscreenAd.this));
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, BaseFullscreenAd.this.getRewardedMetric$vungle_ads_release(), BaseFullscreenAd.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(String str) {
                BaseFullscreenAd.this.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
                BaseFullscreenAd.this.getPresentToDisplayMetric$vungle_ads_release().markStart();
                ThreadUtil.INSTANCE.runOnUiThread(new BaseFullscreenAd$play$2$onAdStart$1(BaseFullscreenAd.this));
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(VungleError error) throws Throwable {
                e0.checkNotNullParameter(error, "error");
                ThreadUtil.INSTANCE.runOnUiThread(new BaseFullscreenAd$play$2$onFailure$1(BaseFullscreenAd.this, error));
                BaseFullscreenAd.this.getShowToFailMetric$vungle_ads_release().markEnd();
                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(BaseFullscreenAd.this.getShowToFailMetric$vungle_ads_release(), BaseFullscreenAd.this.getLogEntry$vungle_ads_release(), error.getCode() + '-' + error.getErrorMessage());
            }
        });
    }
}
