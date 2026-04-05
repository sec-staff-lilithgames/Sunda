package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b0.e2;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.vungle.BuildConfig;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BaseAd;
import com.vungle.ads.BidTokenCallback;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.NativeAd;
import com.vungle.ads.NativeAdListener;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleBannerView;
import com.vungle.ads.VungleError;
import com.vungle.ads.VunglePrivacySettings;
import com.vungle.ads.VungleWrapperFramework;
import com.vungle.ads.internal.ui.view.MediaView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class VungleMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static MaxAdapter.InitializationStatus initializationStatus;
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private VungleBannerView adViewAd;
    private InterstitialAd appOpenAd;
    private InterstitialAd interstitialAd;
    private NativeAd nativeAd;
    private RewardedAd rewardedAd;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class AdViewAdListener implements BannerAdListener {
        private final String adFormatLabel;
        private final MaxAdViewAdapterListener listener;

        public AdViewAdListener(String str, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.adFormatLabel = str;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdClicked(BaseAd baseAd) {
            VungleMediationAdapter.this.log(this.adFormatLabel + " ad clicked");
            this.listener.onAdViewAdClicked();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdEnd(BaseAd baseAd) {
            VungleMediationAdapter.this.log(this.adFormatLabel + " ad hidden");
            this.listener.onAdViewAdHidden();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
            MaxAdapterError maxError = VungleMediationAdapter.toMaxError(vungleError, false);
            VungleMediationAdapter.this.log(this.adFormatLabel + " ad failed to load with error: " + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, vungleError.getCode(), vungleError.getErrorMessage());
            VungleMediationAdapter.this.log(this.adFormatLabel + " ad display failed with error: " + maxAdapterError);
            this.listener.onAdViewAdDisplayFailed(maxAdapterError);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdImpression(BaseAd baseAd) {
            VungleMediationAdapter.this.log(this.adFormatLabel + " ad displayed");
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLeftApplication(BaseAd baseAd) {
            VungleMediationAdapter.this.log(this.adFormatLabel + " ad left application");
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLoaded(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Showing " + this.adFormatLabel + " ad for placement: " + baseAd.getPlacementId() + APSSharedUtil.TRUNCATE_SEPARATOR);
            if (VungleMediationAdapter.this.adViewAd != null) {
                VungleMediationAdapter.this.adViewAd.setGravity(17);
                VungleMediationAdapter.this.log(this.adFormatLabel + " ad loaded");
                this.listener.onAdViewAdLoaded(VungleMediationAdapter.this.adViewAd, VungleMediationAdapter.this.maybeCreateExtraInfoBundle(baseAd));
                return;
            }
            MaxAdapterError maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
            VungleMediationAdapter.this.log(this.adFormatLabel + " ad failed to load: " + maxAdapterError);
            this.listener.onAdViewAdLoadFailed(maxAdapterError);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdStart(BaseAd baseAd) {
            VungleMediationAdapter.this.log(this.adFormatLabel + " ad started");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class AppOpenAdListener implements InterstitialAdListener {
        private final MaxAppOpenAdapterListener listener;

        public AppOpenAdListener(MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
            this.listener = maxAppOpenAdapterListener;
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdClicked(BaseAd baseAd) {
            VungleMediationAdapter.this.log("App Open ad clicked");
            this.listener.onAppOpenAdClicked();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdEnd(BaseAd baseAd) {
            VungleMediationAdapter.this.log("App Open ad hidden");
            this.listener.onAppOpenAdHidden();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
            MaxAdapterError maxError = VungleMediationAdapter.toMaxError(vungleError, false);
            VungleMediationAdapter.this.log("App Open ad failed to load with error: " + maxError);
            this.listener.onAppOpenAdLoadFailed(maxError);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, vungleError.getCode(), vungleError.getErrorMessage());
            VungleMediationAdapter.this.log("App Open ad failed to display with error: " + maxAdapterError);
            this.listener.onAppOpenAdDisplayFailed(maxAdapterError);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdImpression(BaseAd baseAd) {
            VungleMediationAdapter.this.log("App Open ad displayed");
            this.listener.onAppOpenAdDisplayed();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLeftApplication(BaseAd baseAd) {
            VungleMediationAdapter.this.log("App Open ad left application");
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLoaded(BaseAd baseAd) {
            VungleMediationAdapter.this.log("App Open ad loaded");
            this.listener.onAppOpenAdLoaded(VungleMediationAdapter.this.maybeCreateExtraInfoBundle(baseAd));
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdStart(BaseAd baseAd) {
            VungleMediationAdapter.this.log("App Open ad started");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class InterstitialListener implements InterstitialAdListener {
        private final MaxInterstitialAdapterListener listener;

        public InterstitialListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdClicked(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Interstitial ad clicked");
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdEnd(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Interstitial ad hidden");
            this.listener.onInterstitialAdHidden();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
            MaxAdapterError maxError = VungleMediationAdapter.toMaxError(vungleError, false);
            VungleMediationAdapter.this.log("Interstitial ad failed to load with error: " + maxError);
            this.listener.onInterstitialAdLoadFailed(maxError);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, vungleError.getCode(), vungleError.getErrorMessage());
            VungleMediationAdapter.this.log("Interstitial ad failed to display with error: " + maxAdapterError);
            this.listener.onInterstitialAdDisplayFailed(maxAdapterError);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdImpression(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Interstitial ad displayed");
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLeftApplication(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Interstitial ad left application");
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLoaded(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Interstitial ad loaded");
            this.listener.onInterstitialAdLoaded(VungleMediationAdapter.this.maybeCreateExtraInfoBundle(baseAd));
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdStart(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Interstitial ad started");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class MaxVungleNativeAd extends MaxNativeAd {
        public MaxVungleNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) throws Throwable {
            ImageView imageView;
            NativeAd nativeAd = VungleMediationAdapter.this.nativeAd;
            if (nativeAd == null) {
                VungleMediationAdapter.this.e("Failed to register native ad views: native ad is null.");
                return false;
            }
            if (!nativeAd.canPlayAd().booleanValue()) {
                VungleMediationAdapter.this.e("Failed to play native ad or native ad is registered.");
                return false;
            }
            View mediaView = getMediaView();
            if (mediaView == null) {
                VungleMediationAdapter.this.e("Failed to register native ad views: mediaView is null.");
                return false;
            }
            list.add(mediaView);
            if (viewGroup instanceof MaxNativeAdView) {
                if (mediaView.getParent() != null) {
                    ((ViewGroup) mediaView.getParent()).removeView(mediaView);
                }
                MaxNativeAdView maxNativeAdView = (MaxNativeAdView) viewGroup;
                ViewGroup mediaContentViewGroup = maxNativeAdView.getMediaContentViewGroup();
                if (mediaContentViewGroup != null) {
                    mediaContentViewGroup.removeAllViews();
                    mediaContentViewGroup.addView(mediaView);
                }
                nativeAd.registerViewForInteraction(maxNativeAdView, (MediaView) mediaView, maxNativeAdView.getIconImageView(), list);
                return true;
            }
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            viewGroup.addView(frameLayout, 0, new FrameLayout.LayoutParams(-1, -1));
            Iterator<View> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    imageView = null;
                    break;
                }
                View next = it.next();
                if (next instanceof ImageView) {
                    imageView = (ImageView) next;
                    break;
                }
            }
            nativeAd.registerViewForInteraction(frameLayout, (MediaView) mediaView, imageView, list);
            return true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class NativeAdViewListener implements NativeAdListener {
        private final MaxAdFormat adFormat;
        private final Context applicationContext;
        private final MaxAdViewAdapterListener listener;
        private final Bundle serverParameters;

        public NativeAdViewListener(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Context context, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.adFormat = maxAdFormat;
            this.applicationContext = context;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdClicked(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad clicked with placement id: " + baseAd.getPlacementId());
            this.listener.onAdViewAdClicked();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdEnd(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad end with placement id: " + baseAd.getPlacementId());
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
            MaxAdapterError maxError = VungleMediationAdapter.toMaxError(vungleError, false);
            VungleMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad failed to load with error " + maxError + " with placement id: " + baseAd.getPlacementId());
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
            VungleMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad failed to play with error " + VungleMediationAdapter.toMaxError(vungleError, true) + " with placement id: " + baseAd.getPlacementId());
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdImpression(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad shown with placement id: " + baseAd.getPlacementId());
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLeftApplication(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad left application with placement id: " + baseAd.getPlacementId());
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLoaded(BaseAd baseAd) throws Throwable {
            MaxNativeAdView maxNativeAdView;
            if (VungleMediationAdapter.this.nativeAd == null || VungleMediationAdapter.this.nativeAd != baseAd) {
                VungleMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad failed to load: no fill");
                this.listener.onAdViewAdLoadFailed(MaxAdapterError.NO_FILL);
                return;
            }
            VungleMediationAdapter vungleMediationAdapter = VungleMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder("Native ");
            e2.w(this.adFormat, sb2, " ad loaded: ");
            sb2.append(VungleMediationAdapter.this.nativeAd.getPlacementId());
            vungleMediationAdapter.log(sb2.toString());
            MaxVungleNativeAd maxVungleNativeAd = VungleMediationAdapter.this.new MaxVungleNativeAd(new MaxNativeAd.Builder().setAdFormat(this.adFormat).setTitle(VungleMediationAdapter.this.nativeAd.getAdTitle()).setAdvertiser(VungleMediationAdapter.this.nativeAd.getAdSponsoredText()).setBody(VungleMediationAdapter.this.nativeAd.getAdBodyText()).setCallToAction(VungleMediationAdapter.this.nativeAd.getAdCallToActionText()).setIcon(new MaxNativeAd.MaxNativeAdImage(Uri.parse(VungleMediationAdapter.this.nativeAd.getAppIcon()))).setMediaContentAspectRatio(VungleMediationAdapter.this.nativeAd.getMediaAspectRatio()).setMediaView(new MediaView(this.applicationContext)));
            String string = BundleUtils.getString("template", "", this.serverParameters);
            if (!string.contains("vertical")) {
                if (!AppLovinSdkUtils.isValidString(string)) {
                    string = "media_banner_template";
                }
                maxNativeAdView = new MaxNativeAdView(maxVungleNativeAd, string, this.applicationContext);
            } else if ("vertical".equals(string)) {
                maxNativeAdView = new MaxNativeAdView(maxVungleNativeAd, this.adFormat == MaxAdFormat.LEADER ? "vertical_leader_template" : "vertical_media_banner_template", this.applicationContext);
            } else {
                maxNativeAdView = new MaxNativeAdView(maxVungleNativeAd, string, this.applicationContext);
            }
            maxVungleNativeAd.prepareForInteraction(VungleMediationAdapter.this.getClickableViews(maxNativeAdView), maxNativeAdView);
            this.listener.onAdViewAdLoaded(maxNativeAdView, VungleMediationAdapter.this.maybeCreateExtraInfoBundle(baseAd));
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdStart(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad start with placement id: " + baseAd.getPlacementId());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes2.dex */
    public class NativeListener implements NativeAdListener {
        private final Context applicationContext;
        private final MaxNativeAdAdapterListener listener;
        private final Bundle serverParameters;

        public NativeListener(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.applicationContext = context;
            this.listener = maxNativeAdAdapterListener;
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdClicked(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Native ad clicked with placement id: " + baseAd.getPlacementId());
            this.listener.onNativeAdClicked();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdEnd(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Native ad end with placement id: " + baseAd.getPlacementId());
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
            MaxAdapterError maxError = VungleMediationAdapter.toMaxError(vungleError, false);
            VungleMediationAdapter.this.log("Native ad failed to load with error " + maxError + " with placement id: " + baseAd.getPlacementId());
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
            VungleMediationAdapter.this.log("Native ad failed to play with error " + VungleMediationAdapter.toMaxError(vungleError, true) + " with placement id: " + baseAd.getPlacementId());
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdImpression(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Native ad shown with placement id: " + baseAd.getPlacementId());
            this.listener.onNativeAdDisplayed(null);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLeftApplication(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Native ad left application with placement id: " + baseAd.getPlacementId());
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdStart(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Native ad start with placement id: " + baseAd.getPlacementId());
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLoaded(BaseAd baseAd) {
            if (VungleMediationAdapter.this.nativeAd == null || VungleMediationAdapter.this.nativeAd != baseAd) {
                VungleMediationAdapter.this.log(PtLatqAYjEFT.dQpw);
                this.listener.onNativeAdLoadFailed(MaxAdapterError.NO_FILL);
                return;
            }
            if (AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) && TextUtils.isEmpty(VungleMediationAdapter.this.nativeAd.getAdTitle())) {
                VungleMediationAdapter.this.e("Native ad (" + VungleMediationAdapter.this.nativeAd + ") does not have required assets.");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
                return;
            }
            VungleMediationAdapter.this.log("Native ad loaded: " + VungleMediationAdapter.this.nativeAd.getPlacementId());
            this.listener.onNativeAdLoaded(VungleMediationAdapter.this.new MaxVungleNativeAd(new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(VungleMediationAdapter.this.nativeAd.getAdTitle()).setAdvertiser(VungleMediationAdapter.this.nativeAd.getAdSponsoredText()).setBody(VungleMediationAdapter.this.nativeAd.getAdBodyText()).setCallToAction(VungleMediationAdapter.this.nativeAd.getAdCallToActionText()).setIcon(new MaxNativeAd.MaxNativeAdImage(Uri.parse(VungleMediationAdapter.this.nativeAd.getAppIcon()))).setMediaContentAspectRatio(VungleMediationAdapter.this.nativeAd.getMediaAspectRatio()).setMediaView(new MediaView(this.applicationContext))), VungleMediationAdapter.this.maybeCreateExtraInfoBundle(baseAd));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class RewardedListener implements RewardedAdListener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        public RewardedListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdClicked(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdEnd(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Rewarded ad video completed");
            if (this.hasGrantedReward || VungleMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = VungleMediationAdapter.this.getReward();
                VungleMediationAdapter.this.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            VungleMediationAdapter.this.log("Rewarded ad hidden");
            this.listener.onRewardedAdHidden();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
            MaxAdapterError maxError = VungleMediationAdapter.toMaxError(vungleError, false);
            VungleMediationAdapter.this.log("Rewarded ad failed to load with error: " + maxError);
            this.listener.onRewardedAdLoadFailed(maxError);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, vungleError.getCode(), vungleError.getErrorMessage());
            VungleMediationAdapter.this.log("Rewarded ad failed to display with error: " + maxAdapterError);
            this.listener.onRewardedAdDisplayFailed(maxAdapterError);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdImpression(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Rewarded ad displayed");
            this.listener.onRewardedAdDisplayed();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLeftApplication(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Rewarded ad left application");
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLoaded(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Rewarded ad loaded");
            this.listener.onRewardedAdLoaded(VungleMediationAdapter.this.maybeCreateExtraInfoBundle(baseAd));
        }

        @Override // com.vungle.ads.RewardedAdListener
        public void onAdRewarded(BaseAd baseAd) {
            VungleMediationAdapter.this.log("User was rewarded");
            this.hasGrantedReward = true;
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdStart(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Rewarded ad started");
        }
    }

    public VungleMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    private VungleAdSize getAdaptiveAdSize(MaxAdapterParameters maxAdapterParameters, Context context) {
        int adaptiveAdViewWidth = getAdaptiveAdViewWidth(maxAdapterParameters, context);
        if (!isInlineAdaptiveAdView(maxAdapterParameters)) {
            return VungleAdSize.getAdSizeWithWidthAndHeight(adaptiveAdViewWidth, MaxAdFormat.BANNER.getAdaptiveSize(adaptiveAdViewWidth, context).getHeight());
        }
        int inlineAdaptiveAdViewMaximumHeight = getInlineAdaptiveAdViewMaximumHeight(maxAdapterParameters);
        return inlineAdaptiveAdViewMaximumHeight > 0 ? VungleAdSize.getAdSizeWithWidthAndHeight(adaptiveAdViewWidth, inlineAdaptiveAdViewMaximumHeight) : VungleAdSize.getAdSizeWithWidth(context, adaptiveAdViewWidth);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<View> getClickableViews(MaxNativeAdView maxNativeAdView) {
        ArrayList arrayList = new ArrayList(7);
        if (maxNativeAdView.getTitleTextView() != null) {
            arrayList.add(maxNativeAdView.getTitleTextView());
        }
        if (maxNativeAdView.getAdvertiserTextView() != null) {
            arrayList.add(maxNativeAdView.getAdvertiserTextView());
        }
        if (maxNativeAdView.getBodyTextView() != null) {
            arrayList.add(maxNativeAdView.getBodyTextView());
        }
        if (maxNativeAdView.getCallToActionButton() != null) {
            arrayList.add(maxNativeAdView.getCallToActionButton());
        }
        if (maxNativeAdView.getIconImageView() != null) {
            arrayList.add(maxNativeAdView.getIconImageView());
        }
        if (maxNativeAdView.getMediaContentViewGroup() != null) {
            arrayList.add(maxNativeAdView.getMediaContentViewGroup());
        }
        return arrayList;
    }

    private Context getContext(Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    private boolean isAdaptiveAdViewEnabled(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        if (!maxAdapterResponseParameters.getServerParameters().getBoolean("adaptive_banner", false)) {
            return false;
        }
        if (VungleAds.isInline(maxAdapterResponseParameters.getThirdPartyAdPlacementId())) {
            return true;
        }
        userError("Please use a Vungle inline placement ID in order to use Vungle adaptive ads");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle maybeCreateExtraInfoBundle(BaseAd baseAd) {
        Bundle bundle = new Bundle(3);
        String creativeId = baseAd.getCreativeId();
        if (AppLovinSdkUtils.isValidString(creativeId)) {
            bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, creativeId);
        }
        VungleBannerView vungleBannerView = this.adViewAd;
        if (vungleBannerView != null) {
            VungleAdSize adViewSize = vungleBannerView.getAdViewSize();
            bundle.putInt("ad_width", adViewSize.getWidth());
            bundle.putInt("ad_height", adViewSize.getHeight());
        }
        return bundle;
    }

    private boolean shouldFailAdLoadWhenSdkNotInitialized(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        return maxAdapterResponseParameters.getServerParameters().getBoolean("fail_ad_load_when_sdk_not_initialized", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.applovin.mediation.adapter.MaxAdapterError toMaxError(com.vungle.ads.VungleError r3, boolean r4) {
        /*
            int r0 = r3.getCode()
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.UNSPECIFIED
            r2 = 2
            if (r0 == r2) goto L69
            r2 = 6
            if (r0 == r2) goto L66
            r2 = 118(0x76, float:1.65E-43)
            if (r0 == r2) goto L63
            r2 = 119(0x77, float:1.67E-43)
            if (r0 == r2) goto L63
            r2 = 304(0x130, float:4.26E-43)
            if (r0 == r2) goto L60
            r2 = 305(0x131, float:4.27E-43)
            if (r0 == r2) goto L5d
            r2 = 2000(0x7d0, float:2.803E-42)
            if (r0 == r2) goto L5a
            r2 = 2001(0x7d1, float:2.804E-42)
            if (r0 == r2) goto L5a
            r2 = 10001(0x2711, float:1.4014E-41)
            if (r0 == r2) goto L57
            r2 = 10002(0x2712, float:1.4016E-41)
            if (r0 == r2) goto L57
            switch(r0) {
                case 6: goto L66;
                case 109: goto L63;
                case 200: goto L54;
                case 201: goto L69;
                case 202: goto L54;
                case 203: goto L54;
                case 204: goto L54;
                case 205: goto L54;
                case 206: goto L54;
                case 207: goto L69;
                case 208: goto L54;
                case 209: goto L54;
                case 210: goto L4b;
                case 212: goto L57;
                case 302: goto L5d;
                case 307: goto L60;
                case 320: goto L5a;
                case 400: goto L5d;
                case 500: goto L69;
                case 600: goto L48;
                case 2009: goto L45;
                case 20001: goto L42;
                case 30001: goto L69;
                case 30002: goto L63;
                case 30003: goto L63;
                default: goto L2f;
            }
        L2f:
            switch(r0) {
                case 101: goto L54;
                case 102: goto L54;
                case 103: goto L54;
                case 104: goto L54;
                case 105: goto L54;
                case 106: goto L63;
                default: goto L32;
            }
        L32:
            switch(r0) {
                case 111: goto L54;
                case 112: goto L54;
                case 113: goto L54;
                case 114: goto L63;
                case 115: goto L5d;
                case 116: goto L63;
                default: goto L35;
            }
        L35:
            switch(r0) {
                case 214: goto L54;
                case 215: goto L54;
                case 216: goto L54;
                case 217: goto L3f;
                default: goto L38;
            }
        L38:
            switch(r0) {
                case 220: goto L42;
                case 221: goto L42;
                case 222: goto L69;
                case 223: goto L54;
                default: goto L3b;
            }
        L3b:
            switch(r0) {
                case 315: goto L63;
                case 316: goto L63;
                case 317: goto L5d;
                case 318: goto L5d;
                default: goto L3e;
            }
        L3e:
            goto L6b
        L3f:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.TIMEOUT
            goto L6b
        L42:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.SERVER_ERROR
            goto L6b
        L45:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.MISSING_ACTIVITY
            goto L6b
        L48:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS
            goto L6b
        L4b:
            if (r4 == 0) goto L51
            com.applovin.mediation.adapter.MaxAdapterError r4 = com.applovin.mediation.adapter.MaxAdapterError.AD_NOT_READY
        L4f:
            r1 = r4
            goto L6b
        L51:
            com.applovin.mediation.adapter.MaxAdapterError r4 = com.applovin.mediation.adapter.MaxAdapterError.INVALID_LOAD_STATE
            goto L4f
        L54:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INVALID_LOAD_STATE
            goto L6b
        L57:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NO_FILL
            goto L6b
        L5a:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.WEBVIEW_ERROR
            goto L6b
        L5d:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.AD_DISPLAY_FAILED
            goto L6b
        L60:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.AD_EXPIRED
            goto L6b
        L63:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INTERNAL_ERROR
            goto L6b
        L66:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NOT_INITIALIZED
            goto L6b
        L69:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INVALID_CONFIGURATION
        L6b:
            com.applovin.mediation.adapter.MaxAdapterError r4 = new com.applovin.mediation.adapter.MaxAdapterError
            java.lang.String r3 = r3.getLocalizedMessage()
            r4.<init>(r1, r0, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.VungleMediationAdapter.toMaxError(com.vungle.ads.VungleError, boolean):com.applovin.mediation.adapter.MaxAdapterError");
    }

    private VungleAdSize toVungleAdSize(MaxAdFormat maxAdFormat, boolean z10, MaxAdapterParameters maxAdapterParameters, Context context) {
        if (z10 && isAdaptiveAdViewFormat(maxAdFormat, maxAdapterParameters)) {
            return getAdaptiveAdSize(maxAdapterParameters, context);
        }
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return VungleAdSize.BANNER;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return VungleAdSize.BANNER_LEADERBOARD;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return VungleAdSize.MREC;
        }
        throw new IllegalArgumentException("Unsupported ad view ad format: " + maxAdFormat.getLabel());
    }

    private void updateUserPrivacySettings(MaxAdapterParameters maxAdapterParameters) {
        Boolean boolHasUserConsent = maxAdapterParameters.hasUserConsent();
        if (boolHasUserConsent != null) {
            VunglePrivacySettings.setGDPRStatus(boolHasUserConsent.booleanValue(), "");
        }
        if (maxAdapterParameters.isDoNotSell() != null) {
            VunglePrivacySettings.setCCPAStatus(!r3.booleanValue());
        }
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, final MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        updateUserPrivacySettings(maxAdapterSignalCollectionParameters);
        VungleAds.getBiddingToken(getContext(activity), new BidTokenCallback() { // from class: com.applovin.mediation.adapters.VungleMediationAdapter.2
            @Override // com.vungle.ads.BidTokenCallback
            public void onBidTokenCollected(String str) {
                maxSignalCollectionListener.onSignalCollected(str);
            }

            @Override // com.vungle.ads.BidTokenCallback
            public void onBidTokenError(String str) {
                VungleMediationAdapter.this.log("Signal collection failed: " + str);
                maxSignalCollectionListener.onSignalCollectionFailed(str);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return getVersionString(com.vungle.ads.BuildConfig.class, "VERSION_NAME");
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) throws Throwable {
        updateUserPrivacySettings(maxAdapterInitializationParameters);
        if (!initialized.compareAndSet(false, true)) {
            onCompletionListener.onCompletion(initializationStatus, null);
            return;
        }
        String string = maxAdapterInitializationParameters.getServerParameters().getString("app_id", null);
        log("Initializing Vungle SDK with app id: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
        initializationStatus = MaxAdapter.InitializationStatus.INITIALIZING;
        VungleAds.setIntegrationName(VungleWrapperFramework.max, getAdapterVersion());
        VungleAds.init(getContext(activity), string, new InitializationListener() { // from class: com.applovin.mediation.adapters.VungleMediationAdapter.1
            @Override // com.vungle.ads.InitializationListener
            public void onError(VungleError vungleError) {
                VungleMediationAdapter.initialized.set(false);
                VungleMediationAdapter.this.log("Vungle SDK failed to initialize with error: ", vungleError);
                MaxAdapter.InitializationStatus unused = VungleMediationAdapter.initializationStatus = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                onCompletionListener.onCompletion(VungleMediationAdapter.initializationStatus, vungleError.getErrorMessage());
            }

            @Override // com.vungle.ads.InitializationListener
            public void onSuccess() {
                VungleMediationAdapter.this.log("Vungle SDK initialized");
                MaxAdapter.InitializationStatus unused = VungleMediationAdapter.initializationStatus = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                onCompletionListener.onCompletion(VungleMediationAdapter.initializationStatus, null);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) throws Throwable {
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        String label = maxAdFormat.getLabel();
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        Context context = getContext(activity);
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        boolean z10 = maxAdapterResponseParameters.getServerParameters().getBoolean("is_native");
        StringBuilder sb2 = new StringBuilder("Loading ");
        sb2.append(zIsValidString ? "bidding " : "");
        com.google.android.gms.internal.play_billing.a.B(sb2, z10 ? "native " : "", label, " ad for placement: ", thirdPartyAdPlacementId);
        sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb2.toString());
        if (shouldFailAdLoadWhenSdkNotInitialized(maxAdapterResponseParameters) && !VungleAds.isInitialized()) {
            log("Vungle SDK not successfully initialized: failing " + label + " ad load...");
            maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        updateUserPrivacySettings(maxAdapterResponseParameters);
        if (z10) {
            NativeAdViewListener nativeAdViewListener = new NativeAdViewListener(maxAdapterResponseParameters, maxAdFormat, context, maxAdViewAdapterListener);
            NativeAd nativeAd = new NativeAd(getContext(activity), thirdPartyAdPlacementId);
            this.nativeAd = nativeAd;
            nativeAd.setAdListener(nativeAdViewListener);
            this.nativeAd.load(bidResponse);
            return;
        }
        boolean zIsAdaptiveAdViewEnabled = isAdaptiveAdViewEnabled(maxAdapterResponseParameters);
        if (zIsAdaptiveAdViewEnabled && AppLovinSdk.VERSION_CODE < 13020099) {
            userError("Please update AppLovin MAX SDK to version 13.2.0 or higher in order to use Vungle adaptive ads");
            zIsAdaptiveAdViewEnabled = false;
        }
        VungleBannerView vungleBannerView = new VungleBannerView(context, thirdPartyAdPlacementId, toVungleAdSize(maxAdFormat, zIsAdaptiveAdViewEnabled, maxAdapterResponseParameters, context));
        this.adViewAd = vungleBannerView;
        vungleBannerView.setAdListener(new AdViewAdListener(label, maxAdViewAdapterListener));
        this.adViewAd.load(bidResponse);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAppOpenAdapter
    public void loadAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) throws Throwable {
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log(o2.r(new StringBuilder("Loading "), zIsValidString ? "bidding " : "", "app open ad for placement: ", thirdPartyAdPlacementId, APSSharedUtil.TRUNCATE_SEPARATOR));
        if (shouldFailAdLoadWhenSdkNotInitialized(maxAdapterResponseParameters) && !VungleAds.isInitialized()) {
            log("Vungle SDK not successfully initialized: failing app open ad load...");
            maxAppOpenAdapterListener.onAppOpenAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        updateUserPrivacySettings(maxAdapterResponseParameters);
        InterstitialAd interstitialAd = new InterstitialAd(getContext(activity), thirdPartyAdPlacementId, new AdConfig());
        this.appOpenAd = interstitialAd;
        interstitialAd.setAdListener(new AppOpenAdListener(maxAppOpenAdapterListener));
        this.appOpenAd.load(bidResponse);
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) throws Throwable {
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log(o2.r(new StringBuilder("Loading "), zIsValidString ? "bidding " : "", "interstitial ad for placement: ", thirdPartyAdPlacementId, APSSharedUtil.TRUNCATE_SEPARATOR));
        if (shouldFailAdLoadWhenSdkNotInitialized(maxAdapterResponseParameters) && !VungleAds.isInitialized()) {
            log("Vungle SDK not successfully initialized: failing interstitial ad load...");
            maxInterstitialAdapterListener.onInterstitialAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        updateUserPrivacySettings(maxAdapterResponseParameters);
        InterstitialAd interstitialAd = new InterstitialAd(getContext(activity), thirdPartyAdPlacementId, new AdConfig());
        this.interstitialAd = interstitialAd;
        interstitialAd.setAdListener(new InterstitialListener(maxInterstitialAdapterListener));
        this.interstitialAd.load(bidResponse);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) throws Throwable {
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log(o2.r(new StringBuilder("Loading "), zIsValidString ? "bidding " : "", "native ad for placement: ", thirdPartyAdPlacementId, APSSharedUtil.TRUNCATE_SEPARATOR));
        if (shouldFailAdLoadWhenSdkNotInitialized(maxAdapterResponseParameters) && !VungleAds.isInitialized()) {
            log("Vungle SDK not successfully initialized: failing interstitial ad load...");
            maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        updateUserPrivacySettings(maxAdapterResponseParameters);
        NativeAd nativeAd = new NativeAd(getContext(activity), thirdPartyAdPlacementId);
        this.nativeAd = nativeAd;
        nativeAd.setAdListener(new NativeListener(maxAdapterResponseParameters, getContext(activity), maxNativeAdAdapterListener));
        this.nativeAd.load(bidResponse);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) throws Throwable {
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log(o2.r(new StringBuilder("Loading "), zIsValidString ? "bidding " : "", "rewarded ad for placement: ", thirdPartyAdPlacementId, APSSharedUtil.TRUNCATE_SEPARATOR));
        if (shouldFailAdLoadWhenSdkNotInitialized(maxAdapterResponseParameters) && !VungleAds.isInitialized()) {
            log("Vungle SDK not successfully initialized: failing rewarded ad load...");
            maxRewardedAdapterListener.onRewardedAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        updateUserPrivacySettings(maxAdapterResponseParameters);
        RewardedAd rewardedAd = new RewardedAd(getContext(activity), thirdPartyAdPlacementId, new AdConfig());
        this.rewardedAd = rewardedAd;
        rewardedAd.setAdListener(new RewardedListener(maxRewardedAdapterListener));
        this.rewardedAd.load(bidResponse);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        VungleBannerView vungleBannerView = this.adViewAd;
        if (vungleBannerView != null) {
            vungleBannerView.setAdListener(null);
            this.adViewAd.finishAd();
            this.adViewAd = null;
        }
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd != null) {
            nativeAd.setAdListener(null);
            this.nativeAd.unregisterView();
            this.nativeAd = null;
        }
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.setAdListener(null);
            this.interstitialAd = null;
        }
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            rewardedAd.setAdListener(null);
            this.rewardedAd = null;
        }
        InterstitialAd interstitialAd2 = this.appOpenAd;
        if (interstitialAd2 != null) {
            interstitialAd2.setAdListener(null);
            this.appOpenAd = null;
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAppOpenAdapter
    public void showAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) throws Throwable {
        InterstitialAd interstitialAd = this.appOpenAd;
        if (interstitialAd != null && interstitialAd.canPlayAd().booleanValue()) {
            log("Showing app open ad for placement: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + APSSharedUtil.TRUNCATE_SEPARATOR);
            this.appOpenAd.play(getContext(activity));
            return;
        }
        log("App open ad is not ready: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + APSSharedUtil.TRUNCATE_SEPARATOR);
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
        maxAppOpenAdapterListener.onAppOpenAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) throws Throwable {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null && interstitialAd.canPlayAd().booleanValue()) {
            log("Showing interstitial ad for placement: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + APSSharedUtil.TRUNCATE_SEPARATOR);
            this.interstitialAd.play(getContext(activity));
            return;
        }
        log("Interstitial ad is not ready: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + APSSharedUtil.TRUNCATE_SEPARATOR);
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) throws Throwable {
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null && rewardedAd.canPlayAd().booleanValue()) {
            log("Showing rewarded ad for placement: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + APSSharedUtil.TRUNCATE_SEPARATOR);
            configureReward(maxAdapterResponseParameters);
            this.rewardedAd.play(getContext(activity));
            return;
        }
        log("Rewarded ad is not ready: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + APSSharedUtil.TRUNCATE_SEPARATOR);
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }
}
