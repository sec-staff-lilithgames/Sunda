package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.AdPlayCallbackWrapper;
import com.vungle.ads.internal.util.ThreadUtil;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class BannerAdImpl extends BaseAd {
    private final AdPlayCallbackWrapper adPlayCallback;
    private final VungleAdSize adSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdImpl(Context context, String placementId, VungleAdSize adSize, AdConfig adConfig) {
        super(context, placementId, adConfig);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(placementId, "placementId");
        e0.checkNotNullParameter(adSize, "adSize");
        e0.checkNotNullParameter(adConfig, "adConfig");
        this.adSize = adSize;
        AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        e0.checkNotNull(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        this.adPlayCallback = ((BannerAdInternal) adInternal$vungle_ads_release).wrapCallback$vungle_ads_release(new AdPlayCallback() { // from class: com.vungle.ads.internal.BannerAdImpl$adPlayCallback$1
            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdClick(String str) throws Throwable {
                ThreadUtil.INSTANCE.runOnUiThread(new BannerAdImpl$adPlayCallback$1$onAdClick$1(this.this$0));
                this.this$0.getDisplayToClickMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getDisplayToClickMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(String str) throws Throwable {
                ThreadUtil.INSTANCE.runOnUiThread(new BannerAdImpl$adPlayCallback$1$onAdEnd$1(this.this$0));
                this.this$0.getShowToCloseMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getShowToCloseMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdImpression(String str) throws Throwable {
                ThreadUtil.INSTANCE.runOnUiThread(new BannerAdImpl$adPlayCallback$1$onAdImpression$1(this.this$0));
                this.this$0.getPresentToDisplayMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getPresentToDisplayMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                this.this$0.getDisplayToClickMetric$vungle_ads_release().markStart();
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdLeftApplication(String str) throws Throwable {
                ThreadUtil.INSTANCE.runOnUiThread(new BannerAdImpl$adPlayCallback$1$onAdLeftApplication$1(this.this$0));
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getLeaveApplicationMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(String str) throws Throwable {
                this.this$0.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
                this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                this.this$0.getPresentToDisplayMetric$vungle_ads_release().markStart();
                ThreadUtil.INSTANCE.runOnUiThread(new BannerAdImpl$adPlayCallback$1$onAdStart$1(this.this$0));
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(VungleError error) throws Throwable {
                e0.checkNotNullParameter(error, "error");
                ThreadUtil.INSTANCE.runOnUiThread(new BannerAdImpl$adPlayCallback$1$onFailure$1(this.this$0, error));
                this.this$0.getShowToFailMetric$vungle_ads_release().markEnd();
                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this.this$0.getShowToFailMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), error.getCode() + '-' + error.getErrorMessage());
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdRewarded(String str) {
            }
        });
    }

    public final AdPlayCallbackWrapper getAdPlayCallback$vungle_ads_release() {
        return this.adPlayCallback;
    }

    public final VungleAdSize getAdViewSize() {
        AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        e0.checkNotNull(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        VungleAdSize updatedAdSize$vungle_ads_release = ((BannerAdInternal) adInternal$vungle_ads_release).getUpdatedAdSize$vungle_ads_release();
        return updatedAdSize$vungle_ads_release == null ? this.adSize : updatedAdSize$vungle_ads_release;
    }

    @Override // com.vungle.ads.BaseAd
    public BannerAdInternal constructAdInternal$vungle_ads_release(Context context) {
        e0.checkNotNullParameter(context, "context");
        return new BannerAdInternal(context, this.adSize);
    }
}
