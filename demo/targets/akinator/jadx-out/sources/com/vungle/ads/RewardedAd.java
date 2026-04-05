package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.RewardedAdInternal;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class RewardedAd extends BaseFullscreenAd {
    public /* synthetic */ RewardedAd(Context context, String str, AdConfig adConfig, int i10, u uVar) {
        this(context, str, (i10 & 4) != 0 ? new AdConfig() : adConfig);
    }

    private final RewardedAdInternal getRewardedAdInternal() {
        AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        e0.checkNotNull(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.RewardedAdInternal");
        return (RewardedAdInternal) adInternal$vungle_ads_release;
    }

    public final void setAlertBodyText(String bodyText) {
        e0.checkNotNullParameter(bodyText, "bodyText");
        getRewardedAdInternal().setAlertBodyText$vungle_ads_release(bodyText);
    }

    public final void setAlertCloseButtonText(String closeButtonText) {
        e0.checkNotNullParameter(closeButtonText, "closeButtonText");
        getRewardedAdInternal().setAlertCloseButtonText$vungle_ads_release(closeButtonText);
    }

    public final void setAlertContinueButtonText(String continueButtonText) {
        e0.checkNotNullParameter(continueButtonText, "continueButtonText");
        getRewardedAdInternal().setAlertContinueButtonText$vungle_ads_release(continueButtonText);
    }

    public final void setAlertTitleText(String titleText) {
        e0.checkNotNullParameter(titleText, "titleText");
        getRewardedAdInternal().setAlertTitleText$vungle_ads_release(titleText);
    }

    public final void setUserId(String userId) {
        e0.checkNotNullParameter(userId, "userId");
        getRewardedAdInternal().setUserId$vungle_ads_release(userId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedAd(Context context, String placementId, AdConfig adConfig) {
        super(context, placementId, adConfig);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(placementId, "placementId");
        e0.checkNotNullParameter(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.BaseAd
    public RewardedAdInternal constructAdInternal$vungle_ads_release(Context context) {
        e0.checkNotNullParameter(context, "context");
        return new RewardedAdInternal(context);
    }
}
